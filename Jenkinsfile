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
