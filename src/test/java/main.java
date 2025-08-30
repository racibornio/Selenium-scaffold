import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.assertj.core.api.Assertions;

public class main {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        String sutUrl = "http://e.pl";
        driver.get(sutUrl);

        String adresURLStrony = driver.getCurrentUrl();
        System.out.println("Strona ma adres " + adresURLStrony);

        driver.quit();
    }
}