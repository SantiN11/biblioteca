package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Prestamo {
    
    private int cantidadPrestamo;
    private LinkedList<Libro>libros;
    Estudiante estudiantes;
    Bibliotecario bibliotecario; 
    
    public Prestamo(Estudiante estudiantes, int cantidadPrestamo, Bibliotecario bibliotecario) {
        
        this.estudiantes = estudiantes;
        this.cantidadPrestamo = cantidadPrestamo;
        this.bibliotecario = bibliotecario;
        this.libros = new LinkedList<>();
    }

    public Estudiante getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getCantidadPrestamo() {
        return cantidadPrestamo;
    }

    public void setCantidadPrestamo(int cantidadPrestamo) {
        this.cantidadPrestamo = cantidadPrestamo;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        if (libro.getUnidadesDisponibles() > 0) {
            libro.prestar();
            libros.add(libro);
            bibliotecario.setPrestamosRealizados(bibliotecario.getPrestamosRealizados() + 1);
            estudiantes.setPrestamosRealizados(estudiantes.getPrestamosRealizados() + 1);
            libro.setPrestamosContados(libro.getPrestamosContados() + 1);
        } else {
            System.out.println("No hay unidades disponibles para el libro: " + libro.getTitulo());
        }
    }
    
}
