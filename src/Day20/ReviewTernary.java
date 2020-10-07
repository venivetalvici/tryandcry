package Day20;

/*
myFirstCompareTo("Berlin", "Moscow"); → "Berlin"
myFirstCompareTo("Minsk", "Moscow"); → "Minsk"
myFirstCompareTo("Киев", "Paris"); → "Kyiv"
myFirstCompareTo("Могилёв", "Потсдам"); → "Могилёв"
 */
public class ReviewTernary {
    public static void main(String[] args) {
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));
        String a = "a";
        String c = "c";
        System.out.println(a.compareTo(c));
        System.out.println(myFirstCompareTo(a, c));
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));  // ожидаю минск
        System.out.println(myFirstCompareTo("кИЕВ", "Paris"));
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));

        // + =  a + b = c  ;  temp += c + 10 : temp = temp + c + 10
    }

    private static String myFirstCompareTo(String firstWord, String secondWord) {
        return (firstWord.compareTo(secondWord) < 0) ? firstWord : secondWord;
    }

    private static String myFirstCompareToSecond(String firstWord, String secondWord) {
        if (firstWord.compareTo(secondWord) < 0) {
            return firstWord;
        } else {
            return secondWord;
        }
    }
}