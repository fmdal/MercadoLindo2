package dominio;

public class Domicilio {

	private String calle;
	private int numero;
	private int codigoPostal;
	private String localidad;
	
	public Domicilio() {}
	
	public Domicilio(String calle, int numero, int codigoPostal, String localidad) {
		// TODO Auto-generated constructor stub
		this.calle=calle;
		this.numero=numero;
		this.codigoPostal=codigoPostal;
		this.localidad=localidad;
	}

	/**
	 * @return el dato de calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle para cargar en calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return el dato de numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero para cargar en numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return el dato de codigoPostal
	 */
	public int getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal para cargar en codigoPostal
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return el dato de localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad para cargar en localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
