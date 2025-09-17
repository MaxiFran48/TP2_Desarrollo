package facade;

public class Main {
    public static void main(String[] args) {
        Envio envio = new Envio("Juan B. Justo 1439");
        Pago pago = new Pago("Mercado Pago");
        Carrito carrito = new Carrito();

        // Creamos la fachada
        TiendaFacade tienda = new TiendaFacade(envio, pago, carrito);

        // Creamos los articulos
        Articulo art1 = new Articulo("Remera", 10);
        Articulo art2 = new Articulo("Pantalon", 20);

        // Compramos con la fachada
        tienda.comprar(art1, art2);

    }
}
