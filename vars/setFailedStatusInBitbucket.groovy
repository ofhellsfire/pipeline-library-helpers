def call(String creds, Map args) {
  script {
    def repo = new repo.BuildStatusSetter()
    repo.setBuildStatusInBitbucket(
      "FAILED",
      creds,
      args
    )
  }
}
