name := """play-mango-example"""
organization := "com.movies"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.3"


libraryDependencies ++= Seq(
    guice,
    "org.mongodb" % "mongo-java-driver" % "3.4.0",
    "org.mongodb.morphia" % "morphia" % "1.2.1",
    "com.google.code.morphia" % "morphia" % "0.102"
    )
