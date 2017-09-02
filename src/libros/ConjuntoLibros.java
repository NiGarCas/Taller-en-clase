/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class ConjuntoLibros {
    private String nombre;
    private Libro[] libro;
    private int numlibros;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro[] getLibro() {
        return libro;
    }

    public void setLibro(Libro[] libro) {
        this.libro = libro;
    }

    public int getNumlibros() {
        return numlibros;
    }

    public void setNumlibros(int numlibros) {
        this.numlibros = numlibros;
    }
 
    public ConjuntoLibros(String nombre) {
        this.nombre = nombre;
        this.libro= new Libro[100];
        this.numlibros=0;
       
    }
    
    public boolean agregarLibro(String titulo, String autor, int numeropaginas, int calificacion){
      Libro libro = new Libro(titulo, autor, numeropaginas, calificacion);
       if(this.numlibros < 100){
         this.libro[this.numlibros] = libro;
         this.numlibros++;
         return true;
      }else 
         
       return false; 
  
  }
  
    public boolean eliminarLibroTitulo(String titulo){
       if(this.numlibros>0){
            for(int i =0;i < this.numlibros;i++){ 
                if(titulo.equals(this.libro[i].getTitulo())){
                    this.libro[i]=null;
                    for(int j =i;j<this.numlibros;j++){
                        this.libro[j]=this.libro[j+1];
                    }
                }
                break;
            }
            this.numlibros--;
            return true;
        }else{
            return false;
       }       
    }
    
    public boolean eliminarLibroAutor(String autor){
       if(this.numlibros>0){
            for(int i =0;i < this.numlibros;i++){ 
                if(autor.equals(this.libro[i].getAutor())){
                    this.libro[i]=null;
                    for(int j =i;j<this.numlibros;j++){
                        this.libro[j]=this.libro[j+1];
                    }
                }
                break;
            }
            this.numlibros--;
            return true;
        }else{
            return false;
       }       
    }
   
    public void mayorYmenorCalificacion(){
      Libro mayor_calificacion = new Libro("nombre","autor",0,0);
        for (int i = 0; i < this.getNumlibros(); i++){
            if(this.libro[i].getCalificacion() > mayor_calificacion.getCalificacion()){
                mayor_calificacion = this.libro[i];
            }
        }
        if (mayor_calificacion.getCalificacion()!= 0){
            System.out.println("Libro con mayor calificacion: " + mayor_calificacion.getTitulo() + " (" + mayor_calificacion.getCalificacion()+ ")");
        }else{
            System.out.println("En este momento no hay un libro con mayor calificacion que los demas");
        }
        Libro menor_calificacion = new Libro("nombre","autor",0,200);
        for (int i = 0; i < this.getNumlibros(); i++){
            if(this.libro[i].getCalificacion() < mayor_calificacion.getCalificacion()){
                menor_calificacion = this.libro[i];
            }
        }
        if (menor_calificacion.getCalificacion()!= 200){
            System.out.println("Libro con menor calificacion: " + menor_calificacion.getTitulo() + " (" + menor_calificacion.getCalificacion()+ ")");
        }else{
            System.out.println("En este momento no hay un libro con menor calificacion que los demas");
        }
     }
     
    public void mostrarContenido(){
        for (int i = 0; i < this.getNumlibros(); i++) {
            System.out.println("LIBRO "+(i+1));
            System.out.println("Titulo: " + this.libro[i].getTitulo());
            System.out.println("Autor: " + this.libro[i].getAutor());
            System.out.println("Numero de paginas: " + this.libro[i].getNumeropaginas());
            System.out.println("Calificacion dada: " + this.libro[i].getCalificacion());
            System.out.println(" ");
        }
    }
    
    
    
    
}
