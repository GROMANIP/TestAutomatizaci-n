package seleniumfree.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    /*
     * Declaración de una variable estática 'driver' de tipo WebDriver
     * Esta variable va a ser compartida por todas las instancias de BasePage y sus
     * subclases
     */
    protected static WebDriver driver;
    /*
     * Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando
     * el 'driver' estático
     * WebDriverWait se usa para poner esperas explícitas en los elementos web
     */
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    /*
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el
     * driver del navegador
     */
    static {
        WebDriverManager.chromedriver().setup();

        // Inicializa la variable estática 'driver' con una instancia de ChromeDriver
        driver = new ChromeDriver();
    }

    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como
     * argumento.
     */
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    // Método estático para navegar a una URL.
    public static void navigateTo(String url) {
        driver.get(url);
    }

    // Método estático para cerrar la instancia del driver.
    public static void cerrarNavegador() {
        driver.quit();
    }

    // Método estático para cerrar la instancia del driver.
    public static void windowsMaximizar() {
        driver.manage().window().maximize();
    }

    // Encuentra y devuelve un WebElement en la página utilizando un locator XPath,
    // esperando a que esté presentente en el DOM
    private WebElement encontrar(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));

    }

    // click cuando encuentre al localizador
    public void clickElemento(String locator) {
        encontrar(locator).click();

    }

    // Ir a otro enlace
    public void irOtroEnlace(String linktext) {
        driver.findElement(By.linkText(linktext)).click();
    }

    // escribir texto en un campo de texto
    public void escribir(String locator, String keysToSend) {
        encontrar(locator).clear(); // limpiar el campo si esta yeno
        encontrar(locator).sendKeys(keysToSend); // escribir un string en el campo vacio
    }

    // metodo para seleccionar por valor en el combox de una web
    public void encontraValor(String locator, String value) {
        Select dato = new Select(encontrar(locator));
        dato.selectByValue(value);
    }

    // metodo paras seleccionar por index en el combox de pagina
    public void encontraIndex(String locator, Integer index) {
        Select dato = new Select(encontrar(locator));
        dato.selectByIndex(index);
    }

    // comparar el texto de un locator: encontrar es igual a Find
    public String textoVisualElemento(String locator) {
        return encontrar(locator).getText();
    }

    // metodo para crear lista de tipo webElement para obtener el tamaño de
    // la lista (desplegable)
    public int encontrarLista(String locator) {
        Select dato = new Select(encontrar(locator));

        List<WebElement> cantidadList = dato.getOptions();
        return cantidadList.size();
    }

    public List<String> desplegarOption(String locator) {
        Select dato = new Select(encontrar(locator));

        List<WebElement> capturaOpcion = dato.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : capturaOpcion) {
            values.add(option.getText());

        }
        return values; // Academia: $16.99 / mes â€¢ 12 productos
        // comparando con Academia: $16.99 / mes • 12 productos

    }

    // cambiar de un iframea a otro a travez de id. (quitar popup donde nos bloquea
    // lo que queremos cliquear)
    // el iframe es una ventana ensima de una ventana
    public void iFrameId(int frameId) {
        driver.switchTo().frame(frameId);

    }

    // volver al padre de los iframe
    public void iFrameWeb() {
        driver.switchTo().parentFrame();
    }
    // quitar una alerta (popup cuando aparece en la web y nos bloquea)

    public void alertaPopup() {
        driver.switchTo().alert().dismiss();
    }

    // encntrar item o producto de una pagina web y seleccionarlo deforma dinamica
    public void seleccionarItemProduc(String locator, int index) {
        List<WebElement> lista = driver.findElements(By.xpath(locator));
        lista.get(index).click();

    }

}
