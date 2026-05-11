pipeline{
 agent any

 stages{
  stage('Build'){
   steps{
    sh 'mvn clean install'
   }
  }
 }

 post{
  success{
   emailext(
    to: 'lathacm90@gmail.com',
    subject: 'Jenkins Build Success',
    body: 'Build completed successfully'
   )
  }
 }
}
