logLevel := Level.Warn

resolvers ++=Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "sbt-plugin-releasess" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/" ,
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)