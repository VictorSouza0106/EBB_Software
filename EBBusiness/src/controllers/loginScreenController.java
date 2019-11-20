package controllers;


import java.net.URL; 
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import mainApplication.main;

/**
 * @author ADMIN
 *
 */
public class loginScreenController implements Initializable {
	
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
	

	@FXML
	void isValid(ActionEvent event) {
		

		
		databaseController bancoDeDados = new databaseController();
		
		String userName = "\"" + nameInput.getText() + "\"";
		String userPass = "\"" + passwordInput.getText() + "\"";
		
		bancoDeDados.conectar();

		String userNameIsValid = bancoDeDados.getUsuarioByName(userName);
		String userPassIsValid = bancoDeDados.getPasswordByName(userName, userPass);
		
		if(userNameIsValid == "valid" && userPassIsValid == "valid") {
			
			main.loadScene("/views/mainScreen.fxml","Easy Business Travel Booking");	

			
		} else {
			System.out.println("nome de usuario ou senha invalida");
			infoLabel.setVisible(true);
		}
		
		
		
		/*String nameValid = nameInput.getText();
		String passValid = passwordInput.getText();
		
		if(!nameValid.isEmpty()) {
			
			System.out.println("nameEmpty");
			
			if (!passValid.isEmpty()) {
				
				System.out.println("passEmpty");
				
				main.loadScene("/views/mainScreen.FXML", "Easy Business Booking");
				
				
			}

		}else {
			
		System.out.println("Nome de usuário ou senha inválida ");
		
	    }*/
}
		
		
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
	

}
