package org.pkdev;

public final class Settings {
    private static Settings instance;
    private boolean useKatakana = false;
    private boolean useHiragana = true;

    private Settings(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public static Settings getInstance(){
        if(instance == null) instance = new Settings();
        return instance;
    }

    public boolean isUseKatakana() {
        return useKatakana;
    }

    public boolean isUseHiragana() {
        return useHiragana;
    }

    public void setUseKatakana(boolean useKatakana) {
        this.useKatakana = useKatakana;
    }

    public void setUseHiragana(boolean useHiragana) {
        this.useHiragana = useHiragana;
    }
}
