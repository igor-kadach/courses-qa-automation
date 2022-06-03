import consts.NumberType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HW1 {

    /**
     * Task1. Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
     * и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
     */
    public String OddEven(long number) {

        if (number > Integer.MAX_VALUE) {
            return NumberType.UNDEFINED;
        } else if (number % 2 == 0 || number == 0) {
            return NumberType.EVEN;
        } else if (number % 2 != 0) {
            return NumberType.ODD;
        }
        return NumberType.UNDEFINED;
    }

    /**
     * Task2. Написать алгоритм OddIndices, который принимает массив чисел,
     * и возвращает массив значений нечетных индексов
     */
    public int[] OddIndices(int[] masTask2) {
        int a = 0;
        for (int i = 1; i < masTask2.length; i += 2) {
            a++;
        }
        int[] newMas = new int[a];
        int j = 0;
        for (int i = 1; i < masTask2.length; i += 2) {
            newMas[j++] = masTask2[i];
        }
        return newMas;
    }

    /**
     * Task3.Написать алгоритм SumArray, который возвращает сумму всех чисел массива
     */
    public int[] SumArray(int[] masTask3) {

        int[] sum = new int[1];
        int masSum = 0;
        int j = 0;
        for (int i = 0; i < masTask3.length; i++) {
            masSum += masTask3[i];
            sum[j] = masSum;
        }
        return sum;
    }

    /**
     * Task4.Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
     */
    public int BiggerValue(int a, int b) {
        int maxValue = Math.max(a, b);
        return maxValue;
    }

    /**
     * Task5.Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю,
     * и возвращает false, если параметр меньше 0.
     */
    public boolean IsPositiveNumber(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Task6.Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
     * 0, если числа равны; -1, если первое число меньше второго; 1, если первое число больше второго
     */
    public int AreNumberEqual(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        }
        throw new RuntimeException();
    }

    /**
     * Task7. Given an integer M perform the following conditional actions:
     * If M is multiple of 3 and 5 then return "Good Number".
     * If M is only multiple of 3 and not of 5 then return "Bad Number"
     * If M is only multiple of 5 and not of 3 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1"
     *
     * @return
     */
    public String NumberMIs(int m) {
        if (m % 3 == 0 && m % 5 == 0) {
            return NumberType.GOOD;
        } else if (m % 3 == 0) {
            return NumberType.BAD;
        } else if (m % 5 == 0) {
            return NumberType.POOR;
        } else
            return NumberType.ELSE;
    }

    /**
     * Task8. Написать алгоритм MinMaxAve, который принимает массив чисел int[] и 2 значения индексов.
     * Алгоритм возвращает массив, который содержит минимальное значение,
     * максимальное значение, и среднее среди всех значений между 2-мя индексами.
     */
    //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
    public int[] MinMaxAve(int[] masTask8, int a, int b) {
        int min = masTask8[a];
        int max = masTask8[a];
        int sum = 0;
        for (int i = a; i <= b; i++) {
            min = Math.min(min, masTask8[i]);
            max = Math.max(max, masTask8[i]);
            sum += masTask8[i];
        }
        int ave = sum / (b - a + 1);
        return new int[]{min, max, ave};
    }

    /**
     * Task9. Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
     * и возвращает массив общих элементов.
     */
        public static Integer[] Intersection(int[] mas1, int[] mas2) {

            var commonList = new HashSet<Integer>();
            for (int i = 0; i < mas1.length; i++) {
                for (int j = 0; j < mas2.length; j++) {
                    if (mas1[i] == mas2[j]) {
                        commonList.add(mas1[i]);
                    }
                }
            }
            var commonMas = commonList.toArray(new Integer[commonList.size()]);
                return commonMas;
        }

    /**Task10. Написать алгоритм PeakElement, который принимает на вход массив целых чисел и возвращает
     * значения пиковых элементов (элементы, которые больше своих соседей).*/


    /**
     * Task11. Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
     * и возвращает “перевернутый” массив.
     */
    public int[] ReverseArray(int[] mas) {
        for (int i = 0; i < mas.length / 2; i++) {
            int num = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = num;
        }
        return mas;
    }

    /**
     * Task12. Написать алгоритм SortArray, который принимает на вход массив целых чисел, и
     * сортирует элементы массива в порядке возрастания.
     */
    public int[] SortArray(int[] mas) {
        Arrays.sort(mas);
        int[] sortMas = mas;
        return sortMas;
    }


}