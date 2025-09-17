package adapter;

// Creamos el adaptador de la impresora
public class ImpresoraAdapter implements Impresora {

    private ImpresoraTexto impresoraTexto;

    // Constructor
    public ImpresoraAdapter() {
        this.impresoraTexto = new ImpresoraTexto();
    }

    // Definimos el metodo que adapta las impresiones a otros tipos
    @Override
    public void imprimir(String docType, String data) {
        if (docType.equalsIgnoreCase("txt")) {
            impresoraTexto.imprimirTexto(data);
        } else {
            System.out.println("Formato no soportado");
        }

    }
}
