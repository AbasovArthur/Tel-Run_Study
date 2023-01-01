import inheritance.Afghanistan;
import inheritance.Human;
import inheritance.Japan;

public class Main {
/*
        1) В классе Human добавить возможность изменения значений
           inheritance; In the Human class, add the ability to change values
    *:
    2) Реализовать класс для работы с массивом типа double
    3) Реализовать класс для работы с массивом типа Human
    4) Реализовать стирание и удаление, показать разницу между ними
    5) Реализовать возможность игры человека с человеком в "Камень, ножницы, бумага"
    6) Предусмотреть оповещение о исчерпании выделенной памяти и недопущение выхода за границы массива
    7) Реализовать динамическое выделение памяти при ее завершении
    8) Предусмотреть корректный ввод данных в массив
    9) Реализовать сортировку массива
    10) Реализовать поиск в массиве индекса указанного элемента
 */
    public static void main(String[] args) {

        Japan japan = new Japan( "Japanese",  "Naruhito",  125700000);
        japan.iSay();
        Afghanistan afghanistan = new Afghanistan( "Afganse",  "Amrullah Saleh",  39840000);
        afghanistan.iSay();

    }
}