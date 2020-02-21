package Openbrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runbrowserii {
    @Test
    public void OpenchromeBrowser() throws InterruptedException {
        //Set Chrome Browser Driver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //create chrome driver instance
        WebDriver wd = new ChromeDriver();
        //WebDriver wa = new ChromeDriver();
        //open browser
        wd.get("http:/facebook.com");
        wd.manage().window().maximize();
        wd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sami.deuja");
        wd.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Pariskrit@12");

        Thread.sleep(5000);
        wd.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();

       // WebElement login = wd.findElement(By.xpath("//*[@id=\"u_0_4\"]"));
       // login.click();
        Thread.sleep(5000);

        wd.quit();





    }
}