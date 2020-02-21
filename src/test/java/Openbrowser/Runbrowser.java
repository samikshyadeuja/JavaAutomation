package Openbrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runbrowser {
    WebDriver Wd = new ChromeDriver();

    @Test
    public void openchromebrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        Wd.get("https:/www.gmail.com");
        Wd.manage().window().maximize();
        WebElement emailElement = Wd.findElement(By.name("identifier"));
        emailElement.sendKeys("qatesting00567@gmail.com");
        Wd.findElement(By.xpath("//div[@id='identifierNext']")).click();
        Thread.sleep(9000);

        WebElement txtpwd = Wd.findElement(By.name("password"));
        txtpwd.sendKeys("Test@123");
        WebElement btnNext = Wd.findElement(By.id("passwordNext"));
        btnNext.click();
        Thread.sleep(5000);
        Wd.quit();
    }
}
