package loginfx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class MainController {
    @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    
    public void Login(ActionEvent event)
    {
        if(txtUsername.getText().equals("user") && txtPassword.getText().equals("pass") ){
            lblStatus.setText("Login success!!!");
        }else{
             lblStatus.setText("Login failed!!!");
        }
    }
    
    
}
