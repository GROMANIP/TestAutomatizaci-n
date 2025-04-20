pipeline {
    agent any

    tools {
        gradle "Gradle"
    }

    stages {
        stage("Tareas de limpieza") {
            steps {
                git 'https://github.com/GROMANIP/TestAutomatizaci-n.git'
                bat 'gradle clean'
            }
        }

        stage("imprimo cositas") {
            steps {
                echo "Soy un Stage aparte"
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'build\reports\tests\test\index.html'
        }
    }
}