import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c, u, cevre;
        double alan;

        Scanner inp = new Scanner(System.in);

        System.out.println("Ucgenin 1.Kenarini Giriniz: ");
        a = inp.nextInt();
        System.out.println("Ucgenin 2.Kenarini Giriniz: ");
        b = inp.nextInt();
        System.out.println("Ucgenin 3.Kenarini Giriniz: ");
        c = inp.nextInt();

        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        System.out.println("Ucgenin Kenarlari Sirasiyla: " + a + " " + b + " "+ c);
        System.out.println("Ucgenin Cevresi: " + cevre);
        System.out.println("Ucgenin Alani: " + alan);
    }
}
