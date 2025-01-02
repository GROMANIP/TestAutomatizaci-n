pipeline{
    //En que agente esto va estar corriendo
    agent any
    //que herramienta vamos estar instalando al principio
    tools{
        gradle "Gradle"
    }
    stages{
        stage("Tareas de limpieza"){
            steps{
                //agarrrar el repo en el que esta el codigo que necesitamos correr
                git 'https://github.com/GROMANIP/TestAutomatizaci-n.git'
                //Ejecutar las tareas clean de Gladle
                sh './gradlew clean'

            }
        }
        stage ("imprimo cositas"){
            steps{
                echo "Soy un Stage aparte"
            }
        }
    }
}