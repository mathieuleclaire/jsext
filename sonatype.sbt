
sonatypeProfileName := "org.querki"

publishMavenStyle := true

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("jducoeur", "jsext", "justin@querki.net"))

homepage := Some(url("http://www.querki.net/"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/jducoeur/jsext"),
    "scm:git:git@github.com/jducoeur/jsext.git",
    Some("scm:git:git@github.com/jducoeur/jsext.git")))

// There doesn't seem to be a way to specify contributors properly in sbt-sonatype:
pomExtra := (
    <contributors>
      <contributor>
        <name>Jasper Moeys</name>
        <url>https://github.com/Jasper-M/</url>
      </contributor>
      <contributor>
        <name>Stefan Larsson</name>
        <url>https://github.com/lastsys/</url>
      </contributor>
    </contributors>
  )

developers := List(
  Developer(id = "jducoeur", name = "Mark Waks", email = "justin@querki.net", url = new URL("https://github.com/jducoeur/"))
)
