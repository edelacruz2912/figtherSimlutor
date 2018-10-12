package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

//This is the View
//Its only job is to display what the user sees
//It performs no calculations, but instead passes
//information entered by the user to whomever needs
//it.



public class WrestlerView extends BorderPane implements EventHandler<ActionEvent>{

	//Main Pain to all the components and layout.
	//BorderPane mainPane = new BorderPane();

	//GridPane to hold wrestler.
	GridPane wrestlerPane = new GridPane();
		
	//Button to start the simulation.
	Button startBtn;
	
	//Color for the fighter
	String style = "-fx-background-color: rgb(0, 255, 255);";
	
	
	
	//Label
	Label titleForTheTop ;
	
	Label label1 = new Label("label1");
	Label label2= new Label("label2");
	Label label3= new Label("label3");
	
	Label label4 = new Label("label4");
	Label label5= new Label("label5");
	Label label6= new Label("label6");
	
	
	
	
	public WrestlerView()
	{
		titleForTheTop = new Label("ROYALRAMBLE");//To have a label in the top.
		startBtn = new Button("START");//to start the simulation
		startBtn.setOnAction(this);//setting the actionListener
		wrestlerPane.setGridLinesVisible(true);
		
		
		wrestlerPane.setStyle(style);

		
		//-------------
		
		
			//testing the gridLayout
		wrestlerPane.setRowIndex(label1, 0);
		wrestlerPane.setColumnIndex(label1, 0);
		
		wrestlerPane.setRowIndex(label2, 0);
		wrestlerPane.setColumnIndex(label2, 1);
		
		
		wrestlerPane.setRowIndex(label3, 0);
		wrestlerPane.setColumnIndex(label3, 2);
		
		wrestlerPane.setRowIndex(label4, 0);
		wrestlerPane.setColumnIndex(label4, 3);
		
		wrestlerPane.setRowIndex(label5, 0);
		wrestlerPane.setColumnIndex(label5, 4);
		
		wrestlerPane.setRowIndex(label6, 0);
		wrestlerPane.setColumnIndex(label6, 5);
		
		
		///------------
		 //Setting the vertical and horizontal gaps between the columns 
		wrestlerPane.setVgap(100); 
		wrestlerPane.setHgap(100);
		
		wrestlerPane.getChildren().addAll(label1, label2, label3, label4, label5 , label6);
		
		this.setTop(titleForTheTop);		
		this.setCenter(wrestlerPane); //GridPane for the fighters
		this.setBottom(startBtn); 
		//System.out.println("wrestlerView created");
		
	}	
	//why I can't put this code outside.

	@Override //This method might be move to controllers
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		//System.out.println("handle method gets triggered.");
		if(event.getSource() == startBtn)
		{
			System.out.println("button Works");
		}
	}
	
	
	
	
	
	
	
	
	
	

		

	

	
	
	
	
}
