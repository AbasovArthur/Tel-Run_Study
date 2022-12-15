

public class ArreyCalc {

    public void arrCalcy() {


        int a = Main.scanner.nextInt();
        int b = Main.scanner.nextInt();

        switch (a){

            case 5:
                System.out.println("a = 5 из switch");
                break;
            case 6:
                System.out.println("a = 6 из switch");
                break;
            case 7:
                System.out.println("a = 7 из switch");
                break;
            case 8:
                System.out.println("a = 8 из switch");
                break;

            default:
                System.out.println("Значение не опознано");
        }
        switch (b){

            case 5:
                System.out.println("b = 5 из switch");
                break;
            case 6:
                System.out.println("b = 6 из switch");
                break;
            case 7:
                System.out.println("b = 7 из switch");
                break;
            case 8:
                System.out.println("b = 8 из switch");
                break;

            default:
                System.out.println("Значение не опознано");
        }
    }
}