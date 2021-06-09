package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField n1;
    @FXML
    private TextField n2;
    @FXML
    private Label lb1;

    public void addition(){
        float num1= Float.parseFloat(n1.getText());
        float num2= Float.parseFloat(n2.getText());
        lb1.setText(String.valueOf(num1+num2));
    }
    
    public void subtraction(){
        float num1= Float.parseFloat(n1.getText());
        float num2= Float.parseFloat(n2.getText());
        lb1.setText(String.valueOf(num1-num2));
    }

    public void multiplication(){
        float num1= Float.parseFloat(n1.getText());
        float num2= Float.parseFloat(n2.getText());
        lb1.setText(String.valueOf(num1*num2)
        );
    }

    public void division(){
        float num1= Float.parseFloat(n1.getText());
        float num2= Float.parseFloat(n2.getText());
        lb1.setText(String.valueOf(num1/num2));
    }

    //Number One TextField Only Taken Hereafter

    public void calsin(){
        float num1= Float.parseFloat(n1.getText());
        lb1.setText(String.valueOf(Math.sin(num1)));
    }

    public void calcos(){
        float num1= Float.parseFloat(n1.getText());
        lb1.setText(String.valueOf(Math.cos(num1)));
    }

    public void caltan(){
        float num1= Float.parseFloat(n1.getText());
        lb1.setText(String.valueOf(Math.tan(num1)));
    }

    public void calex(){
        float num1= Float.parseFloat(n1.getText());
        lb1.setText(String.valueOf(Math.exp(num1)));
    }
}
