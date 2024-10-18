package seleniumfree.pages;

import java.util.List;

public class RegistroLista extends BasePage {

    private String registro = "//select[@id='cart_cart_item_attributes_plan_with_interval']";

    public RegistroLista() {
        super(driver);
    }

    public List<String> registroCompare() {
        return desplegarOption(registro);
    }

}
