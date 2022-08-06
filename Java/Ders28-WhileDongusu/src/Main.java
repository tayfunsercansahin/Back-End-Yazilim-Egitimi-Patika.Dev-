import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int k;

        while (i <= 5){
            System.out.println("-> " + i);
            k = 1;
            while (k <= 10){
                System.out.print(k + "-");
                k++;
            }
            System.out.println();
            i++;
        }
        //--------------------
        int left = 100, right = 200;
        while (++left < --right);
        System.out.println(left + " " + right);
        //--------------------

        int password;
        boolean isPasswordSuccess = false;
        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess){
            System.out.println("Sifre giriniz: ");
            password = input.nextInt();

            if (password == 123){
                System.out.println("Sifre dogru. Sisteme basariyla giris yaptiniz!");
                isPasswordSuccess = true;
            }
            else {
                System.out.println("Sifre yanlis.");
            }
        }








    }
}
