#!/bin/bash

ENV=$1
VERSION=$2

if [[ ${VERSION} = "" ]]; then
    VERSION="0.0.1"
fi

if [[ ${ENV} = "" ]]; then
    echo "Building the project pointing to local environment"
    ./gradlew clean build
else
    echo "Building the project pointing to ${ENV} environment"
    ./gradlew clean build
fi

echo `pwd`

echo "Starting the service"
java -jar build/libs/main-${VERSION}.jar