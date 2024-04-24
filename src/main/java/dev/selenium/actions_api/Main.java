package dev.selenium.actions_api;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // 1. Открытие поисковой системы гугл
        driver.get("https://google.com/");
        // 2. Полный экран
        driver.manage().window().maximize();
        // 3. Поиск поискового поля и клик
        WebElement input = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        input.click();
        // 4. Внесение значения и нажатие на ENTER
        input.sendKeys("яндекс маркет");
        input.sendKeys(Keys.ENTER);
        // Неявное ожидание
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // 5. Поиск первого результата выдачи и клик для перехода на Яндекс Маркет
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]//span[@jscontroller='msmzHf']")).click();
        // Неявное ожидание
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // 6. Поиск и клик раздела Маркета "Электроника", неявное ожидание
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/noindex/div/div/div/nav/div/ul[1]/li[8]/div/div/a/span")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // 7. Поиск и клик раздела Маркета "Смартфоны и гаджеты", неявное ожидание
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // 8. Поиск и клик раздел Маркета "Смартфоны", неявное ожидание
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // 9. Поиск поля ввода для максимальной цены, внесение значения "20000", неявное ожидание
        WebElement inputmaxprice = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div/div/div[5]/div/div/div/div/div/aside/div/div[3]/div/div/div/div/div[1]/div/fieldset/div/div/div/div[2]/span/div/div/input"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        inputmaxprice.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        inputmaxprice.sendKeys("20000");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // 10. Заполнение чек-боксов диагонали экрана от 3,5" и выше
        WebElement checkbox3inch = driver.findElement(By.xpath("//*[@id=\"/content/page/fancyPage/cms/4/SearchFilters-SearchFilters\"]/div/div/div/div/div[9]/div/fieldset/div/div/div[1]/div/div/div[1]/label/span/span[1]/span"));
        checkbox3inch.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement checkbox5inch = driver.findElement(By.xpath("//*[@id=\"/content/page/fancyPage/cms/4/SearchFilters-SearchFilters\"]/div/div/div/div/div[9]/div/fieldset/div/div/div[1]/div/div/div[2]/label/span/span[1]/span"));
        checkbox5inch.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement checkbox55inch = driver.findElement(By.xpath("//*[@id=\"/content/page/fancyPage/cms/4/SearchFilters-SearchFilters\"]/div/div/div/div/div[9]/div/fieldset/div/div/div[1]/div/div/div[3]/label/span/span[1]/span"));
        checkbox55inch.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement checkbox6inch = driver.findElement(By.xpath("//*[@id=\"/content/page/fancyPage/cms/4/SearchFilters-SearchFilters\"]/div/div/div/div/div[9]/div/fieldset/div/div/div[1]/div/div/div[4]/label/span/span[1]/span"));
        checkbox6inch.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement checkbox65inch = driver.findElement(By.xpath("//*[@id=\"/content/page/fancyPage/cms/4/SearchFilters-SearchFilters\"]/div/div/div/div/div[9]/div/fieldset/div/div/div[1]/div/div/div[5]/label/span/span[1]/span"));
        checkbox65inch.click();
        // Неявное ожидание
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // 11. Заполнение чек-боксов всех предложенных по умолчанию популярных производителей
        WebElement apple = driver.findElement(By.cssSelector("#\\/content\\/page\\/fancyPage\\/cms\\/4\\/SearchFilters-SearchFilters > div > div > div > div > div:nth-child(5) > div > fieldset > div > div > div._1K33w > div > div > div:nth-child(1) > label > span > span._30_gj"));
        apple.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement xiaomi = driver.findElement(By.cssSelector("#\\/content\\/page\\/fancyPage\\/cms\\/4\\/SearchFilters-SearchFilters > div > div > div > div > div:nth-child(5) > div > fieldset > div > div > div._1K33w > div > div > div:nth-child(2) > label > span > span._30_gj"));
        xiaomi.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement samsung = driver.findElement(By.cssSelector("#\\/content\\/page\\/fancyPage\\/cms\\/4\\/SearchFilters-SearchFilters > div > div > div > div > div:nth-child(5) > div > fieldset > div > div > div._1K33w > div > div > div:nth-child(3) > label > span > span._30_gj"));
        samsung.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement realme = driver.findElement(By.cssSelector("#\\/content\\/page\\/fancyPage\\/cms\\/4\\/SearchFilters-SearchFilters > div > div > div > div > div:nth-child(5) > div > fieldset > div > div > div._1K33w > div > div > div:nth-child(4) > label > span > span._30_gj"));
        realme.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement honor = driver.findElement(By.cssSelector("#\\/content\\/page\\/fancyPage\\/cms\\/4\\/SearchFilters-SearchFilters > div > div > div > div > div:nth-child(5) > div > fieldset > div > div > div._1K33w > div > div > div:nth-child(5) > label > span > span._30_gj"));
        honor.click();
        // Неявное ожидание
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // 12. Поиск названия как элемента первой поисковой выдачи, объявление переменной со значением текста искомого элемента, вывод в консоль его значения
        WebElement firstresult = driver.findElement(By.xpath("//*[@role='link'][@class='G_TNq _2SUA6 _33utW _13aK2 h29Q2 _1A5yJ']"));
        String result = firstresult.getText();
        System.out.println(result);
        // 13. Изменение фильтра поиска на "Высокий рейтинг"
        WebElement filter = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div/div/div[5]/div/div/div/div/div/div/div/div[2]/div/div/div/div[1]/div/div/noindex/div/button[4]"));
        filter.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // 14. Поиск поискового поля, клик, внесение значения (текста) переменной первого результата, поиск и клик по первому результату выдачи
        WebElement searchinputmarket = driver.findElement(By.xpath("//*[@id=\"header-search\"]"));
        searchinputmarket.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        searchinputmarket.sendKeys(result);
        searchinputmarket.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div/div[1]/div/div/div[5]/div/div/div/div/div/div/div/div[5]/div/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/article/div/div/div/div/div[5]/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 15. Поиск элемента с цифровым значением рейтинга, вывод его в консоль
        WebElement score = driver.findElement(By.xpath("//span[@class='_24dJu']"));
        String equalsscore = score.getAttribute("innerText");
        System.out.println(equalsscore);
        // 16. Закрытие браузера
        driver.quit();
    }

}

