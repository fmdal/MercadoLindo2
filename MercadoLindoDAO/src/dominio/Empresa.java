package dominio;

import java.util.ArrayList;

public class Empresa extends Cliente {

	private ArrayList<Articulo> articulosEnVenta = new ArrayList<Articulo>();
		
	public Empresa() {}
	
	public Empresa(ArrayList<Articulo> articulosEnVenta, int nroIdentificacion, long dni, String contrasenia, String nombre, String apellido, ArrayList<Domicilio> listaDomicilios, Domicilio domicilioPrincipal, ArrayList<Tarjeta> listaTarjetas, Tarjeta tarjetaPrincipal) {
		super (nroIdentificacion, dni, contrasenia,  nombre, apellido, listaDomicilios, domicilioPrincipal, listaTarjetas, tarjetaPrincipal);
		this.articulosEnVenta=articulosEnVenta;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return el dato de articulosEnVenta
	 */
	public ArrayList<Articulo> getArticulosEnVenta() {
		return articulosEnVenta;
	}

	/**
	 * @param articulosEnVenta para cargar en articulosEnVenta
	 */
	public void setArticulosEnVenta(ArrayList<Articulo> articulosEnVenta) {
		this.articulosEnVenta = articulosEnVenta;
	}

}
