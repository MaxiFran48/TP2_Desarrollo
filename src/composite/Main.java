package composite;

public class Main {
    public static void main(String[] args) {

        Plato plato1 = new Plato("Ñoquis");
        Plato plato2 = new Plato("Lomo");
        Plato plato3 = new Plato("Fideos");

        Menu menu1 = new Menu("Pastas");
        Menu menu2 = new Menu("Lunes");

        // Agregamos los ñoquis y fideos al menu de pastas
        menu1.agregarElemento(plato1);
        menu1.agregarElemento(plato3);

        // Agregamos el menu de pastas y el lomo al menu de los lunes
        menu2.agregarElemento(plato2);
        menu2.agregarElemento(menu1);

        // Mostramos el menu
        menu2.mostrar("");
    }
}
