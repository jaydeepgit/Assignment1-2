package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureSnapshotsSampleCode {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
					
		driver.get("https://www.hcl.com/");
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./target/page.png");
		
		FileHandler.copy(source, target);
		
		driver.quit();
		
	
		
	}

}

