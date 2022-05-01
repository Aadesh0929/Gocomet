package qsp;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstProject {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.xpath("//a[.='Phones']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='Samsung galaxy s6']")).click();
		String details = driver.findElement(By.xpath("//strong[.='Product description']/../p")).getText();
		System.out.println(details);
		driver.findElement(By.xpath("//a[.='Add to cart']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.findElement(By.id("cartur")).click();
		driver.findElement(By.xpath("//button[.='Place Order']")).click();
		driver.findElement(By.id("name")).sendKeys("Aadesh");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Mumbai");
		driver.findElement(By.id("card")).sendKeys("87878787");
		driver.findElement(By.id("month")).sendKeys("May");
		driver.findElement(By.id("year")).sendKeys("2022");
		driver.findElement(By.xpath("//button[.='Purchase']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
