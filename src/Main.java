public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println( " Задача 1 ");
        int name_1 = 198562;
        byte name_2 = 100;
        short name_3= 30256;
        long name_4 = 522554123L;
        float name_5 = -1.0254666f;
        double name_6 = -100.255625552;
        System.out.println( " Значение переменной name 1 с типом  int  равно " + name_1);
        System.out.println( " Значение переменной name 2 с типом  byte  равно " + name_2);
        System.out.println( " Значение переменной name 3 с типом  short  равно " + name_3);
        System.out.println( " Значение переменной name 4 с типом  long равно " + name_4);
        System.out.println( " Значение переменной name 5 с типом  float  равно " + name_5);
        System.out.println( " Значение переменной name 6 с типом  double равно " + name_6);

        // Задача 2
        System.out.println( " Задача 2 ");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        boolean d = c > 10;
        short e = 569;
        float f = -159f;
        short g = 27897;
        byte h =67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        // Задача 3
        System.out.println( " Задача 3 ");
        byte studentsLp = 23;
        byte studentsAs = 27;
        byte studentsEa = 30;
        short totalSheetOfPaper = 480;
        int totalStudents = studentsAs + studentsEa + studentsLp;
        System.out.println( " На каждого ученика рассчитано " + ( totalSheetOfPaper / totalStudents ) + " листов бумаги ");

        // Задача 4
        System.out.println( " Задача 4 ");
        byte bottle2Minute = 16;
        int bottle1Minute = bottle2Minute / 2; // кол-во бутылок в минуту
        byte minute = 20; // 20 минут
        byte day = 1; // 1 день
        byte Day3 = 3; // 3 дня
        byte month = 1; // 1 месяц = 30 дней
        int minute1Day = 60 * 24 * day; // минут в 1 дне
        int minute3Day = minute1Day * Day3 ; // минут в 3 днях
        int minuteMonth30 = 30 * minute1Day; // минут в 1 месяце
               System.out.println( " за 20 минут машина произвела бутылок " + bottle1Minute * minute + " штук");
               System.out.println( " за 1 день машина произвела бутылок " + bottle1Minute * minute1Day + " штук");
               System.out.println( " за 3 дня машина произвела бутылок " + bottle1Minute * minute3Day + " штук");
               System.out.println( " за 1 месяц машина произвела бутылок " + bottle1Minute * minuteMonth30 + " штук");

        // Задача 5
        System.out.println( " Задача 5 ");
        byte paint2Color = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int paint1Class = whitePaint + brownPaint;
        int numberOfClasses = paint2Color / paint1Class;
        System.out.println( " В школе где " + numberOfClasses + " классов нужно " + (numberOfClasses * whitePaint) + " банок белой краски и "
                + (numberOfClasses * brownPaint) + " банок коричневой краски");

        // Задача 6
        System.out.println( " Задача 6 ");
        byte bananas = 5;
        byte gramm1Bananas = 80; // грамм в одном банане
        short volumeMilk = 200;
        short weight100MlMilk = 105; // грамм в 100 мл молока
        byte iceCream = 2;
        byte weightIceCream = 100; // грамм в одном брикете мороженого
        byte eggs = 4;
        byte weight1Egg = 70; // грамм в однм яйце
        float totalWeightBananas = bananas * gramm1Bananas;
        int portion1milk = volumeMilk / 100;
        float totalWeightMilk = weight100MlMilk * portion1milk;
        float totalWeightIceCream = iceCream * weightIceCream;
        float totalWeightEggs = eggs * weight1Egg;
        System.out.println( " Вес завтрака равен " + (totalWeightEggs + totalWeightBananas + totalWeightMilk + totalWeightIceCream ) + " грамм ");
        System.out.println( " Вес завтрака равен " + ((totalWeightEggs + totalWeightBananas + totalWeightMilk + totalWeightIceCream ) /1000 ) + " кг ");

        // Задача 7
        System.out.println( " Задача 7 ");
        byte totalSlimKg = 7;
        double totalSlimGramm = totalSlimKg * 1000;
        double slimNumber1 = 250;
        double slimnumber2 = 500;
        double averageValueSlim = (slimNumber1 + slimnumber2) / 2;

        System.out.println(  " потребуется " + ( totalSlimGramm / slimNumber1 ) + " дней  при потери веса 250 грамм в день" );
        System.out.println(  " потребуется " + ( totalSlimGramm / slimnumber2 ) + " дней  при потери веса 500 грамм в день" );
        System.out.println(  " потребуется " + ( totalSlimGramm / averageValueSlim ) + " дней  при среднем значении потери веса" );


        // Задача 8
        System.out.println( " Задача 8 ");
        float wagesMasha = 67760;
        float wagesDenis = 83690;
        float wagesKristina = 76230;
        float percentage10Masha = (wagesMasha/100) * 10;
        float percentage10Denis = (wagesDenis/100) * 10;
        float percentage10Kristina = (wagesKristina/100) * 10;
        float newWagesMashaForTheYear = ( percentage10Masha + wagesMasha ) * 12;
        float newWagesDenisForTheYear = (percentage10Denis + wagesDenis) * 12;
        float newWagesKristinaForTheYear = (percentage10Kristina + wagesKristina) * 12;
        float averageWagesForTheYearMasha = wagesMasha * 12;
        float averageWagesForTheYearDenis = wagesDenis * 12;
        float averageWagesForTheYearKristina = wagesKristina * 12;
                System.out.println( " Маша теперь получает " + newWagesMashaForTheYear + " рублей в год. Годовой доход вырос на " +
                ( newWagesMashaForTheYear - averageWagesForTheYearMasha ) + " рублей. ");
        System.out.println( " Маша теперь получает " + newWagesDenisForTheYear + " рублей в год. Годовой доход вырос на " +
                ( newWagesDenisForTheYear - averageWagesForTheYearDenis ) + " рублей. ");
        System.out.println( " Маша теперь получает " + newWagesKristinaForTheYear + " рублей в год. Годовой доход вырос на " +
                ( newWagesKristinaForTheYear - averageWagesForTheYearKristina ) + " рублей. ");













    }
}