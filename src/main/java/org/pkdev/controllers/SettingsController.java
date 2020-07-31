package org.pkdev.controllers;

import javafx.fxml.FXML;

import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import org.pkdev.Main;
import org.pkdev.Settings;

import java.io.IOException;

public final class SettingsController {

    @FXML
    CheckBox checkboxUseHiragana;
    @FXML
    CheckBox checkboxUseKatakana;
    @FXML
    Text textSettingsWarning;

    private final Settings settings = Settings.getInstance();

    @FXML
    void initialize(){
        checkboxUseHiragana.setSelected(settings.isUseHiragana());
        checkboxUseKatakana.setSelected(settings.isUseKatakana());
    }

    @FXML
    void saveSettings(){
        try {
            settings.setUseHiragana(checkboxUseHiragana.isSelected());
            settings.setUseKatakana(checkboxUseKatakana.isSelected());
            if(!checkboxUseHiragana.isSelected() && !checkboxUseKatakana.isSelected()){
                textSettingsWarning.setVisible(true);
            }else{
                textSettingsWarning.setVisible(false);
                Main.setRoot("mainScreen");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
