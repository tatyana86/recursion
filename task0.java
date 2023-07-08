public class task0 {

    public static int factorial(int N) {
        if(N == 1) {
            return 1;
        }

        return N * factorial(N - 1);
    }

}