<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="registration" uri="http://www.springframework.org/tags/form" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <link rel="stylesheet" href="<c:url value='/resources/css/Project.css' />">
</head>

<body style="margin:0%">
<div class="container-fluid">
<%@ include file="/WEB-INF/Views/Header.jsp" %>
<div class="container-fluid">
 
  <registration:form method="POST" action="addUser" modelAttribute="RegistrationForm" style="margin-left:35%;margin-bottom:3%; border:0px solid red; width:350px;">
  
  
  
    <div class="form-group">
      <registration:label for="name" path="name">Name:</registration:label>
      <registration:input type="text" class="form-control" path="name" id="name" placeholder="Enter your name" name="name" style="width:350px" />
    </div>
	
	<div class="form-group">
      <label for="num">Contact number:</label>
      <registration:input type="number" class="form-control" path="contact" id="num" placeholder="Enter your mobile number" name="num" style="width:350px"/>
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <registration:input type="email" class="form-control" path="mail" id="email" placeholder="Enter email" name="email" style="width:350px"/>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <registration:input type="text" class="form-control" path="password" id="pwd" placeholder="Enter password" name="pwd" style="width:350px"/>
    </div>
<!--  	<div class="form-group">
      <label for="pwd">Confirm Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" style="width:350px">
    </div>-->
	
    
    <button type="submit" class="btn btn-default"style="margin-left:40%">Submit</button>

    
    
  </registration:form>
</div>
 
</div>
<%@ include file="/WEB-INF/Views/Footer.jsp" %>
<link rel="stylesheet" href="F:/demo.css"  />
</body>
</html>
