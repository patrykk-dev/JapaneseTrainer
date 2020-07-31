package org.pkdev.controllers;

public final class MainControllerHelper {
    private static MainControllerHelper instance;
    private String savedLabelStatus = "";
    private String savedLabelStatusRomanji = "";
    private String savedStatusJap = "";
    private int allAnswers = 0;
    private float correctAnswers = 0;

    private MainControllerHelper(){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MainControllerHelper getInstance() {
        if(instance == null) instance = new MainControllerHelper();
        return instance;
    }

    public void setSavedLabelStatus(String savedLabelStatus) {
      this.savedLabelStatus = savedLabelStatus;
    }

    public void setSavedLabelStatusRomanji(String savedLabelStatusRomanji) { this.savedLabelStatusRomanji = savedLabelStatusRomanji; }

    public void setSavedStatusJap(String savedStatusJap) {
        this.savedStatusJap = savedStatusJap;
    }

    public void setCorrectAnswers(float correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public void setAllAnswers(int allAnswers) {
        this.allAnswers = allAnswers;
    }

    public String getSavedLabelStatus() {
        return savedLabelStatus;
    }

    public String getSavedLabelStatusRomanji() {
        return savedLabelStatusRomanji;
    }

    public String getSavedStatusJap() {
        return savedStatusJap;
    }

    public float getCorrectAnswers() {
        return correctAnswers;
    }

    public int getAllAnswers() {
        return allAnswers;
    }
}
