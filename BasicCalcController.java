import com.sun.org.apache.xerces.internal.xs.StringList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

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
        sign.add("x");
        out.append("x");
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
                num.add(0,n);
                move();
            }else if(sign.get(i).equals("-")){
                n = num.get(0) - num.get(1);
                num.add(0,n);
                move();
            }else if(sign.get(i).equals("x")){
                n = num.get(0) * num.get(1);
                num.add(0,n);
                move();
            }else{
                n = num.get(0)/num.get(1);
                num.add(0,n);
                move();
            }
        }
        out = new StringBuilder();
        output.clear();
        output.setText(num.get(0).toString());

    }
    public void move(){
        for(int i = 1; i < sign.size(); i++){
           num.add(i, num.get(i+1));
           num.add(i+1, null);
        }
    }
    public void clear(ActionEvent event){
        output.clear();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        output.setEditable(false);
    }
}
