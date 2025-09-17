package bridge;

public class Main {
    public static void main(String[] args) {

        TipoNotificacion alertaEmail = new Alerta(new Email());

        TipoNotificacion recordatorioSMS = new Recordatorio(new SMS());

        alertaEmail.enviarNotificacion("Notificacion de alerta");

        recordatorioSMS.enviarNotificacion("Notificacion de recordatorio");

    }
}
