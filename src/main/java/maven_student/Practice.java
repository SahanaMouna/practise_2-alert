package maven_student;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magento.softwaretestingboard.com/");
			driver.findElement(By.linkText("Nora Practice Tank ")).click();
			//driver.findElement(By.id("alert1")).click();
			//driver.findElement(By.name("pswrd")).sendKeys("12345");
//			driver.findElement(By.partialLinkText("popup window")).click();
			driver.findElement(By.xpath("//span[text()=\"Shop New Yoga\"]")).click();
//			
//			Set<String> win = driver.getWindowHandles();
//			Iterator<String> itr = win.iterator();
//			String parent = itr.next();
//			String child = itr.next();
//			driver.switchTo().window(child);
//			driver.switchTo().window(parent);
			Actions action=new Actions(driver);
			WebElement color = driver.findElement(By.xpath("//div[@class=\"swatch-option color\"][2]"));
			action.moveToElement(color).click().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@class=\"product-image-photo\"])[5]")).click();
			driver.findElement(By.xpath("//div[@class=\"swatch-option text\"][3]")).click();
			Thread.sleep(3000);
		     driver.findElement(By.xpath("//div[@class=\"swatch-option color\"][3]")).click();
			driver.findElement(By.xpath("//span[text()=\"Add to Cart\"]")).click();
			Thread.sleep(3000);
			 driver.findElement(By.xpath("//span[@class=\"counter qty\"]")).click();
		driver.findElement(By.cssSelector("button[class=\"action primary checkout\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"customer-email\"]")).sendKeys("sad123@gmail.com");
driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("sana");
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("gowda");
driver.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("amazon");
driver.findElement(By.xpath("//input[@name=\"street[0]\"]")).sendKeys("Huskur ");
driver.findElement(By.xpath("//input[@name=\"street[1]\"]")).sendKeys(" gate");
driver.findElement(By.xpath("//input[@name=\"street[2]\"]")).sendKeys("opp vimalaya hospital");
driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Banglore");
//Actions action=new Actions(driver);
WebElement enter = driver.findElement(By.id("B03OEUK"));
Select select=new Select(enter);
select.selectByVisibleText("Alaska");
//action.moveToElement(enter).click().perform();

driver.findElement(By.xpath("//input[@name=\"postcode\"]")).sendKeys("560100");
WebElement count = driver.findElement(By.xpath("//select[@name=\"country_id\"]"));
Select selct=new Select(count);
selct.selectByVisibleText("India");
driver.findElement(By.xpath("//input[@name=\"telephone\"]")).sendKeys("9876543210");

driver.findElement(By.cssSelector("button[class=\"button action continue primary\"]")).click();
driver.findElement(By.xpath("//button[@class=\"action primary checkout\"]")).click();
//			Thread.sleep(2000);
//			driver.quit();
		}

	}


