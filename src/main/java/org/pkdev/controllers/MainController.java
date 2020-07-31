package org.pkdev.controllers;

import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import org.pkdev.*;

public class MainController {

    private final JapaneseMap japaneseMap = new JapaneseMap();
    private final Statistics stats = Statistics.getInstance();
    private final MainControllerHelper mainControllerHelper = MainControllerHelper.getInstance();
    private float correctAnswers = mainControllerHelper.getCorrectAnswers();
    private int allAnswers = mainControllerHelper.getAllAnswers();

    @FXML
    TextField displayedText;
    @FXML
    Text labelStatus;
    @FXML
    Text labelStatusJap;
    @FXML
    Text labelStatusRomanji;
    @FXML
    Text labelStats;
    @FXML
    TextField inputText;

    @FXML
    void initialize() {
            displayedText.setText(japaneseMap.next().getValue());
            labelStatus.setText(mainControllerHelper.getSavedLabelStatus());
            labelStatusRomanji.setText(mainControllerHelper.getSavedLabelStatusRomanji());
            labelStatusJap.setText(mainControllerHelper.getSavedStatusJap());
            labelStats.setText("Correct: " + (int) correctAnswers + "/" + allAnswers + "(" + (int) (correctAnswers / allAnswers * 100) + "%)");
    }

    @FXML
    void skip() {
        labelStatus.setText("Skipped:");
        labelStatusJap.setText(japaneseMap.getLast().getValue());
        labelStatusRomanji.setText("(" + japaneseMap.getLast().getKey() + ")");
        japaneseMap.next();
        displayedText.setText(japaneseMap.getLast().getValue());
        inputText.setText("");
    }

    @FXML
    void enter() {
        allAnswers++;
        if (inputText.getText().equals(japaneseMap.getLast().getKey())) {
            labelStatus.setText("Correct");
            labelStatusJap.setText("");
            labelStatusRomanji.setText("");
            correctAnswers++;
            stats.addStatCorrectAnswers(japaneseMap.getLastIndex(), japaneseMap.getLastType());
        } else {
            labelStatus.setText("Incorrect:");
            labelStatusJap.setText(japaneseMap.getLast().getValue());
            labelStatusRomanji.setText("(" + japaneseMap.getLast().getKey() + ")");
        }
        japaneseMap.next();
        displayedText.setText(japaneseMap.getLast().getValue());
        inputText.setText("");
        labelStats.setText("Correct: " + (int) correctAnswers + "/" +  allAnswers + "(" + (int) (correctAnswers / allAnswers * 100) + "%)");
    }

    @FXML
    void openSettings() throws IOException {
        mainControllerHelper.setSavedLabelStatus(labelStatus.getText());
        mainControllerHelper.setSavedLabelStatusRomanji(labelStatusRomanji.getText());
        mainControllerHelper.setSavedStatusJap(labelStatusJap.getText());
        mainControllerHelper.setAllAnswers(allAnswers);
        mainControllerHelper.setCorrectAnswers(correctAnswers);
        Main.setRoot("settingsScreen");
    }
}
