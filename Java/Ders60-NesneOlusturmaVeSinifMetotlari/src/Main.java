public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi A3";
        System.out.println("Audi'nin modeli: " + audi.model);
        System.out.println("Audi'nin tipi: " + audi.type);
        audi.type = "Sports";
        System.out.println("Audi'nin yeni tipi: " + audi.type);
        audi.speed = 10;
        System.out.println("Audi'nin hizi: " + audi.speed);
        audi.increaseSpeed(35);
        System.out.println("Audi'nin yeni hizi: " + audi.speed);
        audi.decreaseSpeed(8);
        System.out.println("Audi'nin son hizi: " + audi.speed);
        audi.printSpeed();

        Car bmw = new Car();
        System.out.println("Bmw'nin modeli: " + bmw.model);
        bmw.model = "Bmw X5";
        System.out.println("Bmw'nin yeni modeli: " + bmw.model);
        bmw.speed = 20;
        System.out.println("Bmw'nin hizi: " + bmw.speed);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(80);
        bmw.increaseSpeed(77);
        bmw.printSpeed(); // Hiz limitinden dolayi 125'den sonra artmayacak

        Car mercedes = new Car();
        mercedes.model = "Mercedes AMG";
        mercedes.speed = 30;
        System.out.println("Mercedes'in modeli: " + mercedes.model + " ve Hizi: " + mercedes.speed);

    }
}
