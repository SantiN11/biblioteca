package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {

    private String nombre; 
    private String direccion; 
    private String telefono;
    private LinkedList<Bibliotecario> bibliotecarios;
    private LinkedList<Estudiante> estudiantes;
    private LinkedList<Libro> libros;
    private LinkedList<Prestamo> prestamos;


    public Biblioteca(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.bibliotecarios = new LinkedList<>();
        this.estudiantes = new LinkedList<>();
        this.libros = new LinkedList<>();
        this.prestamos = new LinkedList<>();
        assert !nombre.isBlank();
        assert !telefono.isBlank(); 
        assert !direccion.isBlank(); 

    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "\n Biblioteca: " + nombre + "\n Dirección: " + direccion + "\n Teléfono: " + telefono+ "\n\n";
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void agregarLibroABiblioteca(Libro libro){
        libros.add(libro);
    }

    public void agregarBibliotecarioABiblioteca(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    public void agregarEstudianteABiblioteca(Estudiante estudiante) {
        estudiantes.add(estudiante);

    }

    
    public void crearPrestamo(Estudiante estudiante, Bibliotecario bibliotecario) {
        Prestamo prestamo = new Prestamo(estudiante, 3, bibliotecario);
        prestamos.add(prestamo);
    }

    public void agregarLibroAPrestamo(Prestamo prestamo, Libro libro) {
        prestamo.agregarLibro(libro);
    }


    public Estudiante estudianteConMasPrestamos() {
        Estudiante maxEstudiante = null;
        int maxPrestamos = -1;
        
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getPrestamosRealizados() > maxPrestamos) {
                maxPrestamos = estudiante.getPrestamosRealizados();
                maxEstudiante = estudiante;
            }
        }
        return maxEstudiante;
    }


    public double totalAPagarBibliotecarios() {
        double total = 0.0;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            total += bibliotecario.calcularPago(5000); 
        }
        return total;
    }


    public int contarPrestamosPorLibro(String titulo) {
        int contador = 0;
        for (Prestamo prestamo : prestamos) {
            for (Libro libro : prestamo.getLibros()) {
                if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                    contador++;
                }
            }
        }
        return contador;
    }
    
}
