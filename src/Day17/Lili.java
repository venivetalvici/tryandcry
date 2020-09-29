package Day17;


    import java.util.Scanner;
public class Lili {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Сколько денег? ");
            int SumInRub = input.nextInt();
            if (SumInRub != 1 && SumInRub != 21 && SumInRub != 31 && SumInRub != 41 && SumInRub != 51 && SumInRub != 61 && SumInRub != 71 && SumInRub != 81 && SumInRub != 91 && SumInRub != 101) {
                if ((SumInRub < 2 || SumInRub > 4) && (SumInRub < 22 || SumInRub > 24) && (SumInRub < 32 || SumInRub > 34) && (SumInRub < 42 || SumInRub > 44) && (SumInRub < 52 || SumInRub > 54) && (SumInRub < 62 || SumInRub > 64) && (SumInRub < 72 || SumInRub > 74) && (SumInRub < 82 || SumInRub > 84) && (SumInRub < 92 || SumInRub > 94)) {
                    if ((SumInRub < 5 || SumInRub > 20) && (SumInRub < 25 || SumInRub > 30) && (SumInRub < 35 || SumInRub > 40) && (SumInRub < 45 || SumInRub > 50) && (SumInRub < 55 || SumInRub > 60) && (SumInRub < 65 || SumInRub > 70) && (SumInRub < 75 || SumInRub > 80) && (SumInRub < 85 || SumInRub > 90) && (SumInRub < 95 || SumInRub > 100) && SumInRub != 0) {
                        System.out.println("Это " + SumInRub + " тенге");
                    } else {
                        System.out.println(SumInRub + "  рублей");
                    }
                } else {
                    System.out.println(SumInRub + " рубля");
                }
            } else {
                System.out.println(SumInRub + "  рубль");
            }

            input.close();
        }
    }


