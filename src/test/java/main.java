import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.assertj.core.api.Assertions;

public class main {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        String sutUrl = "http://e.pl";
        sutUrl = "file:///C:/Users/pos/IdeaProjects/Selenium-scaffold/web/index.html";
        driver.get(sutUrl);

        String adresURLStrony = driver.getCurrentUrl();
        System.out.println("Strona ma adres " + adresURLStrony);

        String tytulStrony = driver.getTitle();
        System.out.println("Tytuł strony to " + tytulStrony);


        WebElement akapit = driver.findElement(By.tagName("p"));
        String zawartoscAkapitu = akapit.getText();
        System.out.println(zawartoscAkapitu);

        WebElement akapitZUnikatowaNazwa = driver.findElement(By.name("unikatowa nazwa znacznika"));
        System.out.println(akapitZUnikatowaNazwa.getText());

        WebElement akapitZIdentyfikatorem = driver.findElement(By.id("to_jest_identyfikator_id_znacznika"));
        System.out.println(akapitZIdentyfikatorem.getText());

        WebElement akapitZKlasa = driver.findElement(By.className("akapit_dolny"));
        System.out.println(akapitZKlasa.getText());


        driver.quit();
    }
}