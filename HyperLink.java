package november18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
        String destiny = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
        System.out.println("destiny: "+destiny);
        String verify = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
        boolean contains = verify.contains("error");
        System.out.println("verify: "+contains);
        driver.findElement(By.linkText("(Interact with same link name)")).click();
        driver.navigate().back();
        
        
	}

}
