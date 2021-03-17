package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragDrop {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Velocity\\Java setup\\Slenium standalone file\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0,300)"); 
		Thread.sleep(4000);
		
		driver.switchTo().frame(0);
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(ele1, ele2).perform();
	
		}
	
	
}
