package seleniumfree.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import seleniumfree.pages.BasePage;

public class Hooks extends BasePage {

    public Hooks() {
        super(driver);
    }

    @After
    public void capturaError(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.log("Se encontro un error en tu test pruebas automatizadas");
            final byte[] captura = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(captura, "image/png", "Captura de Error steps");

        }
    }
}
