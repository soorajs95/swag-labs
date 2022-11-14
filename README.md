# swag-labs

## Description

Test automation demo project on [Swag Labs](https://www.saucedemo.com/)

## Features

- Parallel tests - Feature files can run in parallel
- Threadsafe web-driver - Drivers are thread safe to support parallel execution
- Multiple browser support - Tests can run in chrome, edge or firefox
- Responsive web test support - Tests can be run in desktop or mobile dimensions
- Continuous Integration - Connected to [Github Actions](https://github.com/soorajs95/swag-labs/actions) CI configured
  to run tests in different browsers and dimensions

## Tech Stack

- [Java](https://www.java.com/en/)
- [Selenium](https://www.selenium.dev/)
- [Cucumber](https://cucumber.io/)
- [JUnit](https://junit.org/junit5/)
- [Cluecumber reports](https://github.com/trivago/cluecumber-report-plugin)

## Pre-requisites

- [Java](https://www.oracle.com/java/technologies/downloads/#java17) 14 or later should be installed
- [Maven](https://maven.apache.org/download.cgi) should be installed

## Executing tests

### 1. Run Tests

Run tests using default configuration from [Config file](src/test/resources/Config.properties):

```
mvn clean test
```

Run tests in headless mode:

```
mvn clean test -Dheadless=true
```

Run tests in edge browser:

```
mvn clean test -Dbrowser=edge
```

Run tests in firefox browser:

```
mvn clean test -Dbrowser=firefox
```

Run tests in mobile responsive dimension:

```
mvn clean test -Dbrowser_width=375 -Dbrowser_height=842
```

Run only smoke tests:

```
mvn clean test -Dcucumber.filter.tags=@Smoke
```

### 2. Generate HTML Report

```
mvn cluecumber-report:reporting
```

## Continuous Integration:

[Github CI Configuration](.github/workflows/test.yml)

## Test Reports:

HTML report will be generated in `target/generated-report` directory.
Test report will be also uploaded to CI pipeline as artifact.
