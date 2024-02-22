/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1;

/**
 *
 * @author luisf
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       public class Cancion {
    // Atributos
    private int idCancion;
    private String titulo;
    private String autor;
    private double duracion;
    private int anoCreacion;

    // Constructor
    public Cancion(int idCancion, String titulo, String autor, double duracion, int anoCreacion) {
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anoCreacion = anoCreacion;
    }

    // Getters y setters
    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }
}
 // TODpublic class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Cancion
        Cancion cancion = new Cancion(1, "Shape of You", "Ed Sheeran", 3.54, 2017);
        
        // Acceder a los atributos utilizando los getters
        System.out.println("ID de la canción: " + cancion.getIdCancion());
        System.out.println("Título: " + cancion.getTitulo());
        System.out.println("Autor: " + cancion.getAutor());
        System.out.println("Duración: " + cancion.getDuracion() + " minutos");
        System.out.println("Año de creación: " + cancion.getAnoCreacion());
        
        // Modificar atributos utilizando los setters
        cancion.setDuracion(4.10);
        cancion.setAnoCreacion(2016);
        
        // Imprimir los atributos actualizados
        System.out.println("\nDuración actualizada: " + cancion.getDuracion() + " minutos");
        System.out.println("Año de creación actualizado: " + cancion.getAnoCreacion());
    }
}
O code application logic here
    }
    
}
