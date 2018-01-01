#!/bin/sh

set -eur

mkdir build

FILES=`find source -type f -name "*.kt"`

echo "Building..."
kotlinc ${FILES} \
  -include-runtime \
  -Werror \
  -verbose \
  -d build/out.jar
