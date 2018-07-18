# codeChallange

Github api search automation framework leveraging CucumberJVM

# Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
Installation is for Mac OS.
### Prerequisites

Need the following installed:
```
git clone https://github.com/iso13/rewardsNetwork
brew install maven
jdk 1.8.0_60
```
### CucumberJVM Structure
Test file resides in the features directory; ie. **src/test/resources/features/search.feature**
The step definition resides in the step-definitions directory; ie. **src/test/java/org.david.code/step_definitions/search.java**

### Running the tests

Within the project root directory run the following command in a terminal:
```
mvn clean verify
```

### Reporting
Each run will output results in the terminal as well generating an html report; **target/cucumber-html-reports/overview-features.html**