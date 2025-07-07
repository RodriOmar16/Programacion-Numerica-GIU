package resolucionEcuacionesNOlineales;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CalculadoraMetodos_GIU extends JFrame{
	//Atributos
	private JLabel labelFuncion, labelMetodo, labelEpsilon, labelA, labelB, labelResultado, labelTraza, labelTrazaAitken;
	private JTextField textFuncion, textEpsilon, textA, textB, textResultado;
	private JComboBox<String> comboMetodo;
	private JButton buttonCalcular, buttonAitken;
	private JTable tabla, tablaAitken;
	private JScrollPane scrollTabla, scrollAitken;
	private JPanel panelPrincipal, panelFuncion, panelMetodo, panelParametros, panelButtonCalcular, panelResultado, panelTabla, panelAitken;
	
	//Constructor
	public CalculadoraMetodos_GIU() {
		initComponents();
		armarPanelFuncion();
		configGenerales();
	}
	
	//Methods
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
		
		//textField's
		this.textFuncion   = new JTextField(15); 
		this.textEpsilon   = new JTextField(5);
		this.textA         = new JTextField(5);
		this.textB		   = new JTextField(5);
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
		this.panelParametros	 = new JPanel(new GridLayout(2,3));
		this.panelButtonCalcular = new JPanel();
		this.panelResultado		 = new JPanel(new GridLayout(2,1));
		this.panelTabla			 = new JPanel(new GridLayout(2,1));
		this.panelAitken		 = new JPanel(new GridLayout(2,1));
	}
	private void armarPanelFuncion() {
		
	}
	
	private void configGenerales() {
		setLayout(new FlowLayout());
		add(panelPrincipal);
		setSize(300,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	//Clase Anidada
	private class OyenteBotones implements ActionListener, ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	//Main
	public static void main(String[] args) {
		new CalculadoraMetodos_GIU();
	}
}
