package ru.geekbrains.catch_the_drop;

public class Main {

    public static void main(String[] args) {

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;

        boolean z, n;
        z = true;
        n = false;
        char y = 22;
        byte u = 0;
        short r = 5;
        int i = 1992;
        long y2 = y + u + r + i;
        float f = 321.123f;
        double d = 1812.34;
        whatYear(65);
    }

    /* 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий
    результат,где a, b, c, d – входные параметры этого метода;
     */
    public static double theSampleSolution(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    /*4. Написать метод, принимающий на вход два числа,
    и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;
     */
    public static boolean isSumNumbers(int b, int c) {

        int sum = b + c;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;

        }

    }
//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
// положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

    public static void positiveNumber(int n) {

        if (n >= 0) {
            System.out.println(n + " оттрицательное число");
        } else {
            System.out.println(n + " положительное число");

        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число,
    // метод должен вернуть true, если число отрицательное;
    public static boolean isInteger(int n) {
        return n < 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void inscriptionUnknown(String unknown) {

        System.out.println("Привет, " + unknown + "!");
    }

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void whatYear(int year) {

        if (year % 400 == 0) {
            System.out.println(year + " год  является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является высокосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосны");
        } else {
            System.out.println(year + " год не является високосным");
        }


    }


}





