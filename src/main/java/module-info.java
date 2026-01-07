module com.example.helloworld {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.helloworld to javafx.fxml;
    exports com.example.helloworld;
}
