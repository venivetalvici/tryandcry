package HomeWork;

public class ternar1 {
    public static void main(String[] args) {
        System.out.println(getMeMax(15, 5)); //→ 15
        System.out.println(getMeMax(4, 16)); //→ 16
        System.out.println(getMeMax(20, 100)); //→ 100

    }

    private static String getMeMax(int a, int b) {
        String result = "";
        result = String.valueOf((a > b) ? +a : +b);
        return "Большее число: " +  result;

    }


}
    

