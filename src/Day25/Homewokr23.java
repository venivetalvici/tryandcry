package Day25;

public class Homewokr23 {
    public static void main(String[] args) {

        System.out.println(sameStarChar("xy*yzz")); //→ true
        System.out.println(sameStarChar("xy*zzz")); //→ false
        System.out.println(sameStarChar("*xa*az")); //→ true
    }

    public static boolean sameStarChar(String str) {
        for(int i = 1; i < str.length() - 1; i++) {
            if(str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
        }

        return true;
    }


}
