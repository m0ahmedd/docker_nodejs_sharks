pipeline{
    agent any
    enviroment{
        NEW_VERSION = "1.3.0"
        SERVER_CREDENTIALS = "ssh-jenkins"
    }
    stages {
        stage('build'){
            steps{
                echo "This is the building stage..."
                echo "Building version: ${NEW_VERSION}"
                echo 'Building version: ${NEW_VERSION}'
            }
        }
        stage('test'){
            when {
                expression {
                    BRANCH_NAME == 'dev'
                }
            }
            steps {
                echo "This is the testing stage..."
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
                echo "This is the deploying stage..."
            }
        }
    }
}
