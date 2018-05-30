pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /home/diego/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -f jenkins1/pom.xml -B -DskipTests clean package' 
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn -f jenkins1/pom.xml test' 
            }
            post {
                always {
                    junit 'jenkins1/target/surefire-reports/*.xml' 
                }
            }
        }
    }
}
