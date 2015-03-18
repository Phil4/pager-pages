name := "pager-pages"

organization := "org.polymer-components"

version := "1.0.0"

publishArtifact in (Compile, packageDoc) := false

publishArtifact in (Compile, packageSrc) := false

LessKeys.compress in Assets := true

includeFilter in (Assets, LessKeys.less) := "*.less"

excludeFilter in (Assets, LessKeys.less) := "_*.less"

lazy val root = (project in file(".")).enablePlugins(SbtWeb)

libraryDependencies ++= Seq(
  "org.webjars" % "font-awesome" % "4.3.0-1",
  "org.webjars" % "polymer" % "0.5.1"
)

// disable using the Scala version in output paths and artifacts
crossPaths := false