<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="<c:url value='/resources/css/Project.css' />">
 
<title>Insert title here</title>
</head>
<body style="margin:0%">
<div class="container-fluid">
<%@include file="/WEB-INF/Views/Header.jsp" %>

    <!-- Form begins -->

		<div class="row">

			<div class="col-md-6" style="margin-left: 30%">

				<form:form action="addProduct" method="POST"

					modelAttribute="product" class="form-group" >

					
<%-- 
					<form:input path="productId" type="hidden" /> --%>



					<form:label path="productName">Product Name:</form:label>

					<form:input path="productName" type="text" class="form-control" />

					<br>

					 

					<form:label path="productPrice">Product Price:</form:label>

					<form:input path="productPrice" type="text" class="form-control" />

					<br>

					<form:label path="productDescription">Product Description:</form:label>

					<form:input path="productDescription" type="text"

						class="form-control" />

						<br>

						

						 

						

					 
 
					<input type="submit" value="SUBMIT" class="btn1">

					

				</form:form>

			</div>

		</div>

		<!-- Form ends -->

<%@ include file="/WEB-INF/Views/Footer.jsp" %>

</div>
</body>
</html>