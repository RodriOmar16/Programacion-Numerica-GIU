package resolucionEcuacionesNOlineales;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class CalculadoraMetodos_GIU extends JFrame{
	//Atributos
	private JLabel labelFuncion, labelMetodo, labelEpsilon, labelA, labelB, labelResultado, labelTraza, labelTrazaAitken, labelSinInfo;
	private JTextField textFuncion, textEpsilon, textA, textB, textResultado;
	private JComboBox<String> comboMetodo;
	private JButton buttonCalcular, buttonAitken;
	private JTable tabla, tablaAitken;
	private JScrollPane scrollTabla, scrollAitken;
	private JPanel panelPrincipal, panelFuncion, panelMetodo, panelParametros, panelButtonCalcular, panelResultado, panelTabla, panelAitken;
	private MetodoController controllerMetodo;
	
	//Constructor
	public CalculadoraMetodos_GIU() {
		estilosGenerales();
		initComponents();
		armarPanelFuncion();
		armarPanelMetodo();
		armarPanelParametros();
		armarPanelButtonCalcular();
		armarPanelResultado();
		armarPanelTabla();
		armarPanelAitken();
		armarPanelPricipal();
		configGenerales();
	}
	
	//Methods
	private void estilosGenerales() {
		UIManager.put("ToolTip.background", Color.WHITE);            // Fondo blanco
		UIManager.put("ToolTip.foreground", Color.BLACK);            // Texto negro
		UIManager.put("ToolTip.border", BorderFactory.createLineBorder(Color.GRAY)); // Borde gris fino
		UIManager.put("ToolTip.font", new Font("SansSerif", Font.PLAIN, 12)); // Fuente limpia
	}
	private void initComponents() {
		String[] metodos = {"", "Bisección", "Regula Falsi", "Regula Falsi Modificada", "Secante", "Newton - Rapshon", "Punto Fijo", "Convergencia Cúbica"};
		
		//label's
		this.labelFuncion 	  = new JLabel("Función");
		this.labelMetodo 	  = new JLabel("Seleccionar método");
		this.labelEpsilon 	  = new JLabel("Epsilon");
		this.labelA 		  = new JLabel("a");
		this.labelB 		  = new JLabel("b");
		this.labelResultado   = new JLabel("Resultado");
		this.labelTraza 	  = new JLabel("Traza");
		this.labelTrazaAitken = new JLabel("Traza Aitken");
		this.labelSinInfo     = new JLabel("No hay datos para mostrar");
		
		//textField's
		this.textFuncion   = new JTextField(15); 
		this.textEpsilon   = new JTextField(7);
		this.textA         = new JTextField(7);
		this.textB		   = new JTextField(7);
		this.textResultado = new JTextField(15);
		
		//comboBox's
		this.comboMetodo = new JComboBox<String>(metodos);

		//button's
		this.buttonCalcular = new JButton("Calcular");
		this.buttonAitken   = new JButton("Aitken");
		
		//panel's
		this.panelPrincipal      = new JPanel();
		this.panelFuncion        = new JPanel(new GridLayout(2,1));
		this.panelMetodo		 = new JPanel(new GridLayout(2,1));
		this.panelParametros	 = new JPanel(new GridLayout(2,3,5,3));
		this.panelButtonCalcular = new JPanel();
		this.panelResultado		 = new JPanel(new GridLayout(2,1));
		this.panelTabla			 = new JPanel();
		this.panelAitken		 = new JPanel();
	}
	
	private void armarPanelFuncion() {
		this.panelFuncion.add(this.labelFuncion);
		this.panelFuncion.add(this.textFuncion);
		this.panelFuncion.setPreferredSize(new Dimension(100,25));
	}
	private void armarPanelMetodo() {
		this.panelMetodo.add(this.labelMetodo);
		this.panelMetodo.add(this.comboMetodo);
		this.panelMetodo.setPreferredSize(new Dimension(100,25));
	}
	
	private void armarPanelParametros() {
		this.textA.setPreferredSize(new Dimension(60, 25));
		this.textB.setPreferredSize(new Dimension(60, 25));
		this.textEpsilon.setPreferredSize(new Dimension(60, 25));
		this.labelA.setHorizontalAlignment(SwingConstants.CENTER);
		this.labelB.setHorizontalAlignment(SwingConstants.CENTER);
		//labelEpsilon.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panelA = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		panelA.add(textA);
		
		JPanel panelB = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		panelB.add(textB);
		
		JPanel panelEpsilon = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		panelEpsilon.add(textEpsilon);

		this.panelParametros.add(this.labelEpsilon);
		this.panelParametros.add(this.labelA);
		this.panelParametros.add(this.labelB);
		this.panelParametros.add(panelEpsilon);
		this.panelParametros.add(panelA);
		this.panelParametros.add(panelB);
		this.panelParametros.setPreferredSize(new Dimension(100,25));
	}
	private void armarPanelButtonCalcular() {
		this.panelButtonCalcular.setMaximumSize(new Dimension(Integer.MAX_VALUE, panelButtonCalcular.getPreferredSize().height));
		this.panelButtonCalcular.add(this.buttonCalcular);
		this.panelButtonCalcular.setPreferredSize(new Dimension(100,40));
	}
	private void armarPanelResultado() {
		this.panelResultado.add(this.labelResultado);
		this.panelResultado.add(this.textResultado);
		this.panelResultado.setPreferredSize(new Dimension(100,25));
	}
	private void armarPanelTabla(){
		this.labelSinInfo.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel contenidoCentrado = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
		contenidoCentrado.add(this.labelSinInfo);

		this.panelTabla.setLayout(new BoxLayout(panelTabla, BoxLayout.Y_AXIS));
		this.panelTabla.add(contenidoCentrado);

		this.panelTabla.setBorder(BorderFactory.createCompoundBorder(
			    new EmptyBorder(5, 0, 0, 0), // margen externo: 5px arriba
			    BorderFactory.createTitledBorder(
			        BorderFactory.createLineBorder(Color.GRAY),
			        "Traza",
			        TitledBorder.LEFT,
			        TitledBorder.TOP,
			        new Font("SansSerif", Font.BOLD, 12),
			        Color.GRAY
			    )
			));
		panelTabla.setAlignmentX(Component.LEFT_ALIGNMENT); // evita desplazamiento a la derecha
		panelTabla.setMaximumSize(new Dimension(Integer.MAX_VALUE, panelTabla.getPreferredSize().height));
	}
	private void completarTabla() {
		String[][] datos = controllerMetodo.getMatriz();
		String[] columnas = controllerMetodo.getColumnas();
		
		this.panelTabla.removeAll();
        if (datos.length == 0) {
            JLabel sinDatos = new JLabel(this.labelSinInfo.getText(), SwingConstants.CENTER);
            //sinDatos.setFont(new Font("SansSerif", Font.ITALIC, 14));
            //add(sinDatos, BorderLayout.CENTER);
        } else {
            this.tabla = new JTable(datos, columnas);
            DefaultTableCellRenderer derecha = new DefaultTableCellRenderer();
            derecha.setHorizontalAlignment(SwingConstants.RIGHT);
            this.tabla.getColumnModel().getColumn(2).setCellRenderer(derecha);

            this.scrollTabla = new JScrollPane(this.tabla);
            this.scrollTabla.setBorder(new EmptyBorder(10, 10, 10, 10));
            this.scrollTabla.setPreferredSize(new Dimension(480, 150));
            this.scrollTabla.setMaximumSize(new Dimension(Integer.MAX_VALUE, 180));
            this.tabla.setFillsViewportHeight(true);

            this.panelTabla.add(this.scrollTabla);
            this.tabla.setFont(new Font("SansSerif", Font.PLAIN, 13));
        }
        this.panelTabla.revalidate();
        this.panelTabla.repaint();
        this.panelPrincipal.setPreferredSize(new Dimension(550,550));
	}
	private void armarPanelAitken() {
		JPanel botonPanel = new JPanel();
		botonPanel.add(this.buttonAitken);
		this.buttonAitken.setEnabled(false);
		
		JLabel sinInfo = new JLabel(this.labelSinInfo.getText());
		sinInfo.setHorizontalAlignment(SwingConstants.CENTER);
		
		/*this.panelAitken.add(botonPanel);
		this.panelAitken.add(sinInfo);*/
		this.panelAitken.setBorder(BorderFactory.createCompoundBorder(
			    new EmptyBorder(5, 0, 0, 0), // margen externo: 5px arriba
			    BorderFactory.createTitledBorder(
			        BorderFactory.createLineBorder(Color.GRAY),
			        "Aceleracion de Convergencia",
			        TitledBorder.LEFT,
			        TitledBorder.TOP,
			        new Font("SansSerif", Font.BOLD, 12),
			        Color.GRAY
			    )
			));
		
		this.panelAitken.setLayout(new BoxLayout(panelAitken, BoxLayout.Y_AXIS));
		this.panelAitken.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.panelAitken.setMaximumSize(new Dimension(Integer.MAX_VALUE, panelAitken.getPreferredSize().height));

		// centrado vertical
		this.panelAitken.add(Box.createVerticalGlue()); // espacio arriba
		this.panelAitken.add(botonPanel);
		botonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

		this.panelAitken.add(Box.createVerticalStrut(5)); // separación mínima
		this.panelAitken.add(sinInfo);
		sinInfo.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.panelAitken.add(Box.createVerticalGlue()); // espacio abajo
	}
	private void completarTablaAitken() {
		String[][] datos  = controllerMetodo.getMatrizAitken();
		String[] columnas = controllerMetodo.getColumnas();
		
		this.panelAitken.removeAll();
        if (datos.length == 0) {
            JLabel sinDatos = new JLabel(this.labelSinInfo.getText(), SwingConstants.CENTER);
            //sinDatos.setFont(new Font("SansSerif", Font.ITALIC, 14));
            //add(sinDatos, BorderLayout.CENTER);
        } else {
            this.tablaAitken = new JTable(datos, columnas);
            DefaultTableCellRenderer derecha = new DefaultTableCellRenderer();
            derecha.setHorizontalAlignment(SwingConstants.RIGHT);
            this.tablaAitken.getColumnModel().getColumn(2).setCellRenderer(derecha);

            this.scrollAitken = new JScrollPane(this.tablaAitken);
            this.scrollAitken.setBorder(new EmptyBorder(10, 10, 10, 10));
            this.scrollAitken.setPreferredSize(new Dimension(480, 150));
            this.scrollAitken.setMaximumSize(new Dimension(Integer.MAX_VALUE, 180));
            this.tablaAitken.setFillsViewportHeight(true);

            this.panelAitken.add(this.scrollAitken);
            this.tablaAitken.setFont(new Font("SansSerif", Font.PLAIN, 13));
        }
        this.panelAitken.revalidate();
        this.panelAitken.repaint();
        this.panelPrincipal.setPreferredSize(new Dimension(550,550));
	}
	
	private void armarPanelPricipal() {
		OyenteAcciones oyente = new OyenteAcciones();
		this.buttonCalcular.addActionListener(oyente);
		this.buttonAitken.addActionListener(oyente);
		this.comboMetodo.addItemListener(oyente);
		
		this.panelTabla.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.panelAitken.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		this.panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
		this.panelPrincipal.setBorder(new EmptyBorder(10,10,10,10));
		this.panelPrincipal.add(panelFuncion);
		this.panelPrincipal.add(panelMetodo);
		this.panelPrincipal.add(panelParametros);
		this.panelPrincipal.add(panelButtonCalcular);
		this.panelPrincipal.add(panelResultado);
		this.panelPrincipal.add(panelTabla);
		this.panelPrincipal.add(panelAitken);
		
		this.panelPrincipal.setPreferredSize(new Dimension(550,450));
		this.panelPrincipal.setBorder(BorderFactory.createCompoundBorder(
		    BorderFactory.createLineBorder(Color.BLACK, 1), // borde exterior negro
		    new EmptyBorder(15,20,15,20) // margen interior
		));
	}
	private void configGenerales() {
		JScrollPane scroll = new JScrollPane(panelPrincipal);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		add(scroll);
		
		setLayout(new FlowLayout());
		setSize(650,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
		
	//Clase Anidada
	private class OyenteAcciones implements ActionListener, ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			String itemSelected = (String)e.getItem();

			if(itemSelected.equals("") || itemSelected.equals("Bisección") || itemSelected.equals("Regula Falsi") || itemSelected.equals("Regula Falsi Modificada")) {
				labelB.setEnabled(true);
				textB.setEnabled(true);
				labelA.setText("a");
			}else {
				labelA.setText("x0");
				labelB.setEnabled(false);
				textB.setEnabled(false);
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Object fuente = e.getSource();
			double resultado;
			
			if(fuente == buttonCalcular) {
				int res = validarCampos();
				if(res == -1) {
					JOptionPane.showMessageDialog(null, "Se requiere ingresar una función.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if(res == -2) {
					JOptionPane.showMessageDialog(null, "Se requiere seleccionar un método.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if(res == -3) {
					JOptionPane.showMessageDialog(null, "Se requiere ingresar una tolerancia.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if(res == -4) {
					JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor inicial o extremo inferior de intervalo.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if(res == -5) {
					JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor extremo superior de intervalor.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				controllerMetodo = new MetodoController(textFuncion.getText());
				
				
				switch(comboMetodo.getSelectedIndex()) {
					case 1,2,3,4 -> {
						resultado = controllerMetodo.calcular(comboMetodo.getSelectedIndex(), Double.parseDouble(textA.getText()), Double.parseDouble(textB.getText()), Double.parseDouble(textEpsilon.getText()));
					}
					default -> {
						resultado = controllerMetodo.calcular(comboMetodo.getSelectedIndex(), Double.parseDouble(textA.getText()), Double.parseDouble(textEpsilon.getText()));
					}
					
				}
				
				if(!controllerMetodo.getError().isEmpty()) {
					JOptionPane.showMessageDialog(null, controllerMetodo.getError(), "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				textResultado.setText(String.valueOf(resultado));
				
				completarTabla();
				
				buttonAitken.setEnabled(true); //habilito aitken
				System.out.println("Reiniciar aitken, controlar el tamaño con las 2 tablas pintadas");
				/*panelAitken.removeAll();
				panelAitken.revalidate();
		        panelAitken.repaint();*/
				
			}else {
				int columna = -1;
				switch(comboMetodo.getSelectedIndex()) {
					case 6 -> columna = 2;
				}
				
				resultado = controllerMetodo.calcularAitken(columna,Double.parseDouble(textEpsilon.getText()));
				completarTablaAitken();
				buttonAitken.setEnabled(false);
			}
		}
		
		private int validarCampos() {
			int res = 0;
			if(textFuncion.getText().isEmpty()) {
				return res = -1;
			}
			if(comboMetodo.getSelectedIndex() == 0) {
				return res = -2;
			}
			if(textEpsilon.getText().isEmpty()) {
				return  res = -3;
			}
			if(textA.getText().isEmpty()) {
				return res = -4;
			}
			switch(comboMetodo.getSelectedIndex()) {
				case 0,1,2,3 -> {
					if(textB.getText().isEmpty()) {
						return res = -5;
					}
				} 
			}
			return res;
		}
		
	}
	
	//Main
	public static void main(String[] args) {
		new CalculadoraMetodos_GIU();
	}
}
