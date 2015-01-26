package com.cjswordsearch.wordsearch.util;

import java.util.Random;

public class RandomCharacterGenerator {

    private Random random;

    //array filled with the characters, use number in alphabet -1 to access it
    //i.e. a = 0, b = 1, c = 2...x = 23, y = 24, z = 25
    private final String[] characters = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    //character constants
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 5;
    public static final int F = 6;
    public static final int G = 7;
    public static final int H = 8;
    public static final int I = 9;
    public static final int J = 10;
    public static final int K = 11;
    public static final int L = 12;
    public static final int M = 13;
    public static final int N = 14;
    public static final int O = 15;
    public static final int P = 16;
    public static final int Q = 17;
    public static final int R = 18;
    public static final int S = 19;
    public static final int T = 20;
    public static final int U = 21;
    public static final int V = 22;
    public static final int W = 23;
    public static final int X = 24;
    public static final int Y = 25;
    public static final int Z = 26;

    public RandomCharacterGenerator() {
        random = new Random();
    }

    public String nextCharacter() {
        int charNum = random.nextInt(26);
        return characters[charNum];
    }
}
