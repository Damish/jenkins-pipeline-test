pipeline {
    agent any
    tools {
        gradle 'Gradle_8'
    }
    stages {
        stage('Build') {
            steps {
                sh 'gradle clean build'
            }
        }
        stage('Test') {
            steps {
                sh 'gradle test'
            }
        }
        stage('Run Project') {
            steps {
                sh 'gradle bootRun'
            }
        }
    }
}
