package flyweight;

public class Main {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        FabricaDeArboles fabrica = new FabricaDeArboles();

        // Generamos un millon de arboles en el mapa
        for (int i = 0; i < 300000; i++) {
            Arbol arbol = fabrica.obtenerArbol("Abeto", "Blanco", "Liso");
            arbol.generarArbol(x, y);
            y += 10;
        }

        for (int i = 0; i < 300000; i++) {
            Arbol arbol = fabrica.obtenerArbol("Acacia", "Marron", "Rugoso");
            arbol.generarArbol(x, y);
            x += 10;
            y += 10;
        }

        for (int i = 0; i < 100000; i++) {
            Arbol arbol = fabrica.obtenerArbol("Roble", "Marron", "Liso");
            arbol.generarArbol(x, y);
            y += 10;
        }

        for (int i = 0; i < 300000; i++) {
            Arbol arbol = fabrica.obtenerArbol("Pino", "Marron oscuro", "Seca");
            arbol.generarArbol(x, y);
            x += 10;
        }

    }
}
