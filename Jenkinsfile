pipeline{
    agent any
    enviroment{
        NEW_VERSION = "1.3.0"
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
                steps {
                    echo "This is the deploying stage..."
                }
        }
    }
}