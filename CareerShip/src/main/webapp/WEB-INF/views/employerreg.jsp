<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
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
  <div id="fullscreen_bg"/>
 

  
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
        <li><a href="/vjf/jobseekerlogin">Job Seeker Login</a></li>
        <li><a href="/vjf/jobseekerregistration">Job Seeker Registration</a></li>
        <li><a href="/vjf/employerlogin">Employer Login</a></li>
        <li class="active"><a href="/vjf/employerregistration">Employer SignUp</a></li>
      </ul>
      
    </div>
  </div>
</nav>

<div class="container">
  <h2>Employer Registration</h2>
  <c:if	test="${not empty errorE}">
  <div	class="alert	alert-danger">
  Email already exist<br/>
</div>
  </c:if>
  
  <form:form  modelAttribute="eRegis" action="/regdoneE" method="POST">
    <div class="form-group" id="labels">
	<label for="usr">Company name:</label>
		  <div class="form-group">
  
  <form:input path= "eCompanyName"  type="text" class="form-control" id="usr" placeholder="Company name" />
 
	</div>
    <div class="form-group">
	<div class="input-group">
      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
      <form:input path="eName" type="email" class="form-control" id="email" placeholder="Enter email" required="required" />
    </div>
      
	  
    <br />
    <div class="form-group">
	<div class="input-group">
      <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
      
	  <form:input type="password" path="ePassword" class="form-control" id="pwd" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
		  title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" maxlength="15" placeholder="Enter Password" required="required"/>
		   <p id="q"></p>
	  
	  
    </div> 
    </div>
	<div class="form-group">
      <label for="pwd">Confirm Password:<span class="form-required">
          </span></label>
      <input type="password" class="form-control" id="pwd" class="form-control" id="pwd" name="pwd2" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" required title="Please enter the same Password as above" type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" name="pwd2" onchange="
  this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
" placeholder="Confirm password">
    </div>
	</div>
	
	<div class="form-group">
      <label for="num">Phone number:<span class="form-required">
          </span></label>
      <form:input  path="ePhone" class="form-control" id="num" required="required" title="Please enter your phone number" type="number" placeholder="Enter your phone number" />
    </div>
	
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
    <button type="cancel" class="btn btn-default">Cancel</button>
  </form:form>
</div>

</body>
</html>

