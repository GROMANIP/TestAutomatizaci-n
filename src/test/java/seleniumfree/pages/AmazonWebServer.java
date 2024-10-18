package seleniumfree.pages;

public class AmazonWebServer extends BasePage {

    private String id = "//input[@id='twotabsearchtextbox']";
    private String buscar = "//input[@id='nav-search-submit-button']";
    private String producto = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]";
    private String agregarCarrito = "//input[@id='add-to-cart-button']";
    private String ValidarTextoCart = "//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']";

    public AmazonWebServer() {
        super(driver);
    }

    public void navegarAws() {
        navigateTo("https://www.amazon.com");
        driver.manage().window().maximize();

    }

    public void escribirOpcion(String criteria) {
        escribir(id, criteria);

    }

    public void buscarAlexa() {
        clickElemento(buscar);

    }

    public void linkOtraPagina(String pageNumber) {
        irOtroEnlace(pageNumber);
    }

    public void elegirProducto(int index) {
        clickElemento(producto);

    }

    public void agregarCarrito() {
        clickElemento(agregarCarrito);

    }

    public String validarTexto() {
        return textoVisualElemento(ValidarTextoCart);
    }

}
