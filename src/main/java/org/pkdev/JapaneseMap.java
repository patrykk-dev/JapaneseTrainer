package org.pkdev;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Random;

public class JapaneseMap {
    final ArrayList<Pair<String,String>> hiraganaArray = new ArrayList<>();
    final ArrayList<Pair<String,String>> katakanaArray = new ArrayList<>();
    private final Random r = new Random();
    public Pair<String,String> last;
    public int lastIndex = 0;
    public int lastType;

    public JapaneseMap(){
        hiraganaArray.add(new Pair<>("a", "\u3042"));	
        hiraganaArray.add(new Pair<>("i", "\u3044"));	
        hiraganaArray.add(new Pair<>("u", "\u3046"));
        hiraganaArray.add(new Pair<>("e", "\u3048"));	
        hiraganaArray.add(new Pair<>("o", "\u304A"));	
        hiraganaArray.add(new Pair<>("ka", "\u304B"));	
        hiraganaArray.add(new Pair<>("ki", "\u304D"));	
        hiraganaArray.add(new Pair<>("ku", "\u304F"));	
        hiraganaArray.add(new Pair<>("ke", "\u3051"));	
        hiraganaArray.add(new Pair<>("ko", "\u3053"));	
        hiraganaArray.add(new Pair<>("sa", "\u3055"));
        hiraganaArray.add(new Pair<>("shi", "\u3057"));	
        hiraganaArray.add(new Pair<>("su", "\u3059"));	
        hiraganaArray.add(new Pair<>("se", "\u305B"));	
        hiraganaArray.add(new Pair<>("so", "\u305D"));	
        hiraganaArray.add(new Pair<>("ta", "\u305F"));	
        hiraganaArray.add(new Pair<>("chi", "\u3061"));	
        hiraganaArray.add(new Pair<>("tsu", "\u3064"));	
        hiraganaArray.add(new Pair<>("te", "\u3066"));	
        hiraganaArray.add(new Pair<>("to", "\u3068"));	
        hiraganaArray.add(new Pair<>("na", "\u306A"));
        hiraganaArray.add(new Pair<>("ni", "\u306B"));	
        hiraganaArray.add(new Pair<>("nu", "\u306C"));	
        hiraganaArray.add(new Pair<>("ne", "\u306D"));	
        hiraganaArray.add(new Pair<>("no", "\u306E"));	
        hiraganaArray.add(new Pair<>("ha", "\u306F"));	
        hiraganaArray.add(new Pair<>("hi", "\u3072"));	
        hiraganaArray.add(new Pair<>("fu", "\u3075"));	
        hiraganaArray.add(new Pair<>("he", "\u3078"));	
        hiraganaArray.add(new Pair<>("ho", "\u307B"));	
        hiraganaArray.add(new Pair<>("ma", "\u307E"));
        hiraganaArray.add(new Pair<>("mi", "\u307F"));	
        hiraganaArray.add(new Pair<>("mu", "\u3080"));	
        hiraganaArray.add(new Pair<>("me", "\u3081"));	
        hiraganaArray.add(new Pair<>("mo", "\u3082"));	
        hiraganaArray.add(new Pair<>("ya", "\u3084"));	
        hiraganaArray.add(new Pair<>("yu", "\u3086"));	
        hiraganaArray.add(new Pair<>("yo", "\u3088"));	
        hiraganaArray.add(new Pair<>("ra", "\u3089"));	
        hiraganaArray.add(new Pair<>("ri", "\u308A"));	
        hiraganaArray.add(new Pair<>("ru", "\u308B"));
        hiraganaArray.add(new Pair<>("re", "\u308C"));	
        hiraganaArray.add(new Pair<>("ro", "\u308D"));	
        hiraganaArray.add(new Pair<>("wa", "\u308F"));	
        hiraganaArray.add(new Pair<>("wo", "\u3092"));	
        hiraganaArray.add(new Pair<>("n", "\u3093"));	
        hiraganaArray.add(new Pair<>("ga", "\u304C"));	
        hiraganaArray.add(new Pair<>("gi", "\u304E"));	
        hiraganaArray.add(new Pair<>("gu", "\u3050"));	
        hiraganaArray.add(new Pair<>("ge", "\u3052"));
        hiraganaArray.add(new Pair<>("go", "\u3054"));	
        hiraganaArray.add(new Pair<>("za", "\u3056"));	
        hiraganaArray.add(new Pair<>("ji", "\u3058"));	
        hiraganaArray.add(new Pair<>("zu", "\u305A"));	
        hiraganaArray.add(new Pair<>("ze", "\u305C"));	
        hiraganaArray.add(new Pair<>("zo", "\u305E"));	
        hiraganaArray.add(new Pair<>("da", "\u3060"));	
        hiraganaArray.add(new Pair<>("ji", "\u3063"));	
        hiraganaArray.add(new Pair<>("zu", "\u3065"));	
        hiraganaArray.add(new Pair<>("de", "\u3067"));
        hiraganaArray.add(new Pair<>("do", "\u3069"));	
        hiraganaArray.add(new Pair<>("ba", "\u3070"));	
        hiraganaArray.add(new Pair<>("pa", "\u3071"));	
        hiraganaArray.add(new Pair<>("bi", "\u3073"));	
        hiraganaArray.add(new Pair<>("pi", "\u3074"));	
        hiraganaArray.add(new Pair<>("bu", "\u3076"));	
        hiraganaArray.add(new Pair<>("pu", "\u3077"));	
        hiraganaArray.add(new Pair<>("be", "\u3079"));	
        hiraganaArray.add(new Pair<>("pe", "\u307A"));	
        hiraganaArray.add(new Pair<>("bo", "\u307C"));
        hiraganaArray.add(new Pair<>("po", "\u307D"));	

        katakanaArray.add(new Pair<>("a", "\u30A2"));	
        katakanaArray.add(new Pair<>("i", "\u30A4"));	
        katakanaArray.add(new Pair<>("u", "\u30A6"));	
        katakanaArray.add(new Pair<>("e", "\u30A8"));	
        katakanaArray.add(new Pair<>("o", "\u30AA"));
        katakanaArray.add(new Pair<>("ka", "\u30AB"));	
        katakanaArray.add(new Pair<>("ki", "\u30AD"));	
        katakanaArray.add(new Pair<>("ku", "\u30AF"));	
        katakanaArray.add(new Pair<>("ke", "\u30B1"));	
        katakanaArray.add(new Pair<>("ko", "\u30B3"));	
        katakanaArray.add(new Pair<>("sa", "\u30B5"));	
        katakanaArray.add(new Pair<>("shi", "\u30B7"));	
        katakanaArray.add(new Pair<>("su", "\u30B9"));	
        katakanaArray.add(new Pair<>("se", "\u30BB"));	
        katakanaArray.add(new Pair<>("so", "\u30BD"));
        katakanaArray.add(new Pair<>("ta", "\u30BF"));	
        katakanaArray.add(new Pair<>("chi", "\u30C1"));	
        katakanaArray.add(new Pair<>("tsu", "\u30C4"));	
        katakanaArray.add(new Pair<>("te", "\u30C6"));	
        katakanaArray.add(new Pair<>("to", "\u30C8"));	
        katakanaArray.add(new Pair<>("na", "\u30CA"));	
        katakanaArray.add(new Pair<>("ni", "\u30CB"));	
        katakanaArray.add(new Pair<>("nu", "\u30CC"));	
        katakanaArray.add(new Pair<>("ne", "\u30CD"));	
        katakanaArray.add(new Pair<>("no", "\u30CE"));
        katakanaArray.add(new Pair<>("ha", "\u30CF"));	
        katakanaArray.add(new Pair<>("hi", "\u30D2"));	
        katakanaArray.add(new Pair<>("fu", "\u30D5"));	
        katakanaArray.add(new Pair<>("he", "\u30D8"));	
        katakanaArray.add(new Pair<>("ho", "\u30DB"));	
        katakanaArray.add(new Pair<>("ma", "\u30DE"));	
        katakanaArray.add(new Pair<>("mi", "\u30DF"));	
        katakanaArray.add(new Pair<>("mu", "\u30E0"));	
        katakanaArray.add(new Pair<>("me", "\u30E1"));	
        katakanaArray.add(new Pair<>("mo", "\u30E2"));
        katakanaArray.add(new Pair<>("ya", "\u30E4"));	
        katakanaArray.add(new Pair<>("yu", "\u30E6"));	
        katakanaArray.add(new Pair<>("yo", "\u30E8"));	
        katakanaArray.add(new Pair<>("ra", "\u30E9"));	
        katakanaArray.add(new Pair<>("ri", "\u30EA"));	
        katakanaArray.add(new Pair<>("ru", "\u30EB"));	
        katakanaArray.add(new Pair<>("re", "\u30EC"));	
        katakanaArray.add(new Pair<>("ro", "\u30ED"));	
        katakanaArray.add(new Pair<>("wa", "\u30EF"));	
        katakanaArray.add(new Pair<>("wo", "\u30F2"));
        katakanaArray.add(new Pair<>("n", "\u30F3"));	
        katakanaArray.add(new Pair<>("ga", "\u30AC"));	
        katakanaArray.add(new Pair<>("gi", "\u30AE"));	
        katakanaArray.add(new Pair<>("gu", "\u30B0"));	
        katakanaArray.add(new Pair<>("ge", "\u30B2"));	
        katakanaArray.add(new Pair<>("go", "\u30B4"));	
        katakanaArray.add(new Pair<>("za", "\u30B6"));	
        katakanaArray.add(new Pair<>("ji", "\u30B8"));	
        katakanaArray.add(new Pair<>("zu", "\u30BA"));	
        katakanaArray.add(new Pair<>("ze", "\u30BC"));
        katakanaArray.add(new Pair<>("zo", "\u30BE"));
        katakanaArray.add(new Pair<>("da", "\u30C0"));
        katakanaArray.add(new Pair<>("di", "\u30C2"));
        katakanaArray.add(new Pair<>("du", "\u30C5"));
        katakanaArray.add(new Pair<>("de", "\u30C7"));
        katakanaArray.add(new Pair<>("do", "\u30C9"));
        katakanaArray.add(new Pair<>("ba", "\u30D0"));
        katakanaArray.add(new Pair<>("pa", "\u30D1"));
        katakanaArray.add(new Pair<>("bi", "\u30D3"));
        katakanaArray.add(new Pair<>("pi", "\u30D4"));
        katakanaArray.add(new Pair<>("bu", "\u30D6"));	
        katakanaArray.add(new Pair<>("pu", "\u30D7"));	
        katakanaArray.add(new Pair<>("be", "\u30D9"));	
        katakanaArray.add(new Pair<>("pe", "\u30DA"));	
        katakanaArray.add(new Pair<>("bo", "\u30DC"));	
        katakanaArray.add(new Pair<>("po", "\u30DD"));	
    }

    public Pair<String,String> getLast(){
        return last;
    }


    private final Settings settings = Settings.getInstance();

    public Pair<String, String> next() {
        Statistics stats = Statistics.getInstance();
        lastType = 0;
        if (settings.isUseKatakana()) lastType = 1;
        if (settings.isUseHiragana() && settings.isUseKatakana()) lastType = r.nextInt(2);

        int newIndex;
        do{
            newIndex = r.nextInt(70);
        }while(stats.alreadyAnswered(newIndex,lastType) || newIndex == lastIndex);

        lastIndex = newIndex;

        if(lastType == 0){
            last = hiraganaArray.get(lastIndex);
        }else{
            last = katakanaArray.get(lastIndex);
        }

        return last;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public int getLastType() {
        return lastType;
    }
}
