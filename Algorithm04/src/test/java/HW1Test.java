import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static consts.NumberType.*;

public class HW1Test {

    HW1 homeWork1;

    @BeforeEach
    void setUp(){
        homeWork1 = new HW1();
    }

    /**Task1. Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
     *  и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.*/
    @Test
    public void testOddEvenEven() {
        int number = 222222;

        String expectedResult = EVEN;
        String actualResult = homeWork1.OddEven(number) ;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenOdd() {
        int number = -345;

        String expectedResult = ODD;
        String actualResult = homeWork1.OddEven(number) ;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenUndefined() {
        long number = 2147483647l + 1;

        String expectedResult = UNDEFINED;
        String actualResult = homeWork1.OddEven(number) ;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**Task2. Написать алгоритм OddIndices, который принимает массив чисел,
     * и возвращает массив значений нечетных индексов*/
    @Test
    public void testOddIndices(){
        int[] masTask2 = new int[]{-45, 590, 234, 985, 12, 68};

        int[] expectedResult = new int[]{590, 985, 68};
        int[] actualResult = homeWork1.OddIndices(masTask2);
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    /**Task3. Написать алгоритм SumArray, который возвращает сумму всех чисел массива*/
    @Test
    public void testSumArrayNegativeNumber(){
        int[] masTask3 = new int[]{-7, -3};

        int[] expectedResult = new int[] {-10};
        int[] actualResult = homeWork1.SumArray(masTask3);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayPositiveNumber(){
        int[] masTask3 = new int[]{0, 1, 2, 3, 4, 5};

        int[] expectedResult = new int[] {15};
        int[] actualResult = homeWork1.SumArray(masTask3);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    /**Task4.Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение. */
    @Test
    public void testBiggerValue(){
        int a = 3333;
        int b = 9999;

        int expectedResult = 9999;
        int actualResult = homeWork1.BiggerValue(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**Task5. Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю,
     * и возвращает false, если параметр меньше 0.*/
    @Test
    public void testIsPositiveNumberPositive(){
        int a = 555;

        boolean expectedResult = true;
        boolean actualResult = homeWork1.IsPositiveNumber(a);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsPositiveNumberNegative(){
        int a = 555;

        boolean expectedResult = false;
        boolean actualResult = homeWork1.IsPositiveNumber(a);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsPositiveNumberNull(){
        int a = 0;

        boolean expectedResult = true;
        boolean actualResult = homeWork1.IsPositiveNumber(a);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    /**Task6.Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
     0, если числа равны; -1, если первое число меньше второго; 1, если первое число больше второго*/
    @Test
    public void testAreNumberEqualAEqualB(){
        int a = 89;
        int b = 89;

        int expecterResult = 0;
        int actualResult = homeWork1.AreNumberEqual(a,b);
        Assertions.assertEquals(expecterResult,actualResult);
    }

    @Test
    public void testAreNumberEqualALessB(){
        int a = -89;
        int b = 89;

        int expecterResult = -1;
        int actualResult = homeWork1.AreNumberEqual(a,b);
        Assertions.assertEquals(expecterResult,actualResult);
    }

    @Test
    public void testAreNumberEqualAGreaterB(){
        int a = 89;
        int b = -89;

        int expectedResult = 1;
        int actualResult = homeWork1.AreNumberEqual(a,b);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    /**Task7. Given an integer M perform the following conditional actions:
     * If M is multiple of 3 and 5 then return "Good Number".
     * If M is only multiple of 3 and not of 5 then return "Bad Number"
     * If M is only multiple of 5 and not of 3 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1" */
    @Test
    public void testNumberMIsGood (){
        int m = 15;

        String expectedResult = "Good Number";
        String actualResult = homeWork1.NumberMIs(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberMIsBad (){
        int m = 21;

        String expectedResult = "Bad Number";
        String actualResult = homeWork1.NumberMIs(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberMIsPoor (){
        int m = 25;

        String expectedResult = "Poor Number";
        String actualResult = homeWork1.NumberMIs(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberMIsElse (){
        int m = 44;

        String expectedResult = "-1";
        String actualResult = homeWork1.NumberMIs(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**Task8. Написать алгоритм MinMaxAve, который принимает массив чисел int[] и 2 значения индексов.
     * Алгоритм возвращает массив, который содержит минимальное значение,
     * максимальное значение, и среднее среди всех значений между 2-мя индексами.*/
    @Test
    public void testMinMaxAve(){
        int[] masTask8 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;

        int[] expectedResult = new int[]{3,7,5};
        int[] actualResult = homeWork1.MinMaxAve(masTask8,a,b);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    /**
     * Task9. Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
     * и возвращает массив общих элементов.
     */
    @Test
    public void testIntersection(){
        int[] mas1 = new int[]{1, 2, 4, 5, 89};
        int[] mas2 = new int[]{8, 9, 4, 2};

        Integer[] expectedResult = new Integer[]{2, 4};
        Integer[] actualResult = homeWork1.Intersection(mas1,mas2);
        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testIntersectionWithNegative(){
        int[] mas1 = new int[]{1, 2, 4, 5, 8, 9};
        int[] mas2 = new int[]{8, 9, -4, -2};

        Integer[] expectedResult = new Integer[]{8, 9};
        Integer[] actualResult = homeWork1.Intersection(mas1,mas2);
        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testIntersectionWithout(){
        int[] mas1 = new int[]{1, 2, 4, 5, 89};
        int[] mas2 = new int[]{8, 9, 45};

        Integer[] expectedResult = new Integer[]{};
        Integer[] actualResult = homeWork1.Intersection(mas1,mas2);
        Assertions.assertArrayEquals(expectedResult,actualResult);
    }


    /**
     * Task10. Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
     * и возвращает “перевернутый” массив.
     */
    @Test
   public void testReverseArray(){
       int[] mas = new int[]{2, 7, 3, 10};

       int[] expectedResult = new int[]{10, 3, 7, 2};
       int[] actualResult = homeWork1.ReverseArray(mas);
       Assertions.assertArrayEquals(expectedResult, actualResult);
   }

    /**Task11. Написать алгоритм SortArray, который принимает на вход массив целых чисел, и
     * сортирует элементы массива в порядке возрастания.*/
    @Test
    public void testSortArray(){
        int[] mas = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};

        int[] expectedResult = new int[] {2, 3, 4, 4, 5, 7, 9, 12, 12};
        int[] actualResult = homeWork1.SortArray(mas);
        Assertions.assertArrayEquals(expectedResult, actualResult);





    }


}
