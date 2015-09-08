import play.PlayJava

name := """app1"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

libraryDependencies += "com.google.code.gson" % "gson" % "1.7.1"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
libraryDependencies ++= Seq(
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "3.6.10.Final"
)

resolvers += "OSChina Maven Repository" at "http://maven.oschina.net/content/groups/public/"

lazy val admin = (project in file("modules/admin")).enablePlugins(PlayScala)

lazy val myFirstApplication = (project in file("."))
  .enablePlugins(PlayScala)
  .aggregate(admin)
  .dependsOn(admin)

