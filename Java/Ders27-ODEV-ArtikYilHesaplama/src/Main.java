import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;

        Scanner input = new Scanner(System.in);

        System.out.print("Yil giriniz: ");
        yil = input.nextInt();

        if (yil % 4 == 0){
            if (yil % 100 == 0){
                if (yil % 400 == 0){
                    System.out.println(yil + " bir artik yildir.");
                }
                else {
                    System.out.println(yil + " bir artik yil degildir. ");
                }
            }
            else {
                System.out.println(yil + " bir artik yildir.");
            }
        }
        else{
            System.out.println(yil + " bir artik yil degildir.");
        }
    }
}
