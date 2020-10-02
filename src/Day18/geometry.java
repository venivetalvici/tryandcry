package Day18;

public class geometry {
    /*Школа приняла на работу молодую учительницу геометрии.
        И первым делом она решила привести кабинет точных наук в порядок. В подвале школы были найдены:
точная копия спутника земли ПС-1. Диаметр сферы 58см.
жестяной куб со стороной 40см.
правильная четырёхугольная пирамида "Хеопса" со стороной основания 20см и боковыми рёбрами 30см
и чёрный ящик с размерами 80см * 30см * 20см.
Всё было в достаточно запущенном состоянии и новая учительница решила всё покрасить в красный цвет.
Сколько денег на покраску нужно потратить если на один квадратный метр надо 560мл краски,
 а балончик с аэрозольной краской 400мл стоит 17€?

         */
    public static void main(String[] args) {
      //1.найти площади фигур
        //2.Сложить
        //3. перевести в удобные единицы измерение
        //4.узнать сколько краски потребуется всего
        //5. узнать количество баллонов
        //6.узнать стоимость краски
        double flaeche1 = flaecheSphere(58);
        double flaeche2 = flaecheCube(40);
        double flaeche3 = flaechePyramide(20 ,30);
        double flaeche4 = flaecheQuader(80,30,20);
        double gesamFlaeche = flaeche1+flaeche2+flaeche3+flaeche4;
        double mengeFarbe= findeFarbenMenge(gesamFlaeche,560);
        int anzahlDosen = countDosen(mengeFarbe);
        double price = priceCount(anzahlDosen,17.00);
        System.out.println(" денег потребуется на ремонт:" +price);

    }

    private static int countDosen(double mengeFarbe) {
        System.out.println("возможное количество балонов" +(int)Math.ceil(mengeFarbe/400));
        return (int) Math.ceil(mengeFarbe/400);
    }

    private static double priceCount(double mengeDOSEN, double price) {
        return mengeDOSEN*price;
    }

    private static double findeFarbenMenge(double f, int ml) {
        f = f/10000;//квадратныесантиметры в квадратные метры

        return f*ml;
    }

    private static double flaecheQuader(int a, int b, int c) {
        return 2*(a*b+b*c+a*c);
    }

    private static double flaechePyramide(int ground, int side) {
        double a =ground;
        double b = side;
        return (b*Math.sqrt(a* a - ((b * b) / 4))) / 2;
    }

    private static double flaecheCube(int side) {
        return 6*side*side;
    }

    private static double flaecheSphere(int d) {
        return Math.PI*d*d;
    }
}
