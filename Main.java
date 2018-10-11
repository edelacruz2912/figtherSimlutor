package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;
	
	Button btn;
	
	
	@Override  //Stage primaryStage = Main Window
	public void start(Stage primaryStage) {
		
		window = primaryStage; 
		
		btn = new Button("testing this shit");
		
		//layout 
		StackPane layout = new StackPane();
		layout.getChildren().add(btn); 
		
		//creating the Scene = content of the window
		//Scene(layout,width,height)
		Scene scene = new Scene(layout,200,600);
		window.setTitle("Wrestler Simulator");// Main window Title.
		
		window.setScene(scene);
		
		
		
		
		
		
		
		
		
		
		
		// Display the contents of the scene using the method named show()
		window.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args); //The start() method is called by the launch(args).
	}

	
}
