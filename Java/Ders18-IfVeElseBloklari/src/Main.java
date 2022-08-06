public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 1;
        boolean compare = (a==b);
        boolean compare2 = (a!=b);

        // String str = compare ? "Esittir" : "Esit Degildir";
        // String str2 = compare2 ? "Esittir" : "Esit Degildir";

        System.out.println(compare);
        // System.out.println(str);

        System.out.println(compare2);
        // System.out.println(str2);

        if (compare){
            a = 50;
            System.out.println("A sayisi: " + a);
            System.out.println("Dogru...");
        }
        else{
            a = 60;
            System.out.println("A sayisi: " + a);
            System.out.println("Yanlis...");
        }

        if ((a<b) && (a<c)){
            System.out.println("En kucuk sayi A'dir.");
        }
        else if ((b<a) && (b<c)){
            System.out.println("En kucuk sayi B'dir.");
        }
        else{
            System.out.println("En kucuk sayi C'dir.");
        }

        if (a<b){
            if (a<c){
                System.out.println("En kucuk A'dir...");
            }
            else {
                System.out.println("A sayisi C'den buyuktur...");
            }
        }

        int var1 = 5;
        int var2 = 6;

        if ((var2 = 1) == var1){
            System.out.println(var2);
        }
        else {
            System.out.println(++var2);
        }

        System.out.println("Program Bitti!");
    }
}
