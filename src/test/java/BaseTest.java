import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver;
    HepsiburadaPage hepsiburadaPage;

    @BeforeAll
    public void setUp(){ //start browser
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dilek\\Desktop\\Project\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.hepsiburada.com/");
        hepsiburadaPage = new HepsiburadaPage(driver);
    }
    @AfterAll
    public void tearDown(){
        driver.quit();
    }
}
