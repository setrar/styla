name := "styla"

version := "0.1.0-SNAPSHOT"

scalaVersion     := "2.12.8"

lazy val root = project in file(".")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
