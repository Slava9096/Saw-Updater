package slava9096.saws.sawsupdater;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SawUpdaterController {
    @FXML
    private Label start;
    @FXML
    protected void onStartButtonClick() {
        int sawCounter = 0;
        start.setText(String.format("Your saw counter is %d", sawCounter));
    }
}