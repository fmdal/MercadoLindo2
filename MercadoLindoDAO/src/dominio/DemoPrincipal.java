/**
 *
 *
 * @author
 * @since 19 jun. 2021
 * BaseDAO
 * Principal.java
 *
 * @version 0.0 Creacion del archivo.
 */
package dominio;

import java.util.ArrayList;

/**
 * Clase principal que organiza el flujo de datos del sistema, contile los
 * listados de informacion que el sistema utilizara durante su vida util.
 *
 * @author
 * @since 19 jun. 2021
 * @version 0.0 Creacion del archivo.
 *
 *
 */
public class DemoPrincipal {

	private ArrayList<Articulo> articulos = new ArrayList<>();
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Carrito> carritos = new ArrayList<>();

	Cliente usuario;

	/**
	 * Constructor de la clase
	 * 
	 */
	public DemoPrincipal() {
		super();
		cargar();
		// TODO Auto-generated constructor stub
	}

	public void cargar() {
		articulos.add(
				new Articulo("maraca", "Se usa para revolear al suegro en el carnaval careoca", "percusion", 1000, 10));
		articulos.add(new Articulo("flauta", "A veces es dulce", "viento", 50, 50));
		articulos.add(new Articulo("corno", "Musica para infidelidades", "viento", 10, 1000));
		articulos.add(new Articulo("corneta", "Como el corno pero con beta", "viento", 2, 700));
		articulos.add(new Articulo("saxofon", "Pa pa pa parara pa pa papapapa", "viento", 10, 125));
		articulos.add(new Articulo("armonica", "Limite de tolerancia de 5 minutos", "viento", 80, 200));
		articulos.add(new Articulo("clarinete", "Muy agudo", "viento", 17, 100));
		articulos.add(new Articulo("piano", "Me canse de tocar escalas", "percusion", 200, 10000));
		articulos
				.add(new Articulo("guitarra", "Por favor no tocar Flaca o Muchacha ojos de papel", "cuerda", 600, 100));
		articulos.add(new Articulo("arpa", "Juego de angeles", "cuerda", 10, 15000));
		articulos.add(new Articulo("oboe", "Lo sabe tocar Terry Crews", "viento", 34, 300));
		articulos.add(new Articulo("timbal", "El preferido de Tito Puentes", "percusion", 43, 500));
		articulos.add(new Articulo("violin", "No es un ukelele", "cuerda", 10, 2000));
		articulos.add(new Articulo("bajo", "No se escucha y lo confunden con una guitarra", "cuerda", 200, 5000));
		articulos.add(new Articulo("desafinaducha",
				"Tremolando que, mezclado con el fluir del agua, produce un peculiar sonido", "percusion", 1, 10000));
		articulos.add(new Articulo("cordofono",
				"Producen sonido por medio de la vibración de cuerdas pulsadas por el hombre", "cuerda", 1, 10));
		articulos.add(new Articulo("narguilófono", "Tenía la particularidad de echar humo", "cuerda", 1, 1));
		articulos.add(new Articulo("clamaneus", "Clamaneus viene a ser Suenamal-C, o sea «suena mal en do»", "viento",
				1, 100000));
		articulos.add(new Articulo("glamocot", "Si se lee glamocot al revés es «toco mal G»", "viento", 1, 90000));
		articulos.add(new Articulo("nomeolbidet",
				"Basado en el violín y en el organistrum, un instrumento medieval a partir de unos tubos de PVC y de un bidet",
				"viento", 1, 100000));

		int i = 0;
		clientes.add(new Usuario(i++, 0, "0", "Dios", "=)"));
		clientes.add(new Usuario(i++, 39562144, "123", "Juan", "Palotes"));
		clientes.add(new Usuario(i++, 39562145, "123", "Flaco", "Gomez"));
		clientes.add(new Usuario(i++, 39562146, "123", "Manuel", "Dario"));
		clientes.add(new Usuario(i++, 39562147, "123", "Johann Sebastian", "Mastropiero"));
		clientes.add(new Usuario(i++, 39562148, "123", "Miguel", "Suarez"));
		clientes.add(new Usuario(i++, 39562149, "123", "Ricky", "Ricon"));
		clientes.add(new Usuario(i++, 39562150, "123", "Jhonny", "Bravo"));
		clientes.add(new Usuario(i++, 39562151, "123", "Susana", "Gimenez"));
		clientes.add(new Usuario(i++, 39562152, "123", "Cacho", "Castañas"));
		clientes.add(new Usuario(i++, 39562153, "123", "Atahualpa", "Yupanki"));
		clientes.add(new Usuario(i++, 39562154, "123", "Mercedes", "Sosa"));
		clientes.add(new Usuario(i++, 39562155, "123", "Hanna", "Barbera"));
		clientes.add(new Usuario(i++, 39562156, "123", "Hana", "Vaquera"));
		clientes.add(new Usuario(i++, 39562157, "123", "Miguel", "Abuelo"));
		clientes.add(new Usuario(i++, 39562158, "123", "Harley", "Davidson"));
		clientes.add(new Usuario(i++, 39562159, "123", "Bob", "Marley"));
		clientes.add(new Usuario(i++, 39562164, "123", "Paul", "McCarney"));
		clientes.add(new Usuario(i++, 39562174, "123", "Homero", "Simpson"));
		clientes.add(new Usuario(i++, 39562184, "123", "Ricky", "Martin"));
		clientes.add(new Usuario(i++, 39562194, "123", "Lalo", "Landas"));

		clientes.add(new Empresa(i++, 38562144, "123", "DiosSA"));
		clientes.add(new Empresa(i++, 37562144, "123", "AlaSA"));
		clientes.add(new Empresa(i++, 36562144, "123", "ThorSA"));
		clientes.add(new Empresa(i++, 35562144, "123", "ZeusSA"));

		int f = 0;
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(1616, "amex", "credito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(1615, "provincia", "debito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(1614, "bancoGrande", "prepaga"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(1613, "frances", "credito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(1612, "hsbc", "credito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(1611, "amex", "debito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(1610, "chinaBank", "debito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(1609, "casaBlanca", "credito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(1608, "fundacionSiSi", "debito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(1607, "pagosGrandes", "prepaga"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(16126, "amex", "credito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(16215, "provincia", "debito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(16214, "bancoGrande", "prepaga"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(12613, "frances", "credito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(16212, "hsbc", "credito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(16211, "amex", "debito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(16120, "chinaBank", "debito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(162209, "casaBlanca", "credito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(16028, "fundacionSiSi", "debito"));
		clientes.get(f++).getListaTarjetas().add(new Tarjeta(16207, "pagosGrandes", "prepaga"));

		f = 0;
		clientes.get(f++).getListaDomicilios().add(new Domicilio("SiempreViva", 123, 1616, "VillaMaipu"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Bermudez", 111, 1640, "VicenteLopez"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Maipu", 1400, 1640, "VicenteLopez"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("SantaFe", 800, 1640, "SanIsidro"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("JuanJosePaso", 1600, 1616, "DonTorcuato"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Saavedra", 1500, 1414, "Tigre"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Posadas", 1700, 1212, "Florida"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Mendoza", 1400, 1900, "Pilar"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Curupaiti", 1800, 3232, "Munro"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Mariachita", 1800, 6464, "Munro"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("SiempreViva", 123, 1616, "VillaMaipu"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Bermudez", 111, 1640, "VicenteLopez"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Maipu", 1400, 1640, "VicenteLopez"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("SantaFe", 800, 1640, "SanIsidro"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("JuanJosePaso", 1600, 1616, "DonTorcuato"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Saavedra", 1500, 1414, "Tigre"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Posadas", 1700, 1212, "Florida"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Mendoza", 1400, 1900, "Pilar"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Curupaiti", 1800, 3232, "Munro"));
		clientes.get(f++).getListaDomicilios().add(new Domicilio("Mariachita", 1800, 6464, "Munro"));

	}

	/**
	 * @return el campo articulos
	 */
	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}

	/**
	 * @param articulos El parametro articulos para setear
	 */
	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}

	/**
	 * @return el campo clientes
	 */
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * @param clientes El parametro clientes para setear
	 */
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	/**
	 * @return el campo carritos
	 */
	public ArrayList<Carrito> getCarritos() {
		return carritos;
	}

	/**
	 * @param carritos El parametro carritos para setear
	 */
	public void setCarritos(ArrayList<Carrito> carritos) {
		this.carritos = carritos;
	}

	/**
	 * @return el campo usuario
	 */
	public Cliente getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario El parametro usuario para setear
	 */
	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
	}
}
