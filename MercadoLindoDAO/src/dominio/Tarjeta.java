package dominio;
enum tipoTarjeta{credito, debito, prepaga}; 
public class Tarjeta {
	
	private long numero;
	private String marca;
	private String tipoTarjeta;
	//enum tipoTarjeta{credito, debito, prepaga}; 

	
	public Tarjeta() {}
	
	public Tarjeta(long numero, String marca, String tipoTarjeta) {
		// TODO Auto-generated constructor stub
		this.numero=numero;
		this.marca=marca;
		this.tipoTarjeta=tipoTarjeta;
	}

	/**
	 * @return el dato de numero
	 */
	public long getNumero() {
		return numero;
	}

	/**
	 * @param numero para cargar en numero
	 */
	public void setNumero(long numero) {
		this.numero = numero;
	}

	/**
	 * @return el dato de marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca para cargar en marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return el dato de tipoTarjeta
	 */
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	/**
	 * @param tipoTarjeta para cargar en tipoTarjeta
	 */
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

}
