package Files;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author MarcusVinicius
 */
public class Instructions extends Application {

    @Override
    public void start(Stage primaryStage){
        final Stage dialog = new Stage();
            dialog.setTitle("Instructions");
            dialog.initModality(Modality.APPLICATION_MODAL);
            dialog.initOwner(primaryStage);
            Text instruct = new Text("Instruções:\n\nClique no número proximo à palavra\nque deseja tentar, uma janela abrirá\n"
                    + "com uma barra de texto, escreva seu \npalpite e clique em 'enviar'.");
            GridPane instructGrid = new GridPane();
            instructGrid.getChildren().add(instruct);
            instructGrid.setAlignment(Pos.CENTER);
            instructGrid.setPadding(new Insets(10));
            instructGrid.setTranslateY(-20);
            Scene dialogScene = new Scene(instructGrid, 300, 200);
            dialog.setScene(dialogScene);
            dialog.show();
    }
    
}
