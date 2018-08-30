def call(String creds, Map args) {
  script {
    sh "curl -d " +
       "'{\"state\": \"SUCCESSFUL\"," +
       "\"key\": \"${args.commitHash}\"," +
       "\"name\": \"${args.name}\"," +
       "\"url\": \"${args.buildUrl}\"," +
       "\"description\": \"${args.description}\"}' " +
       "--user ${creds} " +
       "-H \"Content-Type: application/json\" " +
       "-X POST ${args.repoUrl}"
  }
}
