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
	private void iniciarVistaControlada() {
		// Crear el panel interno dinámico
	    panelTerminos = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	    // Envolver con scroll
	    JScrollPane scrollPolinomio = new JScrollPane(panelTerminos);
	    scrollPolinomio.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    scrollPolinomio.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
	    scrollPolinomio.setPreferredSize(new Dimension(455, 55));
	
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
	    vista.setSize(545, 720); // Más ancho
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
	    vista.getPanelRaicesBairstow().setBorder(BorderFactory.createCompoundBorder(
			    new EmptyBorder(0, 0, 0, 0), // margen externo: 5px arriba
			    BorderFactory.createTitledBorder(
			        BorderFactory.createLineBorder(Color.GRAY),
			        "Raíces Bairstow",
			        TitledBorder.LEFT,
			        TitledBorder.TOP,
			        new Font("SansSerif", Font.BOLD, 12),
			        Color.GRAY
			    )
			));
	}	
	private void darAcciones() {
		vista.getButtonAgregar().addActionListener(e -> {if (gradoActual < 20) armarPolinomio(++gradoActual); });// Límite arbitrario
	    vista.getButtonQuitar().addActionListener(e -> { if (gradoActual > 0) armarPolinomio(--gradoActual); });
	    vista.getComboMetodo().addItemListener(e -> controlSelecMetodo());
	    vista.getButtonDivir().addActionListener(e-> controlarDividir());
	    vista.getButtonCalcularNewton().addActionListener(e-> controlarNewton());
	    vista.getButtonDetRaices().addActionListener(e -> determinarRaices());
	    vista.getComboMetodoCotas().addItemListener(e -> controlSelecMetodoCotas());
	    vista.getButtonCotas().addActionListener(e -> determinarCotas());
	    vista.getButtonRaicesBairstow().addActionListener(e -> determinarRaicesBairstow());
	}
	
	public boolean esInteger(String entrada) {
	    try {
	        Integer.parseInt(entrada);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
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
	
	//Horner
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
	
	//Newton
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
	
	//Det Raices
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
	}
	
	//Bairstow
	public void determinarRaicesBairstow() {
		String raicesStr, raices[];
		if(!validarCoeficientesPolinomio()) {
			JOptionPane.showMessageDialog(null, "Todos los coeficientes del polinomio deben ser números", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(controloCoeficientePrincipal()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor para el Coef. principal del polinomio", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		if(vista.getTextEpsilonBairstow().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor de tolerancia (Epsilon Bairstow).", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(!esDouble(vista.getTextEpsilonBairstow().getText())) {
			JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo Epsilon (Bairstow)", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
		    return;
		}
		if(vista.getTextR().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un r.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(!esDouble(vista.getTextR().getText())) {
			JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo r", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
		    return;
		}
		if(vista.getTextS().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un s.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(!esDouble(vista.getTextS().getText())) {
			JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo s", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
		    return;
		}
		
		if(vista.getTextMaxIter().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un Máx. Iter.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(!esInteger(vista.getTextMaxIter().getText())) {
			JOptionPane.showMessageDialog(null, "Debes ingresar un número válido en el campo Máx. Iter.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
		    return;
		}
		
		raicesStr = this.polinomioController.detRaicesReales(Double.parseDouble(vista.getTextEpsilonBairstow().getText()),Double.parseDouble(vista.getTextR().getText()),Double.parseDouble(vista.getTextS().getText()),Integer.parseInt(vista.getTextMaxIter().getText()));

		raices = raicesStr.split(";");
		vista.getTextReales().setText(raices[0]);
		vista.getTextImaginarias().setText(raices[1]);
	}
	
	//Cotas
	public void controlSelecMetodoCotas() {
		int metodo = vista.getComboMetodoCotas().getSelectedIndex(); 
		if(metodo == 3) {
			vista.getTextValorInicialCotas().setEnabled(false);
			vista.getCheckRefinar().setEnabled(false);
		}else { 
			vista.getTextValorInicialCotas().setEnabled(true);
			vista.getCheckRefinar().setEnabled(true);
		}
	}
	private boolean coefPrincipalPos(){
		return this.polinomioController.coefPrincipalPos();
	}
	private boolean alMenosUnNegativo() {
		return this.polinomioController.detAlMenosUnNeg();
	}
	public void determinarCotas() {
		if(!validarCoeficientesPolinomio()) {
			JOptionPane.showMessageDialog(null, "Todos los coeficientes del polinomio deben ser números.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		if(controloCoeficientePrincipal()) {
			JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor para el Coef. principal del polinomio.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		int metodo = vista.getComboMetodoCotas().getSelectedIndex();
		String cotasStr = "", cotas[];
		
		if(metodo == 0) {
			JOptionPane.showMessageDialog(null, "Se requiere seleccionar un método para determinarlas cotas.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		switch(metodo) {
			case 1,2 -> {
				if(vista.getTextValorInicialCotas().getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor inicial para el método.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if(!esDouble(vista.getTextValorInicialCotas().getText()) ) {
					JOptionPane.showMessageDialog(null, "Se requiere ingresar un valor inicial de cota válido.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				cotasStr = this.polinomioController.detCotas(metodo, Double.parseDouble(vista.getTextValorInicialCotas().getText()),vista.getCheckRefinar().isSelected());
			}
			case 3 -> {
				if(!coefPrincipalPos()) {
					JOptionPane.showMessageDialog(null, "Para aplicar el método de Lagrange el grado del polinomio debe ser positivo.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if(!alMenosUnNegativo()) {
					JOptionPane.showMessageDialog(null, "Para aplicar el método de Lagrange el polinomio debe tener al menos un término negativo.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				cotasStr = this.polinomioController.detCotas(metodo, 0, false);
			}
		}
		
		cotas = cotasStr.split(";");
		vista.getTextCotaInfNeg().setText(this.polinomioController.getErrorCotaInfNeg().isEmpty()? cotas[0] : this.polinomioController.getErrorCotaInfNeg());
		vista.getTextCotaSupNeg().setText(this.polinomioController.getErrorCotaSupNeg().isEmpty()? cotas[1] : this.polinomioController.getErrorCotaInfNeg());
		vista.getTextCotaInfPos().setText(this.polinomioController.getErrorCotaInfPos().isEmpty()? cotas[2] : this.polinomioController.getErrorCotaInfNeg());
		vista.getTextCotaSupPos().setText(this.polinomioController.getErrorCotaSupPos().isEmpty()? cotas[3] : this.polinomioController.getErrorCotaInfNeg());
		this.polinomioController.setErrores();
	}
}
