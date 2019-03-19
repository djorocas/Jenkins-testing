pipeline {
    // agent { label 'default' }

    stages {
        stage('Test') {
            steps {
                echo 'Hello world'
            }
        }
    }
}
