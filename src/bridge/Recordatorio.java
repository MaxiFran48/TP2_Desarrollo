package bridge;

public class Recordatorio extends TipoNotificacion {

    public Recordatorio(MedioNotificacion medioNotificacion) {
        super(medioNotificacion);
    }

    @Override
    public void enviarNotificacion(String notificacion) {
        System.out.println("Notificacion de recordatorio enviada por " + medioNotificacion.getMedio());
    }

}
