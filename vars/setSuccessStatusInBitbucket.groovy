def call(String creds, Map args) {
  script {
    library('pipeline-library-helpers').repo.BuildStatusSetter.setBuildStatusInBitbucket(
      "SUCCESSFUL",
      creds,
      args
    )
  }
}
