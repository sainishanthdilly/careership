<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html lang="en">
<head>
  <title>Employer Registration</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<style>


.navbar-header img {
  float: left;
  width: 50px;
  height: 50px;
}


#fullscreen_bg {
  background-image: url('http://beatwhale.com/images/background.png');
    position: fixed;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    background-size: cover;
    background-position: 50% 50%;
	
    }
	
	
	#hi{
		
		 font-family:Georgia, serif;
		font-size: 40px;
		color: white;
		padding-bottom: 0px;
	}

	.container { 
   
    color: #ffffff;
}

#labels{
text-align: left;
float : left;
color:white;
}
	
</style>

<body>
<div class="jumbotron">
  <div class="container text-center">
  <div id="fullscreen_bg">
 

  
<div class="row">
<div class="small-12 columns">

<div id="hi">
CAREERSHIP
<h4>Find the right job. Right now. </h4>
</div>

</div>
</div>


<nav class="navbar navbar-inverse">

  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
	  
	   <a class="navbar-brand" href="#">
	  <img src= "https://thumb1.shutterstock.com/display_pic_with_logo/3278303/552246277/stock-vector-search-job-icon-one-of-set-web-icons-552246277.jpg" width=50px style = "display:inline-block;">
	  <span style="display: inline-block;" width=50px></span>
	  </a>
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="/vjf/home">Home</a></li>
        <li><a href="/vjf/employer/postjobs">Employer Post Jobs</a></li>
      </ul>
      
    </div>
  </div>
</nav>

<div class="container">
		
		
		 <form:form  modelAttribute="eJobsPost" action="/vjf/employer/addedpostjobs" method="POST">
    <div class="form-group" id="labels">
	<label for="usr">Position:</label>
		  <div class="form-group">
  
  <form:input path= "title"  type="text" class="form-control" id="usr" placeholder="Job Title" required="required"/>
 
	</div>
	
	
	<div class="form-group" id="labels">
	<label for="usr">Description:</label>
		  <div class="form-group" >
		 
		  <form:textarea path="desc" required="required" col="50" rows="4" type="text" color="black"  class="form-control" id="usr" />
		 
  
	</div>

	<div class="form-group" id="labels">
	<label for="usr">Location:</label>
	<span class="input-group">
      <span class="input-group-addon"  ><i class="glyphicon glyphicon-home"></i></span>

	  <form:input type="text" path="location" required="required" class="form-control" id="usr" placeholder="Please enter location"></form:input>
	  
	  
    </span> 
    </div>
	
	</br>
	<div>
    <button type="submit" class="btn btn-default">Submit</button>
    <button type="cancel" onclick="window.location.href="'/vjf/employer/postjobs'" class="btn btn-default">Cancel</button>
  </form:form>
</div>

</body>
</html>
