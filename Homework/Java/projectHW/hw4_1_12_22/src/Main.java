/*
    1) Работа со String
    2) Продемонстировать явное и неявное приведение типов
    3) Показать переполнение
    4) Показать работу с методами и классами
    5*) Сделать реверс строки
 */
public class Main {
    public static void main(String[] args) {
// тут я (програмист) самостоятельно привел т.е. совершил:
// "ЯВНОЕ ПРИВЕДЕНИЕ" типа "int" в тип "dooble"
//
    int a = 45;
    double b;
    b = a + 0.5;
        System.out.println(b);

    char e;
    int r;
    e = 'w';
    r = (char)e;            // ??? в консоли выдало 119 - что? почему?
        System.out.println(r);


// "НЕЯВНОЕ ПРИВЕДЕНИЕ ТИПА (данных)" делает автоматически система:
        a = 20;             //тут переписали значение "a"
        b = a;              //теперь пер-ая "b" вернула свой тип (данных) на
                            //на "double",!!! или оно вовсе не меняло свой тип
        System.out.println(b);

        e = 'w';
        r = e;              //"НЕЯВНО" привели пер-ную "r" типа "int" в
                            // переменную "e" типа "char"
                            // ??? в консоли выдало 119 - что? почему?
        System.out.println(r);

// ПЕРЕПОЛНЕНИЕ ТИПА (данных) int:
        int x = 2000000000 + 1000000999;
        System.out.println(x);
                            // в консоли -1294966297, а должно быть = 3000000999
                            // но int имеет памяти 2147483647 цифр, по этому он дошел
                            // до края граници памяти,и стал считать в отрицательное значение)
        //x = (long)y;
        long y = (long)x ;  // ??? все равно выводит интовое -1294966297, а должно 3000000999
        System.out.println(x);

        int iThre = 2000000000 + 1000000999;
        int iTwoBill = 2000000000;
        int iOneBill = 1000000999;

        System.out.println(iThre);
                            // чтобы сложить 2 миллиарда я создал еще одну
                            // переменную "iFour" заранее присвоив ей тип данных "long"
                            // и переназначил в суммах ранее заданные int-типы на long-типы данных
                            // # --> был "int iTwoBill" назначил "(long)iTwoBill"
        long iFour = (long)iTwoBill + (long)iOneBill;
                            //явно перевел тип данных
        System.out.println(iFour);

//  String ССЫЛОЧНЫЙ ТИП ДАННЫХ
        String str;         //создал переменную "str"

        str = "Hello";
        str += " yo";       //сконкатинированли ---> Hello yo
        System.out.println(str);

// ЗДЕЛАТЬ БУКВЫ ЗАГЛАВНЫМИ [ .toUpperCase(); ]
// ЗДЕЛАТЬ БУКВЫ СТРОЧНЫМИ (маленькими) [ .toLowerCase(); ]
// убрать пробелы в начале и конце строки [ trim(); ]
// длина строки [ length(); ]

        str.length();
        str.trim();
        str.toLowerCase();
        str.toUpperCase();
        System.out.println(str.toUpperCase());  // вывести в консоль строку с теперь уже заглавными буквами
        System.out.println(str.length());       // посчитал вместе с пробелом, выдал в консоли "8"

// разбить строку на подстроки
                                                // какие подстроки?, я просто
                                                // вывел в консоль строку начиная от
                                                // "0".. с "4-ого" символа строки --> "o yo"
        String strPodStrock = str.substring(4);
        System.out.println(strPodStrock);


// вывести строку из настраиваемого диапазона
        strPodStrock = str.substring(1, 2);     //!!!интересно что отработало только на слове
        System.out.println(".substring " + strPodStrock);
                                                //"Hello" и не сконкатинировало "yo"
                                                //в итоге --> "e" а должно быть "el"

// вывести одну букву по порядку [ charAt(*) ]
        str.charAt(4);                          // в скобках (4) указать нужн число
        System.out.println(str.charAt(1));

// 5*) Сделать реверс строки ХЗ--ХЗ--ХЗ--

//        for (int i = 0; i < str.length(); i ++) {
//            result = str.charAt(i) + result;
//        }
//            return result

//        4) Показать работу с методами и классами
        Test test = new Test(4,5.3);
        System.out.println(test);

    }

}
