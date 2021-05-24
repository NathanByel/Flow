package dz1;



        /* 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – входные параметры этого метода;
        4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
        пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        5. Написать метод, которому в качестве параметра передается целое число, метод должен
        напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
        ноль считаем положительным числом.
        6. Написать метод, которому в качестве параметра передается целое число, метод должен
        вернуть true, если число отрицательное;
        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        8. *Написать метод, который определяет является ли год високосным, и выводит сообщение в
        консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
        високосный.
         */


public class MainClass {
    public static void main(String[] args) {

        // 2
        byte a = 3;
        short b = 25;
        char ch = 'B';
        int d = 93849384;
        long g = 839283829382938L;
        float h = 7579.24234234F;
        double k = 32423.123123;
        boolean t = true;
        String txt = "RATAMAHATAHATA";

        System.out.println(summ(13, 22, 57, 19));

        System.out.println(compare(7, 10));

        positiveOrNegative(-87);

        System.out.println(negative(-22));

        greeting(txt);

        checkYear(325);

        checkYear(400);

        checkYear(4);

        checkYear(8);

        checkYear(2022);

    }

    // 3
    public static int summ(int a, int b, int c, int d) {
        if (d == 0) {
            System.out.println("На ноль делить нельзя");
        }
        return a * (b + (c / d));
    }

    //4
    public static boolean compare(int numberOne, int numberTwo) {
        int summa = numberOne + numberTwo;
        if (summa > 10 && summa <= 20) {
            return true;
        } else return false;
    }

    //5
    public static void positiveOrNegative(int number) {
        if (number >= 0) System.out.println("Число " + number + " положительное");
        if (number < 0) System.out.println("Число " + number + " отрицательное");
    }

    //6
    public static boolean negative(int number) {
        if (number < 0) {
            return true;
        }
        return false;
    }

    //7
    public static void greeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //8
    public static void checkYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || year%400==0 ){
            System.out.println("Год " +year +" високосный");

        } else
            System.out.println("Год " +year +" не високосный");
    }

}
