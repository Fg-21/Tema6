package boletin1.ej4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej4Main {
	/*
	 * Diseña un programa que le pida cadenas de texto al usuario y que deje de
	 * pedirlas cuando el usuario introduzca “fin”. Se debe ir almacenando en un
	 * fichero cada cadena de texto introducida por el usuario, añadiendo un salto
	 * de línea al final de cada cadena.
	 */
	public static void main(String[] args) {
		//Scanner
		Scanner rd = new Scanner(System.in);
		
		//Cadenas de texto
		String cadena = "";
		
		//Buffer para escribir en el fichero
		try (BufferedWriter wr = new BufferedWriter(new FileWriter("src\\boletin1\\ej4\\Archivo.txt", true))){
			System.out.println("Introduce Texto para añadir al archivo");
			cadena = rd.nextLine();
			
			while((!cadena.equals("fin"))) {
				wr.write(cadena);
				wr.newLine();
				System.out.println("Introduce Texto para añadir al archivo");
				cadena = rd.nextLine();
			};
			
			//Cierro scanner
			rd.close();
		} catch (IOException e) {
			System.out.println("No se encuentra el archivo");
		} 
		}
		
		
	}

