package src.test.java.Ejercicio1;

import src.main.java.Ejercicio1.ElementoSimple;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementoSimpleTest {

    @Test
    public void testGetPrecio() {
        ElementoSimple elemento = new ElementoSimple(100.0, 1);
        assertEquals(100.0, elemento.getPrecio());
    }

    @Test
    public void testGetCodigo() {
        ElementoSimple elemento = new ElementoSimple(100.0, 1);
        assertEquals(1, elemento.getCodigo());
    }
}