<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <!DOCTYPE html>
 <html>

 <head>
 	<title>Student Registration Form</title>
 </head>
 
 <body>
 	
 	<form:form action="processForm" modelAttribute="student">
 	
	 	First name: <form:input path="firstName"/>
	 	
	 	<br><br>
	 	
	 	Last name: <form:input path="lastName" />
	 	
	 	<br><br>
	 	
	 	Country: 
	 	
	 	<form:select path="country">
	 		
	 		<form:options items="${theCountryOptions}" />
	 		
	 	</form:select> 
	 	
	 	<br><br>
	 	Favorite Programming Language:
	 	<br>
	 	Java<form:radiobutton path="favoriteLanguage" value="Java" />&nbsp;&nbsp;&nbsp;&nbsp;
	 	C#<form:radiobutton path="favoriteLanguage" value="C#" />&nbsp;&nbsp;&nbsp;&nbsp;
	 	PHP<form:radiobutton path="favoriteLanguage" value="PHP" />&nbsp;&nbsp;&nbsp;&nbsp;
	 	Ruby<form:radiobutton path="favoriteLanguage" value="Ruby" />
	 	
	 	<br><br>
	 	Favorite Operating Systems:
	 	<br>
	 	Linux <form:checkbox path="operatingSystems" value="Linux" />&nbsp;&nbsp;&nbsp;&nbsp;
	 	MacOS <form:checkbox path="operatingSystems" value="MacOS" />&nbsp;&nbsp;&nbsp;&nbsp;
	 	Windows <form:checkbox path="operatingSystems" value="Windows" />
	 	<br><br>
	 	<input type="submit" value="Submit" /> 
	 
 	</form:form>
 
 </body>
 
 
 </html>