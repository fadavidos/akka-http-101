

lazy val configuracionesComunes = Seq(
  version := "0.1",
  scalaVersion := "2.12.8",
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-http"   % "10.1.7",
    "com.typesafe.akka" %% "akka-stream" % "2.5.19"
  )
)

lazy val servidorHttp = ( project in file("servidorHttp"))
  .settings(
    configuracionesComunes
  )

lazy val akkaHttp101 = (project in file("."))
  .aggregate(servidorHttp)
  .settings(
    aggregate in update := false
  )

