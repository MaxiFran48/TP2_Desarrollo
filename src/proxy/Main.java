package proxy;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Maxi", false);
        Usuario usuario2 = new Usuario("Juli", true);

        Archivo archivo = new ArchivoProxy("Hola, soy un archivo");

        archivo.mostrar(usuario1);
        archivo.mostrar(usuario2);
    }
}
