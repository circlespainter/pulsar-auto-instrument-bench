#! /bin/bash
java -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,settings=profile -javaagent:/Users/fabio/.m2/repository/co/paralleluniverse/quasar-core/0.6.3-SNAPSHOT/quasar-core-0.6.3-SNAPSHOT-jdk8.jar -server -Xmixed -XX:+TieredCompilation -XX:+AggressiveOpts -Xmx1024m -jar benchmarks-fiber.jar -prof jfr
