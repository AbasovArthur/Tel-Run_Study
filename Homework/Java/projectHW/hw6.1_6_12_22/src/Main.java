import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

/*
    1) Создать калькулятор(+, -, *, /) в бесконечном цикле,
    но считать в функции

    2) Создать методы, для создания массива,
    заполнения его случайными числами и вывода на консоль.

    3) Метод для сортировки массива пузырьком по возрастанию и убыванию

    4) Создать метод для возведения в степень числа
    и *извлечения корня 3 степени из числа.

    5*) Реализовать игру "Камень, ножницы, бумага"
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
//1) калькулятор:
        Calculator calculator = new Calculator();
        calculator.starCalculations();
        //ArreyCalc arreyCalc = new ArreyCalc();
        //arreyCalc.arrCalcy(); //тут был класс с переменными для "Calculator",
        // когда закинул его в пакет вместе с калькулятором и достал его от туда
        // программа дала ошибку к сканнеру, удалил этот класс и все заработало
        //понятия не имею как оно сейчас работает
//1) калькулятор.
//2) массив с выводом случайных чисел в консоль:
        RandomNum randomNum = new RandomNum();
        randomNum.randomNum();
//2) массив с выводом случайных чисел в консоль.
//3) пузырьковая сортировка массива по возрастанию & убыванию:
        BubblSort bS = new BubblSort();
        System.out.println(Arrays.toString(bS.sort(randomNum.randomNum())));
//3) пузырьковая сортировка массива по возрастанию & убыванию.

    }
    static Scanner scanner = new Scanner(in);

}