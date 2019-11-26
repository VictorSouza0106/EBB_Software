package controllers;



import javax.smartcardio.Card;

import com.sun.corba.se.spi.orbutil.fsm.Action;

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
import models.CarFormModel;
import models.FligthFormModel;
import models.HotelFormModel;

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
	    
	    @FXML
	    private Button hotelBtn;
	    
	    @FXML
	    private Button carBtn;
	    
	    @FXML
	    private Button employeeBtn;
	    
	    //Flight form componetes
		    
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
			    
			    @FXML
			    private Label invalidFlight;
			    
		//Hotel form componetes
			    
			    @FXML
			    private Pane hotelForm;
			    
			    @FXML
			    private RadioButton hotelFormYes;
			    
			    @FXML
			    private RadioButton hotelFormNo;
			    
			    @FXML
			    private TextField hotelCityInput;
			    
			    @FXML
			    private DatePicker checkInDate;
			    
			    @FXML
			    private DatePicker checkOutDate;
			    
			    @FXML
			    private RadioButton interntYesRadioBtn;
			    
			    @FXML
			    private RadioButton interntNoRadioBtn;
			    
			    @FXML
			    private Button hotelClearBtn;
			    
			    @FXML
			    private Button hotelSaveBtn;
			    
			    //Car form componentes
			    
			    @FXML
			    private Pane carForm;
			    
			    @FXML
			    private RadioButton carFormYes;
			    
			    @FXML
			    private RadioButton carFormNo;
			    
			    @FXML
			    private DatePicker carStartDate;
			    
			    @FXML
			    private DatePicker carEndDate;
			    
			    @FXML
			    private TextField classificationInput;
			    
			    @FXML
			    private TextField carTypeInput;
			    
			    @FXML
			    private TextField carBrandInput;
			    
			    @FXML
			    private Button carClearButton;
			    
			    @FXML
			    private Button carSaveButton;
			    
			    //Employee Form Componetes
			    
			    @FXML
			    private Pane employeeForm;
			    
			    
			    

    
    
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
    
    void setFormsDefalt() {
    	
    	FlightBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	hotelBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	carBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	employeeBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	flightForm.setVisible(false);
    	hotelForm.setVisible(false);
    	carForm.setVisible(false);
    	employeeForm.setVisible(false);
    	
    }
    
    @FXML
    void BringMainScreen(MouseEvent event) {
    	
    	
    	PaneLoading.setOnMouseMoved(null);
    	
    	MainScreenPane.setVisible(true);
    	
    	companyLabel.setText(UserClassModel.getUserCompanyName());
    	companyLabel.setTextAlignment(TextAlignment.CENTER);
    	    	
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
    	

    }
   
    @FXML
    void newOrderAction(ActionEvent event) {
    	
    	setButtonSelect(newOrderBtn);
    	
    	newOrderForm.setVisible(true);
    }
    
    @FXML
    void BringFlightForm(ActionEvent event) {

    	setFormsDefalt();
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
    	
    		//Guardando os valores na classe FlightFormModel
    		try {
    		
    		if(originInput.getText().trim().isEmpty() == true || destinyInput.getText().trim().isEmpty() == true || flightCompanyInput.getText().trim().isEmpty() == true) {
    		
    			invalidFlight.setVisible(true);
    			
    			
    			
    		} else {    	
    			
    			FligthFormModel.setFlightOrigin(originInput.getText());
        		FligthFormModel.setFlightDestiny(destinyInput.getText());
        		FligthFormModel.setFlightCompanyAirline(flightCompanyInput.getText());
        		

    			invalidFlight.setVisible(false);
    			
    			
    		}
    		
    		FligthFormModel.setFlightStartDate(startDate.getValue().toString());
    		FligthFormModel.setFlightEndDate(endDate.getValue().toString());
    		
    		
			
    		}catch (Exception e) {
    			
    			invalidFlight.setVisible(true);   			
			}
    		
    		//Setando os RadioButton das poltronas
    		
	    		if (aisleRadioBtn.isSelected() == true) {
	    			
	    			FligthFormModel.setFlightSeatPosition("Aisle");
	    			
				} else if (centerRadioBtn.isSelected() == true) {
					
	    			FligthFormModel.setFlightSeatPosition("Center");
	    			
				} else {
					
	    			FligthFormModel.setFlightSeatPosition("Window");
				}
	    		
	    		//Setando o RadioButton para true ou false 
	    		
	    		if (despacheYesRadioBtn.isSelected() == true) {
	    			
	    			FligthFormModel.setFlightDespache(true);
					
				} else {
					
					FligthFormModel.setFlightDespache(false);
				}
	    		
	    		//Verificando se os campos estao validos
	    		
    }
    
    @FXML
    void BringHotelForm (ActionEvent event) {
    	
    	setFormsDefalt();
    	
    	setButtonSelect(hotelBtn);
    	
    	hotelForm.setVisible(true);
    }
    
     @FXML
     void hotelFormNoAction (ActionEvent event) {
    	 
    	 hotelFormNo.setSelected(true);
    	 hotelFormYes.setSelected(false);
     }
      
     @FXML
     void hotelFormYesAction (ActionEvent event) {
    	 
    	 hotelFormNo.setSelected(false);
    	 hotelFormYes.setSelected(true);
     }
     
     @FXML
     void interntNoAction (ActionEvent event) {
    	 
    	 interntNoRadioBtn.setSelected(true);
    	 interntYesRadioBtn.setSelected(false);
     }
     
     @FXML
     void interntYesAction (ActionEvent event) {
    	 
    	 interntNoRadioBtn.setSelected(false);
    	 interntYesRadioBtn.setSelected(true);
     }
 
     @FXML 
     void ClearHotelForm (ActionEvent event) {
    	 
    	 	hotelFormYes.setSelected(false);
    	 	hotelFormNo.setSelected(true);
    	 	
    	 	interntNoRadioBtn.setSelected(true);
       	 	interntYesRadioBtn.setSelected(false);
       	 
       	 
    	 	hotelCityInput.setText("");
    	 	checkInDate.getEditor().clear();
    	 	checkOutDate.getEditor().clear();
     }
 
     @FXML
     void SaveHotelForm (ActionEvent event) {
    	 
    	 if (hotelFormYes.isSelected() == true) {
    		 
    		 HotelFormModel.setBookingHotel(true);
		
    	 } else {
    		
    		 HotelFormModel.setBookingHotel(false);
    	 }
    	 
    	 if(hotelCityInput.getText() == "") {
    		 
    	 } else {

        	 HotelFormModel.setHotelCity(hotelCityInput.getText());
    	 }
    	 
    	 if (interntYesRadioBtn.isSelected() == true) {
			
    		 HotelFormModel.setHasInternet(true);
    		 
		} else {
			
   		 HotelFormModel.setHasInternet(false);
		
		}
    	 
    	 
    	 try {
    		 
        	 HotelFormModel.setChekInDate(checkInDate.getValue().toString()); 
        	 HotelFormModel.setCheckOutDate(checkOutDate.getValue().toString());
        	 
    	 } catch (Exception e) {
			
		}
    	 
    	 System.out.println(HotelFormModel.getCheckOutDate());
    	 System.out.println(HotelFormModel.getChekInDate());
    	 System.out.println(HotelFormModel.getHotelCity());
    	 System.out.println(HotelFormModel.isBookingHotel());
    	 System.out.println(HotelFormModel.isHasInternet());

    	 
     }
     
     @FXML
     void BringCarForm (ActionEvent event) {
     	
     	setFormsDefalt();
     	
     	setButtonSelect(carBtn);
     	
     	carForm.setVisible(true);
     }
     
     @FXML
     void carFormYesAction(ActionEvent event) {
    	 
    	 carFormNo.setSelected(false);
    	 carFormYes.setSelected(true);
    	 
     }
     
     @FXML
     void carFormNoAction(ActionEvent event) {
    	 
    	 carFormNo.setSelected(true);
    	 carFormYes.setSelected(false);
    	 
     }
     
     @FXML
     void ClearCarForm (ActionEvent event) {
    	 
    	 carFormNo.setSelected(true);
    	 carFormYes.setSelected(false);
    	 carStartDate.getEditor().clear();
    	 carEndDate.getEditor().clear();
    	 classificationInput.setText("a");
    	 carTypeInput.setText("a");
    	 carBrandInput.setText("a");
    	 
    	 System.out.println("clear");
    	 
    	 
     }
     
     @FXML
     void SaveCarForm (ActionEvent event) {
    	 
    	 
    	 
    	 if(carFormYes.isSelected() == true) {
    		 CarFormModel.setRentCar(true);
    	 } else {
    		 CarFormModel.setRentCar(false);
    	 }
    	 
    	 CarFormModel.setClassification(classificationInput.getText());
    	 CarFormModel.setTypeCar(carTypeInput.getText());
    	 CarFormModel.setBrandCar(carBrandInput.getText());
    	 
    	 try {
    		 
    		 CarFormModel.setCarStartDate(carStartDate.getValue().toString());
    		 CarFormModel.setCarEndDate(carEndDate.getValue().toString());
    	 } catch (Exception e) {
			
    		 System.out.println("erro:" + e.getMessage());
		}
     }
     
     @FXML
     void BringEmployeeForm(ActionEvent event) {
          	
          	setFormsDefalt();
          	
          	setButtonSelect(employeeBtn);
          	
          	employeeForm.setVisible(true);
          
    	 
    	 
     }
     
     
     
}
