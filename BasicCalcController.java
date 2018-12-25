import com.sun.org.apache.xerces.internal.xs.StringList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class BasicCalcController implements Initializable {
    @FXML
    private TextField output;
    StringBuilder out = new StringBuilder();
    List<String> sign = new ArrayList<String>();

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
        out.append(" + ");
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
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        output.setEditable(false);
    }
}
