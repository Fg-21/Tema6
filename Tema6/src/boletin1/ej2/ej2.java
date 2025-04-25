package boletin1.ej2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ej2 {
	//Ruta de acceso al archivo
	private static final String FICHERO= "src\\boletin1\\ej2\\Archivo.txt";
	
	
	/*
	 * Crear con un editor el fichero de texto Enteros.txt en la carpeta del
	 * proyecto y escribe en él una serie de números enteros separados por
	 * secuencias de espacios y tabuladores, incluso en líneas distintas, tal como:
	 * 
	 * 2 3 
	 * 
	 * 45       73     123
	 * 
	 * 4    21 
	 * 
	 * Implementar un programa que acceda a Enteros.txt con un
	 * objeto Scanner a través de un flujo de entrada, lea los números y calcule la
	 * suma y la media aritmética, mostrando los resultados por pantalla.
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
