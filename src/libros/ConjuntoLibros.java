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
    //Atributos clase ConjuntoLibros
    private String nombre;
    private Libro[] libro;
    private int numlibros;
    //Getters y Setters atributos de ConjuntoLibros
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
    //Constructor de ConjuntoLibros, se inicializa la clase Libro con un array de tamaño 100 sin objetos adentro 
    public ConjuntoLibros(String nombre) {
        this.nombre = nombre;
        this.libro= new Libro[100];
        this.numlibros=0;
       
    }
    //Metodo que agrega un objeto de tipo Libro a el objeto de clase ConjuntoLibros
    public boolean agregarLibro(String titulo, String autor, int numeropaginas, int calificacion){
      Libro libro = new Libro(titulo, autor, numeropaginas, calificacion);
       if(this.numlibros < 100){
         this.libro[this.numlibros] = libro;
         this.numlibros++;
         return true;
      }else 
         
       return false; 
  
  }
    //Metodo que elimina un objeto de tipo Libro del objeto de clase ConjuntoLibros segun su titulo
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
    //Metodo que elimina un objeto de tipo Libro del objeto de clase ConjuntoLibros segun su autor
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
    //Metodo que muestra el libro con la calificacion mas alta y mas baja del objeto de clase ConjuntoLibros
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
    //Metodo que imprime en pantalla la informacion de todos los libros guardados en el objeto de clase ConjuntoLibros
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
