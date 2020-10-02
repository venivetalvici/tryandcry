package HomeWork;

public class ternar2 {
    public static void main(String[] args) {
        System.out.println(getMeMin(15, 45)); //→ 15
        System.out.println(getMeMin(44, 16)); //→ 16
        System.out.println(getMeMin(200, 100)); //→ 100

    }

    private static String getMeMin(int a, int b) {
        String result = "";
        result = String.valueOf((a > b) ? +b : +a);
        return "меньшее число: " +  result;

    }

}
