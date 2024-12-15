def gv
pipeline{
    agent any
    parameters{
        string(name: VERSION, defaultValue: '1.0', description: 'Version to deploy on production')
        choice(name: VERSION, choices: ['1.0.1', '1.0.1', '1.0.2'], description: 'Version to deploy on production')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Param to make a test stage')
    }
    tools{
        maven 'Maven'
    }
    environment{
        NEW_VERSION = "1.3.0"
        SERVER_CREDENTIALS = "ssh-jenkins"
    }
    stages {
        stage('init'){
            steps{
                script{
                    gv = load 'script.groovy'
                }
            }
        }
        stage('build'){
            steps{
                echo 'This is the building stage...'
                echo "Building version: ${NEW_VERSION}"
                echo 'Building version: ${NEW_VERSION}'
            }
        }
        stage('test'){
            when {
                expression {
                    BRANCH_NAME == 'dev'
                    params.executeTests == true
                }
            }
            steps {
                
            }
        }
        stage('deploy'){
            // withCredentials([usernamePassword(credentialsId: 'amazon', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
            //     // available as an env variable, but will be masked if you try to print it out any which way
            //     // note: single quotes prevent Groovy interpolation; expansion is by Bourne Shell, which is what you want
            //     sh 'echo $PASSWORD'
            //     // also available as a Groovy variable
            //     echo USERNAME
            //     // or inside double quotes for string interpolation
            //     echo "username is $USERNAME"
            //     }
            steps {
                script{
                    gv.deployApp()
                }
            }
        }
    }
}
