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
                bat 'gradle clean'

            }
        }
        stage ("imprimo cositas"){
            steps{
                echo "Soy un Stage aparte"
            }
        }
                 post {
             always {
                 archiveArtifacts artifacts: 'build/reports/tests/test/index.html' // O cualquier ruta relativa
                 // Si deseas ver el informe en la página de Jenkins
                 publishHTML htmlPublisher: [
                     htmlFiles: 'build/reports/tests/test/index.html',
                     reportName: 'My Report',
                     reportTitles: '' // Opcional
                 ]
             }
         }
    }
}