package raicesDePolinomios_Graficadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;

public class test extends JFrame{
	
	private GraficadorPanel grafico;
	
	public test() {
		List<Double> coef = new ArrayList<Double>(); //null;//List.of(4.0, 5.0, -2.0, 1.0,-7.0); // x³ - 6x² + 11x - 6
        List<Double> raices = new ArrayList<Double>();//List.of(0.9625, -1.8618); // raíces reales

		
        grafico = new GraficadorPanel(coef);
		grafico.setRaices(raices);
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        add(grafico);
        setVisible(true);
	}
	
	public static void main(String[] args) {
		//new test();
		new PoliCalcViewController();
	}
}
