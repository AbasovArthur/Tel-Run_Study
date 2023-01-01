package inheritance;

public class Afghanistan extends Human{
    public Afghanistan(String nationality, String president, int population) {
        super(nationality, president, population);
    }
    @Override
    public void iSay(){
        System.out.println("Assalamu alaikum");
    }
}
