import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Hello world!");
    System.out.println(new File(System.getProperty("user.dir") + "\\drivers\\chromedriver.exe"));
    System.setProperty("webdriver.chrome.driver",
        new File(System.getProperty("user.dir") + "\\drivers\\chromedriver.exe").toString());
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(options);
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.close();
  }
}
