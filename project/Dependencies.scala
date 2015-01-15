import sbt._

object Dependencies {
  import Settings.metaVersion 
  
  def reflect(sv: String) = "org.scala-lang" % "scala-reflect" % sv
  def compiler(sv: String) = "org.scala-lang" % "scala-compiler" % sv
  
  lazy val tql = "com.github.begeric" % "tqlscalameta_2.11" % "0.1-SNAPSHOT"

}