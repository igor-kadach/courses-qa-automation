import java.util.Arrays;

public class HW10 {

    /**Task15. Написать алгоритм StringToNumbers, который принимает строку,
     * и возвращает массив чисел:
     Test Data:
     “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     * @return
     */
    public char[] StringToNumbers(String str){

        char[] result = str.replace(", ","").toCharArray();
        return result;
    }

    /**Task16. Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers,
     * StringToNumbersAndSpaces следуя примеру на сайте: https://allcalc.ru/node/2030
     Каждый алгоритм принимает строку,  и удаляет ненужные символы:
     */
    public String StringToLetters(String str){

       String newStr = str.replaceAll("[^\\p{L}]","");
       return newStr;
    }

    public String StringToLettersAndSpaces(String str){

        String newStr = str.replaceAll("[^\\p{L}\\s]","");
        return newStr;
    }

    public String StringToNumbersTask16(String str){

        String newStr = str.replaceAll("[^\\p{N}]","");
        return newStr;
    }

    public String StringToNumbersAndSpaces(String str){

        String newStr = str.replaceAll("[^\\p{N}\\s]","");
        return newStr;
    }

    /**Task17. Напишите алгоритм CountWords, который принимает на вход текст и слово,
     * и считает все вариации этого слова в тексте:*/
    public  int CountWords(String str, String word) {
        int count = 0;
        String[] mas = str.split("[^\\p{L}]");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }


    /**Task19. Написать алгоритм ReverseString, который переворачивает строку:
     Test Data:
     “Abracadabra” → “arbadacarbA”
     */
    public String ReverseString(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

    /**Task20. Написать алгоритм RemoveDuplicates, который принимает строку и
     * возвращает строку уникальных букв:“AABBCCaabbcc” → “abc”*/
    public String RemoveDuplicates(String str ) {

        String unique = str.replaceAll("(?i)(.)(?=.*?\\1)", "");
        return unique;
    }










}
