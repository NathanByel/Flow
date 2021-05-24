package dz2;


/*
1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
значениями 0 3 6 9 12 15 18 21;
3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
умножить на 2;
4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов
одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
5 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
помощи интернета);
6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) →
false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не
входят.
7 **** Написать метод, которому на вход подаётся одномерный массив и число n (может быть
положительным, или отрицательным), при этом метод должен сместить все элементы
массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными
массивами.
 */
public class MainClass {

    public static void main(String[] args) {
        //    1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
        //    0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arrayOne = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1};

        inverseArray(arrayOne);

        //    2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
        //    значениями 0 3 6 9 12 15 18 21;

        int[] arrayTwo = new int[8];

        for (int i = 0, j = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = i*3;

        }

        printArray(arrayTwo);

        // 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
        // умножить на 2;

        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        printArray(arrayThree);

        arrayCheckSix(arrayThree);

        printArray(arrayThree);

        // 4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        // одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arrayFour = new int[9][9];

        for (int i = 0; i < arrayFour.length; i++) {
            for (int j = 0; j < arrayFour[i].length; j++) {
                if (i == j) {
                    arrayFour[i][j] = 1;
                }
                if (i + j == arrayFour[i].length - 1) {
                    arrayFour[i][j] = 1;
                }
            }
        }

        printDoubleArray(arrayFour);

        // 5 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
        //  помощи интернета);

        int[] arrayFive = {3, 8, 12, 6, 7, 12, 5, 8, 22, 9, 34, 12, 7, 9, 36, 44, 7, 59, -12, -36, 99, 158};

        sortMaxMin(arrayFive);

        // 6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
        // массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) →
        // false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не
        // входят.

        int[] arraySix = {3, 3, 13, 6, 6, 4, 1, 1, 22, 15, 28, 4, 6, 14, 22};

        System.out.println(checkBalance(arraySix));
    }

    public static void inverseArray(int[] arr) {     //Метод инвертирует значение ячейки массива с 0 на 1 или с 1 на 0
        for (int number : arr) {
            System.out.print(number);
        }
        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }

        for (int number : arr) {
            System.out.print(number);
        }
        System.out.println();
        System.out.println();
    }

    public static void printArray(int[] arr) {      // Метод выводит на печать интовый одномерный массив
        for (int o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void printDoubleArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void arrayCheckSix(int[] arr) {     // Метод проверяет все ячейки массива и те которые меньше 6-ти умножает на 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
    }

    public static void sortMaxMin(int[] arr) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println("Максимальное значение массива " + arr[max]);
        System.out.println("Минимальное значение массива " + arr[min]);
    }

    // 6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
    // массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) →
    // false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не
    // входят.

    public static boolean checkBalance(int[] arr) {
        System.out.println();
        int leftSide = 0, rightSide = 0, arrayIndex = 0;

        for (int k : arr) {
            rightSide += k;
        }

        do {

            leftSide += arr[arrayIndex];
            rightSide -= arr[arrayIndex];
            arrayIndex++;
            if (arrayIndex == arr.length - 1) {
                break;
            }
        } while (leftSide < rightSide);

        System.out.print("( ");
        for (int l = 0; l < arr.length; l++) {
            if (l == arrayIndex && leftSide == rightSide) System.out.print("|| ");
            System.out.print(arr[l] + " ");
        }
        System.out.print(") -> ");
        return leftSide == rightSide;
    }
    //  7 **** Написать метод, которому на вход подаётся одномерный массив и число n (может быть
    //   положительным, или отрицательным), при этом метод должен сместить все элементы
    //   массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными
    //   массивами.
    public static void arrayShift(int[] arr, int shiftNumber){

    }
}



