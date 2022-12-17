public class FinderArea {
    //static double base = 10;
    //static double height = 5;


    public static final double Pi = 3.14159265358979323846;
/*
    public static double triangeArea(double side1, double side2, double side3) {
        double triandl = (side1 + side2 + side3) / 2;
        //по формуле Герона из вики
        return Math.sqrt(triandl * (triandl - side1) * (triandl - side2) * (triandl - side3)) ;
    }
*/
    public static double triangeArea(double base, double height) {
        return (base * height) / 2;
    }
    public static double rectangleArea(double widh, double height) {
        return (widh * height) ;
    }
    public static double circleArea(double radius) {
        return Pi * Math.pow(radius, 2);
    }

}
