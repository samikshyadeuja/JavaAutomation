package Toolsqa;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No3 {

    WebDriver Wd = new ChromeDriver();
@Test
    public void OpenchromeBrowser() throws InterruptedException {
        Wd.get("https://www.toolsqa.com/automation.practice-form/");
        Wd.manage().window().maximize();
        Wd.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Samikshya");


    }






    }

