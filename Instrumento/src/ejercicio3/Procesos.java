package ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {

		public Procesos(){
			iniciar();
		}
		
		HashMap<String, ArrayList<String>>mapaEmpleado = new HashMap<String, ArrayList<String>>();
		String menu, opc;
		
		private void iniciar() {
			
			
			do {
				menu = "menu principal\n";
				menu += "1. registrar\n";
				menu += "2. imprimir lista\n";
				menu += "3. salir\n";
				menu += "elije una opcion: ";
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
			for (String doc : mapaEmpleado.keySet()) {
				listaUsuarios = mapaEmpleado.get(doc);
				System.out.println("----------------------------------");
				System.out.println("Documento: " + listaUsuarios.get(0));
				System.out.println("nombre: " + listaUsuarios.get(1));
				System.out.println("Valor Venta: " + listaUsuarios.get(2));
				System.out.println("Tipo Vendedor: " + listaUsuarios.get(3));
				System.out.println("Comision: " + listaUsuarios.get(4));
				System.out.println("----------------------------------");
			}
			
			
		}

		

		private double calcularComision(double valVentas, String cat) {
			switch (cat) {
			case "A": return valVentas*0.08;
			case "B": return valVentas*0.06;
			case "C": return valVentas*0.04;
			case "D": return valVentas*0.02;
			default:
				break;
			}
			return 0;
		}

		private void registrar() {
			ArrayList<String>listaUsuario = new ArrayList<String>();
			listaUsuario.add(0,JOptionPane.showInputDialog("ingrese su documento"));
			listaUsuario.add(1,JOptionPane.showInputDialog("ingrese su nombre"));
			double valVentas = Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor de la venta"));
			menu = "Categorial\n";
			menu += "-A\n";
			menu += "-B\n";
			menu += "-C\n";
			menu += "-D\n";
			menu += "elije una opcion: ";
			String cat = JOptionPane.showInputDialog(menu).toUpperCase();
			
			double Valcomision = calcularComision(valVentas,cat);
			listaUsuario.add(2,valVentas+"");
			listaUsuario.add(3,cat);
			listaUsuario.add(4,Valcomision+"");
			
			mapaEmpleado.put(listaUsuario.get(0), listaUsuario);
		}
}
