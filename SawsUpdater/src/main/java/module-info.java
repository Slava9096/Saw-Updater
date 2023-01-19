module slava9096.saws.sawsupdater {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens slava9096.saws.sawsupdater to javafx.fxml;
    exports slava9096.saws.sawsupdater;
}