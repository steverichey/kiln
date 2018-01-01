#!/bin/sh

set -eur

mkdir build

echo "Building..."
kotlinc source/*.kt \
  -include-runtime \
  -d \
  build/out.jar
