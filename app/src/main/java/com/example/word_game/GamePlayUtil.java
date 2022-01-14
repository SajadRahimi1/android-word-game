package com.example.word_game;

import java.util.ArrayList;
import java.util.List;

public class GamePlayUtil {
    public static List<Level> createLevels() {
        List<Level> levels = new ArrayList<>();

        Level level1 = new Level();
        level1.setId(1);
        level1.getWords().add("اش");
        level1.getWords().add("اتش");
        levels.add(level1);

        Level level2 = new Level();
        level2.setId(2);

        level2.getWords().add("خاک");
        level2.getWords().add("کاخ");
        levels.add(level2);

        Level level3 = new Level();
        level3.setId(3);

        level3.getWords().add("اهو");
        level3.getWords().add("هوا");
        levels.add(level3);

        Level level4 = new Level();
        level4.setId(4);

        level4.getWords().add("شیر");
        level4.getWords().add("ریش");
        level4.getWords().add("ری");
        level4.getWords().add("شر");
        levels.add(level4);

        Level level5 = new Level();
        level5.setId(5);

        level5.getWords().add("فک");
        level5.getWords().add("کف");
        level5.getWords().add("کفش");
        level5.getWords().add("کشف");
        level5.getWords().add("شک");
        levels.add(level5);

        Level level6 = new Level();
        level6.setId(6);

        level6.getWords().add("خرس");
        level6.getWords().add("سرخ");
        level6.getWords().add("سر");
        level6.getWords().add("خر");
        level6.getWords().add("رس");
        levels.add(level6);

        return levels;
    }


    public static List<Character> extractUniqueCharacters(List<String> words) {
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (!characters.contains(words.get(i).charAt(j))) {
                    characters.add(words.get(i).charAt(j));
                }
            }
        }
        return characters;
    }


}
