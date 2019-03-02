package application; 

import java.net.URL; 
import java.text.DateFormat; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.ResourceBundle; 

import javafx.event.ActionEvent; 
import javafx.fxml.FXML; 
import javafx.fxml.Initializable; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField; 
import javafx.scene.paint.Color; 




public class MyController { 

@FXML 
private Button MyButton8; 

@FXML 
private TextField MyTextField; 

@FXML 
private Button MyButton16; 

@FXML 
private TextArea MyText; 

public void To_8 () { 
MyText.setText(Integer.toOctalString(Integer.parseInt(MyTextField.getText()))); 
} 

public void To_16 () { 
MyText.setText(Integer.toHexString(Integer.parseInt(MyTextField.getText()))); 
} 

}

