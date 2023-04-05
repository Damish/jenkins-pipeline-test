pipeline {
    agent any
    tools {
        gradle 'Gradle 8.0'
    }
    stages {
        stage('Build') {
            steps {
                // Build the Maven project
                sh 'gradle build'
            }
        }
    }
}