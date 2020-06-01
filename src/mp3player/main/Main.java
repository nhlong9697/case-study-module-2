package mp3player.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        final String appName = "Mp3Player v0.4";
        Parent parent = FXMLLoader.load(getClass().getResource("/mp3player/view/MainPane.fxml"));
        primaryStage.setTitle(appName);
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
