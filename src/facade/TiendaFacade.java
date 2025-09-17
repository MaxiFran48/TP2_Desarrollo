package facade;

import java.util.Arrays;
import java.util.List;

public class TiendaFacade {

    private Envio envio;
    private Pago pago;
    private Carrito carrito;

    public TiendaFacade(Envio envio, Pago pago, Carrito carrito) {
        this.envio = envio;
        this.pago = pago;
        this.carrito = carrito;
    }

    public void comprar (Articulo... articulos) {
        // Usamos varargs para guardar los articulos en una lista

        // Guardamos todo en el carrito
        for (Articulo articulo : articulos) {
            carrito.agregarArticulo(articulo);
        }

        pago.pagar(carrito);

        envio.enviar();

        System.out.println("Compra realizada exitosamente");
    }

}
