package Toolsqa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class No4 {
    WebDriver Wd = new ChromeDriver();
    @Test

    public void OpenchromeBrowser() throws InterruptedException {
        Wd.get("https://www.toolsqa.com/automation.practice-form/");
        Wd.manage().window().maximize();
        Wd.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Deuja");

    }

}

