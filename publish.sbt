sonatypeProfileName := "com.github.alexander-branevskiy"

publishMavenStyle := true

licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
homepage := Some(url("https://github.com/permutive/sbt-liquibase-plugin"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/permutive/sbt-liquibase-plugin"),
    "scm:git@github.com:permutive/sbt-liquibase-plugin.git"
  )
)

developers := List(
  Developer(id="alexander-branevskiy", name="Alexander Branevskiy", email="alexander.branveskiy@gmail.com", url=url("https://github.com"))
)

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)

version in ThisBuild := "1.1.1"
