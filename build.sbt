name := "bootstrap"

organization := "name.guxg.webkit"

version := "2.4-0.1"

scalaVersion := "2.8.1"

scalacOptions ++= Seq("-deprecation")

EclipseKeys.withSource := true

resolvers ++= Seq(
  "Scala Tools Releases" at "http://scala-tools.org/repo-releases/",
  "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"
)

libraryDependencies ++= {
  val liftVersion = "2.4" 
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default" withSources(),
    "net.liftweb" %% "lift-testkit" % liftVersion % "compile->default"
    )
}

//use sbt clean update compile package publish-local


