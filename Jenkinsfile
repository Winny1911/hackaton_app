@Library('ZupSharedLibs@marte') _
node {

  try {

    mvnBuildWithCompose {
      composeFileName = "docker-compose-ci.yml"
      composeService = "hackathon-bff"
      composeProjectName = "hackathon-bff"
      useBuilder = "true"
    }

    buildDockerContainerAWS {
      dockerRepositoryName = "hackathon-bff"
      dockerFileLocation = "."
      team = "Marte"
      dockerRegistryGroup = "Marte"
    }

  } catch (e) {

      notifyBuildStatus {
        buildStatus = "FAILED"
      }
      throw e

  }

}