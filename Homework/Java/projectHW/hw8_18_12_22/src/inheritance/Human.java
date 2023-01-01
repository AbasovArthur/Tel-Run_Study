package inheritance;
//общие свойства человеков
//general properties of human;
public class Human {
    public String nationality;
    public String president;
    public int population;


    public Human(String nationality, String president, int population, boolean isGender) {
        this.nationality = nationality;
        this.president = president;
        this.population = population;

    }

    public Human(String nationality, String president, int population) {
    }


    public void iSay(){
        System.out.println("...");
    }
}

