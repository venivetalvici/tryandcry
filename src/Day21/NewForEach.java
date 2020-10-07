package Day21;

import Day20.FillAndPrintIntArray;

public class NewForEach {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        //forIMethode(arr);
        forEachMethode(arr);

    }

    private static void forEachMethode(int[] arr) {
        for (int element : arr) {
            System.out.println(element + " ");
        }
    }

    private static void forIMethode(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
            arr[i] += 1;
            arr[i]++;
        }
        FillAndPrintIntArray.myPrintIntArray(arr);
    }
}