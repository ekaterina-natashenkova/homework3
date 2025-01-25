public class Main {
    public static void main(String[] args) {

        System.out.println("задача 1");
        int age = 26;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("\nзадача 2");
        int airTemperature = 3;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градус(а/ов), нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + " градус(а/ов), можно идти без шапки");
        } // в задаче нет условия, что вывести в консоль, если температура = 5, поэтому при значении 5 вывода в консоль нет

        System.out.println("\nзадача 3");
        int speedCar = 60;
        if (speedCar > 60) {
            System.out.println("Если скорость " + speedCar + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedCar + ", то можно ездить спокойно");
        }

        System.out.println("\nзадача 4");
        int ageMan = 25;
        boolean ageRange1 = ageMan >= 2 && ageMan <= 6;
        boolean ageRange2 = ageMan >= 7 && ageMan <= 17;
        boolean ageRange3 = ageMan >= 18 && ageMan <= 24;
        if (ageRange1) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад");
        }
        if (ageRange2) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу");
        }
        if (ageRange3) {
            System.out.println("Если возраст человека равен " + ageMan + ", то его место в университете");
        }
        if (ageMan > 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему пора ходить на работу");
        }// в задаче нет условия, что вывести в консоль, если возраст = 1, так же нет предельного значения, поэтому при значении 1 вывода в консоль нет

        System.out.println("\nзадача 5");
        int ageChild = 4;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("\nзадача 6");
        int passenger = 101;
        int capacityWagon = 102;
        int sitPlace = 60;
        if (passenger < capacityWagon && passenger < sitPlace) {
            System.out.println("Если количество человек в вагоне равно " + passenger + ", то есть сидячие места в вагоне");
        } else if (passenger >= sitPlace && passenger < capacityWagon) {
            System.out.println("Если количество человек в вагоне равно " + passenger + ", то есть стоячие места в вагоне");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        System.out.println("\nзадача 7");
        int one = 500;
        int two = 102;
        int three = 600;
        if (one > two && one > three) {
            System.out.println("Наибольшее число one = " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число two = " + two);
        } else {
            System.out.println("Наибольшее число three = " + three);
        }
    }
}