package jnt.scimark2;

public class RunMC {
    public static void main(String[] argv) {
        int cycles=1492;
        double out = MonteCarlo.integrate(1492);
        System.out.println(out);
    }
}
