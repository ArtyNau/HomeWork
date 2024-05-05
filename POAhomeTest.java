import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.poahome.HomePage;
import com.poahome.ShoppingCartEmptyPage;
import com.poahome.TopPart;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

public class POAhomeTest {
    
    String actual;
    String expected;

    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        System.out.println("@BeforeAll executed");
    }
    
    @Test 
    public void homeTest() {
        TopPart.clickshoppingCart();
        assertEquals(ShoppingCartEmptyPage.getLable(),"Your shopping cart is empty!");
        ShoppingCartEmptyPage.clickButton();
        actual = driver.getCurrentUrl();
        expected = HomePage.homePage;
        assertEquals(expected,actual);
    }


}
