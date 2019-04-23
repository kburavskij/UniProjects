import java.util.ArrayList;
import java.util.Scanner;

public class Studentai {

    String Vardas;
    Studentai(String Vardas) {
        this.Vardas = Vardas;
    };


    public String getVardas() {
        return Vardas;
    }

    public void setVardas(String Vardas) {
        this.Vardas = Vardas;
    }

    public String stringName(){
        return this.Vardas;
    }

    static void studentaiToString (ArrayList<Studentai>studentaiArrayList) {
        for (Studentai aStudentaiArrayList : studentaiArrayList) {
            System.out.println(aStudentaiArrayList.stringName());
        }
    }

    static void menu(ArrayList<Studentai> studentaiArrayList){
        boolean jungtis = true;
        Scanner reader = new Scanner(System.in);

        Veiksmai.infoStudentai();

        while(jungtis){

            String input = reader.next();

            switch (input){
                case "1":
                    Studentai.studentaiToString(studentaiArrayList);
                    System.out.println();
                    Veiksmai.infoStudentai();
                    break;
                case "2":
                    Studentai.studentaiToString(studentaiArrayList);
                    System.out.println();
                    Scanner reader1 = new Scanner(System.in);
                    String nameInput = reader1.next();
                    studentaiArrayList.add(new Studentai(nameInput));
                    Studentai.studentaiToString(studentaiArrayList);
                    System.out.println();
                    Veiksmai.infoStudentai();
                    break;
                case "3":
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
