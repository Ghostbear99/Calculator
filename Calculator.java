/****************************************************************
   Name: Chris Gawbill
   Things to Do:
                  Further improve the Quadratic Method
                  Graphing Capabilities
                  GUI Interface with text box and buttons
                        Use String.split to get the values
*************************************************************/
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/*
When program starts up this class is used and starts the JavaFx Interface
 */
public class Calculator extends Application {
   public static void main(String [] args){
      launch(args);
   }
   @Override
   public void start(Stage primaryStage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("CalcHome.fxml"));
      primaryStage.setTitle("Calculator");
      Scene scene = new Scene(root);
      primaryStage.setScene(scene);

      primaryStage.show();
   }
  }