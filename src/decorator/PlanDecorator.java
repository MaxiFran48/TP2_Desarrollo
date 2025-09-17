package decorator;

abstract class PlanDecorator implements Plan {
    protected Plan plan;

    public PlanDecorator(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String descripcion() {
        return plan.descripcion();
    }

    @Override
    public int costo() {
        return plan.costo();
    }

}
