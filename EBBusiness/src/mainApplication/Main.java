package mainApplication;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

 public class Main extends Application {



 public static Stage  primaryStage;
 public static Class thisClass;

 /**
  * A classe principal da aplicação em JavaFX
  */
 public Main() {
  thisClass = getClass();
 }

 /**
  * Inicia o layout da aplicação
  */
 @Override
 public void start(Stage primaryStage) {
  this.primaryStage = primaryStage;

  try {
   Parent root = FXMLLoader.load(getClass().getResource("../views/loginScreen.fxml"));
   Scene scene = new Scene(root, 500, 750);
   
   primaryStage.setTitle("Easy Business Booking");
   primaryStage.setResizable(false);
   
   primaryStage.setScene(scene);
   primaryStage.show();
   
  } catch (Exception e) {
	  
   e.printStackTrace();
   
  }
 }

 public static void main(String[] args) {
  launch(args);
 }

 /**
  * Inicia outra página
  * 
  * @param nameFile
  * @param titlePage
  */
 public static void loadScene(String nameFile, String titlePage) {

  Parent root;
  try {
   
	  root = FXMLLoader.load(thisClass.getClass().getResource(nameFile));
   Scene scene = new Scene(root, 1200, 800);
   
   primaryStage.setTitle(titlePage);
   primaryStage.setScene(scene);
   
   primaryStage.centerOnScreen();
   primaryStage.setResizable(true);
   primaryStage.show();
  } catch (IOException e) {
   e.printStackTrace();
  }

 }
}