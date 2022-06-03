package hw8;

import java.util.Arrays;

import static utils.Utils.*;


public class HW8 {

    /**
     * Task 7. Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
     */
    public static int[] Task7(int a, int b, int c, int d, int e) {
        numberTask();
        int[] masTask7 = new int[]{a, b, c, d, e};
        for(int i = 0; i < masTask7.length; i++){
            System.out.print(masTask7[i] + " ");
        }
        line();
        return masTask7;
    }

    /**
     * Task 8. Написать метод, который принимает на вход 5 чисел типа double,
     * и возвращает массив из этих же чисел
     */
    public static double[] Task8(double a, double b, double c, double d, double e) {
        numberTask();
        double[] masTask8 = new double[]{a, b, c, d, e};
        for(int i = 0; i < masTask8.length; i++){
            System.out.print(masTask8[i] + " ");
        }
        line();
        return masTask8;
    }

    /**
     * Task 9. Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
     */
    public static String[] Task9(String a, String b, String c, String d, String e) {
        numberTask();
        String[] masTask9 = new String[]{a, b, c, d, e};
        for(int i = 0; i < masTask9.length; i++){
            System.out.print(masTask9[i] + " ");}
        line();
        return masTask9;
    }

    /**
     * Task 10. Написать метод, который принимает на вход массив целых чисел,
     * и возвращает массив тех же чисел, умноженных на 2.5
     */
    public static double[] Task10(int[] masTask10) {
        numberTask();
        double[] newMas = new double[masTask10.length];
        for (int i = 0; i < masTask10.length; i++) {
        newMas[i] = masTask10[i] * 2.5;
            System.out.print(newMas[i] + " ");
        }line();
        return newMas;
    }

    /**Task 11. Написать метод, который принимает на вход массив целых положительных чисел,
     * и возвращает количество четных чисел в этом массиве*/
    public static int Task11(int[] masTask11){
        numberTask();
        int count = 0;
        for(int i = 0; i < masTask11.length; i++) {
            if (masTask11[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print(count);
        line();
        return count;
    }

    /**Task 12. Написать метод, который принимает на вход массив целых положительных чисел,
     * и возвращает массив нечетных чисел*/
    public static int[] Task12(int[] masTask12){
        numberTask();
        int[] newMasTask12 = new int[masTask12.length];
        for(int i = 0; i < masTask12.length; i++) {
            if (masTask12[i] % 2 != 0) {
                newMasTask12[i] = masTask12[i];
                System.out.print(newMasTask12[i] + " ");
            }
        }
        line();
        return newMasTask12;
    }

    /**Task 13. Написать метод, который принимает на вход масив целых чисел,
     * и возвращает массив значений true или false, если числа больше 10*/
    public static boolean[] Task13(int[] masTask13) {
        numberTask();
        boolean[] masTrue = new boolean[masTask13.length];
        for (int i = 0; i < masTask13.length; i++) {
            if (masTask13[i] > 10) {
                masTrue[i] = true;
                System.out.println(masTrue[i]);
            } else { masTrue[i] = false;
                System.out.println(masTrue[i]);}
        }
        line();
    return masTrue;
    }

    /**Task 14. Написать метод, который принимает на вход массив слов,
     * и возвращает строку, состоящую из этих слов*/
    public static String Task14(String[] masTask14 ) {
        numberTask();
        String words = null;
        for (int i = 0; i < masTask14.length; i++) {
            words = masTask14[i];
            System.out.print(words + " ");
        }
        line();
        return words;
    }

    /**Task 15. Написать метод, который принимает массив целых чисел
     * и считает сумму чисел во второй половине массива*/
    public static int Task15(int[] masTask15){
        numberTask();
        int sumTask15 = 0;
        for(int i = masTask15.length/2; i < masTask15.length; i++){
        sumTask15 += masTask15[i];
        }System.out.println(sumTask15);
        line();
        return sumTask15;
    }

    /**Task 16.Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10
     исключительно, и возвращает таблицу умножения на это число в виде массива
     Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}*/
   public static int[] Task16(int a) {
       numberTask();
       int num = 0;
       int[] masTask16 = new int[10];
       for (int i = 1; i < 10; i++) {
           num = i * a;
           masTask16[i] = num;
           System.out.print(masTask16[i] + " ");
       }
       line();
       return masTask16;
   }

    /**Task 17. Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
     * если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.*/
    public static int[] Task17(int[] masTask17) {
        numberTask();
        int a = 0;
        int b = 0;
        for (int i = 0; i < masTask17.length; i++) {
            if (masTask17[i] % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }
        int[] masChet = new int[a];
        int[] masNechet = new int[b];
        int j = 0;
        int k = 0;
        for (int i = 0; i < masTask17.length; i++) {
            if (masTask17[i] % 2 == 0) {
                masChet[j++] = masTask17[i];
            } else {
                masNechet[k++] = masTask17[i];
            }
        }
        if (a > b) {
            for(int i = 0; i < masChet.length; i++){
            System.out.println(masChet[i]);}
            return masChet;
        } else {
            for (int i = 0; i < masNechet.length; i++) {
                System.out.println(masNechet[i]);
                return masNechet;
            }
        }return null;
    }

    /**Task 18. Написать метод, который принимает на вход длину массива и генерирует массив случаейных
     * положительных чисел от 0 до 100 исключительно.
     * @return*/
    public static int[] Task18(int a){
        numberTask();
        int b = 0;
        int c = 100;
        int[] masTask18 = new int[a];
        for(int i = 0; i < masTask18.length; i++){
        masTask18[i] = (int)(b + Math.random() * c);
            System.out.print(masTask18[i] + " ");
        }
        line();
        return masTask18;
    }

    /**Task 19. Написать метод, который принимает на вход длину массива l и количество знаков d
     * (однозначные, двузначные, трехзначные и тд числа), и генерирует массив случайных целых положительных
     * чисел длины l, в котором все числа имеют количество знаков d
     * @return*/
    public static int[] Task19(int l, int d) {
        numberTask();
        double[] masTask19 = new double[l];
        for (int i = 0; i < l; i++) {
            masTask19[i] = (Math.random() * 0.9 + 0.1);
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < d; j++) {
                masTask19[i] *= 10;
            }
        }
        int[] vozvrat = new int[l];
        for (int i = 0; i < l; i++) {
            vozvrat[i] = (int) masTask19[i];
            System.out.println(vozvrat[i]);
        }
        return vozvrat;
    }

    /**Task 20. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает
     * массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.*/
    public static int[] Task20(int[] masTask20){
        numberTask();
        int[] newMas = new int[masTask20.length];
        for(int i = 0; i < masTask20.length; i++){
        if(masTask20[i] > 10){
        newMas[i] = masTask20[i];
        System.out.print(newMas[i] + " ");
        }
    }
        line();
        return newMas;
    }

    /**Task 21. Написать метод, который принимает на вход массив целых положительных двузначных чисел, и
     * возвращает массив разниц между десятками и единицами*/
    public static int[] Task21(int[] masTask21){
        numberTask();
        int[] masRaznica = new int[masTask21.length];
        int edenica;
        int desiatka;
        for(int i = 0; i < masTask21.length; i++){
           edenica = masTask21[i] % 10;
           desiatka = masTask21[i] - edenica;
            masRaznica[i] = desiatka - edenica;
            System.out.print(edenica + " ");
            System.out.print(desiatka + " ");
            System.out.println(masRaznica[i]);
        }
        line();
        return masRaznica;
    }

    /**Task 23. Написать метод, который принимает массив целых положительных чисел больше 0, и
     * возвращает массив уникальных чисел.*/
    public static int[] Task23(int[] masTask23){
        numberTask();
        var uniqMas = Arrays.stream(masTask23).distinct().toArray();
        for (int i = 0; i < uniqMas.length; i++) {
            System.out.println(uniqMas[i]);
        }
        line();
        return uniqMas;
    }

    /**Task 24. Написать метод, который принимает на вход массив целых положительных чисел, и
     * возвращает количество уникальных и неуникальных элементов в этом массиве
     * @return*/
    public static int[] Task24(int[] masTask24) {
        numberTask();
        int a = 0;
        var uniqMas = Arrays.stream(masTask24).distinct().toArray();
        for (int i = 0; i < uniqMas.length; i++) {
            a++;
            System.out.println(uniqMas[i]);

        } System.out.println("count" + a);
        line();
        return uniqMas;
    }

    /**Task 25. Написать метод, который принимает на вход массив целых положительных чисел, и 2 целых положительнх
     * числа (значения индексов). Метод возвращает массив, который содержит только числа из первого массива в
     * промежутке между индексами.Например: method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}*/
    public static int[] Task25(int[] masTask25, int a, int b){
        numberTask();
        int[] newMas = new int[masTask25.length];
        for(int i = a; i <= b; i++){
            newMas[i] = masTask25[i];
            System.out.print(newMas[i] + " ");
        }
        line();
        return newMas;
    }





    public static void main(String[] args) {

//        Integer a = 10;
//        Double b = 10.0;
//        String c = "10";
        /**Task 6. Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и
         * распечатать результат сравнения в виде таблички*/
        numberTask();
//
//        HW8 hw1 = new HW8();
//        System.out.println(hw.equals(hw1));
//        System.out.println(a);

        /**Task 7. Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел*/
        Task7(1, 2, 3, 4, 5);

        /**Task 8. Написать метод, который принимает на вход 5 чисел типа double,и возвращает массив из этих же чисел*/
        Task8(22.5, 20.7, 7.8, 4.5, 2.9);

        /**Task 9. Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов*/
        Task9("a", "b", "c", "d", "e");

        /**Task 10. Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив тех же чисел, умноженных на 2.5*/
        Task10(new int[]{1111,2050,345,484,50});

        /**Task 11. Написать метод, который принимает на вход массив целых положительных чисел,
         * и возвращает количество четных чисел в этом массиве*/
        Task11(new int[]{11,22,33,44,55,66,77,88,99});

        /**Task 12. Написать метод, который принимает на вход массив целых положительных чисел,
         * и возвращает массив нечетных чисел*/
        Task12(new int[]{11,22,33,44,55,66,77,88,99});

        /**Task 13. Написать метод, который принимает на вход масив целых чисел,
         * и возвращает массив значений true или false, если числа больше 10*/
        Task13(new int[]{5,55,22,2,88,15,10});

        /**Task 14. Написать метод, который принимает на вход массив слов,
         * и возвращает строку, состоящую из этих слов*/
        Task14(new String[]{"word1", "word5", "word4", "word2", "word3"});

        /**Task 15. Написать метод, который принимает массив целых чисел
         * и считает сумму чисел во второй половине массива*/
        Task15(new int[]{1,2,3,4,10,11,12,13});

        /**Task 16.Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10
         исключительно, и возвращает таблицу умножения на это число в виде массива
         Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}*/
        Task16(3);

        /**Task 17. Написать метод, который принимает массив целых чисел и возвращает массив четных чисел,
         * если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.*/
        Task17(new int[]{121,515,848,121,5,88,66,542,884});

        /**Task 18. Написать метод, который принимает на вход длину массива и генерирует массив случаейных
         * положительных чисел от 0 до 100 исключительно.*/
        Task18(10);

        /**Task 19. Написать метод, который принимает на вход длину массива l и количество знаков d
         * (однозначные, двузначные, трехзначные и тд числа), и генерирует массив случайных целых положительных
         * чисел длины l, в котором все числа имеют количество знаков d*/
        Task19(10,3);

        /**Task 20. Написать метод, который принимает на вход массив целых положительных чисел, и возвращает
         * массив только двузначных чисел. ПРоверить работу метода на массиве из задания 18.*/
        Task20(Task18(10));

        /**Task 21. Написать метод, который принимает на вход массив целых положительных двузначных чисел, и
         * возвращает массив разниц между десятками и единицами*/
        Task21(new int[]{25,58,41,62,74,15,12,10,99,19});

        /**Task 22. Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9, и
         * возвращает массив, который содержит номер телефона, состоящий из этих чисел,  и название страны,
         * которой номер принадлежит. method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}*/
      //  Task22(new int[]{1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7});

        /**Task 23. Написать метод, который принимает массив целых положительных чисел больше 0, и
         * возвращает массив уникальных чисел.*/
        Task23(new int[]{5,89,26,5,48,89,1,1,68,32,77,10,90,5});

        /**Task 24. Написать метод, который принимает на вход массив целых положительных чисел, и
         * возвращает количество уникальных и неуникальных элементов в этом массиве*/
        Task24(new int[]{5,89,26,5,48,89,1,1,68,32,77,10,90,5});

        /**Task 25. Написать метод, который принимает на вход массив целых положительных чисел,и 2 целых положительнх
         * числа (значения индексов). Метод возвращает массив, который содержит только числа из первого
         * массива в промежутке между индексами.Например: method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}*/
        Task25(new int[]{1, 2, 3, 4, 5}, 1, 3);







    }

}
