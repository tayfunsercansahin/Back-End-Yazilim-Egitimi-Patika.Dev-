import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, startPrice = 10;
        double perKm = 2.20, total;
        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi KM cinsinden giriniz: ");
        km = inp.nextInt();

        total = (km * perKm) + startPrice;
        total = (total<20) ? 20 : total;
        System.out.println("Mesafe: " + km + " KM | Toplam Tutar: " + total + " TL");

    }
}
