# MarsRoverPhotosAPITest

MarsRoverPhotosAPITest is a REST Assured API test suite for the Mars rovers NASA API. It validates various aspects of the API related to camera photos and the number of photos based on sol (Martian day) and pagination.

## Test Files

The following test files are included in the project:

- `TestVerifyCameraPhotosByRover.java`: This test verifies if all the photos form an specific camera belongs to the same rover.
- `TestVerifyNumberOfPhotosByMartialSol.java`: This test verifies the number of photos available for a specific rover on a given Martian sol.
- `TestVerifyNumberOfPhotosByMartialSolWithPagination.java`: This test verifies the number of photos available for a specific rover on a given Martian sol with pagination.

## Prerequisites

To run the tests, ensure you have the following dependencies:

- Java Development Kit (JDK) 8 or later
- Maven

## Getting Started

1. Clone the repository: `git clone <repository-url>`
2. Navigate to the project directory: `cd MarsRoverPhotosAPITest`
3. Build the project: `mvn clean install`

## Running the Tests

To run the tests, execute the following command in the project directory:

```properties
mvn test
```  

The test results will be displayed in the console.

## Reporting

This project utilizes Allure TestNG for test reporting. After running the tests, you can generate an Allure report using the following command:

```properties
allure serve allure-results
```

The Allure report will open in your default browser, providing detailed information about the test execution.

## Additional Information

For more information about the Mars rovers NASA API, refer to the official documentation.

