package Week2.day;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("jeeva807@gmail.com");
driver.findElement(By.id("pass")).sendKeys("jeeva@807");
driver.findElement(By.name("login")).click();



}
}
