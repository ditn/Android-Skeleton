#!/usr/bin/env bash

./gradlew lint ktlint -Dpre-dex=false -Pkotlin.incremental=false --no-daemon --stacktrace