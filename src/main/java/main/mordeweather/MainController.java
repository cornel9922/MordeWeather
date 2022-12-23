package main.mordeweather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField city_field;

    @FXML
    private Text feels_like_text;

    @FXML
    private Button getData_button;

    @FXML
    private Text maximum_text;

    @FXML
    private Text minimum_text;

    @FXML
    private Text pressure_text;

    @FXML
    private Text temperature_text;

    @FXML
    void initialize() {
        getData_button.setOnAction(actionEvent -> {
            String getUserCity = city_field.getText().trim();
            String output = getUrlContent("https://api.openweathermap.org/data/2.5/weather?q="+ getUserCity +"&appid=455b088558484b99c1e8bb09d1569fa4&units=metric");
            System.out.println(output);
            if (!output.isEmpty()) {


            }
        });
    }

    private static String getUrlContent(String urlAddress) {
        StringBuffer content = new StringBuffer();

        try {
            URL url = new URL(urlAddress);
            URLConnection urlConn = url.openConnection();

            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line;

            while((line = reader.readLine()) != null) {
                content.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Invalid city name");
            throw new RuntimeException(e);
        }
        return content.toString();
    }
}
