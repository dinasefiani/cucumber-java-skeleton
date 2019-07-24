# Cucumber-Java Skeleton

[![Build Status](https://travis-ci.org/cucumber/cucumber-java-skeleton.svg?branch=master)](https://travis-ci.org/cucumber/cucumber-java-skeleton)

This is a simple possible build script setup for Cucumber using Java.
There is nothing fancy like a webapp or browser testing. All this does is to show you how
to install and run Cucumber!

There is a single feature file with two scenarios scenario. The scenarios have several steps...

The feature file can be found in:
    src/test/resources/io/cucumber/skeleton/login.feature
    
The step definitions can be found in:
    src/test/java/io/cucumber/skeleton/Stepdefs.java
    
Finally, the code implementing the feature can be found in: 
    src/main/java/io/cucumber/skeleton/
## Get the code

Git:

    git clone https://github.com/dinasefiani/cucumber-java-skeleton.git
    cd cucumber-java-skeleton

Or simply [download a zip](https://github.com/dinasefiani/cucumber-java-skeleton/archive/master.zip) file.

## Use Maven

Open a command window and run:

    mvn test

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `RunCucumberTest`
class tells JUnit to kick off Cucumber.

## Use Gradle

Open a command window and run:

    gradlew test --info

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `RunCucumberTest`
class tells JUnit to kick off Cucumber.
