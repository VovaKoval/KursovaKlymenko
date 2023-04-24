module com.example.pctechnika {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pctechnika to javafx.fxml;
    exports com.example.pctechnika;
}