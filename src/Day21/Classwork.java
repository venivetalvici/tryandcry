package Day21;

class ClassWork {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 10, 4};
        int[] новыйМассив = arr;
        System.out.println(arr);
        myPrint(arr);
    }

    private static void myPrint(int[] input) {
        for (int element : input) {
            System.out.println(element);
        }
        for (int j : input) {
            System.out.print(" " + j);
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(" " + input[i]);
        }
    }
}

