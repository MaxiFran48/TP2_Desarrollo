package decorator;

public class conDescargasOffline extends PlanDecorator {

    public conDescargasOffline(Plan plan) {
        super(plan);
    }

    @Override
    public String descripcion() {
        return plan.descripcion() + " + Descargas Offline";
    }

    @Override
    public int costo() {
        return plan.costo() + 700;
    }

}
