package seleniumfree.pages;


public class PaginaCurso extends BasePage {

    private String fundamentoClick = "//a[normalize-space()='Fundamentos del Testing' and @href]";

    public PaginaCurso() {
        super(driver);

    }

    public void fundamentoClickCurso() throws InterruptedException{        
        clickElemento(fundamentoClick);
    }

}
