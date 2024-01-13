import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.assertj.core.api.Assertions;

public class EPL {


    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        String sutUrl = "http://e.pl";
        driver.get(sutUrl);

        String adresURLStrony = driver.getCurrentUrl();
        System.out.println("Strona ma adres " + adresURLStrony);

        String tytulStrony = driver.getTitle();
        System.out.println("Tytuł strony to " + tytulStrony);


        WebElement przyciskStronaGlowna = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[4]/nobr/a/img"));
        przyciskStronaGlowna.click();
        String expectedUrl = "http://e.pl/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertThat(actualUrl).as("Błąd asercji - URL po kliknięciu nie jest zgodny z oczekiwanym").isEqualTo(expectedUrl);


        WebElement przyciskEmail = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[8]/nobr/a/img"));
        przyciskEmail.click();
        expectedUrl = "http://e.pl/email/";
        actualUrl = driver.getCurrentUrl();
        Assertions.assertThat(actualUrl).as("Błąd asercji - URL po kliknięciu nie jest zgodny z oczekiwanym").isEqualTo(expectedUrl);

        WebElement przyciskDomeny = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[12]/nobr/a/img"));
        przyciskDomeny.click();
        expectedUrl = "http://e.pl/domain.html";
        actualUrl = driver.getCurrentUrl();
        Assertions.assertThat(actualUrl).as("Błąd asercji - URL po kliknięciu nie jest zgodny z oczekiwanym").isEqualTo(expectedUrl);

        WebElement przyciskHosting = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[16]/nobr/a/img"));
        przyciskHosting.click();
        expectedUrl = "http://e.pl/serwery_www_index/";
        actualUrl = driver.getCurrentUrl();
        Assertions.assertThat(actualUrl).as("Błąd asercji - URL po kliknięciu nie jest zgodny z oczekiwanym").isEqualTo(expectedUrl);


        driver.quit();
    }

}
