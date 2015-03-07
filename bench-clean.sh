#! /bin/bash
java -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:FlightRecorderOptions=defaultrecording=true,dumponexit=true,settings=profile -server -Xmixed -XX:+TieredCompilation -XX:+AggressiveOpts -Xmx1024m -jar benchmarks.jar -prof jfr
