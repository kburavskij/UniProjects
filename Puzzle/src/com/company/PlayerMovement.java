package com.company;

import java.util.Collections;


class PlayerMovement {

    private Main main = new Main();
    private final GameActions gameActions = new GameActions();
    private final Screen screen = new Screen();

    public void moveUp() {
        for (int i = 0; i < screen.rowSize.intValue(); i++) {
            if (Main.shuffledList.indexOf("X") != i) {
                Collections.swap(Main.shuffledList, Main.shuffledList.indexOf("X") - screen.rowSize.intValue(), Main.shuffledList.indexOf("X"));
                System.out.println(Main.shuffledList.indexOf("X"));
                screen.show();
                gameActions.check();
                break;
            } else {
                System.out.println("Ejimas uz ribu neleistinas");
                break;
            }
        }
    }

    public void moveDown() {
        for (int i = screen.arraySize; i > (screen.arraySize-screen.rowSize.intValue()); i--) {
            if (Main.shuffledList.indexOf("X") != i) {
                Collections.swap(Main.shuffledList, Main.shuffledList.indexOf("X") + screen.rowSize.intValue(), Main.shuffledList.indexOf("X"));
                System.out.println(Main.shuffledList.indexOf("X"));
                screen.show();
                gameActions.check();
                break;
            } else {
                System.out.println("Ejimas uz ribu neleistinas");
                break;
            }
        }
    }

    public void moveLeft() {
        for (int i = screen.arraySize-screen.rowSize.intValue(); i>0; i--) {
            System.out.println(i);
            if (Main.shuffledList.indexOf("X") != i) {
                Collections.swap(Main.shuffledList, Main.shuffledList.indexOf("X") - 1, Main.shuffledList.indexOf("X"));
                System.out.println(Main.shuffledList.indexOf("X"));
                screen.show();
                gameActions.check();
                break;
            } else {
                System.out.println("Ejimas uz ribu neleistinas");
                break;
            }
        }
    }

    public void moveRight() {
        for (int i = screen.rowSize.intValue() - 1; i < screen.arraySize; i++) {
            System.out.println(i);
            if (Main.shuffledList.indexOf("X") != i) {
                Collections.swap(Main.shuffledList, Main.shuffledList.indexOf("X") + 1, Main.shuffledList.indexOf("X"));
                System.out.println(Main.shuffledList.indexOf("X"));
                screen.show();
                gameActions.check();
                break;
            } else {
                System.out.println("Ejimas uz ribu neleistinas");
                screen.show();
                break;
            }
        }
    }

}
