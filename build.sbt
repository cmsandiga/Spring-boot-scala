import sbt.Keys._

lazy val commonSettings = Seq(
  organization := "edu.cmsandiga",
  version := "1.0",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "spring-boot-scala"

  )

lazy val tasksheduling = project.in(file("tasksheduling")).settings(
  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter" % "1.3.3.RELEASE"
  )
)

lazy val caching = project.in(file("caching")).settings(
  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter" % "1.3.3.RELEASE",
    "org.springframework.boot" % "spring-boot-starter-cache" % "1.3.3.RELEASE",
    "com.google.guava" % "guava" % "18.0"

  )
)



