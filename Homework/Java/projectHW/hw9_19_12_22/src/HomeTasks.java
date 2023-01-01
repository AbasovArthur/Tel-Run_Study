import java.util.Random;
import java.util.Scanner;

public class HomeTasks {
    /*
2) Проверить больше ли некоторого значения
    сумма двух чисел, если нет вывести сообщение
    что сумма меньше заданного значение
    ----------------eng------------------------
    Check if more than some value
    the sum of two numbers, if not - display a message
    that the amount is less than the specified value
 */
    public void sumSetValue(){
        System.out.println("add some value that their sum compared with the default value:");
        int one = Main.scanner.nextInt();           // Вводим переменные
        int two = Main.scanner.nextInt();
        int sum = (one + two);
        int b = 100;
        if ((one + two) < b){
            System.out.println(sum + " sum is less than the set value");
        }
        else {
            System.out.println(sum +  " sum is high than the set value");
        }

    }               //-------------done!
    /*
   3) Через case обработать несколько вариантов
     введенной переменной, предусмотреть дефолтный случай
     ----------------eng------------------------
     through "case" make some options variable
     happen for default provide
     */
    public void caseSomeOpt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 num:");

        int a = Main.scanner.nextInt();
        int b = Main.scanner.nextInt();
        //String operator = scanner.nextInt(System.in);
        while (true) {
            System.out.println("enter '&'; or enter symbol operator: ");
            String operator = scanner.next();
            switch (operator) {
                case "+": {
                    System.out.println(a + b);
                    break;
                }
                case "-": {
                    System.out.println(a - b);
                    break;
                }
                case "*": {
                    System.out.println(a * b);
                    break;
                }
                case "/": {
                    System.out.println(a / b);
                    break;
                }
                case "**": {
                    // System.out.println(a + b), (a - b), (a * b), (a / b);
                }
                case "&":
                    System.exit(0);
                    break;
                default: {
                    System.out.println("Error!");
                }

            }
        }

//                                          ALTERNATIVE "switch case":
//        if (operator.equals("+")) {
//            System.out.println(a + b);
//        } else if (operator.equals("-")) {
//            System.out.println(a - b);
//        } else if (operator.equals("*")) {
//            System.out.println(a * b);
//        } else if (operator.equals("/")) {
//            System.out.println(a / b);
//        } else {
//            System.out.println("Error!");
//        }
//                                          ALTERNATIVE "switch case".  :
//        switch (operator) {
//            case "+" -> System.out.println(a + b);
//            case "-" -> System.out.println(a - b);
//            case "*" -> System.out.println(a * b);
//            case "/" -> System.out.println(a / b);
//            default -> System.out.println("Error!");
//        }
//                                          ALTERNATIVE "switch case".


    }              //-------------done!
    /*
    4) Инициализировать массив псевдослучайными числами(Random)
       Initialize an massif with pseudo-random numbers (Random)
     */
    public int[] randomMeth() {
/*
                                                    // Create a new Random object
        Random rand = new Random();

                                                    //Create an array with a length of 10
        int[] arr = new int[10];

                                                    // Use a loop to initialize the array with random numbers
                                                    //цикл для инициализации массива случайными числами
        for (int i = 0; i < arr.length; i++) {

                                                    // Generate a random integer between 0 and 3
                                                    // сгенерировать рандомн [целое число] между 0 и 3
            int randomInt = rand.nextInt(3);

                                                    // Assign the random integer to the array
                                                    // Назначаю случайное [целое число] массиву
            arr[i] = randomInt;
        }
                                                    // Print the array to the console to see the random numbers
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return 0;

 */
        Random rand = new Random();
        int[] arr = new int[10];
        System.out.println("massif with pseudo-random numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(5);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;


    }             //-------------done!
    //5) Найти сумму и произведение всех элементов этого массива
    //Find the sum and multiplication of all elements of this array

    public void sumAndMultNum(){
/*
        //randomMeth();
        System.out.println("massif with pseudo-random numbers: ");
        Random rand2 = new Random();
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand2.nextInt(5);
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n");
                                                            //Declare two variables to hold the sum and multiplication
                                                            // of the array elements:
                                                            //Объявляю две переменные,
                                                            //для хранения суммы и произведения элементов массива:
        int sum = 0;
        int mult = 1;
                                                            //другой цикл для вычисления
                                                            // суммы и произведения элементов массива:
        for (int i = 0; i < arr2.length; i++) {
            sum = sum +=arr2[i];
            System.out.println(sum);
            //System.out.print((sum += arr2[i]) + " sum of the array elements ");
            //System.out.println();
            //System.out.println((mult *= arr2[i]) + " multipl of the array elements");
        }
 */
        Random random = new Random();
        int[] array = new int[5];
        System.out.println();
        System.out.println("all elements of array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();        //сюда можно ввести число, "nextInt(100);"  | can add a number,
            //оно будет объемом [одной ячейки] массива  | it will be the volume
            //                                          | of cell of the array
            System.out.print(array[i] + " ");
        }
        int sum = 0;
        int multpcn = 1;
        for (int elem : array){
            sum += elem;
            multpcn *= elem;
        }
        System.out.println("\n");
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + multpcn);
        System.out.println();
    }            //-------------done!
    /*
    8) Написать 15 тернарных операторов (7/15)
     */
    public void ternarOperator (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Тернарные операторы \nTernary Operators:");
        System.out.println("enter 2 num:");

        int a = Main.scanner.nextInt();
        int b = Main.scanner.nextInt();
        int max = (a > b) ? a : b;                                                  //-1
        System.out.println("Большее из двух чисел: " + max);
        /*
        Этот тернарный оператор
        присваивает переменной max значение a,
        если a больше b, иначе
        присваивает значение b.
         */
        String result = (a > b) ? "первое число больше второго"
                : "первое число меньше второго";                                    //-2
        System.out.println(result);
//вывести оценку:
        System.out.println("enter yours amount baliv:");
        double score = Main.scanner.nextDouble();
        char baliv = (score >= 90) ? 'A'
                : (score >=80) ? 'B'
                : (score >= 70) ? 'C'
                : (score >= 60) ? 'D'
                : 'F';                                                              //-3
        System.out.println("yours amount baliv: " + baliv);

//вычислить совершеннолетие:
        System.out.println("enter how old are you?");
        byte age = Main.scanner.nextByte();
        String message = (age >= 18) ? "You are an adult" : "You are a minor";      //-4
        System.out.println(message);

//ввести или положительное или отрицательное число:
        System.out.println("entr number. Positive it true or negative it false ");
        int valueNum = Main.scanner.nextInt();
        boolean positive = (valueNum >= 0) ? true : false;                          //-5
        System.out.println(positive);

//определить сезон
        System.out.println("введите номер текущего месяца :\nenter current month number: ");
        byte month = Main.scanner.nextByte();
        String season = (month == 12 || month == 1 || month == 2) ? "Winter"
                : (month >= 3 && month <= 5) ? "Spring"
                : (month >= 6 && month <= 8) ? "Summer"
                : "Aut";
        System.out.println("now " + season + " season");                            //-6
//
        System.out.println("введите 3 числа, из них я определю максимальное: \n" +
                "enter 3 numbers, of which I will determine the maximum");
        int x = Main.scanner.nextInt();
        int y = Main.scanner.nextInt();
        int c = Main.scanner.nextInt();

        int maxNum = (x > y) ? ((x > c) ? x : c) : ((y > c) ? y : c);               //-7 to be continued...
        System.out.println("Max number: " + maxNum);


    }           //-------------done!

}
