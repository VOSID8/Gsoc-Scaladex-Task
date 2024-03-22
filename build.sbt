name := """Gsoc-Task"""
organization := "self"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.13"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test
//libraryDependencies += "org.scalactic" %% "scalactic" % "3.3.0"  
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "self.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "self.binders._"
