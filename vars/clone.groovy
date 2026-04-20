def call(String repoUrl, String branchName) {
    echo "Cloning repository from shared library..."

    git url: https://github.com/ajitjivane001/django-notes-app.git, branch: main
}
