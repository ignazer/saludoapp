pipeline {
    agent any
    tools {
        maven '3.9.10'
        jdk 'JDK11'
    }
    stages {
        stage('Clonar') {
            steps {
                git 'https://github.com/ignazer/saludoapp.git'
            }
        }
        stage('Compilar') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Probar') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Empaquetar') {
            steps {
                sh 'mvn package'
            }
        }
    }
    post {
        success {
            echo "El build fue exitoso"
        }
        failure {
            echo "El build falló"
        }
    }
}