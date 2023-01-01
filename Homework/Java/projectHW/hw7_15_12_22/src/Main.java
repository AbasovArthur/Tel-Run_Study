import java.util.Scanner;
/*
hw7_12_12_22
    HW
    1)Создать Scanner и организовать ввод чисел
    Create Scanner and Organize Number Entry

    2) Проверить больше ли некоторого значения
    сумма двух чисел, если нет вывести сообщение
    что сумма меньше заданного значение
    Check if more than some value
    the sum of two numbers, if not - display a message
    that the amount is less than the specified value

    3) Через case обработать несколько вариантов
    введенной переменной, предусмотреть дефолтный случай
    through "case" make some options variable
    happen for default provide

    4) Инициализировать массив псевдослучайными числами(Random)
    Initialize an massif with pseudo-random numbers (Random)

    5) Найти сумму и произведение всех элементов этого массива
    Find the sum and multiplication of all elements of this array

    6) Сделать класс, который будет искать площадь треугольника,
    прямоугольника и окружности
    Make a class that will look for the area of a triangle,
    rectangle and circle
 */
public class Main {
//task1:
//Create Scanner and Organize Number Entry
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    Hw7 hw7 = new Hw7();
/*
Создаем объект. Называть переменную можно как угодно
Example ежик = new Example();
 */
    //task2:
    //hw7.sumSetValue();
    //task3:
    //hw7.caseSomeOpt();
    //task4:
    hw7.randomMeth();
    //task5:
    hw7.sumAndMultNum();
    // task6:
    FinderArea area = new FinderArea();
        System.out.println("Triangle area: "
                + area.triangeArea(56,42));
        System.out.println("Rectangle area: "
                + area.rectangleArea(56,42));
        System.out.println("Circlee area: "
                + area.circleArea(5));

    }
}