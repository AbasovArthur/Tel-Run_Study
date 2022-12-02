public class Main {
    /*
        1) Создать процедуру------------------------------------------------------------------------done!
        2) Создать функцию.
        3) Создать класс
        4) Добавить геттеры и сеттеры, продемонстрировать их работу
        5*) Добавить в класс функцию для вывода свойств класса. Вызвать ее в методе main
     */
    //                                                          ДЕЛАЮ ПРОЦЕДУРУ "void"
    public static void main(String[] args) {
        print(4);                                               //"вызывание процедуры" ~~что бы это ни значило...~~
        doubleEx(4.56, 5.23);
        //byteEx(4, 2);                                         //!!!пришет ошибку!!!
        sum(56.2, 23.7);
        Car car = new Car(2, 65.2, "nimbus");
        System.out.println("prise: " + car.getPrice() +
                        " speed: " + car.getSpeed() +
                        " brand: " + car.getBrand());
                        //пользуюсь сеттерами
        car.setPrice(10000);                                    //изменил цену классу "Сar" сеттером "set___..."
                                                                //но для этого нужно повторно/или обновить
                                                                //всю строку с "System.out.println(~~ + ~~ + ~~ ...)"
        System.out.println("prise: " + car.getPrice() +
                        " speed: " + car.getSpeed() +
                        " brand: " + car.getBrand());
                        //пользуюсь сеттерами

        car.printOut();                                         //вывожу в КОНСОЛЬ все параметры [описание классификации для параметров]
                        //шаблон создан, можно добавить
                        //другие позиции
                        //  ~#~
        Car carAutobus  = new Car(24300, 65.2, "faeton");
        carAutobus.printOut();                                  //?? почему в ввыводе на консоли после "brand" нет [:] и проблема с пробелом
                                                                // этот "main" очень важный!
                                                                // потому что: "все что ты хочешь вызвать - писать в мейне (main)"
    }
    static void print(int a){                                   //создал ПРОЦЕДУРУ void, назвал её print, задал значение int a
    }
    static void doubleEx(double a, double b){                  //создал ПРОЦЕДУРУ void, назвал её doubleEx, задал значение double a, double b
    }
    static void byteEx(byte a, byte b){                        //!!!создал ПРОЦЕДУРУ void, значения byte a, byte b она приняла, но выше не принимает, ошибка
    }
//    static void bolleanTrue(boolean true){                   //!!!пишет ошибку
//    }

    //                                                         ДЕЛАЮ ФУНКЦИЮ "void"

    //static double sum(double a, double b)                    //сигнализирует желтым
    static double sum(double c, double d){                     //сигнализирует желтым
        return c + d;
    }
                                                                //"сигнатура" sum(56.2, 23.7); - не захотела тут писаться, выдает ошибку
                                                                //по этому вынес её между фигурн скобок "main"
    //System.out.println(sum(56.2, 23.7));                      //почему то тоже требует чтобы прописанна была в методе "main"













}


