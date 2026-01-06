@echo off
set JAVA_HOME=C:\Program Files\Java\jdk-25
java --enable-native-access=javafx.graphics --module-path "C:\Program Files\JavaFX\javafx-sdk-25.0.1\lib;target\classes" --add-modules javafx.controls,javafx.fxml --module com.example.helloworld/com.example.helloworld.Main
