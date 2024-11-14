Dockerized NodeJS that shows a sharks website to list info about them.
=====================================================================
To run the app in docker on port 8080:
- Go to the project directory
- sudo docker pull moabdelaziz1/nodejs-sharks
 or --> sudo docker build -t moabdelaziz1/nodejs-sharks .
- sudo docker run --name nodejs-sharks-cont -p 8080:8080 --rm -d moabdelaziz1/nodejs-sharks
- See your app on the following url from your local browser:
    http://localhost:8080/