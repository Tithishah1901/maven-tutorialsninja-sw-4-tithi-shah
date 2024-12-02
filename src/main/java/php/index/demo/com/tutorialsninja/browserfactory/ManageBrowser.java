package php.index.demo.com.tutorialsninja.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import php.index.demo.com.tutorialsninja.propertyreader.PropertyReader;

import java.time.Duration;

/**
 * Create the package ‘browserfactory’ and create the class with the name ‘Managebrowser’
 * inside the ‘browserfactory’ package. And write the browser setup code inside the class
 * ‘Managebrowser’.
 */
public class ManageBrowser {
    public static WebDriver driver;

   String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");

    int implicitWait = Integer.parseInt(PropertyReader.getInstance().getProperty("implicitWait"));

    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        driver.get(baseUrl);
    }

    public void closeBrowser(){
        if(driver != null){
            driver.quit();
        }
    }
}
