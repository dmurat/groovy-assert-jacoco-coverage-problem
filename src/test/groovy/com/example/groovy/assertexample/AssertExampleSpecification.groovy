package com.example.groovy.assertexample

import spock.lang.Specification

class AssertExampleSpecification extends Specification {
  void "printFirstNameWhenNotNull() should print non-null firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: firstNameParam)

    when:
    assertExample.printFirstNameWhenNotNull()

    then:
    true

    where:
    firstNameParam | _
    ""             | _
    " "            | _
    "First"        | _
    " First"       | _
    " First "      | _
  }

  void "printFirstNameWhenNotNull() should throw for null firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: null)

    when:
    assertExample.printFirstNameWhenNotNull()

    then:
    thrown(AssertionError)
  }

  void "printFirstNameWhenNotNull_likeGenerated() should print non-null firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: firstNameParam)

    when:
    assertExample.printFirstNameWhenNotNull_likeGenerated()

    then:
    true

    where:
    firstNameParam | _
    ""             | _
    " "            | _
    "First"        | _
    " First"       | _
    " First "      | _
  }

  void "printFirstNameWhenNotNull_likeGenerated() should throw for null firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: null)

    when:
    assertExample.printFirstNameWhenNotNull_likeGenerated()

    then:
    thrown(AssertionError)
  }

  void "printFirstNameWhenNotNull_likeGenerated_fixed() should print non-null firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: firstNameParam)

    when:
    assertExample.printFirstNameWhenNotNull_likeGenerated_fixed()

    then:
    true

    where:
    firstNameParam | _
    ""             | _
    " "            | _
    "First"        | _
    " First"       | _
    " First "      | _
  }

  void "printFirstNameWhenNotNull_likeGenerated_fixed() should throw for null firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: null)

    when:
    assertExample.printFirstNameWhenNotNull_likeGenerated_fixed()

    then:
    thrown(AssertionError)
  }

  void "printFirstNameWhenNotNullAndNotBlank() should print non-null and non-blank firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: firstNameParam)

    when:
    assertExample.printFirstNameWhenNotNullAndNotBlank()

    then:
    true

    where:
    firstNameParam | _
    "First"        | _
    " First"       | _
    " First "      | _
  }

  void "printFirstNameWhenNotNullAndNotBlank() should throw for null or blank firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: firstNameParam)

    when:
    assertExample.printFirstNameWhenNotNullAndNotBlank()

    then:
    thrown(AssertionError)

    where:
    firstNameParam | _
    null           | _
    ""             | _
    " "            | _
  }

  void "printFirstNameWhenNotNullAndNotBlank_likeGenerated() should print non-null and non-blank firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: firstNameParam)

    when:
    assertExample.printFirstNameWhenNotNullAndNotBlank_likeGenerated()

    then:
    true

    where:
    firstNameParam | _
    "First"        | _
    " First"       | _
    " First "      | _
  }

  void "printFirstNameWhenNotNullAndNotBlank_likeGenerated() should throw for null or blank firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: firstNameParam)

    when:
    assertExample.printFirstNameWhenNotNullAndNotBlank_likeGenerated()

    then:
    thrown(AssertionError)

    where:
    firstNameParam | _
    null           | _
    ""             | _
    " "            | _
  }

  void "printFirstNameWhenNotNullAndNotBlank_likeGenerated_fixed() should print non-null and non-blank firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: firstNameParam)

    when:
    assertExample.printFirstNameWhenNotNullAndNotBlank_likeGenerated_fixed()

    then:
    true

    where:
    firstNameParam | _
    "First"        | _
    " First"       | _
    " First "      | _
  }

  void "printFirstNameWhenNotNullAndNotBlank_likeGenerated_fixed() should throw for null or blank firstName"() {
    given:
    AssertExample assertExample = new AssertExample(firstName: firstNameParam)

    when:
    assertExample.printFirstNameWhenNotNullAndNotBlank_likeGenerated_fixed()

    then:
    thrown(AssertionError)

    where:
    firstNameParam | _
    null           | _
    ""             | _
    " "            | _
  }
}
