package Day17;
public class cesar {

    private static String enigmaCaesar(String phrase, int key) {
        StringBuilder strBox = new StringBuilder(phrase.length());
        char tmp;
        for (int i = 0; i < phrase.length(); i++) {
            tmp = phrase.charAt(i);
            if (Character.isLetter(phrase.charAt(i))) {
                tmp += key % 34;
                if (tmp > 'я')
                    tmp = (char)(tmp % 'я' + 'а' - 3);
                else if (tmp < 'а')
                    tmp = (char)(tmp + 34);
            }
            strBox.append(tmp);
        }
        return strBox.toString();
    }

    public static void main(String[] args) {
        String message = "съешь же ещё этих мягких французских булок, да выпей чаю";
        String codeMessage = enigmaCaesar(message, 3);
        System.out.println(message + " -> " + codeMessage);
        String deCodeMessage = enigmaCaesar(codeMessage, -3);
        System.out.println(codeMessage + " -> " + deCodeMessage);
    }
}