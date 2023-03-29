import java.sql.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahaj/Downloads/chromedriver_win32/chromedriver.exe");
	
		// --remote-allow-origin=*
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origin=*");
		//ChromeDriver driver= new ChromeDriver(options);
		
		
		//Firefox driver- gecko driver
		System.setProperty("webdriver.g.driver", "C:/Users/mahaj/Downloads/geckodriver-v0.32.2-win-aarch64/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		// Microsoft Edge Driver
		System.setProperty("webdriver.edge.driver", "C:/Users/mahaj/Downloads/edgedriver_win64/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
