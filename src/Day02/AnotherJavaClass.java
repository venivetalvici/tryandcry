package Day02;

public class AnotherJavaClass {
    public AnotherJavaClass() {
    }

    public static void main(String[] args) {
        getMeCoffee();
    }

    public static void getMeCoffee() {
        System.out.println("Рецепт создания кофе:");
        getWatterToCoffee();
        getMeCoffeeToCoffee();
    }

    public static void getMeCoffeeToCoffee() {
        System.out.println("Насыпь 5 грамм кофе в стаканчик.");
    }

    public static void getWatterToCoffee() {
        System.out.println("Налей кипятка в стаканчик!");
    }
}