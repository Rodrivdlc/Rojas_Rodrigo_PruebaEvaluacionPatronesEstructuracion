package src.test.java.Ejercicio1;


import src.main.java.Ejercicio1.ElementoSimple;
import src.main.java.Ejercicio1.Kit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KitTest {

    @Test
    public void testGetPrecio() {
        ElementoSimple silla = new ElementoSimple(100.0, 1);
        ElementoSimple mesa = new ElementoSimple(200.0, 2);

        Kit kit = new Kit(3);
        kit.addElemento(silla);
        kit.addElemento(mesa);

        // El precio total debería ser la suma de los precios de los elementos con un descuento del 10%
        double expectedPrice = (silla.getPrecio() + mesa.getPrecio()) * 0.9;
        assertEquals(expectedPrice, kit.getPrecio());
    }

    @Test
    public void testGetCodigo() {
        Kit kit = new Kit(3);
        assertEquals(3, kit.getCodigo());
    }
}