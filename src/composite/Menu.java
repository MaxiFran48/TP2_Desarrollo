package composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu {

    private String nombre;
    private List<ElementoMenu> elementosMenu = new ArrayList<>();


    public Menu(String nombre) {
        this.nombre = nombre;
    }

    // Definimos el metodo para agregar elementos al menu
    public void agregarElemento (ElementoMenu elementoMenu) {
        elementosMenu.add(elementoMenu);
    }


    // Definimos el metodo para mostrar los menus, en este caso la identacion ayuda a mostrar los elementos de forma ordenada
    @Override
    public void mostrar(String identacion) {
        System.out.println(identacion + "Menu: " + nombre);
        for (ElementoMenu elementoMenu : elementosMenu) {
            elementoMenu.mostrar(identacion + "   ");
        }
    }
}
