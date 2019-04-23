package com.company;

import java.util.Collections;

class GameActions {

    Main main = new Main();
    final Screen screen = new Screen();

    public void shuffle(){
        Collections.shuffle(Main.shuffledList);
    }

    public void check(){
        if(Main.shuffledList.equals(Main.correctList)){
            System.out.println("Sveikiname, JUS LAIMEJOTE!!!");
            System.exit(0);
        }
    }

    public void play(){
        shuffle();
        screen.show();
    }

    public void test(){
        Collections.swap(Main.shuffledList, Main.shuffledList.indexOf("X")-3, Main.shuffledList.indexOf("X"));
        screen.show();
        check();
    }

}
