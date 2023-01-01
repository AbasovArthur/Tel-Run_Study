package inheritance;

public class Japan extends Human{


    public Japan(String nationality, String president, int population) {
        super(nationality, president, population);
    }



    @Override
    public void iSay() {
        super.iSay();
        System.out.println("Arrigato!");
    }
}
