
pipeline{
    agent any
    stages{
        stage('checkout') {
            steps{
                echo "checkout starting!"
                checkout([$class: 'GitSCM', branches: [[name: '**']], extensions: [], userRemoteConfigs: [[credentialsId: 'cbbd9409-1160-485d-83b6-a14c9cbd2970', url: 'https://github.com/letonkargit/javaapp.git']]])
                echo "checkout complete!"
            }
        }
    }
}