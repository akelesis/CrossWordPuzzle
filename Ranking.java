package Files;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author MarcusVinicius
 */
public class Ranking extends Application {

    @Override
    public void start(Stage primaryStage){
        final Stage ranking = new Stage();
        ranking.setTitle("Ranking");
        ranking.initModality(Modality.APPLICATION_MODAL);
        ranking.initOwner(primaryStage);
        Text title = new Text("Ranking");
        HBox titleBox = new HBox();
        titleBox.setAlignment(Pos.TOP_CENTER);
        titleBox.setPadding(new Insets(10));
        titleBox.getChildren().add(title);
        ranking.setScene(new Scene(titleBox, 200, 300));
        ranking.show();
        
    }
    
}
