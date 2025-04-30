package biblioteca.clases;

/**
 * Clase Libro, que implementa la interfaz comparable. Tiene como atributos el
 * título, el autor, el ISBM, y si está presatdo o no. No tiene métodos
 * adicionales al constructor y a los getters y setters. Como métodos de
 * override contiene toString, equals y compareTo
 */
public class Libro implements Comparable<Libro> {

	/**
	 * Atributo para el título del libro. Por defecto es "DefaultTitle" 
	 */
	private String titulo = "DefaultTitle";
	/**
	 * Atributo para el autor del libro. Por defecto es "DefaultAuthor"
	 */
	private String autor = "DefaultAuthor";
	/**
	 * Atributo para el isbn del libro. Por defecto es 0000000000000
	 */
	private long isbn = 0000000000000;
	/**
	 * Atributo para ver si el libro está prestado. Por defecto no lo está
	 */
	private boolean prestado = false;
	
	/**
	 * Constructor del libro con todos sus atributos
	 * @param titulo Título del libro
	 * @param autor Autor del libro
	 * @param isbn ISBN del libro. Tiene que tener 13 dígitos
	 * @param prestado Estado del libro (True si es prestado false en caso contrario)
	 */
	public Libro(String titulo, String autor, long isbn, boolean prestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.prestado = prestado;
	}





	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
