/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibros {
    private String nombre;
    private Libro[] libro;
 private int numlibros;
    public ConjuntoLibros(String nombre) {
        this.nombre = nombre;
        this.libro= new Libro[100];
        this.numlibros=0;
    }
  public boolean agregarLibro(String titulo, String autor, int numeropaginas, int calificacion){
      Libro libro=new Libro(titulo,autor,numeropaginas,calificacion) ;
       if(this.numlibros < 100){
         this.libro[this.numlibros] = libro;
         this.numlibros++;
         return true;
      }else 
         
       return false; 
  
  }
   public boolean eliminarLibro(String titulo ){
        for(int i =0;i<this.numlibros;i++){ 
            if(titulo.equals(libro[i].getTitulo())){
               libro[i]=null;
               
               for(int j =i;j<this.numlibros-1;j++){
                   libro[i]=libro[i+1];
               
                     }
                break;
                 }
           return true;
            }
       return false; 
  
  }
  
  
  
  
  
  
  
    
    
    
    
}
