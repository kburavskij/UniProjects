import java.util.ArrayList;
import java.util.Scanner;

public class Destytojai {


    String Vardas;
    Destytojai(String Vardas) {
        this.Vardas = Vardas;
    };


    public String getVardas() {
        return Vardas;
    }

    public void setVardas(String Vardas) {
        this.Vardas = Vardas;
    }

//    public void destytojaiToString(ArrayList<Destytojai>destytojaiArrayList){
//        StringBuilder sb = new StringBuilder();
//        for(Destytojai s : destytojaiArrayList){
//            sb.append(s);
//            sb.append("\t");
//        }
//        System.out.println(sb.toString());
//    }

    public String stringName(){
        return this.Vardas;
    }

    static void destytojaiToString (ArrayList<Destytojai>destytojaiArrayList) {
        for (Destytojai aDestytojaiArrayList : destytojaiArrayList) {
            System.out.println(aDestytojaiArrayList.stringName());
        }
    }


    static void menu(ArrayList<Destytojai>destytojaiArrayList){
        boolean jungtis = true;
        Scanner reader = new Scanner(System.in);

        Veiksmai.infoDestytojai();

        while(jungtis){

            String input = reader.next();

            switch (input){
                case "1":
                    destytojaiToString(destytojaiArrayList);
                    System.out.println();
                    Veiksmai.infoDestytojai();
                    break;
                case "2":
                    destytojaiToString(destytojaiArrayList);
                    System.out.println();
                    Scanner reader1 = new Scanner(System.in);
                    String nameInput = reader1.next();
                    destytojaiArrayList.add(new Destytojai(nameInput));
                    destytojaiToString(destytojaiArrayList);
                    System.out.println();
                    Veiksmai.infoDestytojai();
                    break;
                case "3":
                    destytojaiToString(destytojaiArrayList);
                    System.out.println();
                    Scanner reader2 = new Scanner(System.in);
                    int nameInt = reader2.nextInt();
                    destytojaiArrayList.remove(nameInt-1);
                    System.out.println();
                    destytojaiToString(destytojaiArrayList);
                    System.out.println();
                    Veiksmai.infoDestytojai();
                    break;
                case "4":
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
