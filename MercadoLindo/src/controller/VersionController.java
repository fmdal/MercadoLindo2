/**
 *
 *
 * @author Usalmove
 * @since 19 jun. 2021
 * Base
 * VersionController.java
 *
 * @version 0.0 Creacion del archivo.
 */
package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import views.panels.VersionPanel;

/**
 * Clase de
 *
 * @author Usalmove
 * @since 19 jun. 2021
 * @version 0.0 Creacion del archivo.
 *
 *
 */
public class VersionController extends ControladorPaneles {

	/**
	 * @var Properties propiedades
	 */
	private Properties propiedades;

	/**
	 * Constructor de la clase
	 *
	 * @throws IOException
	 * @throws FileNotFoundException
	 *
	 */
	public VersionController() throws FileNotFoundException, IOException {
		propiedades = new Properties();
		propiedades.load(new FileReader("config.propierties"));

		vista = new VersionPanel();
	}

}
