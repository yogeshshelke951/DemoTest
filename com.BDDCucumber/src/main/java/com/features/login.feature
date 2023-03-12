Feature:JBK offline application
@login 
Scenario Outline:login test
Given user should be on login page
When user enters "<uname>" and "<pass>"
Then user should be on home page 
Examples:
|uname              |pass   |
| kiran@gmail.com    |123456 |
|mangesh@gmail.com  |mangesh|
|yogesh@gmail.com   |yogesh |
@error
Scenario:verify email error
Given user should be on login page
When user enters invalid username
Then verify email error
