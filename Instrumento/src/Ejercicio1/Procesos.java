package Ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	
	public Procesos() {
		iniciar();
	}
	

	HashMap<String, ArrayList<String>>mapaUsuario = new HashMap<String, ArrayList<String>>();
	String menu, opc;
	
	private void iniciar() {
		menu = "menu principal\n";
		menu += "1. registrar\n";
		menu += "2. imprimir lista\n";
		menu += "3. salir\n";
		menu += "elije una opcion: ";
		
		do {
			opc = JOptionPane.showInputDialog(menu);
			menu(opc);
		} while (!opc.equalsIgnoreCase("3"));
	
		
	}

	private void menu(String opc) {
		switch (opc) {
		case "1": registrar(); break;
		case "2": imprimir(); break;
		case "3": JOptionPane.showConfirmDialog(null, "Gracias por utilizar el programa!!"); break;
		default:
			JOptionPane.showConfirmDialog(null, "ingrese una opcion valida");
			break;
		}
		
	}

	private void imprimir() {
		ArrayList<String>listaUsuarios = new ArrayList<String>();
		for (String doc : mapaUsuario.keySet()) {
			listaUsuarios = mapaUsuario.get(doc);
			System.out.println("----------------------------------");
			System.out.println("Documento: " + listaUsuarios.get(0));
			System.out.println("nombre: " + listaUsuarios.get(1));
			System.out.println("Salario Anual: " + listaUsuarios.get(2));
			System.out.println("Transporte: " + listaUsuarios.get(3));
			System.out.println("Vivienda: " + listaUsuarios.get(4));
			System.out.println("Ahorros: " + listaUsuarios.get(5));
			System.out.println("Gastos Personales: " + listaUsuarios.get(6));
			System.out.println("----------------------------------");
		}

	}

	private void registrar() {
		ArrayList<String> listaUsuario = new ArrayList<String>();
		ArrayList<Double> salariosDes = new ArrayList<>();
		listaUsuario.add(0,JOptionPane.showInputDialog("ingrese su documento"));
		listaUsuario.add(1,JOptionPane.showInputDialog("ingrese su nombre"));
		double salarioA = Double.parseDouble(JOptionPane.showInputDialog("ingrese su salarioo"));
		salariosDes = calularDivision(salarioA);
		
		listaUsuario.add(2,salarioA+"");
		listaUsuario.add(3,salariosDes.get(0)+"");
		listaUsuario.add(4,salariosDes.get(1)+"");
		listaUsuario.add(5,salariosDes.get(2)+"");
		listaUsuario.add(6,salariosDes.get(3)+"");
		
		mapaUsuario.put(listaUsuario.get(0),listaUsuario);
	}

	private ArrayList<Double> calularDivision(double salario) {
		ArrayList<Double> salariosDes = new ArrayList<>();
		double trans = salario*0.15;
		double vivienda  = salario*0.3;;
		double ahorro = salario*0.2;
		double gastPers = salario*0.35;
		
		salariosDes.add(0,trans);
		salariosDes.add(1,vivienda);
		salariosDes.add(2,ahorro);
		salariosDes.add(3,gastPers);
	
		return salariosDes;
	}

}
