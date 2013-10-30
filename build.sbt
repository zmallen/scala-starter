organization := "scala"

name := "scala-starter"

version := "1.0"

scalaVersion := "2.10.2"

exportJars := true

retrieveManaged := true

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)
