import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutFiyati, elmaFiyati, domatesFiyati, muzFiyati, patlicanFiyati;
        double armutKilosu, elmaKilosu, domatesKilosu, muzKilosu, patlicanKilosu;
        double armutTutari, elmaTutari, domatesTutari, muzTutari, patlicanTutari;
        double toplamTutar;

        armutFiyati = 2.14;
        elmaFiyati = 3.67;
        domatesFiyati = 1.11;
        muzFiyati = 0.95;
        patlicanFiyati = 5;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kac Kilo: ");
        armutKilosu = inp.nextDouble();
        System.out.print("Elma Kac Kilo: ");
        elmaKilosu = inp.nextDouble();
        System.out.print("Domates Kac Kilo: ");
        domatesKilosu = inp.nextDouble();
        System.out.print("Muz Kac Kilo: ");
        muzKilosu = inp.nextDouble();
        System.out.print("Patlican Kac Kilo: ");
        patlicanKilosu = inp.nextDouble();

        armutTutari = armutFiyati * armutKilosu;
        elmaTutari = elmaFiyati * elmaKilosu;
        domatesTutari = domatesFiyati * domatesKilosu;
        muzTutari = muzFiyati * muzKilosu;
        patlicanTutari = patlicanFiyati * patlicanKilosu;

        toplamTutar = armutTutari + elmaTutari + domatesTutari + muzTutari + patlicanTutari;

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");

    }
}
