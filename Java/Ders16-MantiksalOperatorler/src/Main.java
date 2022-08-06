public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5, d;

        boolean kosul1 = (a < b);
        boolean kosul2 = (a > c);
        boolean kosul3 = (b < c);
        boolean sonuc1 = (kosul1 && kosul2);
        boolean sonuc2 = (kosul2 || kosul3);

        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(kosul3);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(!sonuc2);

        d = (a == b) ? 2 : 3;
        System.out.println(d);
    }
}
