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
import java.util.ResourceBundle;

public class QuadraticController implements Initializable {

    @FXML
    private TextField value1;
    @FXML
    private TextField value2;
    @FXML
    private TextField value3;
    @FXML
    private TextField output;

    public void Quadratic(ActionEvent event){
        double a = Double.parseDouble(value1.getText());
        double b = Double.parseDouble(value2.getText());
        double c = Double.parseDouble(value3.getText());
        double localvalue;

        double origenmath2 = 0;

        origenmath2 = b;

        origenmath2 = -b;

        localvalue = origenmath2 * origenmath2;
        c = 4*a* c;
        localvalue = localvalue-c;
        a = 2 * a;

        int sqrt = (int) Math.sqrt(localvalue);
        if(sqrt*sqrt == localvalue){
            double a1  = b + sqrt;
            double s =  b - sqrt;

            output.setText("( " + a1 + "  / " + a + " )" + " " + "," + "( " + s + "  / " + a + " )");

        }else{
            output.setText("( " + b + " + sqrt( " + localvalue + " ) / " + a + " )" + " " + "," + "( " + b + " - sqrt( " + localvalue + " ) / " + a + " )");
        }



    }
    public void changeSceneHome(ActionEvent event) throws IOException {
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
