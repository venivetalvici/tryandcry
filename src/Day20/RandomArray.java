package Day20;

public class RandomArray {
    public static void main(String[] args) {
        int min = 50;
        int max = 150;
        int[] arr = createRandomArray(min, max);
        int[] arr2 = createRandomArray(50, 150);
        FillAndPrintIntArray.myPrintIntArray(arr);
        FillAndPrintIntArray.myPrintIntArray(arr2);
        System.out.println(arr);
    }

    private static int[] createRandomArray(int min, int max) {
        int size = (int) (Math.random() * 15);
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            int myRandomTemp = (int) ((max - min) * Math.random() + 1) + min;
            output[i] = myRandomTemp;
        }
        return output;
    }
}