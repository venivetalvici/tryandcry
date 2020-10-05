package Day20;

public class Classwork {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Max(arr);
        Min(arr);
        Middle(arr);
        Sum(arr);

        System.out.println("Максимальное значение " +Max(arr));
        System.out.println("Среднее число " +Middle(arr));
        System.out.println("Минимальное значение " +Min(arr));
        System.out.println("сумма значений " +Sum(arr));
    }

    public static int Sum(int[] arr) {
        int Sum;
        Sum = Max(arr)+Min(arr)+Middle(arr);
        return Sum;
    }


    public static int Min(int[] arr) {
        int Min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        return Min;
    }


    public static int Max(int[] arr) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static int Middle(int[] arr) {
        int Middle = arr[0];
        Middle = ((Min(arr)+Max(arr))/2);
        return Middle;
    }
}

