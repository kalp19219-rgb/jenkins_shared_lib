stage('Unit Test Maven') {
    steps {
        dir('kalp_java') {   // jo pom.xml kalp_java folder ni andar hoy to
            sh 'mvn test'
        }
    }
}
