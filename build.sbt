import PlayKeys._

name := """play-secure-social"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

//resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
resolvers += Resolver.sonatypeRepo("releases")

resolvers += "jboss repo" at "https://repository.jboss.org/nexus/content/repositories/public/"


libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "ws.securesocial" %% "securesocial" % "3.0-M3"
)


scalacOptions := Seq("-encoding", "UTF-8", "-Xlint", "-deprecation", "-unchecked", "-feature")

routesImport ++= Seq("scala.language.reflectiveCalls")