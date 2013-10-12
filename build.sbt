import com.typesafe.sbt.SbtStartScript

seq(SbtStartScript.startScriptForClassesSettings: _*)

name := "freshbook"

version := "1.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)  

resolvers += "twitter-repo" at "http://maven.twttr.com"

libraryDependencies ++= Seq("com.twitter" % "finagle-core" % "1.9.0", "com.twitter" % "finagle-http" % "1.9.0")   

play.Project.playScalaSettings


