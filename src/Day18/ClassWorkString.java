package Day18;

public class ClassWorkString {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1)); //→ true 
        System.out.println(prefixAgain("abXYabc", 2)); //→ true 
        System.out.println(prefixAgain("abXYabc", 3)); //→ false
    }

    private static boolean prefixAgain(String str, int n) {
        int len = str.length();
        String prefix = str.substring(0, n);
        for (int i = n; i < len; i++) {
            if (n + i <= len) {
                if (prefix.equals(str.substring(i, n + i)))
                    return true;
            }
        } return false;
    }
}
