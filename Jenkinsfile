
pipeline{
    agent any
    stages{
        stage('Test') {
            steps{
                echo "starting build!"
                junit 'surefire-reports/*.xml'
                echo "build complete!"
            }
        }
    }
}