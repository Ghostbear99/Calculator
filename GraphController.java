import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class GraphController implements Initializable {

    @FXML
    private ChoiceBox graphtype;
    @FXML
    private TextField xcen;
    @FXML
    private TextField yrad;
    @FXML
    private Canvas blank;

    public void graph(ActionEvent event){
        String choice = graphtype.getValue().toString();
        if(choice.equals("Linear")){

        }else{

        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        graphtype.getItems().addAll("Linear", "Ellipse");
    }
}
