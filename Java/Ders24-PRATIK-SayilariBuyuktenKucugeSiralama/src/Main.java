import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 3 FARKLI sayi giriniz!");
        System.out.print("1.sayiyi giriniz: ");
        a = input.nextInt();
        System.out.print("2.sayiyi giriniz: ");
        b = input.nextInt();
        System.out.print("3.sayiyi giriniz: ");
        c = input.nextInt();

        if ((a < b) && (a < c)){
            if (b < c){
                System.out.println(a + " < " + b + " < " + c);
            }
            else{
                System.out.println(a + " < " + c + " < " + b);
            }
        }
        else if ((b < a) && (b < c)){
            if (a < c){
                System.out.println(b + " < " + a + " < " + c);
            }
            else {
                System.out.println(b + " < " + c + " < " + a);
            }
        }
        else{
            if (a < b){
                System.out.println(c + " < " + a + " < " + b);
            }
            else {
                System.out.println(c + " < " + b + " < " + a);
            }
        }
    }
}
