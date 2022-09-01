# Cura

Basic XPATH
Xpath=//input[@type='text']

//*[@id="btn-login"]
/html/body/section/div/div/div[2]/form/div[4]/div/button

Contains():
Xpath=//*[contains(@type,'sub')]
Xpath=//*[contains(text(),'here')]
Xpath=//*[contains(@href,'guru99.com')]

Using OR & AND
Xpath=//*[@type='submit' or @name='btnReset']
Xpath=//input[@type='submit' and @name='btnLogin']

Xpath Starts-with
//label[starts-with(@id,'message')]

XPath Text() Function
Xpath=//td[text()='UserID']

Environment
Dev
Testing
GC
Prod

Notes: 
Test Data Katalon from Database -> Menunggu database dari pak Dion
Run Cura di IE
If Element exist (Checkpoint) -> Done
Login Cura -> Query DB -> Output DB tampil ke Report -> Menunggu database dari pak Dion
Explore Breakpoint 