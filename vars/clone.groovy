def call(string url, string branch){
    echo "Cloning code"
                git url: "${url}", branch:$"{ branch}"
}
