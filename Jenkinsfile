pipeline {
    options {
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
    }

    agent any

    tools {
        maven 'maven_3.9.6'
    }

    stages {
        stage('Code Compilation') {
            steps {
                echo 'Code packaging is In Progress!'
                sh 'mvn clean package'
                echo 'Code package is Completed Successfully!..'
            }
        }

	}
}