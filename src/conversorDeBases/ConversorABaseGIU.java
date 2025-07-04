package conversorDeBases;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

//Vista
public class ConversorABaseGIU extends JFrame{
	//Atributos
	private JComboBox<String> comboBasePartida, comboBaseLlegada, comboMetodo;
	private JLabel labelTitulo, labelBasePartida, labelBaseLlegada, labelNro, labelMetodo, labelResultado;
	private JTextField textNro, textResultado;
	private JButton buttonCalcular, buttonCambiarBases;
	private JPanel panelPrincipal, panelTitle, panelBasePartida,panelIcono , panelBaseLlegada, panelNro, panelMetodo, panelBoton, panelResultado;
	private NroSistNumeracion nro;
	private NroControllerConverter nroController;
	
	//Constructor
	public ConversorABaseGIU() {
		super("Conversor de Bases");
		estilosGenerales();
		initComponents();
		armarPanelTitle();
		armarPanelBasePartida();
		armarPanelIconoInvertir();
		armarPanelBaseLlegada();
		armarPanelNro();
		armarPanelMetodo();
		armarPanelBoton();
		armarPanelResultado();
		armarPanelPrincipal();
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
		String[] bases  = {"", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"},
				metodos = {"", "Suma ponderada", "Multiplicación reiterada", "División reiterada", "Método directo"};
		
		//Combobox's
		this.comboBasePartida = new JComboBox<String>(bases);
		this.comboBaseLlegada = new JComboBox<String>(bases);
		this.comboMetodo 	  = new JComboBox<String>(metodos);
		
		//Label's
		this.labelTitulo      = new JLabel("Conversor de Bases");
		this.labelBasePartida = new JLabel("Base de Origen");
		this.labelBaseLlegada = new JLabel("Base de Llegada");
		this.labelNro 		  = new JLabel("Número");
		this.labelMetodo	  = new JLabel("Método");
		this.labelResultado   = new JLabel("Resultado");
		
		//TextField's
		this.textNro	   = new JTextField(15);
		this.textResultado = new JTextField(15);
		
		//Button
		this.buttonCalcular 	= new JButton("Calcular");
		this.buttonCambiarBases = new JButton(new ImageIcon(getClass().getResource("/img/dos-flechas.png")));
		
		//Panel's
		this.panelTitle       = new JPanel();
		this.panelBasePartida = new JPanel(new GridLayout(2,1));
		this.panelIcono 	  = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		this.panelBaseLlegada = new JPanel(new GridLayout(2,1));
		this.panelNro 		  = new JPanel(new GridLayout(2,1));
		this.panelMetodo 	  = new JPanel(new GridLayout(2,1)); 
		this.panelBoton 	  = new JPanel();
		this.panelResultado   = new JPanel(new GridLayout(2,1));
		this.panelPrincipal   = new JPanel();
	}
	
	private void armarPanelTitle() {
		labelTitulo.setFont(new Font("SansSerif", Font.BOLD, 18));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		this.panelTitle.add(labelTitulo);
	}
	private void armarPanelBasePartida() {
		this.panelBasePartida.add(labelBasePartida);
		this.panelBasePartida.add(comboBasePartida);
	}
	private void armarPanelIconoInvertir(){
		this.buttonCambiarBases.setBorderPainted(false);
		this.buttonCambiarBases.setFocusPainted(false);
		this.buttonCambiarBases.setContentAreaFilled(false);
		this.buttonCambiarBases.setToolTipText("Intercambio de bases");
		
		this.panelIcono.add(this.buttonCambiarBases);
		//this.panelIcono.setMaximumSize(new Dimension(Integer.MAX_VALUE, panelIcono.getPreferredSize().height));
	}
	private void armarPanelBaseLlegada() {
		this.panelBaseLlegada.add(labelBaseLlegada);
		this.panelBaseLlegada.add(comboBaseLlegada);
	}
	private void armarPanelNro() {
		this.panelNro.add(labelNro);
		this.panelNro.add(textNro);
	}
	private void armarPanelMetodo() {
		this.panelMetodo.add(labelMetodo);
		this.panelMetodo.add(comboMetodo);
	}
	private void armarPanelBoton() {
		this.panelBoton.add(buttonCalcular);
	}
	private void armarPanelResultado() {
		this.panelResultado.add(labelResultado);
		this.panelResultado.add(textResultado);
	}
	
	private void armarPanelPrincipal() {
		OyenteBoton oyente = new OyenteBoton();
		this.buttonCalcular.addActionListener(oyente);
		this.buttonCambiarBases.addActionListener(oyente);

		this.panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
		this.panelPrincipal.setBorder(new EmptyBorder(20,20,20,20));

		this.panelPrincipal.add(panelTitle);
		this.panelPrincipal.add(panelBasePartida);
		this.panelPrincipal.add(panelIcono);
		this.panelPrincipal.add(panelBaseLlegada);
		this.panelPrincipal.add(panelNro);
		this.panelPrincipal.add(panelMetodo);
		this.panelPrincipal.add(panelBoton);
		this.panelPrincipal.add(panelResultado);
		this.panelPrincipal.setPreferredSize(new Dimension(300,400));
		this.panelPrincipal.setBorder(BorderFactory.createCompoundBorder(
		    BorderFactory.createLineBorder(Color.BLACK, 1), // borde exterior negro
		    new EmptyBorder(20,20,20,20) // margen interior
		));
	}
	private void configGenerales() {
		setLayout(new FlowLayout());
		add(panelPrincipal);
		setSize(400,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	//Clase Anidada
	private class OyenteBoton implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object fuente = e.getSource();
			if(fuente == buttonCalcular) {
				//controlo que se haya seleccionado una base de partida e ingresado un nro
				boolean res = controlarNroBasePart();
				if(!res) {
					JOptionPane.showMessageDialog(null, "Debe ingresar un Nro y seleccionar una base de partida.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				//Instancia el nro, y controlo que los caracteres del nro correspondan a caracteres de su base
				nro = new NroSistNumeracion(textNro.getText(), Integer.parseInt((String)comboBasePartida.getSelectedItem()));
				res = nro.controlarNro();
				if(!res) {
					JOptionPane.showMessageDialog(null, "Existe algun digito que es mayor o igual a su base.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				//controlo que se haya seleccionado método y base de partida
				res = controlarBaseFinMetodo();
				if(!res) {
					JOptionPane.showMessageDialog(null, "Se requiere ingresar una base de llegada y un método de conversion.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				//creo el objeto que maneja los métodos de conversion
				nroController = new NroControllerConverter(nro, comboMetodo.getSelectedIndex(), comboBaseLlegada.getSelectedIndex() + 1);
				
				//hago las validaciones de las bases y los métodos antes de poder convertir ese nro a esa base y por ese método 
				//no es de cualquier base a cualquiera base
				int resp = controlarBases();
				
				switch(resp) {
					case 0 -> {
						JOptionPane.showMessageDialog(null, "Ocurrió un error no determinado. Revisar.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					case -1 -> {
						JOptionPane.showMessageDialog(null, "El método seleccionado solo funcionará cuando la base de llegada sea 10", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					case -2 -> {
						JOptionPane.showMessageDialog(null, "El método seleccionado solo funcionará cuando la base de partida sea 10", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					case -3 -> {
						JOptionPane.showMessageDialog(null, "El método dirtecto solo funcionará cuando las bases sean potencias una de la otra", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					case 4 -> {
						textResultado.setText(textNro.getText());
						return;
					}
				}
				
				//Controlo que el método se pueda aplicar si el nro es entero o decimal
				resp = controloNroMetodos();
				if(resp == -1) {
					JOptionPane.showMessageDialog(null, "El método seleccionado es solo para números enteros.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				
				//convertir
				System.out.println("convertir...");
				String nroNvo = nroController.convertir();
				textResultado.setText(nroNvo);
			}else {
				Object baseOrigen = comboBasePartida.getSelectedItem();
				Object baseDestino = comboBaseLlegada.getSelectedItem();

				comboBasePartida.setSelectedItem(baseDestino);
				comboBaseLlegada.setSelectedItem(baseOrigen);
			}
		}
		private boolean controlarNroBasePart() {
			boolean res = true;
			if(textNro.getText().isEmpty() || comboBasePartida.getSelectedIndex() == 0) {
				res = false;
			}
			return res;
		}
		private boolean controlarBaseFinMetodo() {
			return !(comboBaseLlegada.getSelectedIndex() == 0 || comboMetodo.getSelectedIndex() == 0);
		}
		private int controlarBases() {
			int opcionBaseLlegada  = comboBaseLlegada.getSelectedIndex() + 1, 
				opcionBasePartida  = comboBasePartida.getSelectedIndex() + 1,
				opcionMetodoSelect = comboMetodo.getSelectedIndex();
			
			//si son iguales
			if(opcionBaseLlegada == opcionBasePartida) {
				return 4;
			}
			
			int res = 0;
			//si el metodo es suma ponderada de enteros o decimales
			if(opcionMetodoSelect == 1) {
				//solo si la base llegada es 10 deja, sino error
				if(opcionBaseLlegada == 10) {
					res = 1;
				}else res = -1;
				//si el método es division o multiplicacion reiterada 
			}else if(opcionMetodoSelect == 3 || opcionMetodoSelect == 2) {
				//solo si la base de partida es base 10, sino error
				if(opcionBasePartida == 10) {
					res = 2;
				}else res = -2;
			}else if(opcionMetodoSelect == 4) {//metodo directo
				switch(opcionBasePartida) {
					case 2 -> {
						switch(opcionBaseLlegada) {
							case 4,8,16 -> res = 3;
							default -> res = -3;
						}
					}
					case 3 -> {
						switch(opcionBaseLlegada) {
							case 9 -> res = 3;
							default -> res = -3;
						}
					}
					case 4 -> {
						switch(opcionBaseLlegada) {
							case 2,16 -> res = 3;
							default -> res = -3;
						}
					}
					case 8 -> {
						switch(opcionBaseLlegada) {
							case 2 -> res = 3;
							default -> res = -3;
						}
					}
					case 9 -> {
						switch(opcionBaseLlegada) {
							case 3 -> res = 3;
							default -> res = -3;
						}
					}
					case 16 -> {
						switch(opcionBaseLlegada) {
							case 2,4 -> res = 3;
							default -> res = -3;
						}
					}
				}
			}
			return res;
		}
		private int controloNroMetodos() {
			int res = 1;
			if(nro.getNro().contains(".") && comboMetodo.getSelectedIndex() == 3) {
				res = -1;
			}
			return res;
		}
	}
	
	//Main
	public static void main(String[] args) {
		//ConversorABaseGIU c = new ConversorABaseGIU();
	    new ConversorABaseGIU();
	}
}
