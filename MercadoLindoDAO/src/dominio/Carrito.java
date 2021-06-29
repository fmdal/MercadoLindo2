package dominio;

import java.util.ArrayList;

public class Carrito {
	
	private int idCarrito;
	private boolean estadoCarrito;
	private ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
	private Domicilio domicilioElegido;
	private Tarjeta tarjetaElegida;
		
	public Carrito() {}
	
	public Carrito(int idCarrito, boolean estadoCarrito, ArrayList<Articulo> listaArticulos, Domicilio domicilioElegido, Tarjeta tarjetaElegida) {
		// TODO Auto-generated constructor stub
		this.idCarrito=idCarrito;
		this.estadoCarrito=estadoCarrito;
		this.listaArticulos=listaArticulos;
		this.domicilioElegido=domicilioElegido;
		this.tarjetaElegida=tarjetaElegida;
	}

	/**
	 * @return el dato de idCarrito
	 */
	public int getIdCarrito() {
		return idCarrito;
	}

	/**
	 * @param idCarrito para cargar en idCarrito
	 */
	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	/**
	 * @return el dato de estadoCarrito
	 */
	public boolean isEstadoCarrito() {
		return estadoCarrito;
	}

	/**
	 * @param estadoCarrito para cargar en estadoCarrito
	 */
	public void setEstadoCarrito(boolean estadoCarrito) {
		this.estadoCarrito = estadoCarrito;
	}

	/**
	 * @return el dato de listaArticulos
	 */
	public ArrayList<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	/**
	 * @param listaArticulos para cargar en listaArticulos
	 */
	public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

	/**
	 * @return el dato de domicilioElegido
	 */
	public Domicilio getDomicilioElegido() {
		return domicilioElegido;
	}

	/**
	 * @param domicilioElegido para cargar en domicilioElegido
	 */
	public void setDomicilioElegido(Domicilio domicilioElegido) {
		this.domicilioElegido = domicilioElegido;
	}

	/**
	 * @return el dato de tarjetaElegida
	 */
	public Tarjeta getTarjetaElegida() {
		return tarjetaElegida;
	}

	/**
	 * @param tarjetaElegida para cargar en tarjetaElegida
	 */
	public void setTarjetaElegida(Tarjeta tarjetaElegida) {
		this.tarjetaElegida = tarjetaElegida;
	}

}
