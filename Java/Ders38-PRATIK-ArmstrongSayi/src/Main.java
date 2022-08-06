import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int number = input.nextInt();

        int rem = 0, result = 0;

        while (number != 0){
            rem = number % 10;
            System.out.print(rem + ",");
            number /= 10;
            result += rem;
        }

        System.out.println();
        System.out.println("Toplam: " + result);

        /*int tempNumber = number, basNumber = 0, basValue, result = 0, basPow;

        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;

            for (int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }

            result += basPow;
            tempNumber /= 10;
        }

        if (result == number){
            System.out.println(number + " sayisi bir Armstrong sayidir.");
        }
        else {
            System.out.println(number + " sayisi bir Armstrong sayisi degildir.");
        }

        /*
        int a = 2451, numberCounter = 0;

        2451 / 10 = 245
        245 / 10 = 24
        24 / 10 = 2
        2 / 10 = 0

        while (a != 0){
            a = a / 10;
            numberCounter++;
        }

        System.out.println("Basamak sayisi: " + numberCounter);

        // Bir sayinin son basamagini bulma: 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        // Uslu sayi
        int sub = 2, sup = 5, result = 1;
        for (int i = 1; i <= sup; i++){
            result = result * sub;
        }
        System.out.println(result);
        */
    }
}
