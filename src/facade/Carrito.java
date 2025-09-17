package facade;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    // Creamos la lista de articulos
    private List<Articulo> articulos = new ArrayList<>();

    public void agregarArticulo (Articulo articulo) {
        this.articulos.add(articulo);
    }

    public void removerArticulo (Articulo articulo) {
        this.articulos.remove(articulo);
    }

    public List<Articulo> getArticulos () {
        return articulos;
    }

}
