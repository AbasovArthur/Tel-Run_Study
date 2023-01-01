public class StringPractice {

    public void workStr(){
        System.out.println("~~~ String ~~~");

        String str1 = "May the Force ";
        String str2 = "be with you";

        int len = str1.length() + str2.length();
        System.out.println("Sum sumbol strok: " + len);

        System.out.println("~~~ StringBuilder ~~~");
        StringBuilder sb = new StringBuilder("May the Force ");
        // Добавление строки в конец:
        sb.append("be with you");                  //"May the Force be with you"
        System.out.println(sb);

        // Вставка строки в указанную позицию
        sb.insert(3, ", ");
        System.out.println(sb);                    //"May,  the Force be with you"

        // Удаление символов
        sb.delete(4, 5);                           //"May, the Force be with you"
        System.out.println(sb);

        // Разворот строки
        sb.reverse();                              //"uoy htiw eb ecroF eht ,yaM"
        System.out.println(sb);

        System.out.println("~~~ StringBuffer ~~~");
        StringBuffer sbf = new StringBuffer("May the Force ");
        // Добавление строки в конец:
        sbf.append("be with you");
        System.out.println(sbf);

        // Вставка строки в указанную позицию
        sbf.insert(14, ", ");              //"May the Force , be with you"
        System.out.println(sbf);

        // Удаление символов
        sbf.delete(6, 9);                             //"May thorce , be with you"
        System.out.println(sbf);

    }
}
