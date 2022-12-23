package main.mordeweather;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPage extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainPage.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 400);
        stage.setResizable(false);
        stage.setTitle("MordeWeather");
        stage.setScene(scene);
        stage.getIcons().add(new Image("C:\\Users\\Cornel\\IdeaProjects\\MordeWeather\\src\\main\\resources\\images\\thermometer.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}