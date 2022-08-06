import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r, alfa;
        double pi = 3.14, alan;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin Yaricapini Giriniz: ");
        r = inp.nextInt();

        System.out.println("Merkez Acisinin Olcusunu Giriniz: ");
        alfa = inp.nextInt();

        alan = (pi * r * r * alfa) / 360;

        System.out.println("Dairenin Yaricapi: " + r);
        System.out.println("Dairenin Diliminin Merkez Acisinin Olcusu: " + alfa);
        System.out.println("Daire Diliminin Alani: " + alan);

    }
}
