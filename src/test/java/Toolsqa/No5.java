package Toolsqa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No5 {
    WebDriver Wd = new ChromeDriver();
JavascriptExecutor js = (JavascriptExecutor) Wd;
    @Test
    public void OpenchromeBrowser() throws InterruptedException {
        Wd.get("https://www.toolsqa.com/automation.practice-form/");
        Wd.manage().window().maximize();
        js.executeScript("window.scrollBy(0,1000)");
        WebElement target = Wd.findElement(By.xpath("//*[@id=\"sex-1\"]"));

        target.click();

    }
}