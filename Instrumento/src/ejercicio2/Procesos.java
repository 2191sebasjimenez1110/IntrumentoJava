package ejercicio2;

import java.util.ArrayList;


import javax.swing.JOptionPane;

public class Procesos {
	
	ArrayList<Double> valorVentas = new ArrayList<Double>();
	
	public Procesos() {
		iniciar();
	}

	private void iniciar() {
		int cantMes = Integer.parseInt(JOptionPane.showInputDialog("ingrese la canidad de meses que va a ingresar"));
		double val;
		for (int i = 0; i < cantMes; i++) {
			val = Double.parseDouble(JOptionPane.showInputDialog("ingrese el vlor de la venta del mes: " + i));
			valorVentas.add(i,val);
		}
		
		double valMar = ventaMayor();
		double valMer = ventaMenor();
		
		System.out.println("---------- Informe Ventas ----------");
		for (int i = 0; i < valorVentas.size(); i++) {
			System.out.println("mes " + (i+1) + " valor ventas: " + valorVentas.get(i));
		}
		System.out.println("mes con mas ventas: " + valMar);
		System.out.println("mes con menos ventas: " + valMer);
		System.out.println("------------------------------------");
	}

	private double ventaMayor() {
		double vent = valorVentas.get(0);
		for (int i = 0; i < valorVentas.size(); i++) {
			if (valorVentas.get(i) > vent) {
				vent = valorVentas.get(i);
			}
		}
		return vent;
		
	}

	private double ventaMenor() {
		double vent = valorVentas.get(0);
		for (int i = 0; i < valorVentas.size(); i++) {
			if (valorVentas.get(i) < vent) {
				vent = valorVentas.get(i);
			}
		}
		return vent;
		
	}


}
