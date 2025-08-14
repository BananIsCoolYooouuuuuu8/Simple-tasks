package august._14_08_25_classes;

public class CountAtom {
    public static void main(String[] args) {
        double density = 7.9;
        double mM = 56;
        double nA = 6.02 * Math.pow(10, 23);
        double nMoleOn1Cm3 = density / mM;
        double nAtomOn1Cm3 = nMoleOn1Cm3 * nA;
        System.out.println("Count atom on 1 cm^3: " + nAtomOn1Cm3);
    }
}
