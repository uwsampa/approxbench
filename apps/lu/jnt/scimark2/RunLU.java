package jnt.scimark2;

public class RunLU {
    public static void main(String[] argv) {
        final int N = Constants.LU_SIZE;
        Random R = new Random(Constants.RANDOM_SEED);
        double A[][] = kernel.RandomMatrix(N, N,  R);
        double lu[][] = new double[N][N];
        int pivot[] = new int[N];

        for (int i = 0; i < 100; i++) {
            kernel.CopyMatrix(lu, A);
            LU.factor(lu, pivot);
        }


        double b[] = kernel.RandomVector(N, R);
        double x[] = kernel.NewVectorCopy(b);

        LU.solve(lu, pivot, x);

        // final double EPS = 1.0e-12;
        
        double[] y = kernel.matvec(A, x);
        for (int i = 0; i < N; ++i) {
            System.out.print(y[i] + " ");
        }
        System.out.println("");
    }
}
