package dominio;

import java.util.ArrayList;

public class Cliente {
	
	private int nroIdentificacion;
	private long dni;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private ArrayList<Domicilio> listaDomicilios = new ArrayList<Domicilio>();
	private Domicilio domicilioPrincipal;
	private ArrayList<Tarjeta> listaTarjetas = new ArrayList<Tarjeta>();
	private Tarjeta tarjetaPrincipal;
	
	public Cliente() {}
	
	public Cliente(int nroIdentificacion, long dni, String contrasenia, String nombre, String apellido, ArrayList<Domicilio> listaDomicilios, Domicilio domicilioPrincipal, ArrayList<Tarjeta> listaTarjetas, Tarjeta tarjetaPrincipal) {
		// TODO Auto-generated constructor stub
		this.nroIdentificacion=nroIdentificacion;
		this.dni=dni;
		this.contrasenia=contrasenia;
		this.nombre=nombre;
		this.apellido=apellido;
		this.listaDomicilios=listaDomicilios;
		this.domicilioPrincipal=domicilioPrincipal;
		this.listaTarjetas=listaTarjetas;
		this.tarjetaPrincipal=tarjetaPrincipal;
	}

	/**
	 * @return el dato de nroIdentificacion
	 */
	public int getNroIdentificacion() {
		return nroIdentificacion;
	}

	/**
	 * @param nroIdentificacion para cargar en nroIdentificacion
	 */
	public void setNroIdentificacion(int nroIdentificacion) {
		this.nroIdentificacion = nroIdentificacion;
	}

	/**
	 * @return el dato de dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * @param dni para cargar en dni
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * @return el dato de contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia para cargar en contrasenia
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
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
	 * @return el dato de apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido para cargar en apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return el dato de listaDomicilios
	 */
	public ArrayList<Domicilio> getListaDomicilios() {
		return listaDomicilios;
	}

	/**
	 * @param listaDomicilios para cargar en listaDomicilios
	 */
	public void setListaDomicilios(ArrayList<Domicilio> listaDomicilios) {
		this.listaDomicilios = listaDomicilios;
	}

	/**
	 * @return el dato de domicilioPrincipal
	 */
	public Domicilio getDomicilioPrincipal() {
		return domicilioPrincipal;
	}

	/**
	 * @param domicilioPrincipal para cargar en domicilioPrincipal
	 */
	public void setDomicilioPrincipal(Domicilio domicilioPrincipal) {
		this.domicilioPrincipal = domicilioPrincipal;
	}

	/**
	 * @return el dato de listaTarjetas
	 */
	public ArrayList<Tarjeta> getListaTarjetas() {
		return listaTarjetas;
	}

	/**
	 * @param listaTarjetas para cargar en listaTarjetas
	 */
	public void setListaTarjetas(ArrayList<Tarjeta> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}

	/**
	 * @return el dato de tarjetaPrincipal
	 */
	public Tarjeta getTarjetaPrincipal() {
		return tarjetaPrincipal;
	}

	/**
	 * @param tarjetaPrincipal para cargar en tarjetaPrincipal
	 */
	public void setTarjetaPrincipal(Tarjeta tarjetaPrincipal) {
		this.tarjetaPrincipal = tarjetaPrincipal;
	}

}
