package dominio;

public class Articulo {
	
	private String nombre;
	private String descripcion;
	private String categoria;
	private int cantidad;
	private double precio;
	
	public Articulo() {}
	
	public Articulo(String nombre, String descripcion, String categoria, int cantidad, double precio) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.categoria=categoria;
		this.cantidad=cantidad;
		this.precio=precio;	
	}

	/**
	 * @return el dato de nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre para cargar en nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el dato de descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion para cargar en descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return el dato de categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria para cargar en categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return el dato de cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad para cargar en cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return el dato de precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio para cargar en precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
