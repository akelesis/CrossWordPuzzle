package Files;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author MarcusVinicius
 */
public class MainMenu extends Application {
    InGame session = new InGame();
    
    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        Button play = new Button();
        Button instructions = new Button();
        Button ranking = new Button();
        Button exit = new Button();
        StackPane root = new StackPane();
        HBox buttons = new HBox();
        GridPane gridButtons = new GridPane();
        Image imgMain = new Image("http://www.realwire.com/writeitfiles/CWB_LOGO.jpg");
        ImageView imgM = new ImageView(imgMain);
        Label label = new Label();
              
        imgM.setFitHeight(200);
        imgM.setFitWidth(350);
        imgM.setTranslateY(-50);
        
        primaryStage.setTitle("Palavras Cruzadas - Menu");
        play.setText("JOGAR");
        instructions.setText("INSTRUÇÕES");
        ranking.setText("RANKING");
        exit.setText("SAIR");
        
        play.setOnAction((ActionEvent start)->{
            InGame game = new InGame();
            game.start(primaryStage);
        });
        
        instructions.setOnAction((ActionEvent event) -> {
            Instructions inst = new Instructions();
            inst.start(primaryStage);
        });
        
        ranking.setOnAction((ActionEvent rank)->{
            Ranking classification = new Ranking();
            classification.start(primaryStage);
        });
        
        exit.setOnAction((ActionEvent close)->{
            Exit shut = new Exit();
            shut.start(primaryStage);
        });
        
        buttons.setSpacing(15);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(play, instructions, ranking, exit);
        
        gridButtons.getChildren().addAll(buttons);
        gridButtons.setAlignment(Pos.BOTTOM_CENTER);
        gridButtons.setPadding(new Insets(30));
        
        root.getChildren().add(imgM);
        root.getChildren().add(gridButtons);
        primaryStage.setScene(new Scene(root,500,400));
        
        primaryStage.show();
    }
}
