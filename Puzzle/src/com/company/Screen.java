package com.company;

public class Screen {

    private Main main = new Main();
    final Integer arraySize = Main.shuffledList.size();
    final Number rowSize = Math.sqrt(Main.shuffledList.size());

    public void show(){
        for(int i = 0, p = 0; arraySize > i; i++,p++){
            if(p==rowSize.intValue()){
                System.out.println();
                p=0;
            }
            System.out.print(Main.shuffledList.get(i) + " ");
        }
        System.out.println();
    }

}