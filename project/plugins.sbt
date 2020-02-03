resolvers ++= Seq(
  Classpaths.sbtPluginReleases,
  Resolver.sonatypeRepo("releases"),
  Resolver.bintrayIvyRepo("jetbrains", "sbt-plugins")
)

addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.1.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.1")
addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.0")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
addSbtPlugin(
  "io.get-coursier" % "sbt-coursier" % coursier.util.Properties.version
)
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.3.7")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.1")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.32")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.6.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.6.1")
