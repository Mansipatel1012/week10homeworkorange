package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {

    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get title of the page
        System.out.println(driver.getTitle());
        // find the username field element
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        // find the password field element
        driver.findElement(By.name("password")).sendKeys("admin123");
        // closing browser
        driver.close();
    }
}


