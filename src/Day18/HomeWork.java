package Day18;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        //1 час = 1 кв метру done
        //час стоит 27 евро без ндс
        //1 плитка 30 на 20 см
        //ввести стоимость плитки за кв метр done
        //вывести количество целых и не целых плиток
        //стоимость материала done
        //итоговую ориентировочную стоимость done
        Scanner input = new Scanner(System.in);//вызываем Сканер
        System.out.println("Введите ширину рабочего участка ? ");
        double widtharea = input.nextDouble(); // получаем ширину в метрах не квадратных
        System.out.println("Ширина рабочего участка:" + widtharea + " метра");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Введите длинну рабочего участка? ");
        double longarea = input2.nextDouble();// получаем длинну в метрах не квадратных
        System.out.println("Длинна рабочего участка: " + longarea + " метра");
        double squarearea = widtharea * longarea; // считаем площадь в метрах квадратных
        Scanner input3 = new Scanner(System.in);
        System.out.println("Какая ширина плитки? ");// получаем ширину в сантиметрах не квадратных
        double widthtile = input3.nextDouble();
        Scanner input4 = new Scanner(System.in);
        System.out.println("Какая длинна плитки? ");// получаем ширину в сантиметрах не квадратных
        double longtile = input4.nextDouble();
        double squaretile = widthtile * longtile;//считаем площадь плитки
        Scanner input5 = new Scanner(System.in);

        System.out.println("Как будем класть плитку? ");
        String metod = input5.nextLine();
        if (metod.equals("вдоль")) {
            System.out.println("Плитку удобнее класть вдоль (по длинне)");
        } else if (metod.equals("поперек")) {
            System.out.println("Плитку удобнее класть поперек (по ширине)");
            //System.out.println(metod);// проверяю на всякий случай что в медоде

            //if (metod.equals("вдоль")) {}
             //tilearrangement  //выбираем как будем класть плитку
            Scanner input6 = new Scanner(System.in);
            System.out.println("Стоимость квадратного метра плитки? ");
            double pricemetrtile = input6.nextDouble(); //получаем цену за квадратный метр плитки
            double pricetile = (int) squarearea * pricemetrtile; // цена материала за указаннцю площадь участка
            Scanner input7 = new Scanner(System.in);
            System.out.println("Какая цена за квадратный метр участка? ");
            double pricehour = input7.nextDouble();// получаем стоимость за кв метр положенной плитки
            double pricejob = squarearea * pricehour; //считаем стоимость работы
            double price = pricejob + pricetile; //считаем общую стоимость


            System.out.println("Площадь участка : " + squarearea + " метров");
            System.out.println("Примерное время укладки плитки :" + (int) squarearea + " часов");
            System.out.println("Площадь плитки:" + squaretile);
            //System.out.println("Количество целых плиток:" +);
            System.out.println("Цена материала : " + pricetile + " Euro");
            System.out.println("Стоимость работы за квадратный метр без НДС: " + pricehour + " Euro");
            System.out.println("Стоимость работ без НДС: " + pricejob + " Euro");
            System.out.println("Итоговая стоимость" + price + " Euro");

        }
    }


}



