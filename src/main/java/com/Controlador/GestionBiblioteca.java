package com.Controlador;

import com.EstructuraDatos.*;
import com.Utilidades.*;

/**
 *
 * @author Antonio Ramos
 */
public class GestionBiblioteca {
    private static Libro[] libros = new Libro[10];
    private static int posicion = -1;
    
        
    /**
     * Método que instancia los arrays
     * 
     */
    public static void inicializar() {        
        libros[0] = new Libro("TEA01", "Teatro universal", "");
        libros[1] = new Libro("BOD01", "Bodas de sangre", "Federico Gacrcía Lorca");
        libros[2] = new Libro("YER01", "Yerma", "Federico Gacrcía Lorca");
    }
    
    
    public static boolean anadirLibro(Libro nuevoLibro){
        for(int i = 0; i < libros.length; i++){
            if(libros[i] == null){
                libros[i] = nuevoLibro;
                return true;
            }                
        }
        return false;
    }
    
    public static Libro siguienteLibro(){
        return datosLibro(posicion+1);
    }
    
    public static Libro anteriorLibro(){
        return datosLibro(posicion-1);
    }
            
    private static Libro datosLibro(int posicion){
        if(posicion > -1 && posicion < libros.length){
            if(libros[posicion] != null){
                GestionBiblioteca.posicion = posicion;
                return libros[posicion];
            }
        }
        return null;
    }
    
   
}
