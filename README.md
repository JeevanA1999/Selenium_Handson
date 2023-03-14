# Selenium_Handson

Selenium WebDriver Assignment 1:
Step 1:
Launch Shop Tools QA application https://shop.demoqa.com/ User must be able to launch the shop tools application
Step 2:
Click on "My Account" link on top right corner of home page My Account page should be displayed with Login and 
Register buttons
Step 3:
Enter Username, Email Address and Password and click on "Register" button User must be able to register into the shop tools application 
and Login page should be displayed
Step 4:
Enter Email Address and Password and click on "Login" Button.
User must be able to login into the shop tools application
Step 5:
Enter the key word (DRESS) in search text box on top left corner of the home 
page. Hit Enter button only and no icon click
The user should be able to enter search criteria and 
Products should be displayed of type-searched key word.
Step 6:
 Select "List" under Filter style drop down. The queried dresses should be displayed in list
Step 7:
 Sort from the "Price (Low >High)" for the page. Lowest priced dresses should be listed on the top and the 
highest priced should be listed below
Step 8:
Click on the first listed dress after applying price filter
Dress information should be displayed in the page redirected.
Step 9:
Get the description of the dress and write into flat file. Information has to be saved into a file
Step 10:
Select “color” in color drop down The user should be able to select the color
Step 11:
Select “size” in size drop down The user should be able to select the size
Step 12:
Click on "Add to Cart".
Page with message “Dress has been added to the cart” 
should be displayed
Step 13:
Click on "Shopping Cart" displayed on top right corner
Shopping cart page should be displayed with all the products 
added to the cart
Step 14:
Click on “Proceed to Check out” button. Check out page should be displayed.
Step 15:
Provide billing details User should be able to fill in all the mandatory fields
Step 16:
Check the Terms and Conditions Checkbox and click Continue User should be able to check the box
Sensitivity:Internal &Restricted
Step 17:
Click on Place Order “Order has been received” message should be displayed
Step 18:
Click on cart button Shopping cart should be empty
Step 19:
Click on "Orders " from "My account "tab "Order History" page should be displayed.
Step 20:
Click on "Logout " The user should be able to log out.



verify with Junit Framework
• You should use below Junit annotations
1. @Test
2. @Before
3. @After
4. @BeforeClass
5. @AfterClass
Steps

Step 1:
Launch Shop Tools QA application https://shop.demoqa.com/ User must be able to launch the shop tools 
application
Step 2:
Click on "My Account" link on top right corner of home page My Account page should be displayed with Login and 
Register buttons
Step 3:
Enter Email Address and Password and clickon "Login" Button. User must be able to login Shop Tools application
Step 4:
Enter the keyword (Sandals) in search text box on top left of the page. User must be able to enter the name of the product 
tobe searched and products should be displayed
Step 5:
Click on first image of searched items First sandals details should be displayed
Step 6:
Change the quantity in the edit box. and select the size and color User must be able to enter the required quantity of 
the products needed.
Step 7:
Click on the "Add to Cart" button Success message ribbon should bedisplayed.
Step 8:
Click on "Cart" displayed on top right corner of the page Shopping cart page is displayed with all 
products added to the cart
Step 9:
Fetch the value of the "Total "and place it to aflat file The total value of the product selected must be 
captured
Step 10:
Click on "Continue Shopping" button if the amount fetched is less than "200" else 
log out
The user must be able to click on the Continue 
Shopping button and navigated to purchase more 
products if the value is less than “200
