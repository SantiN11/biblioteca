package co.edu.uniquindio.poo;

public class DetallePrestamo {

    Libro libro; 
    private int cantidadPrestamosLibros;
    
    public DetallePrestamo(Libro libro, int cantidadPrestamosLibros) {
        this.libro = libro;
        this.cantidadPrestamosLibros = cantidadPrestamosLibros;
    }
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public int getCantidadPrestamosLibros() {
        return cantidadPrestamosLibros;
    }
    public void setCantidadPrestamosLibros(int cantidadPrestamosLibros) {
        this.cantidadPrestamosLibros = cantidadPrestamosLibros;
    }
    
    @Override
    public String toString() {
        return "Detalle Prestamo:\n Libro: " + libro + "\n Cantidad Prestamos Libros: " + cantidadPrestamosLibros;
    } 
}    

