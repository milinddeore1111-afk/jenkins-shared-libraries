def call(String ProjectName, String ImageTag){
echo "this is pushing the image"
withCredentials([usernamePassword(
   'credentialsId':"dockerHubCred",
    usernameVariable:"dockerHubUser",
    passwordVariable:"dockerHubPass"
)]){
sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
sh "docker image tag notes-app:latest ${env.dockerHubUser}/notes-app:latest"
sh "docker push ${env.dockerHubUser}/notes-app:latest"
}  
