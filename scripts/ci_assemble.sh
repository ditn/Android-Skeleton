#!/usr/bin/env bash

./gradlew assembleDebug -Dpre-dex=false -Pkotlin.incremental=false --stacktrace --no-daemon