package seleniumfree.pages;

public class PaginaPrincipal extends BasePage {

    // le quitamo el texto marcado y lo reemplazamos por el salgo de pagina %s

    private String recursoClick = "//a[normalize-space()='Curso' and @href]";
    private String planPagoClick = "//a[normalize-space()='Elegir Plan' and @href]";

    public PaginaPrincipal() {
        super(driver);

    }

    // Metodo para navegar ..aquirimos el metodo de la clase padre basePage
    public void navegadorFreeRangeTester() {
        navigateTo("https://www.freerangetesters.com");

    }

    public void clickOpcionRecurso(String section) throws InterruptedException {
        // Reemplaza el marcador de posicion en recursoClick con nombre
        try {
            String XpathOpcion = String.format(recursoClick, section);
            clickElemento(XpathOpcion);

        } catch (Exception e) {
            System.out.println("No encuentra el LOCATOR ********");
            e.printStackTrace();

        }

        // TODO: handle exception
    }

    public void PlanPago() throws InterruptedException {
        clickElemento(planPagoClick);

    }

}
