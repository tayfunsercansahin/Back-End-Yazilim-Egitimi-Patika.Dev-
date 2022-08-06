public class Main {
    public static void main(String[] args) {
        for (int sayac = 1; sayac <= 10; sayac++){
            System.out.print(sayac + " - ");
        }

        //----------------------------

        int sum = 0;
        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);
    }
}
