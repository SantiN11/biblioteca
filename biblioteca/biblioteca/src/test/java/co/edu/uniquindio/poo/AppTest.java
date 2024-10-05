/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");
        Biblioteca biblioteca = new Biblioteca("Rindemax", "Cra19", "3158305274");
        assertThrows(Throwable.class, () -> new Biblioteca(" ", " ", " "));
        LOG.info("Finalizando test datosVacios");
        
    }

    @Test
    void testAgregarBibliotecario() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Cra 1", "123456789");
        Bibliotecario bibliotecario = new Bibliotecario("Juan", "111", "3000000000", "juan@example.com", 1000, 5);
        
        biblioteca.agregarBibliotecarioABiblioteca(bibliotecario);
        
        assertEquals(1, biblioteca.getBibliotecarios().size());
        assertEquals(bibliotecario, biblioteca.getBibliotecarios().get(0));
    }

    @Test
    void testAgregarEstudiante() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Cra 1", "123456789");
        Estudiante estudiante = new Estudiante("Maria", "222", "3000000001", "maria@example.com", "Ingeniería", 0);
        
        biblioteca.agregarEstudianteABiblioteca(estudiante);
        
        assertEquals(1, biblioteca.getEstudiantes().size());
        assertEquals(estudiante, biblioteca.getEstudiantes().get(0));
    }

    @Test
void testAdicionarLibroAPrestamoSimple() {
    Estudiante estudiante = new Estudiante("Laura", "555", "3000000005", "laura@example.com", "Matemáticas", 0);
    Bibliotecario bibliotecario = new Bibliotecario("Pedro", "666", "3000000006", "pedro@example.com", 1500, 4);
    Libro libro = new Libro("003", "ISBN003", "Autor C", "Título C", LocalDate.now(), 3, 0);

    Prestamo prestamo = new Prestamo(estudiante, 1, bibliotecario);
    
    prestamo.agregarLibro(libro);

    assertEquals(1, prestamo.getLibros().size());
    
    assertEquals(2, libro.getUnidadesDisponibles());

    assertEquals(1, estudiante.getPrestamosRealizados());
    assertEquals(1, bibliotecario.getPrestamosRealizados());
}
    

    @Test
    void testCalcularPago() {
        Bibliotecario bibliotecario = new Bibliotecario("Juan", "123", "3001234567", "juan@example.com", 1000, 5);
        bibliotecario.setPrestamosRealizados(10);
        double pago = bibliotecario.calcularPago(5000);
        
        assertEquals(12000.0, pago, 0.01);
    }

    @Test
    void testSetPrestamosRealizados() {
        Bibliotecario bibliotecario = new Bibliotecario("Juan", "123", "3001234567", "juan@example.com", 1000, 5);
        bibliotecario.setPrestamosRealizados(5);
        assertEquals(5, bibliotecario.getPrestamosRealizados());
    }

    @Test
    void testAntiguedad() {
        Bibliotecario bibliotecario = new Bibliotecario("Juan", "123", "3001234567", "juan@example.com", 1000, 5);
        assertEquals(5, bibliotecario.getAntiguedad());
        bibliotecario.setAntiguedad(6);
        assertEquals(6, bibliotecario.getAntiguedad());
    }

    @Test
    void testPrestamosRealizados() {
        Estudiante estudiante = new Estudiante("Carlos", "12345", "3000000002", "carlos@example.com", "Matemáticas", 0);
        estudiante.setPrestamosRealizados(3);
        assertEquals(3, estudiante.getPrestamosRealizados());
    }

    @Test
    void testSetCurso() {
        Estudiante estudiante = new Estudiante("Carlos", "12345", "3000000002", "carlos@example.com", "Matemáticas", 0);
        estudiante.setCurso("Física");
        assertEquals("Física", estudiante.getCurso());
    }

    @Test
    void testToString() {
        Estudiante estudiante = new Estudiante("Carlos", "12345", "3000000002", "carlos@example.com", "Matemáticas", 0);
        String expected = "\n Estudiante: Carlos\n Curso: Matemáticas\n Cédula: 12345\n Teléfono: 3000000002\n Correo: carlos@example.com\n Curso: Matemáticas\n Prestamos realizados: 0\n\n";
        assertEquals(expected, estudiante.toString());
    }

    @Test
    void testPrestar() {
        Libro libro = new Libro("001", "ISBN001", "Autor A", "Título A", LocalDate.now(), 10, 0);
        libro.prestar();
        assertEquals(9, libro.getUnidadesDisponibles());
        assertEquals(1, libro.getPrestamosContados());
    }

    @Test
    void testConsultarPrestamos() {
        Libro libro = new Libro("001", "ISBN001", "Autor A", "Título A", LocalDate.now(), 10, 0);
        libro.prestar();
        assertEquals(1, libro.consultarPrestamos());
    }


    @Test
    void testAdicionarLibro() {
        Estudiante estudiante2 = new Estudiante("Sara", "12349", "3001234514", "SD@gmail.com", "Medicina", 2); 
        Bibliotecario bibliotecario = new Bibliotecario("Luis", "444", "3000000004", "luis@example.com", 1200, 3);
        Prestamo prestamo = new Prestamo(estudiante2, 2, bibliotecario);
        Libro libro1 = new Libro("123", "LL73e8397934", "Gabriel", "100 años de soledad", LocalDate.now(), 15,3);
        
        prestamo.agregarLibro(libro1);
        
        assertEquals(1, prestamo.getLibros().size());
        assertEquals(libro1, prestamo.getLibros().get(0));
        assertEquals(1, bibliotecario.getPrestamosRealizados());
        assertEquals(1, estudiante2.getPrestamosRealizados());
    }

    @Test
    void testAdicionarLibroSinUnidadesDisponibles() {
        Estudiante estudiante2 = new Estudiante("Sara", "12349", "3001234514", "SD@gmail.com", "Medicina", 2); 
        Bibliotecario bibliotecario1 = new Bibliotecario("Jose Manuel", "12345", "3001234567", "jose@gmail.com", 2000, 2);
        Prestamo prestamo = new Prestamo(estudiante2, 2, bibliotecario1);
        Libro libro = new Libro("002", "ISBN002", "Autor B", "Título B", LocalDate.now(), 0, 0);
        
        prestamo.agregarLibro(libro);
        
        assertEquals(0, prestamo.getLibros().size());
    }

    @Test
    void testCrearPrestamoConDatosCompletos() {
        Estudiante estudiante1 = new Estudiante("Alejo", "12340", "3001234532", "AB@Gmail", "ingenieria", 1);
        Bibliotecario bibliotecario = new Bibliotecario("Ana", "456", "3000000002", "ana@example.com", 1000, 5);
        Prestamo prestamo = new Prestamo(estudiante1, 1, bibliotecario);
    
        assertEquals(estudiante1, prestamo.getEstudiantes());
        assertEquals(bibliotecario, prestamo.getBibliotecario());
        assertEquals(1, prestamo.getCantidadPrestamo());
    }
}


