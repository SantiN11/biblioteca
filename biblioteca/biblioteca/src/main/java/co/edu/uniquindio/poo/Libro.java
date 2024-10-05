package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Libro {

    private String codigo;
    private String isbn;
    private String autor;
    private String titulo;
    private LocalDate fecha;
    private int unidadesDisponibles;
    private int prestamosContados;

    
    public Libro(String codigo, String isbn, String autor, String titulo, LocalDate fecha, int unidadesDisponibles,
        int prestamosContados) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.fecha = fecha;
        this.unidadesDisponibles = unidadesDisponibles;
        this.prestamosContados = prestamosContados;
    }
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }
    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
   
    public int getPrestamosContados() {
        return prestamosContados;
    }

    @Override
    public String toString() {
        return "\n Código del libro: " + codigo + "\n isbn: " + isbn + "\n Autor: " + autor + "\n Titulo: " + titulo + "\n Fecha: "
                + fecha + "\n Unidades Disponibles: " + unidadesDisponibles+ "\n Prestamos contados: "+prestamosContados+ "\n\n"; 
    }


    public void prestar() {
        if (unidadesDisponibles > 0) {
            unidadesDisponibles--;
            prestamosContados++;
        } else {
            System.out.println("La biblioteca no cuenta con las unidades disponibles del libro : " + titulo);
        }
    }

    public int consultarPrestamos() {
        return prestamosContados;
    }


    public void setPrestamosContados(int prestamosContados) {
        this.prestamosContados = prestamosContados;
    }
    
}