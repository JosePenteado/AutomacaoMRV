package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
	
	protected static WebDriver driver;
	
	
	public void abrirNavegador(String site) {
		
		
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			
			
			
			
		}catch (Exception e) {
			System.err.print(" ------ erro ao abrir navegador ----- " +e.getMessage());
			System.err.print(" ---------- causa erro ---------- " +e.getCause());
			
			
		}
	}

	
	

}
