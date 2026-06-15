package model;

//Clase que representa un Tour ofrecido por la Empresa
public class Tour {

    //atributos del Tour
    private String nombre; //Nombre del Tour
    private String tipo; // tipo de Tour: Cultural, Lacustre, Aventura, etc.
    private double precio; //Valor en pesos Chilenos


    //Constructor: inicializa el objeto con sus datos.
    public Tour(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    //Getters & Setters: permite obtener y modificar el valor de cada atributo.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Representación en texto del objeto Tour
    @Override
    public String toString() {
        return "Tour " +
                "nombre = '" + nombre + '\'' +
                ", tipo = '" + tipo + '\'' +
                ", precio = " + precio +
                '.';
    }
}
