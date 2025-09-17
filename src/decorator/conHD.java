package decorator;

public class conHD extends PlanDecorator {

    public conHD(Plan plan) {
        super(plan);
    }

    @Override
    public String descripcion() {
        return plan.descripcion() + " + HD";
    }

    @Override
    public int costo() {
        return plan.costo() + 500;
    }

}
