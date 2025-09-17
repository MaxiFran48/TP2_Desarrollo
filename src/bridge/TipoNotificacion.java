package bridge;

public abstract class TipoNotificacion {

    MedioNotificacion medioNotificacion;

    public TipoNotificacion(MedioNotificacion medioNotificacion) {
        this.medioNotificacion = medioNotificacion;
    }
    public abstract void enviarNotificacion(String notificacion);
}
