public class Main {
    public static void main(String[] args) {
        int counter = 0, number;

        for (number = 2; number <= 100; number++){
            int control = 0;

            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    control = 1;
                    break;
                }
            }

            if (control == 0){
                System.out.println(number);
                counter++;
            }
        }
    }
}
