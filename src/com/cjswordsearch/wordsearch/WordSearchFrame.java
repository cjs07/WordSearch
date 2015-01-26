package com.cjswordsearch.wordsearch;

import javax.swing.*;
import java.awt.*;

public class WordSearchFrame  extends JFrame{

    private static final String VERSION = "0.0.1";

    public WordSearchFrame() {
        super("CJ's Word Searches " + VERSION);
        setSize(new Dimension(420, 300));
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        WordSearchCreatorPanel wscp = new WordSearchCreatorPanel(this);
        setContentPane(wscp);
        revalidate();
    }
}
