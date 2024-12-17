package seleniumfree.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFree {

    private WebDriver driver;

    // se ejecuta primero en este bloque,antes que una prueba corra esto se ejecuta primero
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    // ejecutamos la pagina(metodo tests)
    @Test
    public void navegamosTester() {

        driver.get("https://www.freerangetesters.com");
    }

    // cerramos la pgina despues de la prueba test
    @AfterMethod
    public void dearNave() {
        if (driver != null) {
            driver.quit();
        }
    }
}
