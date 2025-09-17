package facade;

import java.util.List;

public class Pago {

    private String metodoPago;

    public Pago (String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void pagar (Carrito carrito) {
        float montoTotal = 0;

        // Calculamos el monto total del pago
        for (Articulo articulo : carrito.getArticulos()) {
            montoTotal += articulo.getCosto();
        }

        System.out.println("El pago de $" + montoTotal + " hecho con " + this.metodoPago + " fue realizado exitosamente");

    }

}
