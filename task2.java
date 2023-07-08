public class task2 {

    public static int sumOfDig(int N) {
        if(N == 0) {
            return 0;
        }
        return N % 10 + sumOfDig(N / 10);
    }

}