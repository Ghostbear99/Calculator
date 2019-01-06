import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
/*
This class handles what to do when certain buttons are pressed in the Home Scene
 */
public class CalcHomeController implements Initializable {
    /*
    Changes Scene to BasicFunction
     */
    public void changeSceenBasic(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BasicFunction.fxml"));
        Parent searchView = loader.load();
        Scene searchScene = new Scene(searchView);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(searchScene);
        window.show();
    }
    /*
    Changes Scene to Quadratic
     */
    public void changeSceenQuadratic(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Quadratic.fxml"));
        Parent searchView = loader.load();
        Scene searchScene = new Scene(searchView);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(searchScene);
        window.show();
    }
    /*
    Changes scene to CalculatorInterface (BasicCalc)
     */
    public void changeSceenCalc(ActionEvent event) throws IOException{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorInterface.fxml"));
        Parent searchView = loader.load();
        Scene searchScene = new Scene(searchView);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(searchScene);
        window.show();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
