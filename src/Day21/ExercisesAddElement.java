package Day21;

import Day20.FillAndPrintIntArray;

public class ExercisesAddElement {
    public static void main(String[] args) {
        int[] customerArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int key = 4;  // index element
        int value = 100;
        int[] badCustomerArray = new int[]{-56, -45, -67};
        int number = 2;
        int element = 10000;
        // key, value
        // addElement(customerArray, key, value);
        FillAndPrintIntArray.myPrintIntArray(addElement(customerArray, key, value));
    }

    private static int[] addElement(int[] input, int index, int value) {
        int[] result = new int[input.length + 1];
        // 1. шаг
        for (int i = 0; i < index; i++) {
            result[i] = input[i];
        }
        // 2. шаг
        result[index] = value;
        // 3. шаг
        for (int i = index + 1; i < result.length; i++) {
            result[i] = input[i - 1];
        }
        return result;
    }
}