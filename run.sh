#!/bin/bash

java -Djava.library.path=/usr/local/lib -Xms1G -Xmx1G -XX:MaxPermSize=1G -jar target/scala-2.10/scala-starter_2.10-1.0-one-jar.jar
