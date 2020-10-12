package Day23;

public class Converter {
    public static int convertBinaryToDecimal(String binaryNumber){
        // %10
        // /10
        // while
        return 0;
    }
    public static String convertDecimalToBinary(int numberDecimal) {
        String resultBinary = "";
        while (numberDecimal > 0) {
            int remainder;
            remainder = numberDecimal % 2;
            resultBinary = remainder + resultBinary;
            numberDecimal = numberDecimal / 2;
            // numberDecimal /= 2;
        }
        return resultBinary;
    }

        public static void main(String args[]){
            String binaryString="101010101";
            int decimal=Integer.parseInt(binaryString,2);
            System.out.println(decimal);
        }


}