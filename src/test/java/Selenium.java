import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Dimension;


public class Selenium {

    private WebDriver driver;

    @BeforeEach
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("128.0.6613.85");
        driver = new ChromeDriver(options);
    }



    @Test
    void managerDiriver(){
       driver.manage().window();
    }

    @Test
    void openWithDimantions(){
        Dimension dimension = new Dimension(900,600);
        driver.manage().window().setSize(dimension);
    }


}
