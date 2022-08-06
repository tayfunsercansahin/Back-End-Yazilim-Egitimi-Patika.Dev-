import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k, total = 1, i = 1;

        System.out.println("Ussu alinacak sayi: ");
        n = input.nextInt();
        System.out.println("Us olacak sayi: ");
        k = input.nextInt();

        /*
        while ( i <= k){

            total = total * n;
            i++;
        }
        */

        for (int j = 1; j <= k; j++){
            total *= n;
        }

        System.out.println(n + " ^ " + k + " = " + total);
    }
}
