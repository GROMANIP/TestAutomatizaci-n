package seleniumfree.pages;

public class PaginaIntroduccion extends BasePage {

    private String introduccionClickIntroduccion = "//h3[normalize-space()='Fundamentos del Testing']";


    public PaginaIntroduccion(){
        super(driver);
    }
    public void introduccionClick() throws InterruptedException{
    clickElemento(introduccionClickIntroduccion);
    }
    
}
