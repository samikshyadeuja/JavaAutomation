package Table;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Product {
    WebDriver wd = new ChromeDriver();
    /*@Test
    public void OpenchromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        Thread.sleep(5000);
        wd.manage().window().maximize();
        List<WebElement> rows = wd. findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[2]"));
        for (int i=0; i<rows.size();i++){

            String ListText = rows.get(i).getText();
            System.out.println(ListText);
       //     Thread.sleep(5000);
        }*/
    @Before
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        wd.manage().window().maximize();
    }
    @Test
    public void showProductName() throws InterruptedException {
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[2]"));
        for (int i = 0; i < rows.size(); i++) {
            String listofnames = rows.get(i).getText();
            System.out.println(listofnames);
        }
    }
    @After
    public void exit () {
        wd.quit();
    }








    }







