package app;

import app.view.layouts.RootLayoutController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private Stage dialogStage;
    private BorderPane rootLayout;

    public MainApp(){

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Test App");

        showRootOverview();
        primaryStage.show();
    }

    public void showRootOverview(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/layouts/RootLayout.fxml"));
            BorderPane dataOverview = (BorderPane) loader.load();

            primaryStage.setMinHeight(720.0);
            primaryStage.setMinWidth(1280.0);

            RootLayoutController controller = loader.getController();

            Scene scene = new Scene(dataOverview);
            primaryStage.setScene(scene);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){ launch(args);}

    public Stage getPrimaryStage(){
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage){
        this.primaryStage = primaryStage;
    }

    private BorderPane getRootLayout(){
        return this.rootLayout;
    }

    private void setRootLayout(BorderPane rootLayout){
        this.rootLayout = rootLayout;
    }


}
