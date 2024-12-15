def buildApp(){
    echo 'This is the building stage...'
    echo "Building version: ${NEW_VERSION}"
    echo 'Building version: ${NEW_VERSION}'
}

def testApp(){
    echo "This is the testing stage..."
}

def deployApp(){
    echo 'This is the deploying stage...'
    echo "deploying version ${params.VERSION}"
}

return this