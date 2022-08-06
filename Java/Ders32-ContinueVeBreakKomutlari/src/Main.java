public class Main {
    public static void main(String[] args) {

        /*for (int i = 1; i <= 10; i++){
            if (i == 5){
                System.out.println("i degeri 5'tir");
                break;
            }
            System.out.println(i);
        }*/

        /*for (int j = 1; j <= 10; j++){
            if (j == 5){
                continue;
            }
            System.out.println(j);
        }*/

        int i = 1;

        while (i <= 10){
            i++;
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
