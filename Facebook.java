package Week2.day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("seenu");
		driver.findElement(By.name("lastname")).sendKeys("s");
		driver.findElement(By.name("reg_email__")).sendKeys("sinu861@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("jeeva@807");
		WebElement date = driver.findElement(By.id("day"));
		Select d1=new Select(date);
		d1.selectByValue("22");
		WebElement month = driver.findElement(By.id("month"));
		Select d2=new Select(month);
		d2.selectByValue("5");
		WebElement year = driver.findElement(By.id("year"));
		Select d3=new Select(year);
		d3.selectByValue("2000");
	driver.findElement(By.xpath("//input[@value='2']")).click();		
		//driver.close();
		
	}

}
