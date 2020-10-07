package Day22;

import java.util.Arrays;

public class GermanCities {
    public static void main(String[] args) {
        String[] myCities = new String[]
                {
                        "Berlin",
                        "München",
                        "Dresden",
                        "Hamburg",
                        "Potsdam"
                };
        System.out.println(Arrays.toString(myCities));
        myPrintStringArray(myCities);
        myPrintForI(myCities);
    }

    private static void myPrintForI(String[] myCities) {
        System.out.print("[ ");
        for (int i = 0; i < myCities.length - 1; i++) {
            System.out.print(myCities[i] + ", ");
        }
        System.out.print(myCities[myCities.length - 1]);
        System.out.println(" ]");
    }

    private static void myPrintStringArray(String[] input) {
        System.out.print("[ ");
        for (String element : input) {
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }
}