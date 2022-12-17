# groovy-assert-jacoco-coverage-problem
Demonstrates the issues with JaCoCo branch coverage of a Groovy `assert` statement.

## Running

    gw jacocoTestReport
    open build/reports/jacoco/test/html/index.html

## Description
`AssertExample` class contains methods for demonstrating current behavior. There are two base methods - `printFirstNameWhenNotNull` and `printFirstNameWhenNotNullAndNotBlank`, which have two simple 
`assert` statements.

For each method, there are accompanying methods with `_likeGenerated` and `_likeGenerated_fixed` suffixes. Methods with `_likeGenerated` suffix contain equivalent code as is generated for `assert` 
statements today. Methods with `_likeGenerated_fixed` suffix try to demonstrate a minimal change in generated code which would fix the problem of branch coverage for assert statements.

