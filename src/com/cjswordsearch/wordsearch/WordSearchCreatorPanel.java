package com.cjswordsearch.wordsearch;

import javax.swing.*;
import java.awt.*;

public class WordSearchCreatorPanel extends JPanel {

    JComboBox<String> sizes;
    JTextArea wordsToUse;
    JButton createPuzzle;

    int characterPerSide;

    WordSearchCreatorPanel(WordSearchFrame frame) {
        setLayout(new BorderLayout());

        sizes = new JComboBox<String>();
        for (int i = 5; i < 10; i++) {
            sizes.addItem(i + "x" + i);
        }
        wordsToUse = new JTextArea("Enter each word to be used in the word search on a new line");
        createPuzzle = new JButton("Create Word Search");

        add(sizes, BorderLayout.NORTH);
        add(new JScrollPane(wordsToUse), BorderLayout.CENTER);
        add(createPuzzle, BorderLayout.SOUTH);
    }

    public void paintComponent(Graphics g) {}
}
