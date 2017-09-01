/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import java.util.*;
/**
 *
 * @author El PcGamer
 */
public class Main {
      public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
        ConjuntoLibros x = new ConjuntoLibros("Biblioteca central");
        System.out.println("Bienvenidos a"+x.getNombre());
                int continuar = 1, opcion = 0;
        do{
            System.out.println("1. Agregar Libro");
            System.out.println("2. Eliminar Libro");
            System.out.println("3. Mostrar informacion de los libros existentes");
            System.out.println("4. Mostrar Lista de los libros existentes segun su calificacion ");
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
                    System.out.println("Titulo del Libro a eliminar");
                    String titulo = in.next();   
                    boolean resultado2 = x.eliminarLibro(titulo);
                    if(resultado2 == true){
                        System.out.println("Se elimino el libro satisfactoriamente");
                    }else{
                        System.out.println("Problemas en la eliminacion del libro");
                    }
                    break;
                case 3:
                    System.out.println("Lista de libros ");
                    Libro[] libros= x.getLibro();
                    for (int i = 0; i < x.getNumlibros(); i++) {
                        System.out.println("Libro"+"0"+i);
                        System.out.println(libros[i].getTitulo());
                        System.out.println(libros[i].getAutor());
                        System.out.println(libros[i].getNumeropaginas());
                        System.out.println(libros[i].getCalificacion());
                    }
                    break;
                case 4:
                    x.mayorYmenorCalificacion();
                    break;
                default:
                    System.out.println("OPCION NO DISPONIBLE");
            }
        }while(continuar == 1);
    }
}
      
      

