package ejercicio4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	
	public Procesos() {
		iniciar();
	}

	ArrayList<Integer>numeros = new  ArrayList<Integer>();
	int sum = 0;
	
	private void iniciar() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de numeros: "));
		int num;
		for (int i = 0; i < n; i++) {
			num = validar(Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero" + (i+1))));
			numeros.add(num);
		}
		
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println("numero: " + numeros.get(i));
			sum += numeros.get(i);
		}
		
		System.out.println("suma total de los  ingresados numeros: " + sum);
		
	}

	private int validar(int num) {
		if (num <= 0) {
			do {
				JOptionPane.showConfirmDialog(null,"no puede ingresar numeros negativos");
				num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
			} while (num <= 0);
		}
		
		return num;
	}

}
