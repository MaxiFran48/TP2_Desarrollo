package proxy;

public class ArchivoProxy implements Archivo {

    private ArchivoReal archivo;

    public ArchivoProxy(String contenido) {
        this.archivo = new ArchivoReal(contenido);
    }

    // Definimos el metodo para mostrar el archivo
    @Override
    public void mostrar(Usuario usuario) {
        if (usuario.getAutorizado()) {
            archivo.mostrar(usuario);
        } else {
            System.out.println("Usuario no autorizado");
        }
    }


}
