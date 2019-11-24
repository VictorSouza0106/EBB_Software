package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import models.UserClassModel;
import models.FligthFormModel;

public class MainScreenController {
	
	//Pane Ativador para que possa ser populado por dados assim que carrregar a tela principal
		
		@FXML
	    private Pane PaneLoading;

	//Tela Principal
		
	    @FXML
	    private Pane MainScreenPane;
	    
	    @FXML
	    private Label companyLabel;

    //Barra de navegação lateral
	    
	    @FXML
	    private Pane navBar;
    
    //ID's dos botoes que contem na NavBar
    
	    @FXML
	    private Button newOrderBtn;
	
	    @FXML
	    private Button historyBtn;
	
	    @FXML
	    private Button messageBtn;
	
	    @FXML
	    private Button financalBtn;
	
	    @FXML
	    private Button infoBtn;
	
	    @FXML
	    private Button helpBtn;

    //botões de controle da navBar
	    
	    @FXML
	    private ImageView hideBtn;
	
	    @FXML
	    private ImageView showBtn;

    //New Order FORM  
    
	    @FXML
	    private Button FlightBtn;
	    
		    //Flight form componets
		    
			    @FXML
			    private Pane flightForm;
			    
			    @FXML
			    private Pane newOrderForm;
			    
			    @FXML
			    private TextField originInput;
			    
			    @FXML
			    private TextField destinyInput;
			    
			    @FXML
			    private DatePicker startDate;
			
			    @FXML
			    private DatePicker endDate;
			    
			    @FXML
			    private TextField flightCompanyInput;
			    
			    @FXML
			    private Button flightSaveBtn;

			    @FXML
			    private Button flightClearBtn;
			    
			    @FXML
			    private RadioButton aisleRadioBtn;
			    
			    @FXML
			    private RadioButton centerRadioBtn;
			    
			    @FXML
			    private RadioButton windowRadioBtn;
			    
			    @FXML
			    private RadioButton despacheYesRadioBtn;
			    
			    @FXML
			    private RadioButton despacheNoRadioBtn;

    
    
    void setButtonStyleDefault() {
    	
    	newOrderBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	historyBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	messageBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	financalBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	infoBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	helpBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    }
    
    void setButtonSelect(Button buttonID) {
    	
    	setButtonStyleDefault();
    	
    	buttonID.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #23d9cf 50%, #20b2aa 100%);");
    	
    }
   
    void setSeatEmpty() {
    	
    	aisleRadioBtn.setSelected(false);
    	
    	centerRadioBtn.setSelected(false);
    	
    	windowRadioBtn.setSelected(false);
    }
    
    @FXML
    void BringMainScreen(MouseEvent event) {
    	
    	PaneLoading.setOnMouseMoved(null);
    	
    	MainScreenPane.setVisible(true);
    	
    	companyLabel.setText(UserClassModel.getUserCompanyName());
    	companyLabel.setTextAlignment(TextAlignment.CENTER);
    	
    	System.out.println(UserClassModel.getUserCompanyName());
    	    	
    }

	@FXML
    void show_navBar(MouseEvent event) {
    	
    	navBar.setVisible(true);
    	
    	showBtn.setVisible(false);
    	hideBtn.setVisible(true);

    }

    @FXML
    void hide_navBar(MouseEvent event) {
    	
    	navBar.setVisible(false);
    	
    	showBtn.setVisible(true);
    	hideBtn.setVisible(false);
    	
    	System.out.println("hide pressed");  	
    	

    }
   
    @FXML
    void newOrderAction(ActionEvent event) {
    	
    	setButtonSelect(newOrderBtn);
    	
    	newOrderForm.setVisible(true);
    }
    
    @FXML
    void BringFlightForm(ActionEvent event) {

    	setButtonSelect(FlightBtn);
    	
    	flightForm.setVisible(true);
    	
    }
    
    @FXML
    void historyAction(ActionEvent event) {
    	
    	setButtonSelect(historyBtn);
    }

    @FXML
    void messageAction(ActionEvent event) {
    	
    	setButtonSelect(messageBtn);
    }

    @FXML
    void financalAction(ActionEvent event) {
    	
    	setButtonSelect(financalBtn);
    }

    @FXML
    void infoAction(ActionEvent event) {
    	
    	setButtonSelect(infoBtn);
    }
    
    @FXML
    void helpAction(ActionEvent event) {
    	
    	setButtonSelect(helpBtn);
    }
    
    @FXML
    void aisleRadioAction(ActionEvent event) {
    	
	    setSeatEmpty();
	    
	    aisleRadioBtn.setSelected(true);
    	
    }
    
    @FXML
    void centerRadioAction(ActionEvent event) {
    	
	    setSeatEmpty();
	    
	    centerRadioBtn.setSelected(true);
    	
    }
    
    @FXML
    void windowRadioAction(ActionEvent event) {
    	
	    setSeatEmpty();
	    
	    windowRadioBtn.setSelected(true);
    	
    }
    
    @FXML
    void despacheYesAction(ActionEvent event) {
    
    	despacheYesRadioBtn.setSelected(true);
    	despacheNoRadioBtn.setSelected(false);
    	
    }
    
    @FXML
    void despacheNoAction(ActionEvent event) {
    
    	despacheYesRadioBtn.setSelected(false);
    	despacheNoRadioBtn.setSelected(true);
    	
    }
    
    @FXML
    void ClearFlightForm (ActionEvent event) {
    	
    	originInput.setText("");
    	destinyInput.setText("");
    	startDate.getEditor().clear();
    	endDate.getEditor().clear();
    	flightCompanyInput.setText("");
    	setSeatEmpty();
    	
    }
    
    @FXML
    void SaveFlightForm (ActionEvent event) {
    	
    		FligthFormModel.setFlightOrigin(originInput.getText());
    		FligthFormModel.setFlightDestiny(destinyInput.getText());
    		FligthFormModel.setFlightStartDate(startDate.getValue().toString());
    		FligthFormModel.setFlightEndDate(endDate.getValue().toString());
    		FligthFormModel.setFlightCompanyAirline(flightCompanyInput.getText());
	    		
	    		if (aisleRadioBtn.isSelected() == true) {
	    			
	    			FligthFormModel.setFlightSeatPosition("Aisle");
	    			
				} else if (centerRadioBtn.isSelected() == true) {
					
	    			FligthFormModel.setFlightSeatPosition("Center");
	    			
				} else {
					
	    			FligthFormModel.setFlightSeatPosition("Window");
				}
	    		
	    		if (despacheYesRadioBtn.isSelected() == true) {
	    			
	    			FligthFormModel.setFlightDespache(true);
					
				} else {
					
					FligthFormModel.setFlightDespache(false);
				}
    }
     
     
}
