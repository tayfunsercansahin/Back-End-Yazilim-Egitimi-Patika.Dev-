
class Car {
    // Nitelikler
    String type;
    String model = "TEST";
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed, String color){
        System.out.println(model);
        System.out.println("Sinifa ait olan (This) -> " + this.model);
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;
        System.out.println("Parametreli kurucu metodu olustu.");
    }

    Car(){
        System.out.println("Bos kurucu metodu olustu.");
    }

    // Davranislar
    void increaseSpeed(int increment){
        if ((this.speed + increment) < speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease){
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println("Hiziniz: " + this.speed);
    }

    void printInfo(){
        String model = "ABC";
        System.out.println("Model\t: " + model);
        System.out.println("Model\t: " + this.model);
        System.out.println("Color\t: " + this.color);
        System.out.println("Type\t: " + this.type);
        System.out.println("Speed\t: " + this.speed);
    }
}