package controllers;

import models.UserClassModel;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import mainApplication.Main;

/**
 * @author ADMIN
 *
 */
public class LoginScreenController {
	
    @FXML
    private Button btnInput;

    @FXML
    private TextField nameInput;

    @FXML
    private Label userLabel;

    @FXML
    private Label passLabel;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private Label infoLabel;
	
    //Verifica se o usuario esta cadastrad no sistema
	@FXML
	void isValid(ActionEvent event) {
		

		DatabaseController bancoDeDados = new DatabaseController();
		
		String userName = "\"" + nameInput.getText() + "\"";
		String userPass = "\"" + passwordInput.getText() + "\"";
		
		bancoDeDados.conectar();

		boolean userNameIsValid = bancoDeDados.getUsuarioByName(userName);
		
		boolean userPassIsValid = bancoDeDados.getPasswordByName(userName, userPass);
		
		int userRole = bancoDeDados.getUserRoleByUser(userName);
		
			if(userNameIsValid == true && userPassIsValid == true) {
				
				UserClassModel.setUserName(userName);			

				
				if(userRole > 0 ) {
					
				} else {
				
					UserClassModel.setUserCompanyName(bancoDeDados.getCompanyByUser(userName));
					
					Main.loadScene("/views/mainScreen.fxml","Easy Business Travel Booking");
					
					
				}

			
			} else {
				
				infoLabel.setVisible(true);
				
			}	
		

		}
}
		
		
	

	


