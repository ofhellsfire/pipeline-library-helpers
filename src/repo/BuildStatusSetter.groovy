package repo;

def setBuildStatusInBitbucket(String state, String, creds, Map args) {
  script {
    sh "curl -d " +
       "'{\"state\": \"${state}\"," +
       "\"key\": \"${args.commitHash}\"," +
       "\"name\": \"${args.name}\"," +
       "\"url\": \"${args.buildUrl}\"," +
       "\"description\": \"${args.description}\"}' " +
       "--user ${creds} " +
       "-H \"Content-Type: application/json\" " +
       "-X POST ${args.repoUrl}"
  }
}

return this
