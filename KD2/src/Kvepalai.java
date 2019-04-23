import java.util.Scanner;

public class Kvepalai {

    public Kvepalai() {
    }

    int id;
    String pavadinimas;
    String kategorija;
    int pakuotesTalpa;
    Double pakuotesKaina;

    public void setId(int id){
        this.id = id;
    }
    public void setPavadinimas(String pavadinimas){
        this.pavadinimas = pavadinimas;
    }
    public void setKategorija(String kategorija){
        this.kategorija = kategorija;
    }
    public void setPakuotesTalpa(int pakuotesTalpa){
        this.pakuotesTalpa = pakuotesTalpa;
    }
    public void setPakuotesKaina(Double pakuotesKaina){
        this.pakuotesKaina = pakuotesKaina;
    }

    public int getId(){
        return this.id;
    }
    public String getPavadinimas(){
        return this.pavadinimas;
    }
    public String getKategorija(){
        return this.kategorija;
    }
    public int getPakuotesTalpa(){
        return this.pakuotesTalpa;
    }
    public Double getPakuotesKaina(){
        return this.pakuotesKaina;
    }

    public boolean priceCompare(){
        Scanner reader = new Scanner(System.in);
        Double priceInput = reader.nextDouble();
        if(priceInput > pakuotesKaina){
            return true;
        }if(priceInput < pakuotesKaina){
            return false;
        }else{
            return Boolean.parseBoolean(null);
        }
    }
    public Double priceCheck(){
        Scanner reader = new Scanner(System.in);
        String nameInput = reader.next();
        if(nameInput.contentEquals(getPavadinimas()) && getPakuotesTalpa()==100){
            return getPakuotesKaina();
        }
        return null;
    }

}
