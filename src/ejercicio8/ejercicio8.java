package ejercicio8;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nombAlumno;
		int edadAlumno;
		int cantInscriptos; 
		System.out.println("Ingrese su nombre completo: ");
		nombAlumno = entrada.nextLine();
		
		while (nombAlumno.isBlank()) {
			System.err.println("Error: El nombre no puede quedar vacío. Inténtelo de nuevo:");
			nombAlumno = entrada.nextLine();
		
	}
		System.out.println("Ingrese su edad: ");
		edadAlumno = entrada.nextInt();
 
		while (edadAlumno <0) {
			System.err.println("Intentelo nuevamente, no se pueden numeros negativos!");
			edadAlumno = entrada.nextInt();
		} 
		for (int i = 0; i < cantInscriptos; i++) {
			
		}    
		
		
		
		System.out.println("---LISTA FINAL---");
		
		System.out.println("Cantidad " + cantInscriptos + " de inscripciones");
		System.out.println("-Alumno/a: " + nombAlumno);  
		System.out.println("-Edad: " + edadAlumno + " Años ");
        
		if (edadAlumno<18) {	 
			System.out.println("-El alumno/a es menor de edad. ");
		}
		
		if (edadAlumno>=18) {
			System.out.println("-El alumno/a es mayor de edad. ");
		}
	 	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
