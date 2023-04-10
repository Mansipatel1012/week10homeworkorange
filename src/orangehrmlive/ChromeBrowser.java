package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // launch the chrome browser
        WebDriver driver = new ChromeDriver();
        // open the Url into browser
        driver.get(baseUrl);
        //maximise the browser
        driver.manage().window().maximize();
        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // get the current url
        driver.getCurrentUrl();
        System.out.println("Current Url : "+ driver.getCurrentUrl());
        // get page source
        System.out.println("page source : + " + driver.getPageSource());

        // find the username field element
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        // find the password field element
        driver.findElement(By.name("password")).sendKeys("admin123");
        // closing browser
        driver.close();
    }
}
