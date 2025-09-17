package flyweight;

import java.util.concurrent.atomic.AtomicLong;

public class ArbolConcreto extends Arbol {

    public ArbolConcreto(String tipoArbol, String color, String textura) {
        super(tipoArbol, color, textura);
    }

    @Override
    public void generarArbol(int x, int y) {
        System.out.println("Generando un arbol en la posicion (" + x + ", " + y + ") del mapa...");
    }

}
