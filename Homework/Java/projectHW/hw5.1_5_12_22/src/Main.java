import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    TODO
        1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
        2) Сделать программу, которая будет складывать или вычитать введенные числа многократно,
        пока не будет дана команда на выход из цикла
        3*) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
        арифметическое значение
        4*) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.
        5**) Создать метод, который будет принимать строку и выводить из нее только гласные буквы
    */
//глобальный массив который виден везде. вопрос как везде, и где везде,
//и каким образом мы его можем увдеть?
//ЭТО ДАННЫЕ!!! часть программы, которая что-то исполняет
    static int[] arrNew = new int[12];
    static Scanner scanner = new Scanner(System.in);
    static double[] num = new double[5];




    //ЭТО ОПЕРАЦИИ!!!(внизу методы)
    public static void main(String[] args) {
        //задача 3:
        int[] arr_i = arrNew;
        //задача 3.
        //СОЗДАЮ МАССИВ типа: int
        int[] arr = new int[7];

        //СОЗДАЮ МАССИВ типа: double
        double[] var = new double[10];
        System.out.print("arr: int[]\n" +           //1-строка в консоли \n++
                "console output:\n");
        //пишу функцию, чтобы наполнить массив
        //числами по порядку (i++) от 1 до 7;
        //и после "итераций"
        //еще "System.out.print(arr[i] + "; ");" ---
        //--- для вывода на консоль
        //содержания в "arr[i]", ---
        //--- содержится тут номера п.п.

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + "; ");        //2-строка в консоли            // Вывод содержания массива
        }  // Заполняю массив значениями индексов)  (цикл)

        System.out.println();                       //3-строка в консоли +ln
        System.out.println("~~~~~~~~~~~~~~~~~~~");  //4-строка в консоли +ln
        System.out.print("var: double[]\n" +        //5-строка в консоли \n++
                "console output:\n");

        for (int i = 0; i < var.length; i++) {      //???почему нельзя тут
            //вместо "int" написать "double" ???
            var[i] = i;
            System.out.print(var[i] + "; ");        //6-строка в консоли
        }
//!!!
        addMetod(arr);
//!!!
// вот эта херь - "addMetod(arr);"
// а именно "___(arr)" обрати внимание,
// что я обращаюсь к переменной на 14 строке:
// "int[] arr = new int[7];" - где созданн массив типа "int"
//задача 2:
        calk();
//задача 2.

        aliquotThree(arr_i);

    }

    //Создаю дополнительный метод:
    public static void addMetod(int[] arrNew) {
//наполняю новосозданный метод с помощью функции
//которая задаст ему номер по порядку и так я его определяю
//в массиве:
        System.out.print("\n~~~~~~~~~~~~~~~~~~~");
        System.out.print("\narrNew[i]");
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = i;
            System.out.print(arrNew[i] + "; ");
        }
    }

    //ЗАДАЧА 2:

    public static void calk(){
// 2) Сделать программу, которая будет складывать или вычитать
// введенные числа многократно,
//пока не будет дана команда на выход из цикла
        System.out.println("\n~~~~~~~~~~~~~~~~~~~");

        int b = 0;
        while (true){
            System.out.println("enter num for summ: ");
            String q = scanner.nextLine();
            if (q.charAt(0) == 'q') {
                break;
            }
            b += Integer.parseInt(q);
            System.out.println("common: [" + b + "]  (if want exit press \"q\")");
        }
    }
    //ЗАДАЧА 2.

    //ЗАДАЧА 3:
    public static void aliquotThree(int[] arrNew) {
        int[] arr = new int[15];
        for (int i = 0; i < arrNew.length; i++) {
            if (arrNew[i] % 3 == 0 && arrNew[i] != 0) {
                arr[i] = arrNew[i];
                System.out.println(arrNew[i]);
            }

        }
        average(Arrays.toString(arrNew));
    }
//среднее значение

    public static void average(String str){
        String[] strArr = null;
        for (int i = 0; i < str.length(); i++) {
            str = str.replace("0,", "");
            str = str.replace("0", "");
            str = str.replace(" ", "");
            str = str.replace("[", "");
            str = str.replace("]", "");
            strArr = str.split(",");
        }
        double average = 0;
        for (int i = 0; i < strArr.length; i++) {
            average += Integer.parseInt(strArr[i]);
        }
        average = average / strArr.length;
        System.out.println(average);
    }


}

