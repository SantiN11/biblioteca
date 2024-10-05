package co.edu.uniquindio.poo;

public class Estudiante extends Persona{

    private String curso;
    private int prestamosRealizados; 

    public Estudiante(String nombre, String cedula, String telefono, String correo, String curso, int prestamosRealizados) {
        super(nombre, cedula, telefono, correo);
        this.curso = curso;
        this.prestamosRealizados = prestamosRealizados; 
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPrestamosRealizados() {
        return prestamosRealizados;
    }


    public void setPrestamosRealizados(int prestamosRealizados) {
        this.prestamosRealizados = prestamosRealizados;
    }



    @Override
    public String toString() {
        return "\n Estudiante: " + nombre + "\n Cédula: " + cedula + "\n Teléfono: " + telefono + "\n Correo: " + correo+
        "\n Curso: "+curso+ "\n Prestamos realizados: " +prestamosRealizados+ "\n\n"; 
    }
} 
