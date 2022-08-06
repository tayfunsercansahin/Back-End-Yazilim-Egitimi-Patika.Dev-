import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner inp = new Scanner(System.in);
        System.out.println("a Degerini Giriniz: ");
        a = inp.nextInt();
        System.out.println("b Degerini Giriniz: ");
        b = inp.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Ucgenin 1.Kenari: " + a);
        System.out.println("Ucgenin 2.Kenari: " + b);
        System.out.println("Ucgenin Hipotenusu: " + c);
    }
}
