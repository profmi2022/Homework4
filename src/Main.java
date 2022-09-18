import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задание 1.1
        int age = 16;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        //Задание 1.2
        int age2 = 26;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //Задание 1.3
        int vanSeat = 102;
        int seat1 = 60;
        int standingPlaces = vanSeat - seat1;
        int seat = 24;
        if (seat <= 60) {
            System.out.println("Есть " + (seat1 - seat) + " сидячих мест и "+ standingPlaces + " стоячих мест.");
        }
        if (seat > 60 && seat <= 102) {
            System.out.println("В вагоне нет сидячих мест и есть "+ (standingPlaces - (seat - seat1)) + " стоячих мест.");
        }
        if (seat >= 102) {
            System.out.println("Вагон полностью заполнен, свободных мест нет.");
        }
        //Задание 2.1
        int age3 = 20;
        if (age3 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        //Задание 2.2
        int age4 = 26;
        if (age4 >= 7 && age4 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age4 >= 18 && age4 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else  {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //Задание 2.3
        int vanSeat2 = 102;
        int seat12 = 60;
        int standingPlaces2 = vanSeat2 - seat12;
        int seat2 = 24;
        if (seat2 <= 60) {
            System.out.println("Есть " + (seat12 - seat2) + " сидячих мест и "+ standingPlaces2 + " стоячих мест.");
        }
        if (seat2 > 60 && seat2 <= 102) {
            System.out.println("В вагоне нет сидячих мест и есть "+ (standingPlaces2 - (seat2 - seat12)) + " стоячих мест.");
        }
        else {
            System.out.println("Вагон полностью заполнен, свободных мест нет.");
        }
        //Задание 3.1
        int age6 = 25;
        boolean canGoToKindergarten = age6 >= 2 && age6 <= 6;
        if (canGoToKindergarten) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в детский сад.");
        }
        boolean canGoToSchool = age6 >= 7 && age6 <= 18;
        if (canGoToSchool) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в школу.");
        }
        boolean canGoToUni = age6 > 18 && age6 <= 24;
        if (canGoToUni) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в университет.");
        }
        if (age6 >= 24) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно идти на работу");
        }
        //Задание 3.2
        int age7 = 16;
        if (age7 <5) {
            System.out.println("Ребенку меньше 5 лет нельзя кататься на аттракционах");
        }
        if (age7 >=5 && age7 <= 14) {
            System.out.println("Ребенку " + age7 + " лет можно кататься на аттракционах только в сопровождении взрослого");
        }
        if (age7 > 14) {
            System.out.println("Ребенку " + age7 + " лет можно кататься на аттракционах");
        }
        //Задание 3.3
        int one = 25;
        int two = 38;
        int free = 15;
        boolean oneMax = one > two && one > free;
        if (oneMax) {
            System.out.println("Наибольшее число " + one);
        }
        boolean twoMax = two > one && two > free;
        if (twoMax) {
            System.out.println("Наибольшее число " + two);
        }
        boolean freeMax = free > two && free > one;
        if (freeMax) {
            System.out.println("Наибольшее число = " + free);
        }


    }
}