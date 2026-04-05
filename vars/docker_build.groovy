def call(String ProjectName, String ImageTag, String DockerHubUser){
echo "this is building the code"
sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
echo "code build successfully"
}
