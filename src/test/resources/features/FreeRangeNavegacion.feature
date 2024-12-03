@Navegar
Feature: Navigation bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

    #La regla tiene que ir junto a los escenarios
    Rule: regla para probar nuevo

        Background: Vamor a navegar y acceder libremente a la pagina Restesting
            Given I navigate to www.freerangetesters.com

        #TAGS es un identificador ,cada vez que usemos este identificador estaremos diciendo
        #que hagamos algo con eso, en fichur definimos un tags con @

        Scenario Outline: I can access the subpages through the navigation bar
            #Given I navigate to www.freerangetesters.com
            When  I navigate to pagina y click en opcion <section>
            Examples:
                | section   |
                | Cursos    |
                | Recursos  |
                | Blog      |
                | Programas |
                | Mentorias |
                | Udemy     |
        @Course
        Scenario: Acceso al fundamento de testing
            #Given I navigate to www.freerangetesters.com
            When  I navigate to pagina y click en opcion Cursos
            And ingresar Pagina fundamentos

        @Plans @Curso
        Scenario: Acceso al plan de pagos
            #Given I navigate to www.freerangetesters.com
            When  I navigate plan de pagos
            Then The user navigate en el desplegar

    ##Uso de expresiones regulares: ^(?:The|I|You) es una de las opciones
    ## agregar ^ al inicio de los steps
    ## agregar $ al final de cada steps

    #gradle test "-Dpropiedad.del.sistema='@Plans'"
    #gradle test -Dcucumber.filter.tags="@Cart"
    #.\gradlew test -Dcucumber.filter.tags="@Cart"

