/**
 * 
 */
package ni.jug.aplicaciones.pico;

import ni.jug.aplicaciones.pico.Vistas.VentanaPrincipal;

/**
 * Clase principal para la aplicacion, 
 * aqui se validaran las preferencias, las configuraciones, los requisitos del sistema, etc.
 * una vez todo v�lido, procedremos a cargar la interfaz gr�fica.
 * @author oberroteran
 *
 */
public class PICO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//validaciones, 
		//seleccionar preferencias de interfaz grafica
		//cargar
		new VentanaPrincipal().main(args);
	}

}
