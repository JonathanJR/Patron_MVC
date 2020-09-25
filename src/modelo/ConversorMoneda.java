package modelo;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Jonathan
 */
public class ConversorMoneda {

    private HashMap<String, Double> monedas = new HashMap<>();

    public ConversorMoneda() {
        addMoneda("EURO", 1.0);
        addMoneda("DOLAR", 1.12);
        addMoneda("LIBRA", 0.86);
        addMoneda("BITCOIN", 0.0002);
    }

    private void addMoneda(String moneda, Double tipo) {
        monedas.put(moneda, tipo);
    }

    public double getTipo(String moneda) {
        return monedas.get(moneda);
    }

    public Double convertir(String origen, String destino, Double cantidad) {
        Double e = cantidad / getTipo(origen);
        return e * getTipo(destino);
    }

    public Set<String> getMonedas() {
        return monedas.keySet();
    }
}
