import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WebTest {

//    @Test
//    public void testMenuStartTitle() {
//        String chromeDriver = "webdriver.chrome.driver";
//        String driverPath = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
//        String url = "http://www.99-bottles-of-beer.net/";
//
//        String expectedResult = "Welcome to 99 Bottles of Beer";
//
//        System.setProperty(chromeDriver, driverPath);
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get(url);
//
//        WebElement menuBrowseLanguages = driver.findElement(
//                By.xpath(
//                        "//body/div[@id='wrap']/div[@id='navigation']" +
//                                "/ul[@id='menu']/li/a[@href='/abc.html']"
//                )
//        );
//        menuBrowseLanguages.click();
//
//        WebElement menuStart = driver.findElement(
//                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']")
//        );
//        menuStart.click();
//
//        WebElement h2 = driver.findElement(
//                By.xpath("//body/div[@id='wrap']/div[@id='main']/h2")
//        );
//        String actualResult = h2.getText();
//        //sleep(2000);
//
//        Assert.assertEquals(actualResult, expectedResult);
//        //      driver.quit();
//    }

    /**
     * TC_11_01 Подтвердите, что на странице по базовой ссылке в правом верхнем углу пользователь видит заголовок 99 Bottles of Beer
     * <p>
     * Шаги:
     * 1. Открыть вебсайт на базовой странице
     * 2. Считать заголовок в правом верхнем углу
     * 3. Подтвердить, что текст заголовка соответствует ожидаемому
     * 4. Закрыть браузер
     */
    @Test
    public void testNameOfWebSite() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement nameOfWebSite = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h2"));
        String actualResult = nameOfWebSite.getText();

        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    /**
     * TC_11_02 Подтвердите, что на странице по базовой ссылке последний пункт меню называется Submit new Language
     * Шаги:
     * 1. Открыть вебсайт на базовой странице
     * 2. Считать название последнего пункта меню
     * 3. Подтвердить, что название последнего пункта меню соответствует ожидаемому
     * 4. Закрыть браузер
     */

    @Test
    public void testLastPointMenu() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        String expectedResult = "SUBMIT NEW LANGUAGE";
        System.setProperty(chromeDriver, driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement buttonSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']"));

        String actualResult = buttonSubmitNewLanguage.getText();

        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    /**
     * TC_11_03 Подтвердите, что на странице по базовой ссылке последний пункт меню имеет подзаголовок Submit new Language
     * Шаги:
     * 1. Открыть вебсайт на базовой странице
     * 2. Нажать на пункт меню Submit new Language
     * 3. Считать название подзаголовка последнего пункта меню
     * 4. Подтвердить, что название подзаголовка последнего пункта меню соответствует ожидаемому
     * 5. Закрыть браузер
     */

    @Test
    public void testNameOfSubtitle() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);

        String expectedResult = "Submit New Language";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement buttonSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']")
        );
        buttonSubmitNewLanguage.click();

        WebElement subtitle = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='./submitnewlanguage.html']")
        );
        String actualResult = subtitle.getText();

        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    /**
     * TC_11_04 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/abc.html , первый пункт подменю называется 0-9
     * Шаги:
     * 1. Открыть вебсайт на странице
     * 2. Считать название первого подзаголовка
     * 3. Подтвердить, что название подменю соответствует ожидаемому
     * 4. Закрыть браузер
     */

    @Test
    public void testSubtitleNameOfBrowseLanguage() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);
        String expectedResult = "0-9";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement buttonBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']"));
        buttonBrowseLanguages.click();

        WebElement firstSubtitle = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='0.html']")
        );
        String actualResult = firstSubtitle.getText();

        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    /**
     * TC_11_06 Подтвердите, что имена создателей сайта:
     * Oliver Schade
     * Gregor Scheithauer
     * Stefan Scheler
     * <p>
     * Шаги:
     * Напишите самостоятельно (найдите информацию о создателях на сайте, и опишите шаги для навигации и исполнения тест кейса)
     */

    @Test
    public void testCreatorsName() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);

        String expectedResult1 = "Oliver Schade";
        String expectedResult2 = "Gregor Scheithauer";
        String expectedResult3 = "Stefan Scheler";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement buttonTeam = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='team.html']")
        );
        buttonTeam.click();

        WebElement oliver = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3")
        );
        String actualResult1 = oliver.getText();
        Assert.assertEquals(actualResult1, expectedResult1);

        WebElement gregor = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[normalize-space()='Gregor Scheithauer']")
        );

        String actualResult2 = gregor.getText();
        Assert.assertEquals(actualResult2, expectedResult2);

        WebElement stefan = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[normalize-space()='Stefan Scheler']")
        );

        String actualResult3 = stefan.getText();
        Assert.assertEquals(actualResult3, expectedResult3);
        driver.quit();
    }

    /**
     * TC_11_07 Придумайте и автоматизируйте свой собственный тест кейс на сайте http://www.99-bottles-of-beer.net/
     */
    @Test
    public void testMyTest() {

        String chromedriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromedriver, driverPath);
        String expectedresult = "Express";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement buttonTopLists = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/toplist.html']")
        );
        buttonTopLists.click();

        WebElement firstPlace = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/table[@id='category']/tbody/tr/td/a[@href='language-express-250.html']")
        );

        String actualResult = firstPlace.getText();

        Assert.assertEquals(actualResult, expectedresult);
        driver.quit();
    }

    /**
     * Подтвердите, что если на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html ,  пользователь нажмет кнопку Submit Language,  не заполнив информацию в обязательных полях, будет показана ошибка
     * <p>
     * Error: Precondition failed - Incomplete Input.
     * <p>
     * Шаги:
     * 1. Открыть вебсайт на странице
     * 2. Нажать на кнопку Submit Language
     * 3. Подтвердить, что на странице показана ошибка
     * 4. Подтвердить, что текст ошибки соответствует ожидаемому
     * 5. Закрыть браузер
     */
    @Test
    public void testErrorMessage() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);
        String expectedResult1 = "Error: Precondition failed - Incomplete Input.";
        String expectedResult2 = "true";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement buttonMenuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']")
        );
        buttonMenuSubmitNewLanguage.click();

        WebElement buttonSubmitLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@type='submit']")
        );
        buttonSubmitLanguage.click();

        WebElement errorMessage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/p")
        );

        boolean result = errorMessage.isDisplayed();
        String actualResult2 = String.valueOf(result);
        Assert.assertEquals(actualResult2, expectedResult2);

        String actualResult = errorMessage.getText();
        Assert.assertEquals(actualResult, expectedResult1);
        driver.quit();
    }

    /**
     * TC_11_12 Precondition: Если на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html ,  пользователь нажмет кнопку Submit Language,  не заполнив информацию в обязательных полях, будет показана ошибка с текстом
     * <p>
     * Error: Precondition failed - Incomplete Input.
     * <p>
     * Подтвертите, что в тексте ошибки слова Error, Precondition, Incomplete и Input написаны с большой буквы, а слово failed  написано  с маленькой буквы.
     * Так же подтвердите, что в тексте ошибки содержатся знаки :, -  и .
     * <p>
     * Шаги:
     * 1. Открыть вебсайт на странице
     * 2. Нажать на кнопку Submit Language
     * 3. Считать текст ошибки
     * 4. Подтвердить requirenments
     * 5. Закрыть браузер
     */
    @Test
    public void testGrammaticOfErrorMessage() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "https://99-bottles-of-beer.net/submitnewlanguage.html";

        System.setProperty(chromeDriver, driverPath);
        String expectedResult1 = "Error";
        String expectedResult2 = "Precondition";
        String expectedResult3 = "Incomplete";
        String expectedResult4 = "Input";
        String expectedResult5 = "failed";
        String expectedResult6 = ":";
        String expectedResult7 = "-";
        String expectedResult8 = ".";

        String actualResult1 = null;
        String actualResult2 = null;
        String actualResult3 = null;
        String actualResult4 = null;
        String actualResult5 = null;
        String actualResult6 = null;
        String actualResult7 = null;
        String actualResult8 = null;
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement buttonSubmitLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/form[@id='addlanguage']/p/input[@type='submit']")
        );
        buttonSubmitLanguage.click();

        WebElement errorMessage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/p")
        );
        String message = errorMessage.getText();

        String res1 = String.valueOf(message.contains(expectedResult1));
        if (res1 == "true") {
            actualResult1 = "Error";
        }
        Assert.assertEquals(actualResult1, expectedResult1);

        String res2 = String.valueOf(message.contains(expectedResult2));
        if (res2 == "true") {
            actualResult2 = "Precondition";
        }
        Assert.assertEquals(actualResult2, expectedResult2);

        String res3 = String.valueOf(message.contains(expectedResult3));
        if (res3 == "true") {
            actualResult3 = "Incomplete";
        }
        Assert.assertEquals(actualResult3, expectedResult3);

        String res4 = String.valueOf(message.contains(expectedResult4));
        if (res4 == "true") {
            actualResult4 = "Input";
        }
        Assert.assertEquals(actualResult4, expectedResult4);

        String res5 = String.valueOf(message.contains(expectedResult5));
        if (res5 == "true") {
            actualResult5 = "failed";
        }
        Assert.assertEquals(actualResult5, expectedResult5);

        String res6 = String.valueOf(message.contains(expectedResult6));
        if (res6 == "true") {
            actualResult6 = ":";
        }
        Assert.assertEquals(actualResult6, expectedResult6);

        String res7 = String.valueOf(message.contains(expectedResult7));
        if (res7 == "true") {
            actualResult7 = "-";
        }
        Assert.assertEquals(actualResult7, expectedResult7);

        String res8 = String.valueOf(message.contains(expectedResult8));
        if (res8 == "true") {
            actualResult8 = ".";
        }
        Assert.assertEquals(actualResult8, expectedResult8);


    }

    /**
     * TC_11_13 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html
     * в первом пункте списка пользователь видит текст
     * <p>
     * IMPORTANT: Take your time! The more carefully you fill out this form (especially the language name and description),
     * the easier it will be for us and the faster your language will show up on this page. We don't have the time to
     * mess around with fixing your descriptions etc. Thanks for your understanding.
     * <p>
     * Шаги:
     * 1. Открыть вебсайт на странице
     * 2. Считать текст
     * 3. Подтвердить, что текст соответствует ожидаемому
     * 4. Закрыть браузер
     */
    @Test
    public void testUserSeeText() {

        String chromeDriver = "webdriver.chrome.driver";
        String pathDriver = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, pathDriver);

        String expectedResult = "IMPORTANT: Take your time! The more carefully you fill out this form (especially the language name and description), the easier it will be for us and the faster your language will show up on this page. We don't have the time to mess around with fixing your descriptions etc. Thanks for your understanding.";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement buttonSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']")
        );
        buttonSubmitNewLanguage.click();

        WebElement importantText = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li[contains(text(),'Take your time!')]")
        );

        String actualResult = importantText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    /**
     * TC_11_14 Подтвердите, что нажав на пункт меню Browse Languages, пользователь увидит таблицу со
     * следующими названиями для первого и второго столбцов:
     * Language
     * Author
     * <p>
     * Шаги:
     * 1. Открыть вебсайт на базовой странице
     * 2. Нажать на пункт меню Browse Languages
     * 3. Считать названия первого и второго столбцов таблицы
     * 3. Подтвердить, что названия соответствует ожидаемым
     * 4. Закрыть браузер
     */
    @Test
    public void testCheckText() {

        String chromeDriver = "webdriver.chrome.driver";
        String pathDriver = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, pathDriver);
        String expectedResult1 = "Language";
        String expectedResult2 = "Author";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement browseLanguages = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        );
        browseLanguages.click();

        WebElement language = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/table[@id='category']/tbody/tr/th[contains(text(),'Language')]")
        );

        String actualResult1 = language.getText();
        Assert.assertEquals(actualResult1, expectedResult1);

        WebElement author = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/table[@id='category']/tbody/tr/th[contains(text(),'Author')]")
        );
        String actualResult2 = author.getText();
        Assert.assertEquals(actualResult2, expectedResult2);
        driver.quit();
    }

    /**
     * TC_11_15 Подтвердите, что на странице по базовой ссылке  пользователь НЕ увидит новые комментарии, если нажмет на пункты меню Top List → New Comments
     * <p>
     * Шаги:
     * Придумать самостоятельно.
     */
    @Test
    public void testNewComments() {

        String chromeDriver = "webdriver.chrome.driver";
        String pathDriver = "C:\\Users\\Igor\\Documents\\Chromedriver\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, pathDriver);
        boolean expectedResult = false;

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement buttonTopLists = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/toplist.html']")
        );
        buttonTopLists.click();

        String urlTop = driver.getCurrentUrl();

        String actualResult = driver.getPageSource();

        Assert.assertEquals(actualResult, expectedResult);


    }

}


