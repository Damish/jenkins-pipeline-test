pipeline {
    agent any
    tools {
        gradle 'Gradle_8'
    }
    stages {
        stage('Build') {
            steps {
                // Build the Maven project
                sh 'gradle clean build'
            }
        }
        stage('Run Project') {
            steps {
                // Build the Maven project
                sh 'gradle bootRun'
            }
        }
    }
}
