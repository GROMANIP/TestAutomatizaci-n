package seleniumfree.steps;

import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import seleniumfree.pages.AmazonWebServer;

public class TestCarritoAws {
    AmazonWebServer aws = new AmazonWebServer();

    @Given("navegamos a to www.amazon.com")
    public void navegarAmazon() {
        aws.navegarAws();
    }

    @And("buscar el {word}")
    public void escribirOpcionya(String criteria) {
        aws.escribirOpcion(criteria);
        aws.buscarAlexa();

    }

    @And("^pasa a la segunda pagina (.+)$")
    public void pasarSiguientePagina(String pageNumber) {
        aws.linkOtraPagina(pageNumber);

    }

    //@And("^selecciona el tercer elemento (.+)$")
    @And("^selecciona el tercer elemento (.+)$")
    public void elegirItem(int index) {
        aws.elegirProducto(index);

    }

    @Then("se agrega producto al carrito")
    public void agregarAcarrito() {
        aws.agregarCarrito();
        Assert.assertEquals("Agregado al carrito", aws.validarTexto());

    }

}
