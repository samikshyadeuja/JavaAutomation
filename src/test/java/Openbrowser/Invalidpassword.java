package Openbrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidpassword {
    @Test
    public void validuserinvalidpassword() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver Wd = new ChromeDriver();
        Wd.get("http://www.gmail.com");
        Wd.manage().window().maximize();
        //Thread.sleep(5000);
        Wd.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("qatesting00567@gmail.com");
        Wd.findElement(By.xpath("//div[@id='identifierNext']")).click();
        Thread.sleep(9000);
        WebElement txtpwd = Wd.findElement(By.name("password"));
        txtpwd.sendKeys("Aeiou123");
        WebElement btnNext = Wd.findElement(By.id("passwordNext"));
        btnNext.click();
        Thread.sleep(5000);
        Wd.quit();




    }
}


