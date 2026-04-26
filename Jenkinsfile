pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'basicsalary', url: 'https://github.com/avantikagurav-coder/Project.git'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java code...'
                sh 'javac src/main/java/BasicSalary.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running program...'
                sh 'java -cp src/main/java BasicSalary'
            }
        }

    }

    post {
        success {
            echo 'Build Successful'
        }
        failure {
            echo 'Build Failed'
        }
    }
}
