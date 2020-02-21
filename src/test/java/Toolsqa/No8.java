package Toolsqa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class No8 {
    WebDriver Wd = new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor) Wd;

    @Test
    public void OpenchromeBrowser() throws InterruptedException {
        Wd.get("https://www.toolsqa.com/automation.practice-form/");
        Wd.manage().window().maximize();
        js.executeScript("window.scrollBy(0,1000)");

        List <WebElement> target = Wd.findElements(By.xpath("//*[@id=\"profession-0\"]"));
        for(int i=0;i<target.size();i++){
            String button = target.get(i).getText();
            System.out.println(button);
            target.get(i).click();







        }

    }
}