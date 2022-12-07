package Persistencia;

/**
 * Clase que implementa el modelo Singleton la cual sirve para acceder a la base de datos MySql y realizar operaciones en esta.
 */
public class Agente {

	/**
	 * Instancia del agente
	 */
	protected Agente mInstancia = null;
	/**
	 * Atributo que sirve para conectarse a la base de datos
	 */
	protected Connection mBD;
	/**
	 * Driver para conectar con bases de datos MySQL
	 */
	private String Driver = com.mysql.cj.jdbc.Driver;

	/**
	 * Constructor de la clase Agente que implementa el modelo Singleton y que garantiza que solo haya una instancia de la clase, ya que el constructor es privado
	 */
	private Agente() {
		// TODO - implement Agente.Agente
		throw new UnsupportedOperationException();
	}

	/**
	 * Implementacion del patron singleton.
	 * Este patron de diseño permite implementar clases de las cuales solo existir una instancia.
	 */
	public Agente getAgente() {
		// TODO - implement Agente.getAgente
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo para realizar la conexion a la base de datos
	 */
	public void conectar() {
		// TODO - implement Agente.conectar
		throw new UnsupportedOperationException();
	}

	/**
	 * Método para desconectarse de la base de datos
	 */
	public void desconectar() {
		// TODO - implement Agente.desconectar
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo para realizar una insercion en la base de datos
	 * @param SQL Sentencia SQL
	 */
	public int insert(string SQL) {
		// TODO - implement Agente.insert
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo para realizar una eliminacion de la base de datos
	 * @param SQL Sentencia SQL
	 */
	public int delete(string SQL) {
		// TODO - implement Agente.delete
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo para actualizar la base de datos
	 * @param SQL Sentencia SQL
	 */
	public int update(string SQL) {
		// TODO - implement Agente.update
		throw new UnsupportedOperationException();
	}

	/**
	 * Metodo para seleccionar una busqueda de informacion de la base de datos. Cada vector contiene un vector de objetos con la informacion de cada entrada de la base de datos. Solo hará falta un método select ya que las tablas que utilizamos en nuestra base de datos tienen el mismo tamaño
	 * @param SQL Sentencia SQL
	 */
	public Vector<Vector<Object>> select(string SQL) {
		// TODO - implement Agente.select
		throw new UnsupportedOperationException();
	}

}