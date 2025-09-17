package bridge;

public class Email implements MedioNotificacion {

    @Override
    public String getMedio() {
        return "Email";
    }

}
