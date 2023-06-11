import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium {
  @Test
  public void main() {
    System.out.println("Hello world!");
    System.out.println("Hello world!");
    System.out.println(new File(System.getProperty("user.dir") + "\\drivers\\chromedriver.exe"));
    System.setProperty("webdriver.chrome.driver",
        new File(System.getProperty("user.dir") + "\\drivrs\\chromedriver.exe").toString());
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(options);
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.close();
  }
}
