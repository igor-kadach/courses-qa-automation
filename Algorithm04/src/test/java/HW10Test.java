import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HW10Test {

    HW10 homeWork10;

    @BeforeEach
    void SetUp() {
        homeWork10 = new HW10();
    }

    /**Task15. Написать алгоритм StringToNumbers, который принимает строку,
     * и возвращает массив чисел:
     Test Data:
     “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     * @return
     */
    @Test
    public void testStringToNumbers(){
        String str = "1, 2, 3, 4, 5";

        char[] expectedResult = {'1','2','3','4','5'};
        char[] actualResult  = homeWork10.StringToNumbers(str);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    /**Task16. Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers,
     * StringToNumbersAndSpaces следуя примеру на сайте: https://allcalc.ru/node/2030
     Каждый алгоритм принимает строку,  и удаляет ненужные символы:
     */
    @Test
    public void testStringToLetters(){
        String str = "qwerty123456!@#$%^    ";

        String expectedResult = "qwerty";
        String actualResult = homeWork10.StringToLetters(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpaces(){
        String str = "qwe     rty123456!@#$%^";

        String expectedResult = "qwe     rty";
        String actualResult = homeWork10.StringToLettersAndSpaces(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersTask16(){
        String str = "qwe     rty123456!@#$%^";

        String expectedResult = "123456";
        String actualResult = homeWork10.StringToNumbersTask16(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpaces(){
        String str = "qwe     rty123456!@#$%^";

        String expectedResult = "     123456";
        String actualResult = homeWork10.StringToNumbersAndSpaces(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**Task17. Напишите алгоритм CountWords, который принимает на вход текст и слово,
    * и считает все вариации этого слова в тексте:*/
    @Test
    public void testCountWords(){
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise " +
                "still support Java 8 with public updates for personal use indefinitely. Other vendors have begun " +
                "to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = "Java";

        int expectedResult = 5;
        int actualResult = homeWork10.CountWords(str, word);
        Assertions.assertEquals(expectedResult, actualResult);
    }


    /**Task18. Написать алгоритм ReverseString, который переворачивает строку:
     Test Data:
     “Abracadabra” → “arbadacarbA”
     */
    @Test
    public void testReverseString(){
        String str = "Abracadabra";

        String expectedResult = "arbadacarbA";
        String actualResult = homeWork10.ReverseString(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**Task20. Написать алгоритм RemoveDuplicates, который принимает строку и
     * возвращает строку уникальных букв:“AABBCCaabbcc” → “abc”*/
    @Test
    public void testRemoveDuplicates(){
        String str = "AABBCCaabbcc";

        String expectedResult = "abc";
        String actualResult = homeWork10.RemoveDuplicates(str);
        Assertions.assertEquals(expectedResult, actualResult);
    }


}
