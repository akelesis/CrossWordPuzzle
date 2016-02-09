package Files;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author MarcusVinicius
 */
public class Exit extends Application {

    @Override
    public void start(Stage primaryStage) {
        final Stage dialog = new Stage();
            dialog.setTitle("Confirma");
            dialog.initModality(Modality.APPLICATION_MODAL);
            dialog.initOwner(primaryStage);
            Text exitText = new Text("Tem certeza disto?");
            Button yes = new Button();
            yes.setText("Sim");
            Button no = new Button();
            no.setText("Não");
            yes.setOnAction((ActionEvent conf)->{
                primaryStage.close();
            });
            no.setOnAction((ActionEvent dont)->{
                dialog.close();
            });
            GridPane exitGrid = new GridPane();
            exitGrid.getChildren().add(exitText);
            exitGrid.setAlignment(Pos.TOP_CENTER);
            HBox buttonBox = new HBox();
            buttonBox.setAlignment(Pos.CENTER);
            buttonBox.setSpacing(30);
            buttonBox.setPadding(new Insets(10));
            buttonBox.getChildren().addAll(yes, no);
            VBox exitBox = new VBox();
            exitBox.getChildren().addAll(exitGrid, buttonBox);
            exitGrid.setPadding(new Insets(10));
            Scene dialogScene = new Scene(exitBox, 230, 100);
            dialog.setScene(dialogScene);
            dialog.show();
    }
    
}
