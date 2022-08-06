import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, vucutKitleIndeksi;
        int kilo;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen Boyunuzu (Metre Cinsinden) Giriniz: ");
        boy = inp.nextDouble();

        System.out.println("Lutfen Kilonuzu Giriniz: ");
        kilo = inp.nextInt();

        vucutKitleIndeksi = (kilo / (boy * boy));

        System.out.println("Boyunuz: " + boy + " metre");
        System.out.println("Kilonuz: " + kilo + " kg");
        System.out.println("Vucut Kitle Indeksiniz: " + vucutKitleIndeksi);

    }
}
