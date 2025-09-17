package decorator;

public class conUltraHD extends PlanDecorator {

    public conUltraHD(Plan plan) {
        super(plan);
    }

    @Override
    public String descripcion() {
        return plan.descripcion() + " + UltraHD";
    }

    @Override
    public int costo() {
        return plan.costo() + 1000;
    }

}
