package jnt.scimark2;

public class RunFFT {
    public static void main(String[] argv) {
        final int N = Constants.FFT_SIZE;
        Random R = new Random(Constants.RANDOM_SEED);
        double x[] = kernel.RandomVector(2 * N, R);

        for (int i = 0; i < 1000; i++) {
            FFT.transform(x);
            FFT.inverse(x);	
        }

        for (int i = 0; i < N; ++i) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}
