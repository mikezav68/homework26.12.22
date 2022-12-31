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

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18)
        {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, то совершеннолетия нужно дождаться");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature >= 5)
        {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 67;
        if (speed <=60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int ageOfPupil = 25;
        if (ageOfPupil >= 2 && ageOfPupil < 7)
        {
            System.out.println("Если возраст человека " + ageOfPupil + " лет, то ему нужно ходить в детский сад");
        } else
        if (ageOfPupil >= 7 && ageOfPupil < 18)
        {
            System.out.println("Если возраст человека " + ageOfPupil + " лет, то ему нужно ходить в школу");
        } else
        if (ageOfPupil >= 18 && ageOfPupil < 24)
        {
            System.out.println("Если возраст человека " + ageOfPupil + " лет, то ему нужно ходить в университет");
        } else
        if (ageOfPupil >= 24)
        {
            System.out.println("Если возраст человека " + ageOfPupil + " лет, то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int childAge = 12;
        if (childAge < 5)
        {
            System.out.println("Если возраст ребенка " + childAge + " лет, то ему нельзя кататься на аттракционах");
        } else
        if (childAge >= 5 && childAge < 14)
        {
            System.out.println("Если возраст ребенка " + childAge + " лет, то ему можно кататься на аттракционах в сопровождении взрослых");
        } else
        if (childAge>=14)
        {
            System.out.println("Если возраст ребенка " + childAge + " лет, то ему можно кататься на аттракционах самостоятельно");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int AllPlaces = 102;
        int maxSeatPlaces = 60;
        int seatPlaces = 22;
        int standPlaces = 41;
        int maxStandPlaces = AllPlaces - maxSeatPlaces;
        if (seatPlaces < maxSeatPlaces && standPlaces < maxStandPlaces)
        {
            System.out.println("В вагоне есть и сидячие, и стоячие места");
        } else
        if (seatPlaces == maxSeatPlaces && standPlaces < maxStandPlaces)
        {
            System.out.println("В вагоне есть только стоячие места");
        } else
        if (seatPlaces < maxSeatPlaces && standPlaces == maxStandPlaces)
        {
            System.out.println("В вагоне есть только сидячие места");
        } else
        {
            System.out.println("В вагоне нет мест");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 23;
        int two = 1444;
        int three = 165;
        if (one > two && one > three)
        {
            System.out.println("Самое большое число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число: " + two);
        } else {
            System.out.println("Самое большое число: " + three);
        }
    }
}