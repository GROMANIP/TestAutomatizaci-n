package seleniumfree.pages;

public class PaginaIntroduccion extends BasePage {

    private String introduccionClickIntroduccion = "//h3[normalize-space()='Introducción al Testing de Software']";


    public PaginaIntroduccion(){
        super(driver);
    }
    public void introduccionClick() throws InterruptedException{
    clickElemento(introduccionClickIntroduccion);
    }
    
}
