import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;

        while (right > 0){
            System.out.print("Kullanici adiniz: ");
            userName = input.nextLine();

            System.out.print("Parolaniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, kodluyoruz bankasina hosgeldiniz.");

                do {
                    System.out.println("1- Para yatirma\n" +
                            "2- Para cekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4-Cikis yap");
                    System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yatirilacak para miktarini giriniz: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Cekilecek para miktarini giriniz: ");
                            price = input.nextInt();

                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar gorusmek uzere.");
                            break;
                        default:
                            System.out.println("Lutfen 1-4 arasinda bir secim yapiniz!");
                    }
                } while (select != 4);
                /*do{
                    System.out.println("1- Para yatirma\n" +
                            "2- Para cekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4-Cikis yap");
                    System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();
                    if (select == 1){
                        System.out.println("Yatirilacak para miktarini giriniz: ");
                        int price = input.nextInt();
                        balance += price;
                    }
                    else if (select == 2){
                        System.out.println("Cekilecek para miktarini giriniz: ");
                        int price = input.nextInt();

                        if (price > balance){
                            System.out.println("Bakiye yetersiz.");
                        }
                        else {
                            balance -= price;
                        }
                    }
                    else if (select == 3){
                        System.out.println("Bakiyeniz: " + balance);
                    }
                }
                while (select != 4);
                System.out.println("Tekrar gorusmek uzere.");
                break;
            }*/
            }else{
                right--;
                System.out.println("Hatali kullanici adi veya sifre!");
                if (right == 0){
                    System.out.println("Hesabiniz bloke olmustur, banka ile iletisime geciniz.");
                }
                else{
                    System.out.println("Tekrar deneyiniz, kalan hakkiniz: " + right);
                }
            }
        }
    }
}
