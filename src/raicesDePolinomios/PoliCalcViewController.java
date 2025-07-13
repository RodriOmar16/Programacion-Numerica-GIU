package raicesDePolinomios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PoliCalcViewController extends JFrame{
	private PolinomioController polinomioController;
	private int gradoActual = 2;
	private PoliCalcView vista;
	private JPanel panelTerminos;
	
	public PoliCalcViewController(){
		this.vista 				 = new PoliCalcView();
		this.polinomioController = new PolinomioController();
		configurarVista();
	}
	private void configurarVista() {
		iniciarVistaControlada();
		darAcciones();
	}
	private void darAcciones() {
		vista.getButtonAgregar().addActionListener(e -> {if (gradoActual < 20) armarPolinomio(++gradoActual); });// Límite arbitrario
	    vista.getButtonQuitar().addActionListener(e -> { if (gradoActual > 0) armarPolinomio(--gradoActual); });
	    vista.getComboMetodo().addItemListener(e -> controlSelecMetodo());
	    vista.getButtonDivir().addActionListener(e-> controlarDividir());
	    vista.getButtonCalcularNewton().addActionListener(e-> controlarNewton());
	    vista.getButtonDetRaices().addActionListener(e -> determinarRaices());
	    vista.getButtonCotas().addActionListener(e -> determinarCotas());
	}
	private void iniciarVistaControlada() {
		// Crear el panel interno dinámico
	    panelTerminos = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	    // Envolver con scroll
	    JScrollPane scrollPolinomio = new JScrollPane(panelTerminos);
	    scrollPolinomio.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    scrollPolinomio.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
	    scrollPolinomio.setPreferredSize(new Dimension(430, 60));
	
	    // Insertar en el panel que quedó vacío
	    vista.getPanelTerminos().setLayout(new BorderLayout());
	    vista.getPanelTerminos().add(scrollPolinomio, BorderLayout.CENTER);
	    vista.getPanelTerminos().setBorder(new EmptyBorder(5, 20, 5, 20)); // arriba, izquierda, abajo, derecha
	    vista.getPanelTerminos().revalidate();
	    vista.getPanelTerminos().repaint();
	
	    // Inicializar polinomio cuadrático
	    armarPolinomio(2);
	    
	    //doy border a las secciones
	    darBorderApaneles();
	    
	    //Agrego scroll al panel principal
	    JScrollPane scrollGlobal = new JScrollPane(vista.getPanelPrincipal());
	    scrollGlobal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	    scrollGlobal.getVerticalScrollBar().setUnitIncrement(12);
	    scrollGlobal.setBorder(null);
	    vista.setContentPane(scrollGlobal);

	    //ultimas config
	    vista.setSize(540, 720); // Más ancho
	    //vista.getPanelPrincipal().setPreferredSize(new Dimension(580, 1000)); // ajustá altura según tus secciones
	    vista.getPanelPrincipal().setMaximumSize(new Dimension(580, 1000)); // evita estiramiento
	    vista.setLocationRelativeTo(null); // Centrar en pantalla
	    vista.setResizable(false);
	    vista.revalidate();
	    vista.repaint();

	}
	private void armarPolinomio(int grado) {
		panelTerminos.removeAll();
		for (int i = grado; i >= 0; i--) {
	        agregarTermino(i);
	    }
		panelTerminos.revalidate();
	    panelTerminos.repaint();
	}
	private void agregarTermino(int grado) {
	    JLabel etiqueta  = new JLabel("x^" + grado);
	    JTextField campo = new JTextField(5);
	    campo.setName("coef_" + grado); // útil para recorrerlos después
	    JLabel separador = new JLabel(" + ");
	    
	    panelTerminos.add(campo);
	    panelTerminos.add(etiqueta);
	    if(grado > 0) {
	    	panelTerminos.add(separador);
	    }

	    panelTerminos.revalidate();
	    panelTerminos.repaint();
	}
	private void darBorderApaneles() {
		vista.getPanelTerminos().setBorder(null);
	    vista.getPanelTerminos().setBorder(BorderFactory.createCompoundBorder(
			    new EmptyBorder(0, 0, 0, 0), // margen externo: 5px arriba
			    BorderFactory.createTitledBorder(
			        BorderFactory.createLineBorder(Color.GRAY),
			        "Definición",
			        TitledBorder.LEFT,
			        TitledBorder.TOP,
			        new Font("SansSerif", Font.BOLD, 12),
			        Color.GRAY
			    )
			));
	    vista.getPanelDivision().setBorder(BorderFactory.createCompoundBorder(
			    new EmptyBorder(0, 0, 0, 0), // margen externo: 5px arriba
			    BorderFactory.createTitledBorder(
			        BorderFactory.createLineBorder(Color.GRAY),
			        "División Sintética",
			        TitledBorder.LEFT,
			        TitledBorder.TOP,
			        new Font("SansSerif", Font.BOLD, 12),
			        Color.GRAY
			    )
			));
	    vista.getPanelNewton().setBorder(BorderFactory.createCompoundBorder(
			    new EmptyBorder(0, 0, 0, 0), // margen externo: 5px arriba
			    BorderFactory.createTitledBorder(
			        BorderFactory.createLineBorder(Color.GRAY),
			        "Aproximación de Raíz",
			        TitledBorder.LEFT,
			        TitledBorder.TOP,
			        new Font("SansSerif", Font.BOLD, 12),
			        Color.GRAY
			    )
			));
	    vista.getPanelRaices().setBorder(BorderFactory.createCompoundBorder(
			    new EmptyBorder(0, 0, 0, 0), // margen externo: 5px arriba
			    BorderFactory.createTitledBorder(
			        BorderFactory.createLineBorder(Color.GRAY),
			        "Raíces",
			        TitledBorder.LEFT,
			        TitledBorder.TOP,
			        new Font("SansSerif", Font.BOLD, 12),
			        Color.GRAY
			    )
			));
	    vista.getPanelCotas().setBorder(BorderFactory.createCompoundBorder(
			    new EmptyBorder(0, 0, 0, 0), // margen externo: 5px arriba
			    BorderFactory.createTitledBorder(
			        BorderFactory.createLineBorder(Color.GRAY),
			        "Cotas de Raíces",
			        TitledBorder.LEFT,
			        TitledBorder.TOP,
			        new Font("SansSerif", Font.BOLD, 12),
			        Color.GRAY
			    )
			));
	}
	
	public boolean esDouble(String entrada) {
	    try {
	        Double.parseDouble(entrada);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
	public List<Double> getCoeficientesIngresados() {
	    List<Double> coeficientes = new ArrayList<>();
	    for (int i = gradoActual; i >= 0; i--) {
	        for (Component comp : panelTerminos.getComponents()) {
	            if (comp instanceof JTextField) {
	                JTextField campo = (JTextField) comp;
	                if (campo.getName().equals("coef_" + i)) {
	                    try {
	                        coeficientes.add(Double.parseDouble(campo.getText()));
	                    } catch (NumberFormatException e) {
	                        coeficientes.add(0.0); // valor por defecto si no hay número válido
	                    }
	                }
	            }
	        }
	    }
	    return coeficientes;
	}
	//Controla que se bloquea o que no 
	public void controlSelecMetodo() {
		JComboBox<String> metodoCombo = vista.getComboMetodo();
		int metodo = metodoCombo.getSelectedIndex();
		
		switch(metodo) {
			case 0 -> { 
				vista.getTextA().setEnabled(true);
				vista.getTextB().setEnabled(true);
				vista.getTextC().setEnabled(true);
			}
			case 1 ->{
				vista.getTextA().setEnabled(true);
				vista.getTextB().setEnabled(false);
				vista.getTextC().setEnabled(false);	
			}
			case 2, 3 -> {
				vista.getTextA().setEnabled(true);
				vista.getTextB().setEnabled(true);
				vista.getTextC().setEnabled(false);	
			}
			case 4 ->{
				vista.getTextA().setEnabled(true);
				vista.getTextB().setEnabled(true);
				vista.getTextC().setEnabled(true);	
			}
		}
	}
	private boolean validarCoeficientesPolinomio() {
		boolean cumple = true;

		for(Component comp : panelTerminos.getComponents()) {
			if(comp instanceof JTextField && !((JTextField)comp).getText().isEmpty() && !esDouble(((JTextField)comp).getText())) {
				cumple = false;
			}
		}
		return cumple;
	}
	private boolean controloCoeficientePrincipal() {
		List<Double> coeficientes = getCoeficientesIngresados();
		this.polinomioController.asignarPolinomio(coeficientes);
		return ( coeficientes.get(0) == 0 );
	}
	public void controlarDividir() {		
		String resultado = "", aux[];
		
		if(!validarCoeficientesPolinomio()) {
			JOptionPane.showMessageDialog(null, "Todos los coeficientes del polinomio deben ser números", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		if(controloCoeficientePrincipal()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor para el Coef. principal del polinomio", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		JComboBox<String> metodoCombo = vista.getComboMetodo();
		int metodo = metodoCombo.getSelectedIndex();
		switch(metodo) {
			case 0 -> { 
				JOptionPane.showMessageDialog(null, "Se seleccionar un método para continuar.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			case 1 ->{
				if(vista.getTextA().getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debes rellenar el campo a para revisar esa divión.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if(!esDouble(vista.getTextA().getText())) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo a.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
				    return;
				}
				resultado = this.polinomioController.divisionSintetica(Double.parseDouble(vista.getTextA().getText()));
			}
			case 2, 3 -> {
				if(vista.getTextA().getText().isEmpty() || vista.getTextB().getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debes rellenar campos a y b para realizar la división.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if(!esDouble(vista.getTextA().getText())) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo a", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
				    return;
				}
				if(!esDouble(vista.getTextB().getText())) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo b", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
				    return;
				}
				resultado = this.polinomioController.divisionSintetica(metodo, Double.parseDouble(vista.getTextA().getText()), Double.parseDouble(vista.getTextB().getText()));
			}
			case 4 ->{
				if(vista.getTextA().getText().isEmpty() || vista.getTextB().getText().isEmpty() || vista.getTextC().getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debes rellenar campos a, b y c para realizar la división.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if(!esDouble(vista.getTextA().getText())) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo a", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
				    return;
				}
				if(!esDouble(vista.getTextB().getText())) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo b", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
				    return;
				}
				if(!esDouble(vista.getTextC().getText())) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo c", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
				    return;
				}
				resultado = this.polinomioController.divisionSintetica(Double.parseDouble(vista.getTextA().getText()), Double.parseDouble(vista.getTextB().getText()), Double.parseDouble(vista.getTextC().getText()));				
			}
		}

		aux = resultado.split(";");
		vista.getTextCociente().setText(aux[0]);
		vista.getTextResto().setText(aux[1]);
	}
	public void controlarNewton() {
		String resultado;
		if(!validarCoeficientesPolinomio()) {
			JOptionPane.showMessageDialog(null, "Todos los coeficientes del polinomio deben ser números", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(controloCoeficientePrincipal()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor para el Coef. principal del polinomio", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(vista.getTextEpsilon().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor de tolerancia (Epsilon).", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(!esDouble(vista.getTextEpsilon().getText())) {
			JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo Epsilon", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
		    return;
		}
		if(vista.getTextValorInicial().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor inicial.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(!esDouble(vista.getTextValorInicial().getText())) {
			JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo Valor inicial", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
		    return;
		}
		
		resultado = polinomioController.aproximarRaices(Double.parseDouble(vista.getTextEpsilon().getText()), Double.parseDouble(vista.getTextValorInicial().getText()));
		vista.getTextResultado().setText(resultado);
	}
	public void determinarRaices() {
		if(!validarCoeficientesPolinomio()) {
			JOptionPane.showMessageDialog(null, "Todos los coeficientes del polinomio deben ser números", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(controloCoeficientePrincipal()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor para el Coef. principal del polinomio", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
	
		String raicesStr = this.polinomioController.determinarRaices(),
			   raices[]  = raicesStr.split(";");
		vista.getTextEnteras().setText(raices[0]);
		vista.getTextRacionales().setText(raices[1]);
		vista.getTextReales().setText(raices[2]);
	}
	public void determinarCotas() {
		if(!validarCoeficientesPolinomio()) {
			JOptionPane.showMessageDialog(null, "Todos los coeficientes del polinomio deben ser números", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(controloCoeficientePrincipal()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor para el Coef. principal del polinomio", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		System.out.println("Determino las cosas...");
	}
}
