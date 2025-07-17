package raicesDePolinomios_Graficadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class GraficadorPanel extends JPanel {
    private List<Double> coeficientes;
    private List<Double> raices;
    private double escala = 40.0; // Escala de pixeles por unidad
    private double desplazamientoX = 0;
    private double desplazamientoY = 0;

    public GraficadorPanel() {
    	this.coeficientes = new ArrayList<Double>();
    	this.raices = new ArrayList<>();
    }
    public GraficadorPanel(List<Double> coeficientes) {
        this.coeficientes = coeficientes;
        this.raices = new ArrayList<>();

        setBackground(Color.WHITE);
        setFocusable(true);

        // Zoom con scroll
        addMouseWheelListener(e -> {
            double rotacion = e.getPreciseWheelRotation();
            if (rotacion < 0) escala *= 1.1;
            else escala *= 0.9;
            repaint();
        });

        // Traslación con drag
        final Point[] lastDrag = {null};
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastDrag[0] = e.getPoint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point actual = e.getPoint();
                desplazamientoX += (actual.x - lastDrag[0].x);
                desplazamientoY += (actual.y - lastDrag[0].y);
                lastDrag[0] = actual;
                repaint();
            }
        });
    }

    public void setCoeficientes(List<Double> coeficientes) {
        this.coeficientes = coeficientes;
        repaint();
    }

    public void setRaices(List<Double> raices) {
        this.raices = raices;
        repaint();
    }

    private double evaluarPolinomio(double x, List<Double> coef) {
        double resultado = 0;
        int grado = coef.size() - 1;
        for (int i = 0; i <= grado; i++) {
            resultado += coef.get(i) * Math.pow(x, grado - i);
        }
        return resultado;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int ancho = getWidth();
        int alto = getHeight();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Cuadrícula
        g2.setColor(new Color(220, 220, 220));
        for (int x = (int)(desplazamientoX % escala); x < ancho; x += escala) {
            g2.drawLine(x, 0, x, alto);
        }
        for (int y = (int)(desplazamientoY % escala); y < alto; y += escala) {
            g2.drawLine(0, y, ancho, y);
        }

        // Ejes
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(1.5f));
        g2.drawLine((int)(ancho / 2 + desplazamientoX), 0, (int)(ancho / 2 + desplazamientoX), alto);
        g2.drawLine(0, (int)(alto / 2 + desplazamientoY), ancho, (int)(alto / 2 + desplazamientoY));

        // Números en ejes
        g2.setFont(new Font("Arial", Font.PLAIN, 10));
        for (int x = (int)(desplazamientoX % escala); x < ancho; x += escala) {
            double valorX = (x - ancho / 2 - desplazamientoX) / escala;
            g2.drawString(String.format(Locale.US, "%.0f", valorX), x + 2, alto / 2 + 12 + (int)desplazamientoY);
        }
        for (int y = (int)(desplazamientoY % escala); y < alto; y += escala) {
            double valorY = -(y - alto / 2 - desplazamientoY) / escala;
            g2.drawString(String.format(Locale.US, "%.0f", valorY), ancho / 2 + 5 + (int)desplazamientoX, y - 2);
        }

        // Curva del polinomio
        g2.setColor(Color.BLUE);
        int prevX = 0, prevY = 0;
        boolean primero = true;
        for (int xPix = 0; xPix < ancho; xPix++) {
            double xVal = (xPix - ancho / 2 - desplazamientoX) / escala;
            double yVal = evaluarPolinomio(xVal, coeficientes);
            int yPix = (int) (alto / 2 - yVal * escala + desplazamientoY);

            if (!primero) {
                g2.drawLine(prevX, prevY, xPix, yPix);
            } else {
                primero = false;
            }

            prevX = xPix;
            prevY = yPix;
        }

        // Marcación de raíces
        g2.setColor(Color.GRAY);
        for (Double raiz : raices) {
            int xPix = (int)(raiz * escala + ancho / 2 + desplazamientoX);
            int yPix = (int)(alto / 2 + desplazamientoY);
            g2.fillOval(xPix - 4, yPix - 4, 8, 8);
            g2.drawString(String.format(Locale.US, "%.2f", raiz), xPix + 5, yPix - 5);
        }
    }
}
