import sbt.*
import sbt.Keys._

object SonarPlugin extends AutoPlugin {
  override def trigger = allRequirements

  import autoImport.*

  private lazy val sonarScan0 = Def.task {
    implicit val log: Logger = streams.value.log
    log.info(s"Aggregating properties from subprojects...")
    val b = sonarProperties.all(ScopeFilter(inAggregates(ThisProject))).value
    log.info(s"${sonarProjectKey.value}")
    log.info(s"$b")
  }

  object autoImport {
    lazy val sonarProperties =
      settingKey[Map[String, String]]("Sonar properties")
    lazy val sonarProjectKey = settingKey[String]("Sonar project key")
    lazy val sonarScan = taskKey[Unit]("Sonar Scan")
  }

  override def globalSettings: Seq[Setting[_]] =
    super.globalSettings ++
      Seq(
        sonarProjectKey := ""
      )

  override def projectSettings = Seq(
    sonarProperties := {
      Map("name" -> name.value)
    },
    sonarScan := sonarScan0.value,
    sonarScan / aggregate := false
  )

}
