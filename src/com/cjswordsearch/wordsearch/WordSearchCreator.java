package com.cjswordsearch.wordsearch;

import com.cjswordsearch.wordsearch.util.RandomCharacterGenerator;

import java.util.Random;

public class WordSearchCreator {

    String[][] puzzle;
    RandomCharacterGenerator characterGenerator;
    Random random;

    int charactersPerSide;

    public WordSearchCreator(int charactersPerSide){
        puzzle = new String[charactersPerSide][charactersPerSide];
        characterGenerator = new RandomCharacterGenerator();
        random = new Random();

        this.charactersPerSide = charactersPerSide;
    }

    public void generatePuzzle(String[] words) {
        for (String s : words) {
            int startingX = random.nextInt(charactersPerSide);
            int startingY = random.nextInt(charactersPerSide);
            int direction = random.nextInt(8);
            addWord(s, startingX, startingY, direction);
            fillBlanks();
        }
    }

    public void addWord(String word, int x, int y, int direction) {
        if (word != null && word.length() != 0 && word.length() != 1) {
            for (int i = 0; i < word.length(); i++) {
                String letter = word.substring(i, i + 1);
                if (puzzle[x][y] == null) {
                    switch (direction) {
                        case 0:
                            addLetter(letter, x, y-i);
                            break;
                        case 1:
                            addLetter(letter, x+i, y-i);
                            break;
                        case 2:
                            addLetter(letter, x+i, y);
                            break;
                        case 3:
                            addLetter(letter, x+i, y+i);
                            break;
                        case 4:
                            addLetter(letter, x, y+i);
                            break;
                        case 5:
                            addLetter(letter, x-i, y+i);
                            break;
                        case 6:
                            addLetter(letter, x-i, y);
                            break;
                        case 7:
                            addLetter(letter, x-i, y-i);
                            break;
                    }
                } else {
                    if (puzzle[x][y].equals(letter)) {
                        addLetter(letter, x, y);
                    } else {
                        if (i == 0) {
                            addWord(word, random.nextInt(charactersPerSide), random.nextInt(charactersPerSide),
                                    random.nextInt(8));
                        } else {
                            addWord(word, x, y, random.nextInt(8));
                        }
                    }
                }
            }
        }
    }

    public void addLetter(String letter, int x, int y) {
        if (letter.length() != 1) {
            return;
        } else {
            puzzle[x][y] = letter;
        }
    }

    public void fillBlanks() {
        for (int x = 0; x < puzzle.length; x++) {
            for (int y = 0; y < puzzle[0].length; y++) {
                if (puzzle[x][y] == null) {
                    puzzle[x][y] = characterGenerator.nextCharacter();
                }
            }
        }
    }
}
