import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;

        /*
        for (boolean run = true; run; ){
            System.out.println("Sayi giriniz: ");
            sayi = input.nextInt();

            if (sayi < 0){
                System.out.println("Negatif sayi girdiniz!");
                run = false;
            }
        }
        */
        //--------------------------------
        /*
        System.out.println("Sayi giriniz: ");
        sayi = input.nextInt();

        while (sayi > 0){
            System.out.println("Sayi giriniz: ");
            sayi = input.nextInt();
        }
        */
        //-------------------------------

        do {
            System.out.println("Sayi giriniz: ");
            sayi = input.nextInt();
        }while (sayi > 0);




    }
}
