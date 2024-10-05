package co.edu.uniquindio.poo;

public class Editorial {
    private String nombre;
    private int librosPublicados;

    
    public Editorial(String nombre, int librosPublicados) {
        this.nombre = nombre;
        this.librosPublicados = librosPublicados;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getLibrosPublicados() {
        return librosPublicados;
    }


    public void setLibrosPublicados(int librosPublicados) {
        this.librosPublicados = librosPublicados;
    }
    

    @Override
    public String toString() {
        return "Editorial: " + nombre + "\n Los libros Publicados: " + librosPublicados;
    }
    
}
