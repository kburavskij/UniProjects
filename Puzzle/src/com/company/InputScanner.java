package com.company;

import java.util.Scanner;

class InputScanner {

    private final GameActions gameActions = new GameActions();
    private final PlayerMovement playerMovement = new PlayerMovement();

    public void read(){


        boolean gameState = true;

        while(gameState){



            Scanner input = new Scanner(System.in);
            String userInput = input.next();

            switch (userInput)
            {
                case "p":
                    gameActions.play();
                    break;

                case "t":
                    gameActions.test();
                    break;

                case "w":
                    playerMovement.moveUp();
                    break;

                case "s":
                    playerMovement.moveDown();
                    break;

                case "a":
                    playerMovement.moveLeft();
                    break;

                case "d":
                    playerMovement.moveRight();
                    break;

                case "q":
                    gameState = false;
                    break;

                default:
                    System.out.println("Tokio pasirinkimo nera: " + userInput);

            }

        }

    }
}
