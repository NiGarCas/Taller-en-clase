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
      Libro libro=new Libro(titulo,autor,numeropaginas,calificacion) ;
       if(this.numlibros < 100){
         this.libro[this.numlibros] = libro;
         this.numlibros++;
         return true;
      }else 
         
       return false; 
  
  }
   public boolean eliminarLibro(String titulo ){
       if(this.numlibros>0){
           for(int i =0;i<this.numlibros;i++){ 
            if(titulo.equals(this.libro[i].getTitulo())){
             this.libro[i]=null;
               
               for(int j =i;j<this.numlibros;j++){
                  this.libro[j]=this.libro[j+1];
                       
                     }
                       
                
                 return false;
                 
                 }
                
             break;
           }
          this.numlibros--;
           
       }
         return true;
                           
  
  
   }
  public void OrganizarlistaCalificacion(Libro[] libro ){
       int cuentaintercambios=0;
            for (boolean ordenado=false;!ordenado;){
        for (int i = 0; this.libro[i] != null; i++){
            if(this.libro[i].getCalificacion()> this.libro[i+1].getCalificacion()){
                 Libro variableauxiliar=this.libro[i];
                    this.libro[i]=this.libro[i+1];
                    this.libro[i+1]=variableauxiliar;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                    ;
              
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
            
            
                
            }
        
        

     }
  
    
     }
     
          
            

  
  
  
  
  
    
    
    public  Libro darInformacionLibro(String nombreLibro){
         Libro libro= null;
         for (int i = 0; i < this.numlibros; i++) {
           if(this.libro[i].getTitulo().equals(nombreLibro)){
              libro = this.libro[i];
              break;
           }   
         }
        return libro;
    }
    
    
    
    
}
