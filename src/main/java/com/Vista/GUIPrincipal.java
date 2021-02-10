package com.Vista;

import com.Controlador.*;
import com.EstructuraDatos.Libro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import java.io.IOException;

public class GUIPrincipal implements Initializable{
    
    
    @FXML
    private TextField tf_isbn;    
    @FXML
    private TextField tf_nombre;
    @FXML
    private TextField tf_autor;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mostrarDatos(GestionBiblioteca.siguienteLibro());
    }  
    
    @FXML
    private void siguienteLibro(ActionEvent event) {
        mostrarDatos(GestionBiblioteca.siguienteLibro());
    }
    
    @FXML
    private void anteriorLibro(ActionEvent event) {
        mostrarDatos(GestionBiblioteca.anteriorLibro());
    }
    
    @FXML
    private void abrirVentanaAniadirLibro(ActionEvent event) throws IOException {
        App.ventanaSuperpuesta("AniadirLibro", "Añadir Libro");
    }
    
    private void mostrarDatos(Libro libro){
        if(libro != null){
            tf_isbn.setText(libro.getIsbn());
            tf_nombre.setText(libro.getNombre());
            tf_autor.setText(libro.getAutor());
        }   
    }
}
