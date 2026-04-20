def call(String url, String branch) {
    echo "Cloning repository from shared library..."

    git url: https://github.com/ajitjivane001/django-notes-app.git, branch: main
}
