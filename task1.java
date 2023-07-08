public class task1 {
	
    public static double row(int N, int M) {
        if(M == 0) {
            return 1;
        }
        if(M < 0) {
            return 1.0 / row(N, -M);
        }
        M --;
        return N * row(N, M);
    }

}