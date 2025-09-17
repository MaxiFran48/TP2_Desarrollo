package proxy;

class ArchivoReal implements Archivo {

    private String contenido;

    public ArchivoReal(String contenido) {
        this.contenido = contenido;
    }


    @Override
    public void mostrar(Usuario usuario) {
        System.out.println("Archivo: " + contenido);
    }

}
