package decorator;

public class PlanBasico implements Plan {

    @Override
    public int costo() {
        return 1000;
    }

    @Override
    public String descripcion() {
        return "Plan basico";
    }



}
