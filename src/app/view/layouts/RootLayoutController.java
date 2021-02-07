package app.view.layouts;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class RootLayoutController {
    private Stage ownerStage;
    private Stage dialogStage;

    @FXML
    private AnchorPane mainPane;
    @FXML
    private Menu fileMenu;
    @FXML
    private MenuItem closeMenuItem;
    @FXML
    private Menu optionsMenu;
    @FXML
    private Menu languageMenu;
    @FXML
    private RadioMenuItem polishRMI;
    @FXML
    private RadioMenuItem englishRMI;
    @FXML
    private RadioMenuItem germanRMI;
    @FXML
    private RadioMenuItem spanishRMI;
    @FXML
    private MenuItem settingsMenuItem;
    @FXML
    private Menu helpMenu;
    @FXML
    private MenuItem aboutMenuItem;
    @FXML
    private MenuItem developersMenuItem;
    @FXML
    private MenuItem introductoryMovieMenuItem;

    private ToggleGroup languageGroup;

    @FXML
    private Label settingsLabel;
    @FXML
    private Label chooseYourLanguageLabel;
    @FXML
    private Button logoutButton;
    @FXML
    private Button myProfileButton;
    @FXML
    private Label userLabel;
    @FXML
    private ImageView userIcon;
    @FXML
    private ImageView adminPanelAccessImage;
    @FXML
    private Label adminPanelAccessLabel;

    @FXML
    private void initialize(){

    }

    @FXML
    private void handleClick(){
        System.out.println("NO JAK TAM!");
    }


}
