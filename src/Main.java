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
        boolean four = one < two;
        int five = 569;
        short six = -159;
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

    }
}