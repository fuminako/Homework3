public class Main {
    public static void main(String[] args) {
        // Задача 1
        int a = 2;
        byte b = 3;
        short c = 4;
        long d = 11L;
        float e = 1.5f;
        double f = 1.77;

       System.out.println("Значение переменной a с типом int равно " + a);
       System.out.println("Значение переменной b с типом byte равно " + b);
       System.out.println("Значение переменной c с типом short равно " + c);
       System.out.println("Значение переменной d с типом long равно " + d);
       System.out.println("Значение переменной e с типом float равно " + e);
       System.out.println("Значение переменной f с типом double равно " + f);

        // Задача 2
        float one = 27.12f;
        long two = 987_678_965_549L;
        double three = 2.786;
        boolean four = false;
        char five = 569;
        int six = -159;
        short seven = 27897;
        byte eight = 67;

        // Задача 3
        int lyudmilaPavlovna = 23;
        int annaSergeyevna = 27;
        int ekaterinaAndreevna = 30;
        int allPaper = 480;
        int allChildren = lyudmilaPavlovna + annaSergeyevna + ekaterinaAndreevna;
        System.out.println("На каждого ученика рассчитано " + (allPaper / allChildren) + " листов бумаги");

        // Задача 4
        int bottlePerMinute = 16 / 2;
        int bottleTwenty = bottlePerMinute * 20;
        int bottlePerDay = bottlePerMinute * 1440;
        int bottleThree = bottlePerMinute * 4320;
        int BottlesPerMonth = bottlePerMinute * 43200;
        System.out.println("За 20 минут машина произвела бутылок " + bottleTwenty + " штук");
        System.out.println("За сутки машина произвела бутылок " + bottlePerDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + bottleThree + " штук");
        System.out.println("За месяц машина произвела бутылок " + BottlesPerMonth + " штук");

        // Задача 5
        int totalCans = 120;
        int brownJar = 4;
        int whiteJar = 2;
        int cansPerClass = brownJar + whiteJar;
        int totalClasses = totalCans / cansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + (totalClasses * whiteJar) + " банок белой краски и " + (totalClasses * brownJar) + " банок коричневой краски");

        // Задача 6
        int banana = 5 * 80;
        int milk = 2 * 105;
        int cream = 2 * 100;
        int egg = 4 * 70;
        float totalWeight = banana + milk + cream + egg;
        System.out.println("Вес спорт-завтрака составляет " + totalWeight + " грамм или " + (totalWeight / 1000) + " килограмм");

        // Задача 7
        int desiredWeight = 7 * 1000;
        int firstWeight = 250;
        int secondWeight = 500;
        int days = desiredWeight / firstWeight;
        int days2 = desiredWeight / secondWeight;
        int averageWeight = desiredWeight / ((firstWeight + secondWeight) / 2);
        System.out.println("Если спортсмен будет терять по 250 грамм в день, потребуется " + days + " дней, а если 500 грамм, то " + days2 + " дней, в среднем же " + averageWeight + " дней");

        // Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int kristinaYear = kristina * 12;
        System.out.println("Маша теперь получает " + (masha + (masha / 10)) + " рублей. Годовой доход вырос на " + (((masha + (masha / 10)) * 12) - mashaYear) + " рублей");
        System.out.println("Денис теперь получает " + (denis + (denis / 10)) + " рублей. Годовой доход вырос на " + (((denis + (denis / 10)) * 12) - denisYear) + " рублей");
        System.out.println("Кристина теперь получает " + (kristina + (kristina / 10)) + " рублей. Годовой доход вырос на " + (((kristina + (kristina / 10)) * 12) - kristinaYear) + " рублей");
    }
}