package Day18;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        //1 час = 1 кв метру done
        //час стоит 27 евро без ндс done
        //1 плитка 30 на 20 см (по условию) заменили на сканер
        //ввести стоимость плитки за кв метр done
        //вывести количество целых и не целых плиток
        //стоимость материала done
        //итоговую ориентировочную стоимость done
        Scanner input = new Scanner(System.in);//вызываем Сканер
        System.out.println("Введите ширину рабочего участка ? ");
        double widtharea = input.nextDouble(); // получаем ширину в метрах не квадратных
        System.out.println("Ширина рабочего участка: " + widtharea + " метра");
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

        System.out.println("Как будем класть плитку? Вдоль или поперек? ");
        String metod = input5.nextLine();
        if (metod.equals("вдоль")) {
            double lengthResult =(long) longarea / longtile;
            double widthResult = (long) widtharea/ widthtile;
            double fullTiles = (long)lengthResult * widthResult;
            double lengthResultCut =(long) longarea % longtile;
            double widthResultCut = (long)widtharea % widthtile;
            double cutTiles = (long)lengthResultCut + widthResultCut;
            System.out.println("Плитку удобнее класть вдоль (по длинне)");
            System.out.println("Целых плиток: " + fullTiles);
            System.out.println("Плиток придется резать: " + cutTiles);

        } else if (metod.equals("поперек")) {
            double lengthResult = longarea / longtile;
            double widthResult = widtharea/ widthtile;
            double fullTiles = lengthResult * widthResult;
            System.out.println("Целых плиток: " + fullTiles);
            double lengthResultCut = longarea % longtile;
            double widthResultCut = widtharea % widthtile;
            double cutTiles = lengthResultCut + widthResultCut;
            System.out.println("Плитку удобнее класть поперек (по ширине)");
            System.out.println("Целых плиток: " + fullTiles);
            System.out.println("Плиток придется резать: " + cutTiles);
        }
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
            System.out.println("Цена материала : " + pricetile + " Euro");
            System.out.println("Стоимость работы за квадратный метр без НДС: " + pricehour + " Euro");
            System.out.println("Стоимость работ без НДС: " + pricejob + " Euro");
            System.out.println("Итоговая стоимость :" + price + " Euro");

        }
    }






