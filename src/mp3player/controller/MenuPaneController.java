package mp3player.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuPaneController implements Initializable {

    @FXML
    private MenuItem aboutMenuItem;
    @FXML
    private MenuItem fileMenuItem;
    @FXML
    private MenuItem closeMenuItem;
    @FXML
    private MenuItem dirMenuItem;
    @FXML
    private Menu fileMenu;

    public MenuItem getAboutMenuItem() {
        return aboutMenuItem;
    }

    public MenuItem getFileMenuItem() {
        return fileMenuItem;
    }

    public MenuItem getCloseMenuItem() {
        return closeMenuItem;
    }

    public MenuItem getDirMenuItem() {
        return dirMenuItem;
    }

    public Menu getFileMenu() {
        return fileMenu;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }
}