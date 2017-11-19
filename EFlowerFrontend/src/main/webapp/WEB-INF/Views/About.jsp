<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<body>
<div class="container-fluid">
<%@ include file="/WEB-INF/Views/Header.jsp" %>
<div  class="row">
	<div class="col-md-12">
		<div class="col-md-5" style="margin-left:27%;border:1px solid">
		 <h2>//Company Name//</h2>
		 <h5>//company address//</h5>
		 <h5>//company fon number//</h5>
		 <p>//Something about Company//</p>
		</div> 
	</div>
</div>
</div>
<%@ include file="/WEB-INF/Views/Footer.jsp" %>
</body>