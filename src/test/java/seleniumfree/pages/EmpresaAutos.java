package seleniumfree.pages;

import org.openqa.selenium.WebDriver;

public class EmpresaAutos extends BasePage {

    public EmpresaAutos(WebDriver driver) {
        super(driver);
    }

    public void accesoPagina(){
    clickElemento("www.trademe.co.nz");

    }
    
    

}
