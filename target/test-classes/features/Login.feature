Feature: Application Login

Background:
Given Validate initializaion
When Browser is trigered
Then check if broser started


Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "Otto" and password "1234"
Then Home page is populated
And Cards displayed is "true"

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "Rey" and password "5678"
Then Home page is populated
And Cards displayed is "false"

@Smoke
Scenario: Home page default login
Given User is on NetBanking landing page
When User Sign Up with the following
|Otto|1234|correo@coreo.com|8186817850|
Then Home page is populated
And Cards displayed is "false"

@Reg
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with <Username> and password <Password>
Then Home page is populated
And ValCards displayed is <Flag>

Examples:
|Username|Password|Flag|
|Otto|1234|true|
|Otto1|1234|false|
|Ott2|1234|true|