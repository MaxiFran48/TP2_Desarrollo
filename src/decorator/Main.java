package decorator;

public class Main {

    public static void main(String[] args) {
        Plan plan = new PlanBasico();
        System.out.println(plan.descripcion());
        System.out.println("Costo: " + plan.costo());

        plan = new conHD(plan);
        System.out.println(plan.descripcion());
        System.out.println("Costo: " + plan.costo());

        plan = new conDescargasOffline(plan);
        System.out.println(plan.descripcion());
        System.out.println("Costo: " + plan.costo());
    }

}
