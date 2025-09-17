package bridge;

public class Alerta extends TipoNotificacion{

    public Alerta(MedioNotificacion medioNotificacion) {
        super(medioNotificacion);
    }

    @Override
    public void enviarNotificacion(String notificacion) {
        System.out.println("Notificacion de alerta enviada por " + medioNotificacion.getMedio());
    }

}
