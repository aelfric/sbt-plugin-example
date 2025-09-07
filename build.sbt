import SonarPlugin.autoImport.sonarProjectKey
import Dependencies._

ThisBuild / scalaVersion := "2.13.16"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"
ThisBuild / sonarProjectKey := "some_key_asdkjsahdlksajhdj"

lazy val root = (project in file("."))
  .settings(name := "Scala Seed Project")
  .aggregate(
    moduleA,
    moduleB
  )

lazy val moduleA = (project in file("./moduleA"))
  .settings(
    (
      name := "Module A"
    )
  )

lazy val moduleB = (project in file("./moduleB"))
  .settings(
    (
      name := "Module A"
    )
  )
