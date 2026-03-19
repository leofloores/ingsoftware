package mx.unam.fesa.ico.ejemplo1.controladores;

public class comida {
    private String nombre;
    private double precio;
    private String foto;

    public comida(String foto, String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "comida{" +
                "foto='" + foto + '\'' +
                ", nombre=" + nombre +
                ", precio='" + precio + '\'' +
                '}'; 
    }
}
