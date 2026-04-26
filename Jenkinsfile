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
                echo "Build successful"
                // Example:
                // sh 'npm install'
            }
        }

        stage('Test') {
            steps {
                echo "Testing done"
                // Example:
                // sh 'npm test'
            }
        }
    }
}
