pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'basicsalary', url: 'https://github.com/avantikagurav-coder/Project.git'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java code...'
                sh 'javac src/main/BasicSalary.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running program...'
                sh 'java -cp src/main BasicSalary'
            }
        }
    }
}
