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
	
	//Label
	Label titleForTheTop ;
	
	public WrestlerView()
	{
		titleForTheTop = new Label("ROYALRAMBLE");//To have a label in the top.
		startBtn = new Button("START");//to start the simulation
		startBtn.setOnAction(this);//setting the actionListener
		this.setTop(titleForTheTop);		
		this.setCenter(wrestlerPane);
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
