package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller{

    @FXML
    private TextField n1;
    @FXML
    private TextField n2;
    @FXML
    private Label lb1;

        //Addition
        public void addition () {
            n2.setDisable(false);
            try{
                float num1 = Float.parseFloat(n1.getText());
                float num2 = Float.parseFloat(n2.getText());
                lb1.setText(String.valueOf(num1 + num2));

            }
            catch(Exception e){
                n1.setText(n1.getText());
                n2.setText(n2.getText());
                lb1.setText("");
            }
        }

        //Subtraction
        public void subtraction () {
            n2.setDisable(false);
            try{
                float num1 = Float.parseFloat(n1.getText());
                float num2 = Float.parseFloat(n2.getText());
                lb1.setText(String.valueOf(num1 - num2));
            }
            catch(Exception e){
                n1.setText(n1.getText());
                n2.setText(n2.getText());
                lb1.setText("");
            }
        }

        //Multiplication
        public void multiplication () {
            n2.setDisable(false);
            try{
                float num1 = Float.parseFloat(n1.getText());
                float num2 = Float.parseFloat(n2.getText());
                lb1.setText(String.valueOf(num1 * num2));
            }
            catch(Exception e){
                n1.setText(n1.getText());
                n2.setText(n2.getText());
                lb1.setText("");
            }
        }

        //Division
        public void division () {
            n2.setDisable(false);
            try{
                float num1 = Float.parseFloat(n1.getText());
                float num2 = Float.parseFloat(n2.getText());
                lb1.setText(String.valueOf(num1 / num2));
            }
            catch(Exception e){
                n1.setText(n1.getText());
                n2.setText(n2.getText());
                lb1.setText("");
            }
        }

        //Number One TextField Only Taken Hereafter

        //Sin
        public void calsin () {
            try {
                double num1 = Float.parseFloat(n1.getText());
                num1= Math.toRadians(num1);
                lb1.setText(String.valueOf(Math.sin(num1)));
                n2.setDisable(true);
            }
            catch(Exception e){
                n1.setText(n1.getText());
                n2.setText("Use the Above Box");
                n2.setDisable(true);
                lb1.setText("");
            }

        }

        //Cos
        public void calcos () {
            n2.setText("Use the Above Box");
            n2.setDisable(true);
            try {
                double num1 = Float.parseFloat(n1.getText());
                num1= Math.toRadians(num1);
                lb1.setText(String.valueOf(Math.cos(num1)));
                n2.setDisable(true);
            }
            catch(Exception e){
                n1.setText(n1.getText());

                lb1.setText("");
            }
        }

        //Tan
        public void caltan () {
            try {
                double num1 = Float.parseFloat(n1.getText());
                num1= Math.toRadians(num1);
                lb1.setText(String.valueOf(Math.tan(num1)));
                n2.setDisable(true);
            }
            catch(Exception e){
                n1.setText(n1.getText());
                n2.setText("Use the Above Box");
                n2.setDisable(true);
                lb1.setText("");
            }
        }

        //Exp
        public void calex () {
            try {
                double num1 = Float.parseFloat(n1.getText());
                lb1.setText(String.valueOf(Math.exp(num1)));
                n2.setDisable(true);
            }
            catch(Exception e){
                n1.setText(n1.getText());
                n2.setText("Use the Above Box");
                n2.setDisable(true);
            }
        }

}
