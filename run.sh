#!/bin/bash -ex

mvn -q clean
mvn -q compile
mvn -q exec:java -Dprism.order=sw -Dexec.mainClass=ink.api.AppDriver
