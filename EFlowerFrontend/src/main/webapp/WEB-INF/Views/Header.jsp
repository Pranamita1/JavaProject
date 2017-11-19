<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <div class="row" style="background-color:black;height:50px;">
<nav class="navbar col-md-12">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">FlowerZone</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="<c1:url value="home"/>" >Home</a></li>
        <li><a href="</>">Products</a></li>
        <li><a href="<c1:url value="about"/>">About Us</a></li>
       
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="<c1:url value="Admin"/>"><span class="glyphicon glyphicon-user"></span> Admin</a></li>
        <li><a href="<c1:url value="Sign_in"/>"><span class="glyphicon glyphicon-user"></span> Sign In</a></li>
        <li><a href=<c1:url value="Sign_up"/>><span class="glyphicon glyphicon-registration-mark"></span> Sign Up</a></li>
      </ul>
    </div>
  </div>
</nav>
</div>
   
</body>
</html>