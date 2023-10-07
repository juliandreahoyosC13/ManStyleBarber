
package com.mycompany.menstylebarber;

public class Persona {     
    private String nombre;
    private String apellido;
    private int id;
    //Se crea un atributo estatico para contar las personas (Usuario/Cliente).
    private static int contadorPersonas;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
