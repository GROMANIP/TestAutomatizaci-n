package seleniumfree.pages;


public class PaginaCurso extends BasePage {

    private String fundamentoClick = "//a[@class='sc-hORkcV khhKqW sc-fAomSb sc-ijEwUV ibWYYr urOie'][normalize-space()='Cursos']";

    public PaginaCurso() {
        super(driver);

    }

    public void fundamentoClickCurso() throws InterruptedException{        
        clickElemento(fundamentoClick);
    }

}
