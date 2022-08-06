public class Mai {
    static int sum(int a, int b){
        return a+b;
    }

    static void summ(int a, int b){
        int result = a + b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int result = sum(5,2) + sum(3,1);

        System.out.println(result);
        System.out.println(sum(5,5));

        summ(3,2);
    }
}
