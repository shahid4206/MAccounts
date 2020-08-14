pipeline {
  
  agent any
  
  stages {
    
   /* stage("code checkout) {
          steps {
           git "https://github.com/teja996/Devops-clgproject-.git"
          }
          } */
          
    stage("compile") {
      
      steps {
        echo 'building the appication...'
        withMaven(maven : 'maven_3.6.3'){
        bat 'mvn clean'
        }
      }
    }
   
          
    stage("install") {
      
      steps {
        echo 'testing the appication...'
        withMaven(maven : 'maven_3.6.3'){
        bat 'mvn install'
        }
      }
    }
          stage("test") {
      
      steps {
        echo 'testing the appication...'
        withMaven(maven : 'maven_3.6.3'){
        bat 'mvn test'
        }
      }
    }
  }
}
