pipeline {
  
  agent any
   environment{
      PATH="C:/Users/shahid/Downloads/apache-maven-3.6.3-bin.zip/apache-maven-3.6.3/bin:$PATH"
  }
  
  stages {
    
   stage('code checkout') {
          steps {
           git "https://github.com/shahid4206/MAccounts.git"
          }
          } 
          
    stage('compile') {
      
      steps {
        echo 'building the appication...'
        withMaven(maven : 'maven_3.6.3'){
        bat 'mvn clean'
        }
      }
    }
    stage('install') {
      
      steps {
        echo 'building the appication...'
        withMaven(maven : 'maven_3.6.3'){
        bat 'mvn install '
        }
      }
    }
   stage('test') {
      
      steps {
        echo 'building the appication...'
        withMaven(maven : 'maven_3.6.3'){
        bat 'mvn test'
        }
      }
    }
   
  }
}
