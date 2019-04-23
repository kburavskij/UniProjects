import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Destytojai>destytojaiArrayList = new ArrayList<Destytojai>();
        ArrayList<Studentai> studentaiArrayList = new ArrayList<Studentai>();
        ArrayList<Kursai> kursaiArrayList = new ArrayList<Kursai>();
        Valdymas.menu(destytojaiArrayList, studentaiArrayList, kursaiArrayList);
    }
}
