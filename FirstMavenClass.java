package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMavenClass {
	
	@Test
	public void test1()
	{
		//System.out.println("Test case 1");
		

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");//chromedriver path
		
		ChromeDriver dr= new ChromeDriver();//By default chromedriver class launching login inside constructor by default default cons called when obj created
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/");
		
		
		
		dr.findElement(By.xpath("//a[@id='nav_automobile']")).click();
		dr.findElement(By.xpath("//a[text()='Enter Vehicle Data']")).click();
		
		dr.findElement(By.xpath("//select[@id='make']")).click();
		dr.findElement(By.xpath("//option[@value='BMW']")).click();
		
		dr.findElement(By.xpath("//input[@id='engineperformance']")).click();
		WebElement ele=dr.findElement(By.xpath("//input[@id='engineperformance']"));
		ele.click();
       
		dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("2000");
		
		dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys(Keys.ENTER);
		
		//dr.findElement(By.xpath("//i[@class='fa fa-calendar-plus-o']")).click();
		dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender']")).click();
		//dr.findElement(By.xpath("//a[text()='2']")).click();
		//dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']")).click();
		
	}

}
