package dominio;

import java.util.ArrayList;

public class Usuario extends Cliente {

	private Carrito usuarioCarrito;
	
	public Usuario() {}
	
	public Usuario(Carrito usuarioCarrito, int nroIdentificacion, long dni, String contrasenia, String nombre, String apellido, ArrayList<Domicilio> listaDomicilios, Domicilio domicilioPrincipal, ArrayList<Tarjeta> listaTarjetas, Tarjeta tarjetaPrincipal) {
		super (nroIdentificacion, dni, contrasenia,  nombre, apellido, listaDomicilios, domicilioPrincipal, listaTarjetas, tarjetaPrincipal);
		this.usuarioCarrito=usuarioCarrito;
		// TODO Auto-generated constructor stub
	}
}
