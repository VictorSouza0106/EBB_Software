package controllers;



import java.awt.TextArea;
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

    //Barra de navega��o lateral
	    
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

    //bot�es de controle da navBar
	    
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
			    
			    @FXML
			    private TextField employeeNameInput;
			    
			    @FXML
			    private TextField employeeCpfInput;
			    
			    @FXML
			    private TextField employeeCodeInput;
			    
			    @FXML
			    private TextField employeePassaportInput;
			    
			    @FXML
			    private DatePicker employeePassaaportValid;
			    
			    @FXML
			    private TextField employeeCnhInput;
			    
			    @FXML
			    private DatePicker employeeCnhValid;
			    
			    @FXML
			    private TextField employeeProgInput;
			    
			    @FXML
			    private TextField employeeSpecialInput;
			    
			    @FXML
			    private TextArea a;
			    
			    
			    

    
    //Pega os botoes do Menu inicial e seta a cor deles para uma cor default
    void setButtonStyleDefault() {
    	
    	newOrderBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	historyBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	messageBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	financalBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	infoBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    	helpBtn.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #d7d7d7 50%, #a7a7a7 100%);");
    }
    
    
    //Pega o botao selecionado e coloca uma cor no style dele
    void setButtonSelect(Button buttonID) {
    	
    	setButtonStyleDefault();
    	
    	buttonID.setStyle("-fx-background-color: linear-gradient(#F7f7f7 0%, #23d9cf 50%, #20b2aa 100%);");
    	
    }
   //Pega os RadioButton da tela flight Form e deseleciona os botoes  
    void setSeatEmpty() {
    	
    	aisleRadioBtn.setSelected(false);
    	
    	centerRadioBtn.setSelected(false);
    	
    	windowRadioBtn.setSelected(false);
    }
    
    //Deixa todos os formularios invisiveis e reseta a cor dos botoes para a cor padrao
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
    //Tras a tela principal para a frente (utilizada para que fosse possivel popular os dados assim que rendeniza na tela)
    @FXML
    void BringMainScreen(MouseEvent event) {
    	
    	
    	PaneLoading.setOnMouseMoved(null);
    	
    	MainScreenPane.setVisible(true);
    	
    	companyLabel.setText(UserClassModel.getUserCompanyName());
    	companyLabel.setTextAlignment(TextAlignment.CENTER);
    	    	
    }
    
    //Controles da barra lateral de navega��o
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
   
	//A�oes do botao da barra de navega��o lateral
		    @FXML
		    void newOrderAction(ActionEvent event) {
		    	
		    	setButtonSelect(newOrderBtn);
		    	
		    	newOrderForm.setVisible(true);
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
	
	//Tras o form de viagens
	@FXML
	void BringFlightForm(ActionEvent event) {
		
		setFormsDefalt();
		setButtonSelect(FlightBtn);
		flightForm.setVisible(true);
		    
	
	}
		
		//Configura��o dos botoes de RadioButton para a posi��o da poltrona
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
    
	//Configura��o dos RadioButton para a op��o de despache
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
    
    //Limpa os dados dos campos no form de viagens    
    @FXML
    void ClearFlightForm (ActionEvent event) {
    	
    	originInput.setText("");
    	destinyInput.setText("");
    	startDate.getEditor().clear();
    	endDate.getEditor().clear();
    	flightCompanyInput.setText("");
    	setSeatEmpty();
    	
    }
    
    //Salva no Moldel de viagem os dados passados pelo usu�rio    
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
    
    //Tras o form de hotel
    @FXML
    void BringHotelForm (ActionEvent event) {
    	
    	setFormsDefalt();
    	
    	setButtonSelect(hotelBtn);
    	
    	hotelForm.setVisible(true);
    }
    
    //configura��o se o cliente quer ou nao alugar um hotel
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
     
	 //configura��o se o cliente quer ou nao internet no hotel
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
	 //Limpa os campos do form Hotel
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
 
     
     //Salva os campos no model do hotel
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
     
     //Tras o form para aluguel de carro
     @FXML
     void BringCarForm (ActionEvent event) {
     	
     	setFormsDefalt();
     	
     	setButtonSelect(carBtn);
     	
     	carForm.setVisible(true);
     }
    
     //configura os RadioButton para verificar se o usuario quer alugar carro
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
     
	 //Limpa os campos do form de carros
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
     
     //Salva os campos de form de carros no Model
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
     
     //tras o form de cadastro de funcionario
     @FXML
     void BringEmployeeForm(ActionEvent event) {
          	
          	setFormsDefalt();
          	
          	setButtonSelect(employeeBtn);
          	
          	employeeForm.setVisible(true);
          
    	 
    	 
     }
     
     
     
}
