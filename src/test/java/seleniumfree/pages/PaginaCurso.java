package seleniumfree.pages;


public class PaginaCurso extends BasePage {

    private String fundamentoClick = "//h3[normalize-space()='Introducción al Testing de Software']";

    public PaginaCurso() {
        super(driver);

    }

    public void fundamentoClickCurso() throws InterruptedException{        
        clickElemento(fundamentoClick);
    }

}
