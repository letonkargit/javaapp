node any
stage('checkout') {
   echo "checkout starting!"
   checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'cbbd9409-1160-485d-83b6-a14c9cbd2970', url: 'https://github.com/letonkargit/javaapp.git']]])
   echo "checkout complete!"
}