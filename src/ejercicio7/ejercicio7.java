package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nomProducto;
		int cantProducto;
		
		System.out.println("Ingrese nombre de un producto: ");
		nomProducto = entrada.nextLine();
		while (nomProducto.isBlank()) {
			System.err.println("Error: El nombre no puede quedar vacío. Inténtelo de nuevo:");
			nomProducto = entrada.nextLine();

		}
		System.out.println("Ingrese cuantas unidades hay: ");
		cantProducto = entrada.nextInt(); 
		
		while (cantProducto <0) {
			System.out.println("Intentelo nuevamente, no se pueden numeros negativos!");
			cantProducto = entrada.nextInt();
		}
		if (cantProducto < 5) {

			System.out.println(" Alerta! (Menos de 5 unidades). Stock bajo!!");
		}

		System.out.println("---MENU DE PRODUCTOS---");
		System.out.println("Nombre del ultimo producto ingresado: " + nomProducto);
		System.out.println("cantidad del producto: " + cantProducto);

	}

}
