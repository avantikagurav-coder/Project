node {

    stage('Clean') {
        deleteDir()   // wipes old workspace completely
    }

    stage('Clone Code') {
        checkout([
            $class: 'GitSCM',
            branches: [[name: '*/main']],   
            userRemoteConfigs: [[
                url: 'https://github.com/avantikagurav-coder/Project.git'
            ]]
        ])
    }

    stage('Build') {
        echo "Build successful"
    }

    stage('Test') {
        echo "Testing done"
    }
}
