/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import java.util.*;
/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class PruebaLibros {
      //Main que prueba los metodos y atributos de las clases Libro y Conjuntolibros
      public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        ConjuntoLibros x;
        x = new ConjuntoLibros("Coleccion de libros");
        System.out.println("Bienvenidos a "+x.getNombre());
        System.out.println(" ");
        int continuar = 1;
        int opcion;
        while(continuar == 1){
            System.out.println("PRUEBAS DISPONIBLES: ");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Eliminar Libro");
            System.out.println("3. Mostrar informacion de los libros existentes");
            System.out.println("4. Mostrar Lista de los libros existentes segun su calificacion ");
            System.out.println("Digite el numero de prueba que desea realizar: ");
            opcion = in.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el titulo del Libro");
                    String nombre = in.next();
                    System.out.println("Ingrese el autor del libro");
                    String artista = in.next();
                    System.out.println("Ingrese el numero de paginas del libro");
                    int numpaginas = in.nextInt();
                    System.out.println("Ingrese la calificacion del libro de 1 a 10 de acuerdo a cuanto te gusto");
                    int calificacion= in.nextInt();    
                    boolean resultado1 = x.agregarLibro(nombre,artista,numpaginas,calificacion);
                    if(resultado1 == true){
                        System.out.println("Se ha creado satisfactoriamente el Libro");
                    }else{
                        System.out.println("Problemas en la creacion del disco");
                    }
                    break;
                case 2:
                    int titulo_autor;
                    System.out.println("Escriba numero del criterio de busqueda del libro a eliminar:");
                    System.out.println("1. Titulo");
                    System.out.println("2. Autor");
                    titulo_autor = in.nextInt();
                    switch(titulo_autor){
                        case 1:
                            System.out.println("LISTA DE TITULOS:");
                            for (int j = 0; j < x.getNumlibros(); j++){
                                System.out.println(" - " + x.getLibro()[j].getTitulo());
                                }
                            System.out.println("Titulo del Libro a eliminar");
                            String titulo = in.next();   
                            boolean resultado2 = x.eliminarLibroTitulo(titulo);
                            if(resultado2 == true){
                                System.out.println("Se elimino el libro exitosamente");
                            }else{
                                System.out.println("Problemas en la eliminacion del libro");
                            }
                            break;
                        case 2:
                            System.out.println("LISTA DE AUTORES:");
                            for (int j = 0; j < x.getNumlibros(); j++){
                                System.out.println(" - " + x.getLibro()[j].getAutor());
                                }
                            System.out.println("Autor del Libro a eliminar");
                            String autor = in.next();   
                            boolean resultado3 = x.eliminarLibroAutor(autor);
                            if(resultado3 == true){
                                System.out.println("Se elimino el libro exitosamente");
                            }else{
                                System.out.println("Problemas en la eliminacion del libro");
                            }
                            break;
                        default:
                            System.out.println("Criterio de busqueda no disponible");
                            break;
                    }
                    
                    break;
                case 3:
                    if (x.getNumlibros() == 0){
                        System.out.println("Actualmente la coleccion no tiene libros");
                    }
                    x.mostrarContenido();
                    break;
                case 4:
                    x.mayorYmenorCalificacion();
                    break;
                default:
                    System.out.println("OPCION NO DISPONIBLE");
            }
            System.out.println("¿SALIR?");
                System.out.println("1. SI");
                System.out.println("2. NO");
                int respuesta = in.nextInt();
                switch (respuesta){
                    case 1:
                        continuar = 0;
                        break;
                    default:
                        continuar = 1;
                        break;
                }
        }
    }
}