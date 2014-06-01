package jnt.scimark2;

public class RunSMM {
    public static void main(String[] argv) {
        final int N = Constants.SPARSE_SIZE_M;
        final int nz = Constants.SPARSE_SIZE_nz;
        Random R = new Random(Constants.RANDOM_SEED);

        double x[] = kernel.RandomVector(N, R);
        double y[] = new double[N];

        int nr = nz / N;
        int anz = nr * N;

        double val[] = kernel.RandomVector(anz, R);
        int col[] = new int[anz];
        int row[] = new int[N+1];

        row[0] = 0;	
        for (int r = 0; r < N; r++)
        {
            int rowr = row[r];
            row[r+1] = rowr + nr;
            int step = r/ nr;
            if (step < 1) step = 1;

            for (int i=0; i<nr; i++)
                col[rowr+i] = i*step;
        }

        SparseCompRow.matmult(y, val, row, col, x, 100);
        
        for (int i = 0; i < N; ++i) {
            System.out.print(y[i] + " ");
        }
        System.out.println("");
    }
}
