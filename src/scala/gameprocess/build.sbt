name := "My Project"
 
version := "1.0"
 
scalaVersion := "2.10.2"
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.2.1"

libraryDependencies += "com.typesafe.akka" %% "akka-zeromq" % "2.2.1"

libraryDependencies +=  "com.google.protobuf" % "protobuf-java" % "2.5.0"