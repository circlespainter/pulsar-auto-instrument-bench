#! /bin/bash
java -javaagent:/Users/fabio/.m2/repository/co/paralleluniverse/quasar-core/0.6.3-SNAPSHOT/quasar-core-0.6.3-SNAPSHOT-jdk8.jar=x -Dco.paralleluniverse.pulsar.instrument.auto=all -server -Xmixed -XX:+TieredCompilation -XX:+AggressiveOpts -Xmx1024m -jar benchmarks-pulsar.jar
