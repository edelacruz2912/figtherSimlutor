package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;	
	//Button btn;
	
	
	@Override  //Stage primaryStage = Main Window
	public void start(Stage primaryStage) {
		
		window = primaryStage;			
		WrestlerView wView = new WrestlerView();
		//scene = contentOfTheWindow
		Scene scene = new Scene(wView,1000,800);
		window.setTitle("Wrestler Simulator");// Main window Title.
		window.setScene(scene);		
		// Display the contents of the scene using the method named show()
		window.show();	
		
	}
	
	public static void main(String[] args) {
		launch(args); //The start() method is called by the launch(args).
	}

	
	
	
	
}
