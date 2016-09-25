name := "processor"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.0"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "0.10.0.1"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.0.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.0.0"

libraryDependencies += "com.typesafe" % "config" % "1.3.0"
