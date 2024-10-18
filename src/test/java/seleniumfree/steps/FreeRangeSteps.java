package seleniumfree.steps;

import java.util.*;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import seleniumfree.pages.PaginaCurso;
import seleniumfree.pages.PaginaIntroduccion;
import seleniumfree.pages.PaginaPrincipal;
import seleniumfree.pages.RegistroLista;

public class FreeRangeSteps {

    SoftAssert sof = new SoftAssert();
    PaginaPrincipal landin = new PaginaPrincipal();
    PaginaCurso fundamento = new PaginaCurso();
    PaginaIntroduccion introduccion = new PaginaIntroduccion();
    RegistroLista registroList = new RegistroLista();

    @Given("I navigate to www.freerangetesters.com")

    public void navegarTo() {
        landin.navegadorFreeRangeTester();
    }

    // @When("I navigate to pagina y click en opcion {word}")
    // public void clickOpcion(String section){
    // landin.clickOpcionRecurso(section);
    @When("I navigate to pagina y click en opcion {word}")
    public void clickOpcion(String section) throws InterruptedException {
        landin.clickOpcionRecurso(section);

    }

    @When("I navigate plan de pagos")
    public void clickPlanPago() throws InterruptedException {
        landin.PlanPago();

    }

    @And("^(?:ingresar|select|click) Pagina fundamentos$")
    public void ingresarFundamentos() throws InterruptedException {
        fundamento.fundamentoClickCurso();
        introduccion.introduccionClick();

    }

    @Then("^(?:I|The user|You) navigate en el desplegar$")
    public void compararLista() throws InterruptedException {
        List<String> lista = registroList.registroCompare();
        // List<String> listaEsperada = new ArrayList<>();
        // String textWithSpecialCharacters = "Academia: $16.99 / mes ? 12 productos";
        // textWithSpecialCharacters.replace("â?¢", "?");
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 12 productos",
                "Academia: $176 / año • 12 productos", "Free: Gratis • 3 productos");
        // Los asesert nos brindala facilida de realizar pruebas automtizadasm de forma
        // mas sencilla
        Assert.assertEquals(listaEsperada, lista);
    }

    public void ejemplosAssert() {

        String nombreEncontrado = "jhonny";
        String nombreEsperado = "leo";

        // compararlo
        Assert.assertEquals(nombreEncontrado, nombreEsperado);

        // No compararlo
        Assert.assertNotEquals(nombreEncontrado, nombreEsperado);

        // validar que la condicion sea verdadero se usa el contains en web quiero decir
        // que es true si mi
        // variable nombreEcontrador tiene el valor de nombreEsperado.
        Assert.assertTrue(nombreEncontrado.contains(nombreEsperado));

        // validar que la condicion sea verdadero se usa el contains en web quiero decir
        // que es false si mi
        // variable nombreEcontrador tiene el valor de nombreEsperado.
        Assert.assertFalse(nombreEncontrado.contains(nombreEsperado));

        // Lo bueno de usar SoftAssert es que esto no detiene las pruebas lo realiza
        // a pesar de tener una falla a diferencia de Assert comun
        sof.assertEquals(nombreEncontrado, nombreEsperado);
        sof.assertNotEquals(nombreEncontrado, nombreEsperado);
        sof.assertTrue(nombreEncontrado.contains(nombreEsperado));
        sof.assertFalse(nombreEncontrado.contains(nombreEsperado));
        sof.assertAll();

    }

}
