<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<%@ include file="/WEB-INF/Views/Header.jsp" %>
  
<!--<div class="container-fluid">-->
  
   <div id="myCarousel" class="carousel slide" data-ride="carousel"style="border:0px solid red">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="<c:url value='/resources/images/marguerite-daisy-beautiful-beauty.jpg' />"  style="height:350px;width:100%;" />
      </div>

      <div class="item">
        <img src=<c:url value="/resources/images/Beautiful-Pink-Rose-Wallpaper.jpg"/> alt="Chicago" style="height:350px;width:100%;">
      </div>
    
      <div class="item">
        <img src=<c:url value="/resources/images/lily_li21.jpg"/> alt="New york" style="height:350px;width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<div class="container-fluid" style="border:0px solid red;margin-top:2%;">    
  <div class="row">
    <div class="col-md-3" style="border:0px solid red">
      <div class="panel panel-primary">
        <div class="panel-heading">ATTRACTIVE ROSE DEAL</div>
        <div class="panel-body"><img src=<c:url value="/resources/images/img1.jpg" />class="img-responsive" style="width:300px; height:250px;border:0%;" alt="Image"></div>
        <div class="panel-footer"></div>
      </div>
    </div>
    <div class="col-md-3"> 
      <div class="panel panel-danger">
        <div class="panel-heading">AUTHENTICATE ARCHID DEAL</div>
        <div class="panel-body"><img src=<c:url value="/resources/images/ARCHID1.JPG"/> class="img-responsive" style="width:300px;HEIGHT:250px;" alt="Image"></div>
        <div class="panel-footer"></div>
      </div>
    </div>
    <div class="col-md-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">ELEGANT TULIP DEAL</div>
        <div class="panel-body"><img src=<c:url value="/resources/images/tulip1.jpg"/> class="img-responsive" style="width:300px;height:250px;" alt="Image"></div>
        <div class="panel-footer"></div>
      </div>
    </div>
	<div class="col-md-3"> 
      <div class="panel panel-success">
        <div class="panel-heading">FASCINATING GERBERA DEAL</div>
        <div class="panel-body"><img src=<c:url value="/resources/images/204d4e74b8c10cd917672a929a5c0614--coral-color-coral-pink.jpg"/> class="img-responsive" style="width:300px;height:250px;" alt="Image"></div>
        <div class="panel-footer"></div>
      </div>
    </div>
  </div>
</div>

 



</div>
<%@ include file="/WEB-INF/Views/Footer.jsp" %>

<link rel="stylesheet" href="F:/demo.css"  />
</body>
</html>
