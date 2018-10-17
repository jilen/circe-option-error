
scalaVersion := "2.12.7"

val circeV        = "0.10.0"

libraryDependencies ++= Seq(
  "io.circe"      %% "circe-generic" % circeV,
  "org.scalatest"  %% "scalatest"     % "3.0.5" % Test
)
