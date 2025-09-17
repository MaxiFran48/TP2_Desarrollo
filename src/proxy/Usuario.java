package proxy;

// Definimos el usuario que accede a los archivos
public class Usuario {
    private String name;
    private Boolean autorizado;

    public Usuario(String name, Boolean autorizado) {
        this.name = name;
        this.autorizado = autorizado;
    }

    public Boolean getAutorizado() {
        return this.autorizado;
    }

}
