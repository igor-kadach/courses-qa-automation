package homework;

public class HW10 {

    public static int count = 0;

    public static void taskNumber() {
        count++;
        System.out.println("----------------Task # " + count + "----------------");
    }

    /**
     * Task1. Написать метод, который принимает на вход строку. Если строка не пустая,
     * то примените метод по удалению пробелов в начале строки и в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы.
     * Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая, вернуть сообщение “Строка пустая”.
     * <p>
     * Test Data:
     * “    QA4Everyone   “ → “Лишние пробелы удалены”
     * “QA4Everyone“ → “Пробелов не было”
     * “” → “Строка пустая”
     */

    public static String Task1(String str1) {
        String newStr1 = null;
        boolean checkStr1 = str1.isEmpty();
        if (checkStr1 == false) {
            newStr1 = str1.trim();
            int spaceCount = 0;
            for (char c : str1.toCharArray()) {
                if (c == ' ') {
                    spaceCount++;
                }
            }
            if (spaceCount > 0) {
                System.out.println(newStr1 + " → Лишние пробелы удалены");
            } else if (spaceCount == 0) {
                System.out.println(newStr1 + " → Пробелов не было");
            }
        } else {
            System.out.println(newStr1 + " → Строка пустая");
        }
        return str1;
    }

    /**
     * Task2. Написать алгоритм RemoveAlla. С помощью методов из видео1,  написать алгоритм, который принимает
     * на вход строку. Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
     * Метод возвращает обработанную строку.
     * Test Data:
     * “    QA4Everyone   “ →  “QA4Everyone“
     * “panda   “ → “pnd”
     */
    public static String Task2(String str) {
        boolean checkStr = str.isEmpty();
        if (checkStr == false) {

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a')
                    str = str.replace("a", "");
            }
            System.out.println(str.trim());
        } else {
            System.out.println("Пустая строка.");
        }
        return str;
    }

    /**
     * Task3. Написать алгоритм RemoveAllZeros. С помощью методов из видео1,  написать алгоритм, который принимает
     * на вход строку, состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
     * если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
     * Test Data:
     * “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
     * “ 0000000111“ → “111”
     */
    public static String Task3(String str) {
        boolean checkStr = str.isEmpty();
        if (checkStr == false) {
            for (int i = 0; i < str.length(); i++) {
                str = str.replace(" ", "");
                str = str.replace("0", "");
            }
            System.out.println(str);
        }
        return str;
    }

    /**
     * Task4. Написать алгоритм RemoveAllSpaces.
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то
     * метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    QA   4  Everyone   “ →  “QA4Everyone“
     * “p a     n d a   “ → “panda”
     */
    public static String Task4(String str) {
        boolean checkStr = str.isEmpty();
        if (checkStr == false) {
            str = str.replace(" ", "");
            System.out.println(str);
        } else {
            System.out.println("Строка пустая");
        }
        return str;
    }

    /**
     * Task5. Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
     * Test Data:
     * “Abracadabra” → 5
     * “Homenum Revelio” → 0
     */
    public static String Task5(String str) {
        boolean checkStr = str.isEmpty();
        if (checkStr == false) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
                    count++;
            }
            System.out.println(str + " " + count);
        } else {
            System.out.println("Строка пустая");
        }
        return str;
    }

    /**
     * Task6. Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте
     * хотя бы одно слово Java.
     * Test Data:
     */
    public static String Task6(String str) {
        str = str.toLowerCase();
        boolean checkStr = str.contains("java");
        System.out.println(checkStr);
        return str;
    }

    /**
     * Task7. Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
     * точку и кавычки в конце строки с помощью метода concat()
     * Test Data:
     * “One” → ““One.””
     * “    TWO  “ → ““TWO.””
     */
    public static String Task7(String str) {
        String str1 = "\"";
        String str2 = ".\"";
        str = str1.concat(str).concat(str2);
        str = str.replace(" ", "");
        System.out.println(str);
        return str;
    }

    /**
     * Task8. Напишите метод, кторый принимает на вход название города и исправляет написание:Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго"
     */
    public static String Task8(String str) {
        str = str.toLowerCase();
        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(str);
        return str;
    }

    /**
     * Task9. Напишите метод, который принимает на вход строку, и возвращает все, что находится между первой и последней буквой-параметром:
     * Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */
    public static String Task9(String str, char ch ) {
        String newStr = "";
        for(int i = str.indexOf(ch); i < str.lastIndexOf(ch); i++){
            newStr = String.valueOf(str.charAt(i));
            System.out.print(newStr);
        }
        System.out.println();
        return newStr;
    }

    /**
     * Task10. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается
     * и заканчивается на одинаковую букву, и false иначе
     *
     * @return
     */
    public static boolean Task10(String str) {
        String firstLetter = String.valueOf(str.toUpperCase().charAt(0));
        String lastLetter = String.valueOf(str.toUpperCase().charAt(str.length() - 1));
        if (firstLetter.equals(lastLetter)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    /**
     * Task11. Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения
     * в виде массива слов
     * Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     */
    public static String[] Task11(String str) {
        String[] masWords = str.split(" ");
        for (int i = 0; i < masWords.length; i++) {
            System.out.print(masWords[i] + " ");
            System.out.println();
        }
        return masWords;
    }

    /**
     * Task12. Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии,
     * отчества и возвращает массив строк:
     */
    public static String[] Task12(String str) {
        String[] words = str.split(" ");
        words[0] = "Имя: " + words[0];
        words[1] = "Отчество: " + words[1];
        words[2] = "Фамилия: " + words[2];

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        return words;
    }

    /**Task13. Написать метод, который возвращает сумму всех букв слова
     */
    public static int Task13(String str) {
        int sum = 0;
        char[] strToArray = str.toCharArray();
        for(int i = 0; i < strToArray.length; i++){
            System.out.print(strToArray[i] + " ");
             sum = sum + strToArray[i];
        }
        System.out.println(sum);
        return sum;
    }

    /**Task14. Написать метод,  который принимает на вход 2 буквы и возвращает true, если первая буква встречается
     * раньше второй, иначе метод возвращает false
     method(“a”, “m”) → true
     method(“m”, “l”) → false
     */
    public static boolean Task14(char a, char b){
        if(a < b){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
        return false;
    }
    }





    public static void main(String[] args) {
        /**Task1. Написать метод, который принимает на вход строку. Если строка не пустая,
         * то примените метод по удалению пробелов в начале строки и в конце строки.
         Догадаться, каким методом из видео можно проверить, были ли пробелы.
         Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
         Если пробелов не было, вернуть сообщение “Пробелов не было”.
         Если строка пустая, вернуть сообщение “Строка пустая”.

         Test Data:
         “    QA4Everyone   “ → “Лишние пробелы удалены”
         “QA4Everyone“ → “Пробелов не было”
         “” → “Строка пустая”*/
        taskNumber();
        Task1("");

        /**Task2. Написать алгоритм RemoveAlla. С помощью методов из видео1,  написать алгоритм, который принимает
         * на вход строку. Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
         * Метод возвращает обработанную строку.
         Test Data:
         “    QA4Everyone   “ →  “QA4Everyone“
         “panda   “ → “pnd”
         */
        taskNumber();
        Task2("panda   ");

        /**Task3. Написать алгоритм RemoveAllZeros. С помощью методов из видео1,  написать алгоритм, который принимает
         * на вход строку, состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
         * если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
         Test Data:
         “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
         “ 0000000111“ → “111”
         */
        taskNumber();
        Task3(" 0000000111");

        /**Task4. Написать алгоритм RemoveAllSpaces.
         С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
         Test Data:
         “    QA   4  Everyone   “ →  “QA4Everyone“
         “p a     n d a   “ → “panda”
         */
        taskNumber();
        Task4("    QA   4  Everyone   ");

        /**Task5. Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
         Test Data:
         “Abracadabra” → 5
         “Homenum Revelio” → 0
         */
        taskNumber();
        Task5("Abracadabra");

        /**Task6. Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте
         * хотя бы одно слово Java.
         Test Data:
         */
        taskNumber();
        Task6("As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term " +
                "support (LTS) versions. Oracle released the last zero-cost public update for the legacy version " +
                "Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 with " +
                "public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of " +
                "OpenJDK 8 and 11 that are still receiving security and other upgrades.");

        /**Task7. Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
         * точку и кавычки в конце строки с помощью метода concat()
         Test Data:
         “One” → ““One.””
         “    TWO  “ → ““TWO.””
         */
        taskNumber();
        Task7("\"            Two               \"");

        /**Task8. Напишите метод, кторый принимает на вход название города и исправляет написание:Test Data:
         “ташкент” → “Ташкент”
         “ЧикаГО” → “Чикаго"*/
        taskNumber();
        Task8("ЧикаГО");

        /**Task9. Напишите метод, который принимает на вход строку, и возвращает все, что находится между первой и последней буквой-параметром:
         Test Data:
         “Abracadabra”, “b” → “bracadab”
         “Whippersnapper”, “p” → “ppersnapp”
         */
        taskNumber();
        Task9("Abracadabra", 'b');

        /**Task10. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается
         * и заканчивается на одинаковую букву, и false иначе
         */
        taskNumber();
        Task10("Whippersnapper");

        /**Task11. Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
         Test Data:
         “QA for Everyone” → {“QA”, “for”, “Everyone”}
         */
        taskNumber();
        Task11("Александр Сергеевич Пушкин");

        /**Task12. Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии,
         * отчества и возвращает массив строк:*/
        taskNumber();
        Task12("Александр Сергеевич Пушкин");

        /**Task13. Написать метод, который возвращает сумму всех букв слова
         */
        taskNumber();
        Task13("123");

        /**Task14. Написать метод,  который принимает на вход 2 буквы и возвращает true, если первая буква встречается
         * раньше второй, иначе метод возвращает false
         method(“a”, “m”) → true
         method(“m”, “l”) → false
         */
        taskNumber();
        Task14('m', 'l');








    }

}
