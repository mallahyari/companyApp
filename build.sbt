
name := """employeeDirectory"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += javaJdbc

libraryDependencies += evolutions

libraryDependencies += "com.h2database" % "h2" % "1.4.199"

libraryDependencies += "io.ebean" % "ebean" % "12.1.3"

//libraryDependencies += "io.ebean" % "ebean" % "11.22.10"

// To provide an implementation of JAXB-API, which is required by Ebean.
libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.1"
libraryDependencies += "javax.activation" % "activation" % "1.1.1"
libraryDependencies += "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.2"


// to access MySQL
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.18"
