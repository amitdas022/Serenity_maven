Feature: API validation for negative test cases in Customer Registration API

  Scenario Outline: Validate Customer Registration API Unsuccessfully for Invalid Scenarios
    Given Login successfully to generate authorisation token
      And Prepare the request body with "<name>" "<contactName>" "<phoneNumber>" "<emailId>" "<contactMethod>" "<additionalinfo>"
     When POST request on Customer Registration API
     Then Status code returned is "<status_code>"
      And Error code returned is "<error_code>"
      And Response body returned is "<error_description>"
    Examples: 
      | Test Description                  | name     | contactName  | phoneNumber | emailId         | contactMethod | additionalinfo              | status_code | error_code | error_description                        | 
      | Test without Blank name           |          | testcustomer | 123456789   | some@random.com | Others        | Copy to testcust@eaton.com | 400         | 9008       | Input parameters cannot be null or empty | 
      | Test without contact name         | custname |              | 123456789   | some@random.com | Others        | Copy to testcust@eaton.com | 400         | 9008       | Input parameters cannot be null or empty | 
      | Test without phone number         | custname | testcustomer |             | some@random.com | Others        | Copy to testcust@eaton.com | 400         | 9008       | Input parameters cannot be null or empty | 
      | Test without emailid              | custname | testcustomer | 123456789   |                 | Others        | Copy to testcust@eaton.com | 400         | 9008       | Input parameters cannot be null or empty | 
      | Test without contact method       | custname | testcustomer | 123456789   | some@random.com |               | Copy to testcust@eaton.com | 400         | 9008       | Input parameters cannot be null or empty | 
#      | Test without additonalInfo        | custname | testcustomer | 123456789   | some@random.com | Others        |                            | 400         | 9008       | Input parameters cannot be null or empty | 

  
  