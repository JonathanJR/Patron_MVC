package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import modelo.ConversorMoneda;
import vista.VistaConversor;

/**
 *
 * @author Jonathan
 */
public class ControlConversor implements ActionListener {

    private VistaConversor vista;
    private ConversorMoneda modelo;

    public ControlConversor(VistaConversor vista, ConversorMoneda modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.llenarComboBoxMonedas(modelo.getMonedas());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Double cantidad = vista.getCantidad();
        String origen = vista.getOrigen();
        String destino = vista.getDestino();
        Double resultado = modelo.convertir(origen, destino, cantidad);
        DecimalFormat df = new DecimalFormat("#,######.#######");
        vista.escribeCambio(df.format(resultado));

    }

}
