import sbt._

object Dependencies {

  val circeVersion = "0.6.0"
  lazy val circe = List(
    "io.circe" %% "circe-core" % circeVersion,
    "io.circe" %% "circe-generic" % circeVersion,
    "io.circe" %% "circe-parser" % circeVersion)

  lazy val betterFiles = "com.github.pathikrit" %% "better-files" % "3.4.0"

  lazy val jodaTime = "joda-time" % "joda-time" % "2.9.9"

  lazy val log4s = Seq("ch.qos.logback" % "logback-classic" % "1.2.3", "org.log4s" %% "log4s" % "1.5.0")

  lazy val specs2 = "org.specs2" %% "specs2-core" % "4.0.2"

  lazy val caseApp = "com.github.alexarchambault" %% "case-app" % "1.2.0"

}