package DIFRAME;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.get("https://omayo.blogspot.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // implicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5)); //explicit wait
//		WebElement frame = driver.findElement(By.id("frm1"));                         //frame handles
//		driver.switchTo().frame(frame);
//		WebElement enter = driver.findElement(By.id("course"));
//		Select select=new Select(enter);                                           //whenever their dropdown text to choose eg:state or country to be choosen within alist
//		select.selectByVisibleText("Java");
//		driver.findElement(By.xpath("//option[@value=\"ec\"]")).click();
//		driver.findElement(By.xpath("//h2[@class=\"title\"]")).click();
		
//		driver.findElement(By.id("alert1")).click();                                     //Alert handles
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
//		WebElement blog = driver.findElement(By.id("blogsmenu"));                         //mouse action
//		Actions action=new Actions(driver);
//		action.moveToElement(blog).perform();
		
//		WebElement name = driver.findElement(By.xpath("//input[@name=\"userid\"]"));
//		Actions action=new Actions(driver);
//		action.moveToElement(name).click().sendKeys("sahana").perform();
//		
//		WebElement name1 = driver.findElement(By.xpath("//input[@name=\"pswrd\"]"));
//		Actions action1=new Actions(driver);
//		action.moveToElement(name1).click().sendKeys("Sana@12").build().perform();
//		
//		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
//		Alert alert = driver.switchTo().alert();
//System.out.println(alert.getText());
////	alert.accept();
//      WebElement name = driver.findElement(By.linkText("SeleniumTutorial"));
//Actions action=new Actions(driver);
//        action.moveToElement(name).contextClick().perform();                         //right click or context click using mouse action

//	WebElement name1 = driver.findElement(By.id("testdoubleclick"));
//		action.moveToElement(name1).doubleClick().perform();
//		driver.findElement(By.linkText("Flipkart")).click();                           //double click using mouse action
		
		
		driver.findElement(By.xpath("//button[@class=\"dropbtn\"]")).click();
		//driver.findElement(By.linkText("Facebook")).click();   //implicit statement
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook"))).click(); //explicit wait statement
	}

}
