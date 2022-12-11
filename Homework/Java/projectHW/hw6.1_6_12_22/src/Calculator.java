public class Calculator {

    public void starCalculations() {
        while (true) {
            System.out.println("Выберите операцию: \n" +
                    "Сложение:  +  \n" +
                    "Вычетание: -  \n" +
                    "Умножение: *  \n" +
                    "Деление:   /  \n" +
                    "Выход: +   e  \n");
            char charAt = Main.scanner.next().charAt(0);

            switch (charAt){
                case '+': sum(); break;
                case '-': sub(); break;
                case '*': mul(); break;
                case '/': div(); break;
                case 'e':
                    System.exit(0);
                    break;
            }
        }
    }


    private void sum() {
        double a = Main.scanner.nextInt();
        double b = Main.scanner.nextInt();
        System.out.println("Сумма: " + (a+b));
    }
    private void sub() {
        double a = Main.scanner.nextInt();
        double b = Main.scanner.nextInt();
        System.out.println("Разность: " + (a-b));
    }
    private void mul() {
        double a = Main.scanner.nextInt();
        double b = Main.scanner.nextInt();
        System.out.println("Произведение: " + a*b);
    }
    private void div() {
        double a = Main.scanner.nextInt();
        double b = Main.scanner.nextInt();
        System.out.println("Частное: " + a/b);
    }



}
