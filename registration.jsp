<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<title>Customer Registration Form</title>
	
	<style>
		.error {color:red}
	</style>
</head>
<body>
<h1> Spring MVC 5 - Form Validation Example</h1>
<i>Fill out the form. Asterisk (*) means required.</i>
<br><br>
	
	<form action="registration"  method="POST">	
		First name: <input name="firstName" />		
		<br><br>		
		Last name (*): <input name="lastName" />		
		<br><br>

		Free passes  (*): <input type="number" name="freePasses" />	
		<br><br>
				
		Email  (*): <input type="email" name="email" />		
		<br><br>

		Postal Code: <input name="postalCode" />		
		<br><br>

		<input type="submit" value="Submit" />
				
	</form>

</body>

</html>










