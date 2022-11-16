import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String url = "https://www.saucedemo.com/";

        //Set chrome driver path
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

       //start chrome browser
        WebDriver driver = new ChromeDriver();

        //Open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is:" + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is:" +driver.getCurrentUrl());

        //Get web elements or page saurce
        System.out.println("Page saurce is:" + driver.getPageSource());

        //find and enter email in username field element
        WebElement usernameField = driver.findElement(By.name("user-name"));
        usernameField.sendKeys("Akta");

        //find and enter password in password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Abc123");

        //close browser
        driver.quit();


    }
}
