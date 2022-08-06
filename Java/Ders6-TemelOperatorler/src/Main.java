public class Main {
    public static void main(String[] args) {
        int a = 5, b = 1;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int x = 7;
        int y = x;
        System.out.println(y);

        int z = 7, t = 2;
        // t = t + z;
        t += z;
        System.out.println(t);
        t -= z;
        System.out.println(t);
        t *= z;
        System.out.println(t);
        t /= z;
        System.out.println(t);

        int k = 5, m = 2;
        boolean sonuc = (k == m);
        System.out.println(sonuc);
        boolean sonuc2 = (k != m);
        System.out.println(sonuc2);
        boolean sonuc3 = (k>m);
        System.out.println(sonuc3);
        boolean sonuc4 = (m >= k);
        System.out.println(sonuc4);

        int o = 5, u = 1, h = 5;
        boolean kosul1 = (o==h);
        System.out.println(kosul1);
        boolean kosul2 = (o>=u);
        System.out.println(kosul2);
        boolean sonucu = (kosul1 && kosul2);
        System.out.println(sonucu);
        boolean sonucu2 = (kosul1 || kosul2);
        System.out.println(sonucu2);
        System.out.println(!sonucu2);

        String str = sonuc ? "Dogru" : "Degil";
        System.out.println(str);
        int sonuc5 = sonuc ? 1 : 0;
        System.out.println(sonuc5);

        int modes = -12%-5;
        System.out.println(modes);
    }
}
