package Table;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class sum {

 WebDriver wd = new ChromeDriver();

 @Before
    public void  setup() throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "chromedriver");
     wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
     wd.manage().window().maximize();
 }
 @Test
    public void sum () {
     double sum = 0.00;
     double expectedsum = 91.35;
     List<WebElement> rows = wd. findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));

     for (WebElement row : rows) {
         double no = Double.parseDouble(row.getText());
         sum = sum + no;

     }
     Assert.assertEquals(sum,expectedsum, 2); //delta is 2 decimal place value

 }
 @After
    public void exist(){
     wd.quit();

 }

}
