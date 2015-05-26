enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.11.5" // or any other Scala version >= 2.10.2

// node (nodejs) and phantomjs must be installed
scalaJSStage in Global := FastOptStage
skip in packageJSDependencies := false

persistLauncher in Compile := true
persistLauncher in Test := false

//libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"

jsDependencies += RuntimeDOM

testFrameworks += new TestFramework("utest.runner.Framework")
