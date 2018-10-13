package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

//This is the View
//Its only job is to display what the user sees
//It performs no calculations, but instead passes
//information entered by the user to whomever needs
//it.



public class WrestlerView extends BorderPane implements EventHandler<ActionEvent>{

	//Title
	Label titleForTheTop;		
	//Button to start the simulation.
	Button startBtn;	
	//Color for the fighter
	String style = "-fx-background-color: rgb(0, 255, 255);";
	
	//To wrap the Canvas to The Pane Layout 
	//and then put in the center of BorderLayout
	Pane wrapperCanvas;
	//The Canvas to shows fighters.
	Canvas figherCanvas;
	
	GraphicsContext gc ; 
	
	public WrestlerView()
	{
		titleForTheTop = new Label("ROYALRAMBLE");//To have a label in the top.
		startBtn = new Button("START");//to start the simulation
		startBtn.setOnAction(this);//setting the actionListener	for the start Button
		
		wrapperCanvas = new Pane();
		figherCanvas = new Canvas();
		gc = figherCanvas.getGraphicsContext2D();
		
		//figherCanvas.setStyle("-fx-background-color: red");
		
		wrapperCanvas.getChildren().add(figherCanvas);
		
		// Bind the width/height property to the wrapper Pane
		figherCanvas.widthProperty().bind(wrapperCanvas.widthProperty());
		figherCanvas.heightProperty().bind(wrapperCanvas.heightProperty());
	    // redraw when resized
		figherCanvas.widthProperty().addListener(event -> draw(gc));
		figherCanvas.heightProperty().addListener(event -> draw(gc));
		
		draw(gc);
		
		
		this.setCenter(wrapperCanvas);
		this.setTop(titleForTheTop);		
		this.setBottom(startBtn); 
		
		
	
		
	}	
	private void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		int width = (int) figherCanvas.getWidth();
	    int height = (int) figherCanvas.getHeight();
		
		
	    System.out.println("width " + width + "  height " + height);
	  
	    
	    gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(0, 400, 1000, 400);
       
		
	}
	
	
	

	@Override //This method might be move to controllers
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
		if(event.getSource() == startBtn)
		{
			System.out.println("button Works");
		}
	}
	
	
	
	
	
	
	
	
	
	

		

	

	
	
	
	
}
