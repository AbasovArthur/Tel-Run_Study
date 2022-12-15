public class Hw7 {

/*
2) Проверить больше ли некоторого значения
    сумма двух чисел, если нет вывести сообщение
    что сумма меньше заданного значение
    ----------------eng------------------------
    Check if more than some value
    the sum of two numbers, if not - display a message
    that the amount is less than the specified value
 */
    int one = Main.scanner.nextInt();       // Вводим переменные
    int two = Main.scanner.nextInt();

    int sum = (one + two);
    int b = 100;
    if ((one + two) < b){
        System.out.println(sum + " sum is less than the set value");
    }
    else {
        System.out.println(sum +  " sum is greater than the set value");
    }

}
