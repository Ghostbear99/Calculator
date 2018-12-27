import com.sun.org.apache.xerces.internal.xs.StringList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class BasicCalcController implements Initializable {
    @FXML
    private TextField output;
    StringBuilder out = new StringBuilder();
    List<String> sign = new ArrayList<>();
    List<Double> num = new ArrayList<>();

    public void zero(ActionEvent event){
        out.append("0");
        output.setText(String.valueOf(out));
    }
    public void one(ActionEvent event){
        out.append("1");
        output.setText(String.valueOf(out));
    }
    public void two(ActionEvent event){
        out.append("2");
        output.setText(String.valueOf(out));
    }
    public void three(ActionEvent event){
        out.append("3");
        output.setText(String.valueOf(out));
    }
    public void four(ActionEvent event){
        out.append("4");
        output.setText(String.valueOf(out));
    }
    public void five(ActionEvent event){
        out.append("5");
        output.setText(String.valueOf(out));
    }
    public void six(ActionEvent event){
        out.append("6");
        output.setText(String.valueOf(out));
    }
    public void seven(ActionEvent event){
        out.append("7");
        output.setText(String.valueOf(out));
    }
    public void eight(ActionEvent event){
        out.append("8");
        output.setText(String.valueOf(out));
    }
    public void nine(ActionEvent event){
        out.append("9");
        output.setText(String.valueOf(out));
    }
    public void add(ActionEvent event){
        sign.add("+");
        out.append("+");
        output.setText(String.valueOf(out));
    }
    public void subtract(ActionEvent event) {
        sign.add("-");
        out.append("-");
        output.setText(String.valueOf(out));
    }
    public void mult(ActionEvent event) {
        sign.add("*");
        out.append("*");
        output.setText(String.valueOf(out));
    }
    public void divide(ActionEvent event) {
        sign.add("/");
        out.append("/");
        output.setText(String.valueOf(out));
    }
    public void calc(ActionEvent event){
        String s = out.toString();
        String sanitizedText = s.replaceAll("[^\\w\\s\\.]", " ");
        String [] result = sanitizedText.split(" ");
        for(int i = 0 ; i < sign.size()+1; i++){
            num.add(Double.parseDouble(result[i]));
        }
        double n = 0;
        for(int i = 0 ; i < sign.size(); i++){
            if(sign.get(i).equals("+")){
                n = num.get(0) + num.get(1);
                num.set(0,n);
                move();
            }else if(sign.get(i).equals("-")){
                n = num.get(0) - num.get(1);
                num.set(0,n);
                move();
            }else if(sign.get(i).equals("*")){
                n = num.get(0) * num.get(1);
                num.set(0,n);
                move();
            }else{
                n = num.get(0)/num.get(1);
                num.set(0,n);
                move();
            }
        }
        out = new StringBuilder();
        out.append(num.get(0).toString());
        sign.clear();
        output.clear();
        output.setText(num.get(0).toString());
        for(int i = 0; i < num.size(); i++){
            num.remove(i);
        }
        if(num.size() != 0) {
            num.remove(0);
        }

    }
    public void move(){
        for(int i = 1; i < num.size(); i++){
            if(i == num.size()-1){
                num.remove(i);
            }else {
                num.set(i, num.get(i + 1));
            }
        }
    }
    public void clear(ActionEvent event){
        sign.clear();
        out = new StringBuilder();
        output.clear();
    }
    public void changeScreenHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CalcHome.fxml"));
        Parent searchView = loader.load();
        Scene searchScene = new Scene(searchView);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(searchScene);
        window.show();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        output.setEditable(false);
    }
}
