package Toolsqa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Practiceform {
   WebDriver wd = new ChromeDriver();

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        wd.get("https://www.toolsqa.com/automation.practice-form/");
        wd.manage().window().maximize();
    }

        @Test
    public void linktest () throws InterruptedException {
       WebElement text = wd.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[2]/a/strong"));

        String expectedstring = "Partial Link Test";
            Assert.assertEquals(expectedstring,text.getText());


        }





}
