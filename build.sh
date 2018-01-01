#!/bin/sh

rm -rf build
mkdir build
kotlinc source/Main.kt -include-runtime -d build/out.jar
