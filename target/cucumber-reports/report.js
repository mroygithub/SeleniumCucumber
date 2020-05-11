$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Feature/stringConcat.feature");
formatter.feature({
  "name": "Do String Concat and output it with Calculation.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Pass company name and add two numbers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addition"
    }
  ]
});
formatter.step({
  "name": "We pass company as \"Cognizant\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.StepDeftest2.we_pass_company_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Output should be \"Welcome to Cognizant\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDeftest2.output_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "When we pass two numbers as 5 and 5 for addition",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.StepDeftest2.when_we_pass_two_numbers_as_and_for_addition(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "output should be 10",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDeftest2.output_should_be(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
});