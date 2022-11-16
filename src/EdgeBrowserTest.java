import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String url = "https://www.saucedemo.com/";

        //set Edge drive path
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //start edge browser
        WebDriver driver = new EdgeDriver();

        //Open Url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is:" + driver.getTitle());

        //Get Current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web element or page saurce
        System.out.println("Saurce page is:" + driver.getPageSource());

        //find and enter email in username field element
        WebElement usernameField = driver.findElement(By.name("user-name"));
        usernameField.sendKeys("Admin");

        //find and enter password in password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Abc120");

        //close browser
        driver.quit();

    }
}
