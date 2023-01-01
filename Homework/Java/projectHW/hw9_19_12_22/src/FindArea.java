public class FindArea {
    public static final double Pi = 3.14159265358979323846;

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
