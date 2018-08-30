def call(String state, Map args) {
  script {
    sh "curl -d " +
       "'{\"state\": \"${state}\"," +
       "\"key\": \"${args.commitHash}\"," +
       "\"name\": \"${args.name}\"," +
       "\"url\": \"${args.buildUrl}\"," +
       "\"description\": \"${args.description}\"}' " +
       "--user ${args.creds} " +
       "-H \"Content-Type: application/json\" " +
       "-X POST ${args.repoUrl}"
  }
}
