package inheritance;

public class Afghanistan extends Human{

    public Afghanistan(String nationality, String president, int population) {
        super(nationality, president, population);
    }

    public Afghanistan(String nationality, String president, int population, boolean isGender) {
        super(nationality, president, population, isGender);
    }

    @Override
    public void iSay(){
        System.out.println("Assalamu alaikum");
    }


}
