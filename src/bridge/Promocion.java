package bridge;

public class Promocion extends TipoNotificacion {

    public Promocion(MedioNotificacion medioNotificacion) {
        super(medioNotificacion);
    }

    @Override
    public void enviarNotificacion(String notificacion) {
        System.out.println("Notificacion de promocion enviada por " + medioNotificacion.getMedio());
    }

}
