
ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "styla"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.20",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.20" % Test
)


// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
