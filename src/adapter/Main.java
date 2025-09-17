package adapter;

public class Main {

    public static void main(String[] args) {

        // Creamos un adaptador
        Impresora impresora = new ImpresoraPDF();

        // Imprimimos un pdf
        impresora.imprimir("pdf", "Hola desde un archivo con formato PDF");

        // Imprimimos un txt
        impresora.imprimir("txt", "Hola desde un archivo con formato de texto ");



    }

}
