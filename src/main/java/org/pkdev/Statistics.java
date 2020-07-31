package org.pkdev;

import java.util.ArrayList;

public final class Statistics {
    private static Statistics instance; //Singleton
    final ArrayList<Integer> statHiraganaCorrectAnswers = new ArrayList<>();
    final ArrayList<Integer> statKatakanaCorrectAnswers = new ArrayList<>();

    private Statistics() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        JapaneseMap map = new JapaneseMap();
        map.hiraganaArray.forEach(p -> statHiraganaCorrectAnswers.add(0));
        map.katakanaArray.forEach(p -> statKatakanaCorrectAnswers.add(0));
        if(statHiraganaCorrectAnswers.size() < 1 || statKatakanaCorrectAnswers.size() < 1) System.out.println("ERROR!");
    }

    public static Statistics getInstance(){
        if(instance == null){
            instance = new Statistics();
        }
        return instance;
    }

    public void addStatCorrectAnswers(int index, int type){
        if(type == 0){
            statHiraganaCorrectAnswers.set(index, statHiraganaCorrectAnswers.get(index)+1);
        }else{
            statKatakanaCorrectAnswers.set(index, statKatakanaCorrectAnswers.get(index)+1);
        }
    }

    @SuppressWarnings("RedundantIfStatement")
    public boolean alreadyAnswered(int index, int type) {
        int min = Integer.MAX_VALUE;
        if(type == 0){
            for(int i : statHiraganaCorrectAnswers){
                if(i<min) min = i;
            }
            if(statHiraganaCorrectAnswers.get(index)>min){
                return true;
            }
        }else{
            for(int i : statKatakanaCorrectAnswers){
                if(i<min) min = i;
            }
            if(statKatakanaCorrectAnswers.get(index)>min){
                return true;
            }
        }

        return false;
    }
}
