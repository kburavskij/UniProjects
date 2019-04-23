import java.util.ArrayList;
import java.util.Scanner;

public class Valdymas {

    static void menu(ArrayList<Destytojai> destytojaiArrayList, ArrayList<Studentai> studentaiArrayList, ArrayList<Kursai> kursaiArrayList){
        boolean jungtis = true;
        Veiksmai.infoValdymas();

        Scanner reader = new Scanner(System.in);


        while(jungtis){


            String input = reader.next();

            switch (input){
                case "1":
                    Destytojai.menu(destytojaiArrayList);
                    jungtis = false;
                    break;
                case "2":
                    Studentai.menu(studentaiArrayList);
                    jungtis = false;
                    break;
                case "3":
                    Kursai.menu(kursaiArrayList);
                    jungtis = false;
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
