.DEFAULT_GOAL := build-run

setup:
	gradle wrapper --gradle-version 8.5

clean:
	gradle clean

build:
	gradle clean build

install:
	gradle clean install

run-dist:
	./build/install/app/bin/app

run:
	gradle run

test:
	gradle test

report:
	gradle jacocoTestReport

lint:
	gradle checkstyleMain

check-deps:
	gradle dependencyUpdates -Drevision=release


build-run: build run

.PHONY: build
