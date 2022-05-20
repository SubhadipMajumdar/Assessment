import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.urbanladder.com/");
        Actions a=new Actions(driver);
        a.moveToElement (driver.findElement(By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[1]/a"))).click().perform();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/main/section[2]/div/a[1]/div[3]/h3")).click();
   
		
	}

}
