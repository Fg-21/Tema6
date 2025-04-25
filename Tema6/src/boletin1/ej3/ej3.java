package boletin1.ej3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ej3 {
	/*
	 * Crea con un editor el fichero de texto Alumnos.txt en la carpeta del proyecto
	 * y escribe en él los nombres, edades y estaturas de los alumnos de un grupo,
	 * cada uno en una línea: 
	 * juan 22 1.77 
	 * luis 21 1.80 
	 * pedro 20 1.73
	 * 
	 * Implementa
	 * un programa que lea del fichero los datos, muestre los nombres y calcule la
	 * media de la edad y de las estaturas, mostrándolas por pantalla.
	 * (Integer.parseInt, Double.parseDouble).
	 */
	
public static void main(String[] args) {
	//Lista de los nombres
	ArrayList<String> listaNombres = new ArrayList<String>();
	
	//Nombre actual para luego agregar a la lista
	String name;
	
	//Suma de las edades
	int sumaEdad = 0;
	
	//Suma de las alturas
	double sumaAltura = 0;
	
	//contador de iteraciones
	int cont = 0;
	
	
	//Scanner, si no se crea lanza una excepcion de que no ha encontrado el archivo	
	try (Scanner rd = new Scanner(new FileReader("src\\boletin1\\ej3\\Archivo.txt"))){
		
		do {
			//Se recoje el nombre del fichero
			name = rd.next();
			
			//Se adjuntan el nombre a la lista
			listaNombres.add(name);
			
			//se recoje la edad y se va sumando
			sumaEdad += rd.nextInt();
			
			//se recoje la altura y se va sumando
			sumaAltura += rd.nextDouble();
			
			//Incremento contador
			cont++;
			
		}while(rd.hasNext());
		
		
		
	} catch (FileNotFoundException e) {
		System.out.println("Archivo no encontrado");
	}
	
	//Imprime los nombres, la media de la altura y la media de la edad
	System.out.println(listaNombres + "\nMedia Altura: " + sumaAltura/cont + "\nMedia Edad: " + sumaEdad/cont);
	
	
	
}
}
