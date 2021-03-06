package ar.com.eduit.curso.java.entities;
//En las clases abstract no se pueden crear objetos de esa clase, si se pueden crear clases hijas
//En las clases final no se pueden crear clases hijas
public abstract class Persona {
    private String nombre;
    private String apellido;
    private Direccion direccion;

    public Persona(String nombre, String apellido, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    
    public void saludar(){
        System.out.println("Hola soy una persona.");
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
}
