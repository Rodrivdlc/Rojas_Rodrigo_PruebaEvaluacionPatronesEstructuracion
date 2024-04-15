package src.main.java.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ElementoSimple silla = new ElementoSimple(100.0, 1);
        ElementoSimple mesa = new ElementoSimple(200.0, 2);

        Kit kit = new Kit(3);
        kit.addElemento(silla);
        kit.addElemento(mesa);

        System.out.println("Precio del kit: " + kit.getPrecio());
    }
}
