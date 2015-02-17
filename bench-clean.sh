#! /bin/bash
java -server -Xmixed -XX:+TieredCompilation -XX:+AggressiveOpts -Xmx1024m -jar benchmarks.jar
