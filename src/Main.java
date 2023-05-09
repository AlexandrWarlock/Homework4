public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }
    public static void task1 ()
    {
        System.out.println("Задача 1");
        int ages = 100;
        if (ages >= 18) {
            System.out.println("Если возраст человека равен " + ages + " то он совершеннолетний");
        }
        if (ages < 18) {
            System.out.println("Если возраст человека равент " + ages + " то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 ()
    {
        System.out.println("Задача 2");
        int temperature = 11;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }
    public static void task3 ()
    {
        System.out.println("Задача 3");
        int speed = 10;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }

    }
    public static void task4 ()
    {
        System.out.println("Задача 4");
        int age = 66;
        if (age > 0 && age < 2) {
            System.out.println("Если возраст человека равен " + age + " , то ему пора спать");
        }
        if (age >= 2 && age <= 6)
        {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age < 18)
        {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        }
        if (age >= 18 && age < 24)
        {
            System.out.println("Если возраст человека равен " + age + " , то его место в университете");
        }
        if (age >= 24 && age < 60)
        {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }
        else if (age >= 60)
            {
            System.out.println("Если возраст человека равен " + age + " , то он может отдохнуть");
            }
    }
    public static void task5 ()
    {
        System.out.println("Задача 5");
        int years = 114;
        if (years < 5)
        {
            System.out.println("Если возраст ребенка равен " + years + " , то ему нельзя кататься на аттракцционе");
        }
        if (years >=5 && years < 14)
        {
            System.out.println("Если возраст ребенка равен " + years + " , то ему можно кататься на аттракционе в сопровождении");
        } else if (years >= 14) {
            System.out.println("Если возраст ребенка равен " + years + " , то ему можно кататься без сопровождения");
        }
    }
    public static void task6 ()
    {
        System.out.println("Задача 6");
        int allPlace = 102;
        int sitPlace = 60;
        int stayPlace = allPlace - sitPlace;
        int engagedPlace = 71;
        if (engagedPlace >= allPlace)
        {
            System.out.println("Свободных мест нет");
        }
        if (engagedPlace < allPlace && engagedPlace >= sitPlace)
        {
            System.out.println("Есть свободные стоячие места");
        } else if (engagedPlace < sitPlace) {
            System.out.println("Есть свободные стоячие и сидячие места");
        }
    }
    public static void task7 ()
    {
        System.out.println("Задача 7");
        int one = 111111;
        int two = 11111;
        int three = 11111;
        if (one > two && one > three){
            System.out.println(one);
        }
        else if (two > one && two >three) {
            System.out.println(two);
        }
        else
            System.out.println(three);
    }
}