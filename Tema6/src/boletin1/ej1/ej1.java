package boletin1.ej1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ej1 {
	//Ruta de acceso al archivo
	private static final String FICHERO= "src\\boletin1\\ej1\\texto.txt";

	/*
	 * Crea con un editor el fichero de texto NumerosReales.txt en un paquete dentro
	 * del proyecto. Escribe en él una serie de números reales separados por
	 * espacios simples. Implementar un programa que acceda a NumerosReales.txt, lea
	 * los números y calcule la suma y la media aritmética, mostrando los resultados
	 * por pantalla.
	 */
	public static void main(String[] args) {
		//Variable en la que se va a sumar el resultado
		int res = 0;
		
		//Contador de numeros
		int cont = 0;
		
		//Variable para guardar la media
		double media = 0;
		
		// Delcaracion del lector con el scanner, si se lanza la excepcion se imprime
		// que no se ha encontrado el archivo
		try (Scanner rd = new Scanner(new FileReader(FICHERO))) {
			do {
				res += rd.nextInt();
				cont++;
			}while (rd.hasNextInt()); 
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el archivo");
		}
		
		//Calculamos la media
		media = res/cont;
		
		//imprimimos el resultado
		System.out.println("Resultado de la suma: " + res);
		System.out.println("Resultado de la media: " + media);
	}
}
