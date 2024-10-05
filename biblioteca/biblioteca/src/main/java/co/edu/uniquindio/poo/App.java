package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Rindemax", "Cra19", "3158305274");
        Biblioteca.mostrarMensaje(biblioteca.toString()); 

        
        Bibliotecario bibliotecario1 = new Bibliotecario("Jose Manuel", "12345", "3001234567", "jose@gmail.com", 2000, 2);
        biblioteca.agregarBibliotecarioABiblioteca(bibliotecario1);
        Biblioteca.mostrarMensaje(bibliotecario1.toString()); 

        Bibliotecario bibliotecario2 = new Bibliotecario("Santiago Nieto", "54321","3001234566", "SN@gmail.com", 1500, 3); 
        biblioteca.agregarBibliotecarioABiblioteca(bibliotecario2);
        Biblioteca.mostrarMensaje(bibliotecario2.toString());

        Bibliotecario bibliotecario3 = new Bibliotecario("Luisa", "13542", "3001234563", "luisa@gmail.com", 1300, 4);
        biblioteca.agregarBibliotecarioABiblioteca(bibliotecario3);
        Biblioteca.mostrarMensaje(bibliotecario3.toString());


       
        Estudiante estudiante1 = new Estudiante("Alejo", "12340", "3001234532", "AB@Gmail", "ingenieria", 1);
        biblioteca.agregarEstudianteABiblioteca(estudiante1);
        Biblioteca.mostrarMensaje(estudiante1.toString());

        Estudiante estudiante2 = new Estudiante("Sara", "12349", "3001234514", "SD@gmail.com", "Medicina", 2); 
        biblioteca.agregarEstudianteABiblioteca(estudiante2);
        Biblioteca.mostrarMensaje(estudiante2.toString());

        Estudiante estudiante3  = new Estudiante("Luis", "12348", "3001234565", "LJ@gmail.com", "enfermeria", 3);
        biblioteca.agregarEstudianteABiblioteca(estudiante3);
        Biblioteca.mostrarMensaje(estudiante3.toString()); 

     
        Libro libro1 = new Libro("123", "LL73e8397934", "Gabriel", "100 años de soledad", LocalDate.now(), 15,3);
        biblioteca.agregarLibroABiblioteca(libro1);
        Biblioteca.mostrarMensaje(libro1.toString());

        Libro libro2 = new Libro("321", "MM82u894hsbdh", "Daniel", "200 años de soledad", LocalDate.of(2015, 4, 30), 15, 2); 
        biblioteca.agregarLibroABiblioteca(libro2);
        Biblioteca.mostrarMensaje(libro2.toString());

        Libro libro3 = new Libro("213", "BB92u3u3898w9d", "Fernarndo", "300 años de soledad", LocalDate.of(2000, 6, 9), 15, 4);
        biblioteca.agregarLibroABiblioteca(libro3);
        Biblioteca.mostrarMensaje(libro3.toString());



        Prestamo prestamo1 = new Prestamo(estudiante1, 2, bibliotecario1);
        prestamo1.agregarLibro(libro1);
        Biblioteca.mostrarMensaje(prestamo1.toString());
        
    }

 }