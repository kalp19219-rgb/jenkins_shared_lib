stage('Unit Test Maven') {
    steps {
            sh 'mvn test'
    }
}
