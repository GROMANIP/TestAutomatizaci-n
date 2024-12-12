Feature: Validacion de navegacion por Amazon Web server-Alexa y agregar producto a carrito de compras

    @Cart
    Scenario Outline: Acceso a la pagina para seleccionar los link y agregar producto
        Given navegamos a to www.amazon.com
        And buscar el <Product>
        And pasa a la segunda pagina 3
        And selecciona el tercer elemento 2
        Then se agrega producto al carrito
        Examples:
            | Product |
            | Alexa   |

