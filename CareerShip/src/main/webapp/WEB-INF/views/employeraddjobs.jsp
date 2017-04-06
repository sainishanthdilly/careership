<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
<style>
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

</style>
<body>
<div id="fullscreen_bg"> 


<div class="container">
		
		
		 <form:form  modelAttribute="eJobsPost" action="/vjf/employer/addedpostjobs" method="POST">
    <div class="form-group" id="labels">
	<label for="usr">Job Title:</label>
		  <div class="form-group">
  
  <form:input path= "title"  type="text" class="form-control" id="usr" placeholder="Job Title" required="required"/>
 
	</div>
    <div class="form-group">
	<div class="input-group">
      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
      <form:input path="desc" type="text" class="form-control" id="email" placeholder="Enter job description" required="required" />
    </div>
    <br />
    <div class="form-group">
	</div>
	</div>
	
	<div class="form-group">
      <label for="num">Phone number:<span class="form-required">
          </span></label>
      <form:input  path="location" class="form-control" id="location" required="required" title="Please enter job location" type="text" placeholder="Enter job location" />
    </div>
    <button type="save" class="btn btn-default">Submit</button>
    <button type="cancel" class="btn btn-default">Cancel</button>
  </form:form>
		
			
			</div>

</div>
</body>
</html>