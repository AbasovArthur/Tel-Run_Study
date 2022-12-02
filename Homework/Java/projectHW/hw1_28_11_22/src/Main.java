public class Main {
    public static void main(String[] args) {

        //               HomeWork:
        //               Вывести все 8 примитивных типов на консоль
        //_________________________________________________________________________

        //boolean - Логический тип данных (один бит) представляет только (true, false)
        boolean bolleanTrue = true;
        System.out.println(bolleanTrue + " bolleanTrue");
        boolean bolleanFalse = false;
        System.out.println(bolleanTrue + " bolleanFalse");

        //byte - (8 bits) представляет собой число (-128 to 127)
        byte byteEx = 127;
        System.out.println(byteEx + " bytEx");
        //System.out.println(byteEx.getClass());                // хочу чтобы показал значение пер-ной, почему ошибка?

        //short - (16 bits) представляет собой число (-32 768 до 32 767)
        //short shortEx = (Math.pow(32, 3));                    // хочу представить число 32, в степени 3 (а оно нихера)
        short shortEx = 32000;
        System.out.println(shortEx + " shortEx");

        //int - (32 bits) представляет собой число (-2147483648 до 2147483647)
        int intEx = 2000000000;
        //int intEx = 2 * (10 ^ 9);                             // так и не выходит возвести число в степень
        System.out.println(intEx + " intEx");

        //long – (64 bits) большое целое число (-9223372036854775808 до 9223372036854775807)
        long longEx = 1000000000;
        System.out.println(longEx + " longEx");

        //float - (32 bits) число с плавающей запятой (до 7 десятичных цифр)
        //float floatEx = 10,56;                                //почему ошибку выдает? это же число с плавающей запятой?
        float floatEx = 10;
        System.out.println(floatEx + " floatEx");

        //double - (64 bits) число с плавающей запятой (до 16 десятичных цифр)
        double doubleEx = 1.618;
        System.out.println(doubleEx + " doubleEx");

        //char - (16 bits) символ Unicode (от '\u0000' (0) до '\uffff' (65535))
        char charEx = 'Y';
        System.out.println(charEx + " charEx");

        //
        //              Done!
    }
}