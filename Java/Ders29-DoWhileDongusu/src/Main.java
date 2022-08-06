import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = 2021;

        do {
            System.out.println(year);
            year++;
        }while (year < 2021);
        //-----------------------------
        Scanner input = new Scanner(System.in);

        int pass;
        boolean askPassword = false;

        do{
            System.out.println("Sifre giriniz: ");
            pass = input.nextInt();
            if (pass == 123){
                System.out.println("Dogru.");
                askPassword = true;
            }
            else {
                System.out.println("Yanlis.");
            }
        }while (!askPassword);
    }
}
