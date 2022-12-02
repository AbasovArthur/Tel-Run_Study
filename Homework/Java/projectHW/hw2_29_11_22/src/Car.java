public class Car {
    //                                      ОБЪЕКТ или экземпляр класса

                                            //важная тема когда создаёшь ПОЛЯ КЛАССА
                                            //ПОЛЯ это где ты пишешь [описание классификации для параметров]
                                            //наример сейчас это скорость(speed); цена(price); и т.д.
                                            //т.е. я пишу тип данных типа "int" и его данное это "price"
                                            //далее пишу тип данных типа "double" и его данное это "speed"
    private int price;                      //~~зачем-то сделал поля приватными~~
    //int price;
    private double speed;
    //double speed;
    private String brand;
    //String brand;

                                            //создал КОНСТРУКТОР. без него в "main" -
                                            // - в строке было так: Car car = new Car(2, 65);
                                            // а столо так: Car car = new Car(price:2, speed:65);
    public Car(int price, double speed, String brand) {
        this.price = price;
        this.speed = speed;
        this.brand = brand;
    }

    public Car(int price, int speed) {      //шота поругался, я кликнул по красн. маркеру в "main"
    }                                       //и оно мне сделало эту строку автоматически. Видно могло
                                            //не понравиться тошо где double сперва указал целое числ, а не дробное

    //                                      генерирую АКСЕССОРЫ (геттер и сеттер)
                                            //методы геттер и сеттер:
                                            //геттер - получить значение
                                            //сеттер - настроить значение

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printOut(){
        System.out.println("price: " + price +
                        " speed: " + speed +
                        " brand" + brand);
    }
}

