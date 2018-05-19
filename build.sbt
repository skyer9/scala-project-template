name := "MyProject"

version := "0.0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"
libraryDependencies ++= Seq(
  // "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided"
)
