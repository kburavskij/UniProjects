package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String[] correctArray = {"1", "2", "3", "4", "5", "6", "7", "8", "X"};
    static final List correctList = new ArrayList(Arrays.asList(correctArray));
    public static final List shuffledList = new ArrayList(Arrays.asList(correctArray));

    public static void main(String[] args) {
        InputScanner inputScanner = new InputScanner();
        Introduction intro = Introduction.getIntro();
        inputScanner.read();
    }
}
