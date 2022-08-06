import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, total = 0;

        /*
        do {
            System.out.println("Sayi giriniz: ");
            n = input.nextInt();

            if (n % 2 == 1){
                total = total + n;
            }
        } while (n > 0);

        System.out.println("Toplam: " + total);
        */

        do {
            System.out.println("Sayi giriniz: ");
            n = input.nextInt();

            if ((n % 2 == 0) && (n % 4 == 0)){
                total = total + n;
            }
        } while (!(n % 2 == 1));

        System.out.println("Toplam: " + total);

    }
}
