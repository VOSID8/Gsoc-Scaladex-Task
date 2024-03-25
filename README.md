# GSoc ScalaDex Task: Asynchronous Sum of Even Squares Calculator

This repository contains a web application built using the Play Framework in Scala for Gsoc Scaladex Task. The application calculates the sum of squares of even numbers up to a given limit asynchronously.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Running the Application](#running-the-application)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Testing](#testing)

## Getting Started

### Prerequisites

- [Java Development Kit (JDK)](https://adoptopenjdk.net/) version 8 or above
- [sbt](https://www.scala-sbt.org/) (Scala Build Tool)

### Installation

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/VOSID8/Gsoc-Scaladex-Task.git
   ```

2. Navigate to the project directory:

   ```bash
   cd Gsoc-Scaladex-Task
   ```

## Running the Application

Run the following command to start the Play application:

```bash
sbt run
```

Once the application is running, you can access it at `http://localhost:9000`.

## Usage

- Visit the homepage to see the input form.
- Enter a positive integer value in the input field.
- Submit the form.
- The application will calculate the sum of squares of even numbers from 1 up to the entered value.
- The result will be displayed on the page
- You can try another input with button

## Code Structure

The application code is organized as follows:

- `app/HomeController`: Contains the main logic for handling requests and calculating the sum of even squares.
- `app/views/`: Contains HTML templates for rendering the UI.

## Testing

This project includes unit tests using ScalaTest, a popular testing framework for Scala. Tests are located in the `Testing` class within the `test` directory.

### Running Tests

To run the tests, execute the following command:

```bash
sbt test
```

### Test Cases

The following test cases are included:

1. **calculateSumOfEvenSquares should return the sum of squares of even numbers up to n**: 
   - This test verifies that the `calculateSumOfEvenSquares` method in the `HomeController` class correctly calculates the sum of squares of even numbers up to a given limit.
   - It checks if the method returns the expected sum of squares for a positive integer `n`.

2. **calculateSumOfEvenSquares should return 0 when n is 0**: 
   - This test verifies the behavior of the `calculateSumOfEvenSquares` method when `n` is 0.
   - It checks if the method returns 0 when `n` is 0.

3. **calculateSumOfEvenSquares should return 0 when n is negative**: 
   - This test ensures that the `calculateSumOfEvenSquares` method handles negative values of `n` correctly.
   - It checks if the method returns 0 when `n` is negative.

### Dependencies

The testing dependencies used in this project include:

- `org.scalatestplus.play` for testing Play Framework controllers and actions.
- `org.scalatest.concurrent` for handling asynchronous testing with ScalaFutures.

