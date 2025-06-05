import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.assertj.core.api.Assertions;

public class EPL {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String sutUrl = "http://e.pl";
        driver.get(sutUrl);

        String adresURLStrony = driver.getCurrentUrl();
        System.out.println("Strona ma adres " + adresURLStrony);

        String tytulStrony = driver.getTitle();
        System.out.println("Tytuł strony to " + tytulStrony);


        driver.quit();
    }

}
