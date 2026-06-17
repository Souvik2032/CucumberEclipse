Feature:Checking the second conditio 

Scenario: 

Given Open page
When Type username incorrectUser into Username field
When password Password123 into Password field
And  Submit button
Then Verify error message is displayed
Then Verify error message text is Your username is invalid!

