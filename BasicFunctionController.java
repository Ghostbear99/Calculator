import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BasicFunctionController implements Initializable {

    private double globalV;
    private double localV1;
    private double localV2;
    private double localsum;
    private int a = 0;

    @FXML
    private TextField output;
    @FXML
    private TextField number1;
    @FXML
    private TextField number2;
    @FXML
    private ChoiceBox sign;
    @FXML
    private ChoiceBox next;

    public void doMath(ActionEvent event){
        String out = sign.getItems().toString()''
        String what = next.getItems().toString();
        double num1  = Double.parseDouble(number1.getText());
        double num2  = Double.parseDouble(number2.getText());
        if(out.equals("+")){
            Add(num1, num2);
        }else if(out.equals("-")){
            Sub(num1, num2);
        }else if(out.equals("x")){
            Mult(num1, num2);
        }else{
            Div(num1, num2);
        }
        if(a == 0){
            globalV = localsum;
            if(what.equals("Add")){
                a = 1;
            }else if(what.equals("Subtract")){
                a = 2;
            }else if(what.equals("Multiply")){
                a = 3;
            }else if(what.equals("Divide")){
                a = 4;
            }else{
                a = 0;
                String b = String.valueOf(globalV);
                output.setText(b);

            }
        }else if(a == 1){
            Add(globalV, localsum);
            globalV = localsum;
            if(what.equals("Add")){
                a = 1;
            }else if(what.equals("Subtract")){
                a = 2;
            }else if(what.equals("Multiply")){
                a = 3;
            }else if(what.equals("Divide")){
                a = 4;
            }else{
                String a = String.valueOf(globalV);
                output.setText(a);
            }
        }else if(a == 2){
            Sub(globalV, localsum);
            globalV = localsum;
            if(what.equals("Add")){
                a = 1;
            }else if(what.equals("Subtract")){
                a = 2;
            }else if(what.equals("Multiply")){
                a = 3;
            }else if(what.equals("Divide")){
                a = 4;
            }else{
                String a = String.valueOf(globalV);
                output.setText(a);
            }
        }else if(a == 3){
            Mult(globalV, localsum);
            globalV = localsum;
            if(what.equals("Add")){
                a = 1;
            }else if(what.equals("Subtract")){
                a = 2;
            }else if(what.equals("Multiply")){
                a = 3;
            }else if(what.equals("Divide")){
                a = 4;
            }else{
                String a = String.valueOf(globalV);
                output.setText(a);
            }
        }else{
            Div(globalV, localsum);
            globalV = localsum;
            if(what.equals("Add")){
                a = 1;
            }else if(what.equals("Subtract")){
                a = 2;
            }else if(what.equals("Multiply")){
                a = 3;
            }else if(what.equals("Divide")){
                a = 4;
            }else{
                String a = String.valueOf(globalV);
                output.setText(a);
            }
        }
    }
    public void Add(double a, double b){
        if(a == 0){
            localsum = a;
        }else if(b == 0){
            localsum = b;
        }else {
            localsum = a + b;
        }
    }
    public void Sub(double a, double b){
        if(a == 0){
          localsum = a;
        }else if(b == 0){
            localsum = b;
        }else {
            localsum = a - b;
        }
    }
    public void Mult(double a, double b){
        if(a == 0){
            localsum = a;
        }else if(b == 0){
            localsum = b;
        }else {
            localsum = a * b;
        }
    }
    public void Div(double a, double b){
        if(a == 0){
            localsum = a;
        }else if(b == 0){
            localsum = b;
        }else {
            localsum = a / b;
        }
    }
    public void changeSceneHome(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CalcHome.fxml"));
        Parent searchView = loader.load();
        Scene searchScene = new Scene(searchView);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(searchScene);
        window.show();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sign.getItems().addAll("+","-","x","/");

        next.getItems().add("Output");
        next.getItems().add("Add");
        next.getItems().add("Subtract");
        next.getItems().add("Multiply");
        next.getItems().add("Divide");

        output.setEditable(false);
    }
}
