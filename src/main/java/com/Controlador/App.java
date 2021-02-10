package com.Controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.application.Platform;
import javafx.stage.Modality;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static String rutaFxml = "/com/vista/";

    @Override
    public void start(Stage stage) throws IOException {
        GestionBiblioteca.inicializar();

        scene = new Scene(loadFXML(rutaFxml + "Principal"));
        //scene = new Scene(loadFXML("/com/vista/EjemploLista")); 

        stage.setTitle("Gestión Biblioteca");
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    
    public static void ventanaSuperpuesta(String fxml, String titulo) throws IOException {      
        Scene scene = new Scene(loadFXML(rutaFxml + fxml));
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(titulo);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }
}