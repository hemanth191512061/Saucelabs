import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
  
public class SampleSauceTest {
  
  public static final String USERNAME = "Hemanth1997";
  public static final String ACCESS_KEY = "9b9148a0-7dd7-486c-ba61-f6ed775006f4";
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
  
  public static void main(String[] args) throws Exception {
  
    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows XP");
    caps.setCapability("version", "51.0");
  
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.get("https://www.facebook.com");
   System.out.println( driver.getTitle());
   
  }
}