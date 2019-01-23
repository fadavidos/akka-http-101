

lazy val configuracionesComunes = Seq(
  name := "akka-http-101",
  version := "0.1",
  scalaVersion := "2.12.8",
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-http"   % "10.1.7",
    "com.typesafe.akka" %% "akka-stream" % "2.5.19",
    "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.7",
    "com.typesafe" % "config" % "1.3.2"
  )
)

lazy val akkaHttp = ( project in file("akka-http"))
  .settings(
    configuracionesComunes
  )

lazy val akkaHttp101 = (project in file("."))
  .aggregate(akkaHttp)
  .settings(
    aggregate in update := false
  )

