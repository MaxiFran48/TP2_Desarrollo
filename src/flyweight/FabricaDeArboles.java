package flyweight;

import java.util.ArrayList;
import java.util.List;


public class FabricaDeArboles {

    // Creamos una lista para los arboles
    private List<Arbol> arboles = new ArrayList<>();

    public Arbol obtenerArbol (String tipoArbol, String color, String textura) {

        boolean existe = false;
        Arbol arbol = null;

        // Verificamos si el arbol ya existe
        for (Arbol arbolIteracion : this.arboles) {

            if (arbolIteracion.getColor().equals(color)
                    && arbolIteracion.getTipoArbol().equals(tipoArbol)
                    && arbolIteracion.getTextura().equals(textura)) {
                existe = true;
                arbol = arbolIteracion;
                break;
            }
        }

        if (arbol == null) {
            arbol = new ArbolConcreto(tipoArbol, color, textura);
            arboles.add(arbol);
        }

        return arbol;
    }

}
