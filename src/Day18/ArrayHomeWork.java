package Day18;

public class ArrayHomeWork {
    public static void main(String[] args) {
        double[] newArray = new double[10];
        System.out.println("Инициализация массива");
        myArrayPrint(newArray);

        double[] secondArray = myDoubleArrayInitialisation(newArray);
        System.out.println("Заполнение массива");
        myArrayPrint(secondArray);

        double max = findMyMax(secondArray);
        double min = findMin(secondArray);
        System.out.println("Максимальное значение" + max);
        System.out.println("Минимальное значение" + min);

        double[] сразуНесколькоПеременных = new double[]{min, max};
        double middle = 0.0;
        double[] сразуНесколькоПеременных2 = new double[]{min, middle, max};
    }

    private static double findMin(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    private static double findMyMax(double[] input) {
        double max = input[0];
        for (int i = 0; i < input.length; i++) {
            max = Math.max(max, input[i]);
        }
        return max;
    }

    private static double[] myDoubleArrayInitialisation(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }

    private static void myArrayPrint(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }
}