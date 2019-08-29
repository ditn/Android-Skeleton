#!/usr/bin/env bash

./gradlew testDebug -Dpre-dex=false -Pkotlin.incremental=false --no-daemon --stacktrace