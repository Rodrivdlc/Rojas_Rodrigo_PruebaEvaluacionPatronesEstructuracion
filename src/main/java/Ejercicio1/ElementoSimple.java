package src.main.java.Ejercicio1;

/**
 * La clase ElementoSimple representa un elemento simple en el sistema.
 * Implementa la interfaz Elemento y tiene dos atributos: precio y codigo.
 */
public class ElementoSimple implements Elemento {
    private double precio;
    private int codigo;
    /**
     * Constructor de la clase ElementoSimple.
     * @param precio El precio del elemento simple.
     * @param codigo El codigo del elemento simple.
     */
    public ElementoSimple(double precio, int codigo) {
        this.precio = precio;
        this.codigo = codigo;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }
}