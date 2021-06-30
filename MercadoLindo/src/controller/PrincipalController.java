/**
 *
 *
 * @author Usalmove
 * @since 19 jun. 2021
 * Base
 * PrincipalController.java
 *
 * @version 0.0 Creacion del archivo.
 */
package controller;

import dominio.DemoPrincipal;
import views.frames.FramePrincipal;

/**
 * Clase de
 *
 * @author Usalmove
 * @since 19 jun. 2021
 * @version 0.0 Creacion del archivo.
 *
 *
 */
public class PrincipalController {

	/**
	 * @var Principal modelo
	 */
	private DemoPrincipal modelo = new DemoPrincipal();

	/**
	 * @var FramePrincipal vista
	 */
	private FramePrincipal vista;

	/**
	 * Constructor de la clase
	 *
	 */
	public PrincipalController() {
		// TODO Auto-generated constructor stub
	}

	public Object initPanel() throws Exception {
		FramePrincipal vista = new FramePrincipal();
		vista.getEvento().setDatos(this);
		vista.init();

//		vista.setVisible(true);

		return null;
	}

	/**
	 * @return el campo modelo
	 */
	public DemoPrincipal getModelo() {
		return modelo;
	}

	/**
	 * @param modelo El parametro modelo para setear
	 */
	public void setModelo(DemoPrincipal modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return el campo vista
	 */
	public FramePrincipal getVista() {
		return vista;
	}

	/**
	 * @param vista El parametro vista para setear
	 */
	public void setVista(FramePrincipal vista) {
		this.vista = vista;
	}

}
