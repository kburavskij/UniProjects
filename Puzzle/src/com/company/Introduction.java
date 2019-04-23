package com.company;

public class Introduction {

    private static Introduction intro = null;

    private Introduction() {
            System.out.println("Zaidimo valdymas: \n  W \nA S D");
            System.out.println("Kad iseiti is zaidimo spauskite Q");
            System.out.println("Zaidimui pradeti paspauskite P");
            System.out.println("Zaidimui testuoti paspauskite T");
    }

    public static Introduction getIntro() {
        if (intro == null)
            intro = new Introduction();
        return intro;
    }

}