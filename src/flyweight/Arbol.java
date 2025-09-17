package flyweight;

public abstract class Arbol {

    // Definimos la estructura de un arbol

    protected final String tipoArbol;
    protected final String color;
    protected final String textura;

    public Arbol(String tipoArbol, String color, String textura) {
        this.tipoArbol = tipoArbol;
        this.color = color;
        this.textura = textura;
    }

    public String getTipoArbol() {
        return tipoArbol;
    }

    public String getColor() {
        return color;
    }

    public String getTextura() {
        return textura;
    }

    abstract public void generarArbol(int x, int y);
}
