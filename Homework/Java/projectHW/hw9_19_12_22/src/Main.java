import inheritance.Human;
import inheritance.Japan;
import inheritance.Afghanistan;


import java.util.Scanner;

public class Main {
    /*
    1)Создать Scanner и организовать ввод чисел             +

    2) Проверить больше ли некоторого значения
    сумма двух чисел, если нет вывести сообщение
    что сумма меньше заданного значение                     +

    3) Через case обработать несколько вариантов
    введенной переменной, предусмотреть дефолтный случай    +

    4) Инициализировать массив
    псевдослучайными числами(Random)                        +

    5) Найти сумму и произведение всех элементов
    этого массива                                           +

    6) Сделать класс, который будет
    искать площадь треугольника,
    прямоугольника и окружности                             +

    7) В классе Human добавить возможность
    изменения значений                                      +

    8) Написать 15 тернарных операторов
    9) Показать работу с методами классов String,
    StringBuilder и StringBuffer
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeTasks homeTasks = new HomeTasks();
        //task2:
        //homeTasks.sumSetValue();
        //task3:
        //homeTasks.caseSomeOpt();
        //task4:
        //homeTasks.randomMeth();
        //task5:
        //homeTasks.sumAndMultNum();
        //task6:
        FindArea area = new FindArea();
            System.out.println("Triangle area: "
                    + area.triangeArea(56,42));
            System.out.println("Rectangle area: "
                    + area.rectangleArea(56,42));
            System.out.println("Circlee area: "
                    + area.circleArea(5));
        //task7:
        Human human = new Human("national", "leader", 2);
        Japan japan = new Japan( "Japanese",  "Naruhito",  125700000);
        japan.iSay();
        Afghanistan afghanistan = new Afghanistan( "Afganse","Amrullah Saleh",39840000);
        afghanistan.iSay();
        //task8:
        homeTasks.ternarOperator();
        //task9:
        StringPractice task9 = new StringPractice();
        task9.workStr();

    }
}