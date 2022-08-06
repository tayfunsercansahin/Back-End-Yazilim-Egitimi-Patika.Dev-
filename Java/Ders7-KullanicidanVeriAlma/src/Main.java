import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        System.out.print("A sayisini giriniz: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println(a);

        System.out.print("B sayisini giriniz: ");
        double b = input.nextDouble();
        System.out.println(b);

        String str = input.nextLine();
        System.out.println(str);
    }
}
