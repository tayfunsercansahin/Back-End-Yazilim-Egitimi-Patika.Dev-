public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi A3", 10, "Blue");
        audi.printInfo();

        Car bmw = new Car();
        bmw.model = "Bmw X5";
        bmw.speed = 20;

        Car mercedes = new Car();
        mercedes.model = "Mercedes AMG";
        mercedes.speed = 30;

    }
}