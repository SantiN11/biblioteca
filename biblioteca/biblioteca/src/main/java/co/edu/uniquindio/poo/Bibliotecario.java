package co.edu.uniquindio.poo;


public class Bibliotecario extends Persona {

    private int salario;
    private int prestamosRealizados;
    private int antiguedad;
    

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, int salario, int antiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.prestamosRealizados = 0;
        this.antiguedad = antiguedad;
    }


    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getPrestamosRealizados() {
        return prestamosRealizados;
    }


    public void setPrestamosRealizados(int prestamosRealizados) {
        this.prestamosRealizados = prestamosRealizados;
    }


    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    @Override
    public String toString() {
        return " \n Bibliotecario: " + nombre + "\n Salario: " + salario + "\n Cédula: " + cedula + "\n Teléfono: "+ telefono + "\n Correo: " + correo+
         "\n Prestamos realizados: " +prestamosRealizados+ "\n Antiguedad: "+antiguedad+ "\n\n"; 
    }


    public double calcularPago(int valorPrestamo) {
        double comision = 0.20 * prestamosRealizados * valorPrestamo;
        double bonificacion = 0.02 * comision * antiguedad;
        return salario + comision + bonificacion;
    }
}
