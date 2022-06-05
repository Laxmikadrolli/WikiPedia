@tag
Feature: Verify functionalities of wikipedia

Background:
	Given an user opens the browser
  When  user is on wikipedia page
  And user clicks on login
  And user enters username as "LaxmiKadrolli"
  And user enters password as "Laxmi@123"
  Then user clicks on login button
  
  @tag1
  Scenario: User should be able to login and search
   When user enters "leap legal software" in search box
   And user click search button
   Then user should get "LEAP Legal Software" page 
   And user closes the browser
		
  @tag2
   Scenario: User should download wikipedia in pdf format 
   When user cliks on download as pdf link
   And user should click on download button
   Then pdf can be downloaded
   And user closes the browser
  	
  @tag3
   Scenario: User should be able to translate the main page into Spanish
   When user clicks on Espanol
   #Then user should get "Bienvenidos" on the page
   And user clicks on English 
   And user closes the browser
    
  @tag4
  Scenario: User should be able to get autosuggestion
   When user enters "Selenium" in search box
   Then user should be able to click on "Selenium (software)" and user should land on "Selenium (software)" page
   And user closes the browser
  
  @tag5
  Scenario: User should be able to access Contact Us page and verifies broken link
	 When user clicks on Contact Us button  
	 And user clicks on Reader button and verifies
	 Then user verifies the broken links
   And user closes the browser
  
  