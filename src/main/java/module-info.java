module main.mordeweather {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.mordeweather to javafx.fxml;
    exports main.mordeweather;
}