```sh
sbt sonarScan
```

```log
[info] welcome to sbt 1.11.5 (Eclipse Adoptium Java 11.0.28)
[info] loading global plugins from /home/fricc/.sbt/1.0/plugins
[info] loading settings for project scala-seed-project-build-build from metals.sbt...
[info] loading project definition from /home/fricc/git/scala-seed-project/project/project
[info] loading settings for project scala-seed-project-build from metals.sbt...
[info] loading project definition from /home/fricc/git/scala-seed-project/project
[success] Generated .bloop/scala-seed-project-build.json
[success] Total time: 3 s, completed Sep 7, 2025, 10:40:45 AM
[info] loading settings for project root from build.sbt...
[info] set current project to Scala Seed Project (in build file:/home/fricc/git/scala-seed-project/)
[warn] there are 4 keys that are not used by any other settings/tasks:
[warn]  
[warn] * Global / sonarProjectKey
[warn]   +- /home/fricc/git/scala-seed-project/project/SonarPlugin.scala:27
[warn] * moduleA / sonarProperties
[warn]   +- /home/fricc/git/scala-seed-project/project/SonarPlugin.scala:31
[warn] * moduleB / sonarProperties
[warn]   +- /home/fricc/git/scala-seed-project/project/SonarPlugin.scala:31
[warn] * root / sonarProperties
[warn]   +- /home/fricc/git/scala-seed-project/project/SonarPlugin.scala:31
[warn]  
[warn] note: a setting might still be used by a command; to exclude a key from this `lintUnused` check
[warn] either append it to `Global / excludeLintKeys` or call .withRank(KeyRanks.Invisible) on the key
[info] Aggregating properties from subprojects...
[info] some_key_asdkjsahdlksajhdj
[info] List(Map(name -> Module A), Map(name -> Module A), Map(name -> Scala Seed Project))
[success] Total time: 0 s, completed Sep 7, 2025, 10:40:46 AM
```