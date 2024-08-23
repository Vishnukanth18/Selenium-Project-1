package mpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.findElement(By.linkText("https://tutorialsninja.com/demo")).click();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("king789@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("king@kk");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Account']")).isDisplayed());
		driver.findElement(By.name("search")).sendKeys("tab");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("Samsung Galaxy Tab 10.1")).click();
		WebElement quantity = driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("1");
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		WebElement successstatus = driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
		System.out.println(successstatus.getText());
		System.out.println(successstatus.isDisplayed());
		driver.findElement(By.xpath("//*[text()='Shopping Cart']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.findElement(By.id("button-payment-address")).click();
		driver.findElement(By.id("button-confirm")).click();
		driver.findElement(By.xpath("//div[@class='content']/h1[text()='your order has placed!']"));
	}

}
