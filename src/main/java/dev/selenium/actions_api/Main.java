import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.RETURN;


public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://ya.ru/");
        driver.getTitle();

        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Запрос']"));
        input.click();
        WebElement submitButton = driver.findElement(By.xpath("//button"));

        input.sendKeys("Selenium");
     

    }
}
