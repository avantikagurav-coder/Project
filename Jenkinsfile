pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}