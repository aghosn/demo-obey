import sbt._
import Keys._

object build extends Build {
  import Settings._
  
  lazy val commonDependencies = Seq(
    libraryDependencies <++= (scalaVersion)(sv => Seq(
      Dependencies.tql)))

  lazy val core = Project(
    id = "core",
    base = file("core"),
    settings = sharedSettings ++ commonDependencies ++ Seq(obeyplugin.obeyWarn += "+{Dotty}")) enablePlugins(obeyplugin)

}