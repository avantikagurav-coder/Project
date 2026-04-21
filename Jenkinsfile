pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/avantikagurav-coder/Project.git'
            }
        }

        stage('Build') {
            steps {
                echo "Project build successful"
            }
        }

        stage('Test') {
            steps {
                echo "No tests configured"
            }
        }

    }
}