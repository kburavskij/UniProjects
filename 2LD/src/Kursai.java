import java.util.ArrayList;
import java.util.Scanner;

public class Kursai {




    String Pavadinimas;
    String Informacija;

    Kursai(String Pavadinimas, String Informacija) {
        this.Pavadinimas = Pavadinimas;
        this.Informacija = Informacija;
    };


    public String getPavadinimas() {
        return Pavadinimas;
    }

    public String getInformacija(){
        return Informacija;
    }

    public void setPavadinimas(String Pavadinimas) {
        this.Pavadinimas = Pavadinimas;
    }

    public void setInformacija(String Informacija){
        this.Informacija = Informacija;
    }

    public String stringPavadinimas(){
        return this.Pavadinimas;
    }

    public String stringInformacija(){
        return this.Informacija;
    }

    static void kursaiNameToString (ArrayList<Kursai>kursaiArrayList) {
        for (Kursai aKursaiArrayList : kursaiArrayList) {
            System.out.println(aKursaiArrayList.stringPavadinimas());
        }
    }

    static void kursaiInfoToString (ArrayList<Kursai>kursaiArrayList) {
        for (Kursai aKursaiArrayList : kursaiArrayList) {
            System.out.println(aKursaiArrayList.stringInformacija());
        }
    }

    static void menu(ArrayList<Kursai> kursaiArrayList){
        boolean jungtis = true;
        Scanner reader = new Scanner(System.in);

        Veiksmai.infoKursai();

        while(jungtis){

            String input = reader.next();

            switch (input){
                case "1":
                    Kursai.kursaiNameToString(kursaiArrayList);
                    System.out.println();
                    Veiksmai.infoKursai();
                    break;
                case "2":
                    Kursai.kursaiInfoToString(kursaiArrayList);
                    System.out.println();
                    Veiksmai.infoKursai();
                    break;
                case "3":
                    Kursai.kursaiNameToString(kursaiArrayList);
                    System.out.println();
                    Scanner reader1 = new Scanner(System.in);
                    String nameInput = reader1.next();
                    kursaiArrayList.add(new Kursai(nameInput, nameInput));
                    Kursai.kursaiNameToString(kursaiArrayList);
                    System.out.println();
                    Veiksmai.infoKursai();
                    break;
//                case "4":
//                    Kursai.kursaiInfoToString(kursaiArrayList);
//                    Scanner reader2 = new Scanner(System.in);
//                    Integer infoIndex = reader2.nextInt();
//                    String infoInput = reader2.next();
//                    kursaiArrayList.set(infoIndex, infoInput);
//                    Kursai.kursaiNameToString(kursaiArrayList);
//                    System.out.println();
//                    Veiksmai.infoKursai();
//                    break;
                case "5":
                    System.out.println("Aciu kad naudojotes");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Nera tokio ivedimo" + input);
                    break;
            }
        }


    }

}
