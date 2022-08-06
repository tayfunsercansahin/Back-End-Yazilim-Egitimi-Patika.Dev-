import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Haftanin kacinci gununu ogrenmek istiyorsunuz?");
        int day = input.nextInt();

        if(day==1){
            System.out.println("Bugun pazartesi");;
        }
        else if (day==2){
            System.out.println("Bugun sali");
        }
        else if (day==3){
            System.out.println("Bugun carsamba");
        }
        else if (day==4){
            System.out.println("Bugun persembe");
        }
        else if (day==5){
            System.out.println("Bugun cuma");
        }
        else if (day==6){
            System.out.println("Bugun cumartesi");
        }
        else if (day==7){
            System.out.println("Bugun pazar");
        }
        else {
            System.out.println("Lutfen 1-7 arasinda bir sayi giriniz!");
        }

        switch (day){
            case 1:
                System.out.println("Bugun pazartesi");
                break;
            case 2:
                System.out.println("Bugun sali");
                break;
            case 3:
                System.out.println("Bugun carsamba");
                break;
            case 4:
                System.out.println("Bugun persembe");
                break;
            case 5:
                System.out.println("Bugun cuma");
                break;
            case 6:
                System.out.println("Bugun cumartesi");
                break;
            case 7:
                System.out.println("Bugun pazar");
                break;
            default:
                System.out.println("Lutfen 1-7 arasinda bir sayi giriniz!");
        }


        int points = 6;
        switch(points){
            case 6: ;
            case 7:
                System.out.println("Java"); break;
            case 8: ;
            case 9:
                System.out.println("101"); break;
            case 10:
                System.out.println("Patika"); break;
            default:
                System.out.println("Dev");
        }
    }
}
