package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;


public class mainScreenController {
	

    @FXML
    private Pane MainScreenPane;

    @FXML
    private Button showBtn;

    @FXML
    private Button hideBtn;

    @FXML
    private Pane navBar;

    @FXML
    void show_navBar(ActionEvent event) {
    	
    	navBar.setVisible(true);
    	
    	showBtn.setVisible(false);
    	hideBtn.setVisible(true);
    	
    	System.out.println("show pressed");

    }

    @FXML
    void hide_navBar(ActionEvent event) {
    	
    	navBar.setVisible(false);
    	
    	showBtn.setVisible(true);
    	hideBtn.setVisible(false);
    	
    	System.out.println("hide pressed");
    	
    	

    }
	

}
