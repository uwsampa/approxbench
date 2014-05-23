package jnt.scimark2;

public class RunSOR {
    public static void main(String[] argv) {
        final int N = Constants.SOR_SIZE;
        Random R = new Random(Constants.RANDOM_SEED);

        double G[][] = kernel.RandomMatrix(N, N, R);
        for (int i = 0; i < 10000; ++i) {
            SOR.execute(1.25, G, 1);
        }

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                System.out.print(G[i][j] + " ");
            }
            System.out.println();
        }
    }
}
