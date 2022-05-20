import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(); driver.get("https://www.urbanladder.com/");
        Actions a=new Actions (driver);
        a.moveToElement(driver.findElement(By.xpath("//li[@class='topnav_item storageunit']"))).build().perform();
        Thread.sleep (2000);
        driver.findElement(By.xpath("//a[@href='/bookshelf?src=g_topnav_storage_living-storage_bookshelves']")).click();
      driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[1]/div/div[5]/a/div[1]")).click();
driver.findElement(By.xpath("//*[@id=\"spree_user_email\"]"));
	}
	
}
