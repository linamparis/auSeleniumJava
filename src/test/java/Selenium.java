import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {

    @Test
    void manageDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments ("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);







    }

}
