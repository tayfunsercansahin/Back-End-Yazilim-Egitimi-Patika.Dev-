import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14, alan, cevre;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin Yaricapini Giriniz: ");
        r = inp.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Yaricapi: " + r);
        System.out.println("Dairenin Alani: " + alan + " | Cevresi: " + cevre);

    }
}
