Feature: Login 
Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://www.nopcommerce.com/en/login?returnUrl=%2Fen" 
	And User enters Email as "rameshwar12163@gmail.com" and Password as "Dubey@1530"

	And Click on Login 
	Then Page Title should be "Free and open-source eCommerce platform. ASP.NET Core based shopping cart. - nopCommerce" 
	