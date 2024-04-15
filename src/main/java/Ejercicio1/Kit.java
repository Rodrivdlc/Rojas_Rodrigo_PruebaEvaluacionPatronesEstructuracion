package src.main.java.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
/**
 * La clase Kit representa un kit en el sistema.
 * Implementa la interfaz Elemento y tiene una lista de elementos y un codigo.
 */
public class Kit implements Elemento {
    private List<Elemento> elementos = new ArrayList<>();
    private int codigo;

    /**
     * Constructor de la clase Kit.
     * @param codigo El codigo del kit.
     */
    public Kit(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Agrega un elemento al kit.
     * @param elemento El elemento a agregar.
     */
    public void addElemento(Elemento elemento) {
        elementos.add(elemento);
    }
    /**
     * Obtiene el precio del kit.
     * El precio se calcula como la suma de los precios de los elementos con un descuento del 10%.
     * @return El precio del kit.
     */
    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (Elemento elemento : elementos) {
            precioTotal += elemento.getPrecio();
        }
        return precioTotal * 0.9; // Aplicamos el descuento del 10%
    }
    /**
     * Obtiene el codigo del kit.
     * @return El codigo del kit.
     */
    @Override
    public int getCodigo() {
        return codigo;
    }
}