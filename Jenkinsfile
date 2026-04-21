pipeline {
    agent any

    tools {
        maven 'Maven'   // name you gave in Jenkins
    }

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/avantikagurav-coder/Project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

    }
}
