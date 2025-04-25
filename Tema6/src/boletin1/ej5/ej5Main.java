package boletin1.ej5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej5Main {
	/*
	 * Diseña una aplicación que pida al usuario su nombre y edad. Estos datos deben
	 * guardarse en el fichero datos.txt. Si este fichero existe, deben añadirse al
	 * final en una nueva línea, y en caso de no existir, debe crearse.
	 */

	public static void main(String[] args) {
		
		//Creacion del scanner
		Scanner rd = new Scanner(System.in);

		//Cadena para el nombre
		String nombre;
		
		//Entero para la edad
		int edad;
		
		//Creamos el fichero si no existe
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src\\boletin1\\ej5\\Archivo.txt"))){
			//Pedimos datos
			System.out.println("Nombre");
			nombre = rd.nextLine();
			System.out.println("Edad");
			edad = rd.nextInt();
			
			//Ponemos en el documento
			bw.write(nombre + " ");
			bw.write(String.valueOf(edad));
		
			
		} catch (IOException e) {
			System.out.println("Error:" + e.getMessage());
		}
		
		//Cierro scanner
		rd.close();
	}
}
