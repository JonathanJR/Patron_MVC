package principal;

import controlador.ControlConversor;
import modelo.ConversorMoneda;
import vista.VistaConversor;

/**
 *
 * @author Jonathan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorMoneda modelo = new ConversorMoneda();
        VistaConversor vista = new VistaConversor();
        ControlConversor controlador = new ControlConversor(vista, modelo);

        vista.setControlador(controlador);
        vista.arranca();
    }
}
