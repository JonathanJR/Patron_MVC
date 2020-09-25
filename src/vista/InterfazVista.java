package vista;

import controlador.ControlConversor;

/**
 *
 * @author Jonathan
 */
public interface InterfazVista {

    void setControlador(ControlConversor c);

    void arranca();

    double getCantidad();

    void escribeCambio(String s);
}
