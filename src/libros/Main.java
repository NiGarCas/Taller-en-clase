/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import java.util.Scanner;
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
            System.out.println("4. Mostrar Lista de los libros existentes ");
            opcion = in.nextInt();
            if(opcion == 1){
                
                
                System.out.println("Ingrese el titulo del Libro");
                String nombre = in.next();
                System.out.println("Ingrese el autor del libro");
                String artista = in.next();
                System.out.println("Ingrese el numero de paginas del libro");
                int numpaginas = in.nextInt();
                System.out.println("Ingrese la calificacion del libro de 1 a 10 de acuerdo a cuanto te gusto");
                int calificacion= in.nextInt();
                 
                boolean resultado =x.agregarLibro(nombre,artista,numpaginas,calificacion);
                
                if(resultado == true){
                    System.out.println("Se ha creado satisfactoriamente el Libro");
                }else{
                    System.out.println("Problemas en la creacion del disco");
                }
            }else if(opcion == 2){
                System.out.println("Titulo del Libro a eliminar");
                String titulo = in.next();
              
                
           boolean resultado=x.eliminarLibro(titulo);
                if(resultado == true){
                    System.out.println("Se elimino el libro satisfactoriamente");
                }else{
                    System.out.println("Problemas en la eliminacion del libro");
                }
            }else if(opcion == 3){
                 System.out.println("Lista de libros ");
                  
                 Libro[] libros= x.getLibro();
                for (int i = 0; i < x.getNumlibros(); i++) {
                    System.out.println("Libro"+"0"+i);
                    System.out.println(libros[i].getTitulo());
                    System.out.println(libros[i].getAutor());
                    System.out.println(libros[i].getNumeropaginas());
                    System.out.println(libros[i].getCalificacion());
                }
            
             
            }else if(opcion ==4){
            System.out.println("Ingrese nombre del libro");
            String nombre = in.next();
           
           x.darInformacionLibro(nombre);
          }else{  System.out.println("Opcion invalida");
           
            }
        
        }while(continuar == 1);
    
    }
      }
      
      

