enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.13.2" // or any other Scala version >= 2.10.2

// core = essentials only. No bells or whistles.
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "1.7.0"

npmDependencies in Compile ++= Seq(
    "react" -> "16.13.1",
    "react-dom" -> "16.13.1"
)

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
