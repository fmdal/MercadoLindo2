package dominio;

import java.util.ArrayList;

public class Usuario extends Cliente {

	private Carrito usuarioCarrito;

	/**
	 * @param nroIdentificacion
	 * @param dni
	 * @param contrasenia
	 * @param nombre
	 * @param apellido
	 */
	public Usuario(int nroIdentificacion, long dni, String contrasenia, String nombre, String apellido) {
		super();
		this.nroIdentificacion = nroIdentificacion;
		this.dni = dni;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Usuario(Carrito usuarioCarrito, int nroIdentificacion, long dni, String contrasenia, String nombre,
			String apellido, ArrayList<Domicilio> listaDomicilios, Domicilio domicilioPrincipal,
			ArrayList<Tarjeta> listaTarjetas, Tarjeta tarjetaPrincipal) {
		super(nroIdentificacion, dni, contrasenia, nombre, apellido, listaDomicilios, domicilioPrincipal, listaTarjetas,
				tarjetaPrincipal);
		this.usuarioCarrito = usuarioCarrito;
		// TODO Auto-generated constructor stub
	}
}
