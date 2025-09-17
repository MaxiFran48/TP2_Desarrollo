package facade;

public class Envio {
    private String direccion;

    public Envio (String direcion) {
        this.direccion = direcion;
    }

    public void enviar () {
        System.out.println("Enviando compra a la direccion " + direccion);
    }
}
