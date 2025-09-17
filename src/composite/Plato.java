package composite;

public class Plato implements ElementoMenu {

    private String nombre;

    public Plato(String nombre) {
        this.nombre = nombre;
    }

    // Definimos el metodo para mostrar el plato
    @Override
    public void mostrar(String identacion) {
        System.out.println(identacion + "-Plato: " + nombre);
    }
}
