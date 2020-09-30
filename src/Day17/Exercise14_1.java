package Day17;

public class Exercise14_1 {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }

    private static String doubleChar(String input) {
        String output = "";
        for (int i=0; i< input.length(); i ++) {
            output += output +input.charAt(i) + input.charAt(i);
        }return output;
    }
}
