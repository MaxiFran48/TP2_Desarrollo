package adapter;

public class ImpresoraPDF implements Impresora {

    private ImpresoraAdapter impresoraAdapter;

    // Definimos el metodo de impresion de PDF
    @Override
    public void imprimir(String docType, String data) {

        if (docType.equalsIgnoreCase("pdf")) {
            // Si el formato es PDF podemos imprimirlo
            System.out.println("PDF: " + data);

        } else {
            // Si el formato es otro debemos usar un adpatador
            this.impresoraAdapter = new ImpresoraAdapter();
            impresoraAdapter.imprimir(docType, data);
        }

    }

}
