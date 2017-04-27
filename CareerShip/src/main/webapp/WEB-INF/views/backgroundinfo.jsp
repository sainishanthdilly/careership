<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 <!DOCTYPE html>
<html>
<head>
  <title>Background Information</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<style type="text/css">
.jumbotron { 
    background-image: url('http://beatwhale.com/images/background.png');
    color: #ffffff;
}

.container { 
   
    color: #ffffff;
}
#bl{
color: #black;
}

.navbar-header img {
  float: left;
  width: 50px;
  height: 50px;
}

#fullscreen_bg {
  background-image: url('http://beatwhale.com/images/background.png');
    position: absolute;
    top: 0;
    right: 0;
    bottom: 0;
    left: 0;
    background-size: cover;
    overflow:scroll;
    background-position: 100% 100%;
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
display: inline;
}
fieldset.date { 
  margin: 0; 
  padding: 0; 
  padding-left: 20px; 
  padding-bottom: .5em; 
  display: block; 
  border: none; 
} 

fieldset.date legend { 
  margin: 0; 
  padding: 0; 
  margin-top: .25em; 
  font-size: 100%; 
} 


fieldset.date label { 
  position: absolute; 
  top: -20em; 
  left: -200em; 
} 

fieldset.date select { 
margin: 0; 
padding: 0; 
font-size: 100%; 
display: inline; 
color:Blue;
} 

span.inst { 
  font-size: 75%; 
  color: blue; 
  padding-left: .25em; 
} 


fieldset.date select:active, 
fieldset.date select:focus, 
fieldset.date select:hover 
{ 
  border-color: gray; 
  background-color: white; 
} 

#email{
	float:right;
	margin-right: 5px;
	padding-top: 5px;
	font-size: 16px;
	font-family: Verdana, sans-serif;
	color: #ffffff;
}
	


</style>

<body>
<div class="jumbotron">
     <div class="container text-center">
        <div id="fullscreen_bg"/>  
          <div class="row">
		    <div class="small-12 columns">
              <div id="hi">CAREERSHIP<h4>Find the right job. Right now. </h4></div>
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
         <li><a href="/vjf/job/backgroudinfo">Background information</a></li>
         <li><a href="/vjf/jobseek/searchjobs">Search Jobs</a></li>
         
      </ul>
      <ul class="nav navbar-nav navbar-right">
	    <li><a href="/logout">Logout</a></li>
	  </ul>
      
      
    </div>
  </div>
</nav>
<div class="container">
  <div class="panel-group" id="accordion">
   <form:form modelAttribute="jBioData" action="/BioDataDone" method="POST">
     
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Personal Information</a>
        </h4>
      </div>
      
         <div id="collapse1" class="panel-collapse collapse in">
	  
            <div class="panel-body">
		       
	             <div class="form-group" id="labels" style="color:black;"> 
                   <label for="usr">First name:</label>
                     <div class="form-group">  
                         <form:input path ="jFirstName" type="text" class="form-control" value="${jBioData.jFirstName}" id="usr" placeholder="Enter First name" required="required" 
                         title="Must Enter the First Name" maxlength="30" />
	                    </div>
		    
	
  
                   <div class="form-group" id="labels" style="color:black;"> 
                        <label for="usr">Last name:</label>
                          <div class="form-group">  
                            <form:input type="text" path = "jLastName" value = "${jBioData.jLastName}" class="form-control" id="usr" placeholder="Enter last name" required="required" 
                         title="Must Enter the Last Name" maxlength="30"/>
	                       </div>
				    
  
	               <div>    
	                 <h3 style="color:black;">Contact Information</h3>
	                 <p style="color:black;"> ${JobSeekerEmail} <span><i  class="glyphicon glyphicon-lock"></i></span> only provided to the employers you apply to</p>
	
	                 
	               </div>
				   <div class="form-group" id="labels" style="color:black;"> 
                        <label for="num">Phone Number:<span class="form-required">
                         </span></label>
                          <div class="form-group">  
                            <form:input type="number" value= "${jBioData.jPhone}" path = "jPhone" class="form-control" id="num" placeholder="Enter phone Number" required="required" 
                         title="Enter the Phone number with 10 digits" maxlength="10" />
	                       </div>
	
                   <br />
                     <button type="Save" class="btn btn-default">Save</button>
                   <br/>
				 </div>
	         </div>
           </div>
	     </div>
	    </div>
	  </div>
	
       <div class="panel panel-default">
          <div class="panel-heading">
           <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Educational Information</a>
             </h4>
            </div>
          <div id="collapse2" class="panel-collapse collapse">
            <div class="panel-body"><c:if	test="${not empty errorJ}"></c:if>
           
	
	           <div class="form-group" id="labels" style="color:black;"> 
                 <label for="usr">School </label>
                    <div class="form-group">  
                         <form:input path ="jSchool" value="${jBioData.jSchool}" type="text" class="form-control" id="usr" placeholder="Enter School Name" required="required" 
                         title="Must Enter the School Name" maxlength="50" />
	                    </div>
	
  
                <div class="form-group" id="labels" style="color:black;"> 
                  <label for="usr">Degree</label>
 
                       <div class="form-group">  
                           <form:input type="text" path = "jDegree" value="${jBioData.jDegree}" class="form-control" id="usr" placeholder="Enter Degree" required="required" title="Must Enter the Degree Name" maxlength="50"/>
	 
	                    </div>
	                   <p class = "help-block">e.g, BA,BS,PhD,JD</p>
	
	            <div class="form-group" id="labels" style="color:black;"> 
                     <label for="usr">Field Of Study</label>
                        <div class="form-group">  
                          <form:input type="text" value = "${jBioData.jFStudy}" path = "jFStudy" class="form-control" id="usr" placeholder="Enter Field of Study"
                          required="required" 
                         title="Must Enter the Field of Study" maxlength="30" />
	                          </div>
                           <p class = "help-block">e.g, Biology,Computer Science, Nursing, Psychology</p>
               <div class="form-group" id="labels" style="color:black;">
                <label for="usr">Time Period </label>
   
   
                      <fieldset class="date"> 
   
                           <label for="month_start">Month</label> 
                               <form:select path ="jSStudyMonth"  id="month_start" name="month_start" required="required">
                                    
                                      <c:if test="${empty jBioData.jSStudyMonth}" >
                                      <form:option selected="selected" value="Month">Month</form:option> 
                                      </c:if>
                                      <c:if test="${not empty jBioData.jSStudyMonth}" >
                                      <form:option selected="selected" value="${jBioData.jSStudyMonth}" > ${jBioData.jSStudyMonth}</form:option> 
                                      </c:if>
                                      
    <form:option value="January">January</form:option>       
    <form:option value="February">February</form:option>       
    <form:option value="March">March</form:option>       
    <form:option value="April">April</form:option>       
    <form:option value="May">May</form:option>       
    <form:option value="June">June</form:option>       
    <form:option value="July">July</form:option>       
    <form:option value="August">August</form:option>       
    <form:option value="September">September</form:option>       
    <form:option value="October">October</form:option>       
    <form:option value="November">November</form:option>       
    <form:option value="December">December</form:option>         
                                </form:select> - 
   
  <label for="year_start">Year</label> 
  <form:select path ="jSStudyYear"  id="year_start" 
         name="year_start" required="required">
         
     <c:if test="${empty jBioData.jSStudyYear}" >
	<form:option selected="selected" value="Year">Year</form:option>	
	</c:if> 
	 <c:if test="${not empty jBioData.jSStudyYear}" >
	<form:option selected="selected" value="${jBioData.jSStudyYear}" >${jBioData.jSStudyYear}</form:option>	
	</c:if> 
	
	
	<form:option  value="2004">2004</form:option> 
	<form:option  value="2005">2005</form:option> 
	<form:option  value="2006">2006</form:option> 
	<form:option  value="2007">2007</form:option> 
	<form:option  value="2008">2008</form:option> 
    <form:option  value="2009">2009</form:option>       
    <form:option  value="2010">2010</form:option>       
    <form:option  value="2011">2011</form:option>       
    <form:option  value="2012">2012</form:option>       
    <form:option  value="2013">2013</form:option>       
    <form:option  value="2014">2014</form:option>       
    <form:option  value="2015">2015</form:option>       
    <form:option  value="2016">2016</form:option>       
    <form:option  value="2017">2017</form:option>       
    <form:option  value="2018">2018</form:option>     
  </form:select> 
  <span class="inst">(Month-Year)</span> 
</fieldset> 

<fieldset class="date"> 
   
  <label for="month_end">Month</label> 
  <form:select id="month_end" path="jEStudyMonth" 
          name="month_end" required="required">
    
    <c:if test="${empty jBioData.jEStudyMonth}" >
    <form:option selected="selected" value="Month">Month</form:option>
    </c:if>
    <c:if test="${not empty jBioData.jEStudyMonth}" >
    <form:option selected="selected" value="${jBioData.jEStudyMonth}">${jBioData.jEStudyMonth}</form:option>
    </c:if>
    <form:option value="January">January</form:option>       
    <form:option value="February">February</form:option>       
    <form:option value="March">March</form:option>       
    <form:option value="April">April</form:option>       
    <form:option value="May">May</form:option>       
    <form:option value="June">June</form:option>       
    <form:option value="July">July</form:option>       
    <form:option value="August">August</form:option>       
    <form:option value="September">September</form:option>       
    <form:option value="October">October</form:option>       
    <form:option value="November">November</form:option>       
    <form:option value="December">December</form:option>         
           
  </form:select> -
  <label for="year_end">Year</label> 
  <form:select id="year_end" path="jEStudyYear" 
         name="year_end"  required="required">
     
      <c:if test="${empty jBioData.jEStudyYear}" >    
	 <form:option selected="selected" value="Year">Year</form:option>
	 </c:if>
	 
      <c:if test="${not empty jBioData.jEStudyYear}" >    
	 <form:option selected="selected" value="${jBioData.jEStudyYear}">${jBioData.jEStudyYear}</form:option>
	 </c:if>
	 
	 
	<form:option  value="2004">2004</form:option> 
	<form:option  value="2005">2005</form:option> 
	<form:option  value="2006">2006</form:option> 
	<form:option  value="2007">2007</form:option> 
	<form:option  value="2008">2008</form:option> 
    <form:option  value="2009">2009</form:option>       
    <form:option  value="2010">2010</form:option>       
    <form:option  value="2011">2011</form:option>       
    <form:option  value="2012">2012</form:option>       
    <form:option  value="2013">2013</form:option>       
    <form:option  value="2014">2014</form:option>       
    <form:option  value="2015">2015</form:option>       
    <form:option  value="2016">2016</form:option>       
    <form:option  value="2017">2017</form:option>       
    <form:option  value="2018">2018</form:option>             
  </form:select> 
  <span class="inst">(Month-Year)</span> 
</fieldset> 
	
    
	         </br>
	            <button type="Save" class="btn btn-default">Save</button>
             <br/>
  
           </div>
         </div>
        </div>
	   </div>
	   </div>
	   </div>
	   </div>
	
	 
    
     <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Work Experience</a>
        </h4>
      </div>
      <div id="collapse3" class="panel-collapse collapse">
        <div class="panel-body"><c:if	test="${not empty errorJ}">
  
    </c:if>
  
	
	<div class="form-group" id="labels" style="color:black;"> 
 <label for="usr">Job Title </label>
 <div class="form-group">  
  <form:input path ="jWJobTitle" value ="${jBioData.jWJobTitle}" type="text" class="form-control" id="usr" placeholder="Enter job title" required="required" title="Must Enter the Job Title" maxlength="30" />
	</div>
	
  
  <div class="form-group" id="labels" style="color:black;"> 
 <label for="usr">Company</label>
   <div class="form-group">  
  <form:input  type="text" path = "jWCompany" value = "${jBioData.jWCompany}" class="form-control" id="usr" placeholder="Enter Company Name" required="required" 
                         title="Must Enter the Company Name you worked" maxlength="30"/>
	 
	</div>
	
	
	<div class="form-group " id="labels" style="color:black;">
    <label for="CountryId">Country</label>
	<div class="form-group">
	
    <form:select class="form-control GSgd4 fieldWrapper" path="jWCountry"   id="CountryId" name="CountryId" required="required" >
    
          <c:if test="${empty jBioData.jWCountry}" >    
	 <form:option selected="selected" value="US">US</form:option>
	 </c:if>
	 
      <c:if test="${not empty jBioData.jWCountry}" >    
	 <form:option selected="selected" value="${jBioData.jWCountry}" >${jBioData.jWCountry}</form:option>
	 </c:if>
    
    
<form:option value="Australia">Australia</form:option>
<form:option value="Brazil">Brazil</form:option>
<form:option value="Canada">Canada</form:option>
<form:option value="China">China</form:option>
<form:option value="Germany">Germany</form:option>
<form:option value="India">India</form:option>
<form:option value="Italy">Italy</form:option>
<form:option value="Japan">Japan</form:option>
<form:option value="Mexico">Mexico</form:option>
<form:option value="New Zealand">New Zealand</form:option>
<form:option value="UK">UK</form:option>
<form:option value="US">US</form:option>


</form:select>

 <!-- Note* try to assig id but it conflicts with location autocomplete result -->
                </div>
				</div>
	<div class="form-group" id="labels" style="color:black;"> 
 <label for="usr">City</label>
 <div class="form-group">  
  <form:input type="text" path = "jWCity" value = "${jBioData.jWCity}" class="form-control" id="usr" placeholder="Enter City name" required="required" title="Must Enter the City Name you worked" maxlength="30" />
	</div>
	</div>
   <br />
   <div class="form-group" id="labels" style="color:black;">
   <label for="usr">Time Period </label>
   </div>
   <div>
  <fieldset class="date"> 
   
  <label for="month_start">Month</label> 
  <form:select id="month_start" 
          name="month_start" path="jSWorkMonth"  required="required" > 
     <c:if test ="${empty jBioData.jSWorkMonth} ">
     <form:option selected="selected" value="Month">Month</form:option> 
     </c:if>
     <c:if test ="${not empty jBioData.jSWorkMonth} ">
     <form:option selected="selected" value="${jBioData.jSWorkMonth}" >${jBioData.jSWorkMonth}</form:option> 
     </c:if>
    <form:option value="January">January</form:option>       
    <form:option value="February">February</form:option>       
    <form:option value="March">March</form:option>       
    <form:option value="April">April</form:option>       
    <form:option value="May">May</form:option>       
    <form:option value="June">June</form:option>       
    <form:option value="July">July</form:option>       
    <form:option value="August">August</form:option>       
    <form:option value="September">September</form:option>       
    <form:option value="October">October</form:option>       
    <form:option value="November">November</form:option>       
    <form:option value="December">December</form:option>       
  </form:select> 
   
  <label for="year_start">Year</label> 
  <form:select path ="jSWorkYear"  id="year_start" 
         name="year_start" required="required"> 
	
	<c:if test ="${empty jBioData.jSWorkYear}">
	<form:option selected="selected" value="Year">Year</form:option>	 
	</c:if>
	<c:if test ="${not empty jBioData.jSWorkYear}">
	<form:option selected="selected" value="${jBioData.jSWorkYear}" >${jBioData.jSWorkYear}</form:option>	 
	</c:if>
	
	
	 
	<form:option  value="2004">2004</form:option> 
	<form:option  value="2005">2005</form:option> 
	<form:option  value="2006">2006</form:option> 
	<form:option  value="2007">2007</form:option> 
	<form:option  value="2008">2008</form:option> 
    <form:option  value="2009">2009</form:option>       
    <form:option  value="2010">2010</form:option>       
    <form:option  value="2011">2011</form:option>       
    <form:option  value="2012">2012</form:option>       
    <form:option  value="2013">2013</form:option>       
    <form:option  value="2014">2014</form:option>       
    <form:option  value="2015">2015</form:option>       
    <form:option  value="2016">2016</form:option>       
    <form:option  value="2017">2017</form:option>       
    <form:option  value="2018">2018</form:option>        
  </form:select> 
  <span class="inst">(Month-Year)</span> 
</fieldset> 

<fieldset class="date"> 
   
  <label for="month_end">Month</label> 
  <form:select id="month_end" 
          name="month_end" path="jEWorkMonth"  required="required" > 
    <c:if test="${empty jBioData.jEWorkMonth} ">
    <form:option selected="selected" value="Month">Month</form:option>
    </c:if>
    
    <c:if test="${not empty jBioData.jEWorkMonth} ">
    <form:option selected="selected" value="${jBioData.jEWorkMonth}" >${jBioData.jEWorkMonth}</form:option>
    </c:if>
    
    
    <form:option value="January">January</form:option>       
    <form:option value="February">February</form:option>       
    <form:option value="March">March</form:option>       
    <form:option value="April">April</form:option>       
    <form:option value="May">May</form:option>       
    <form:option value="June">June</form:option>       
    <form:option value="July">July</form:option>       
    <form:option value="August">August</form:option>       
    <form:option value="September">September</form:option>       
    <form:option value="October">October</form:option>       
    <form:option value="November">November</form:option>       
    <form:option value="December">December</form:option>      
    
    
    
  </form:select> -
  <label for="year_end">Year</label> 
  <form:select id="year_end" 
         name="year_end" path="jEWorkYear" value="${jBioData.jEWorkYear}" required="required" > 
	 
	  <c:if test="${ empty jBioData.jEWorkYear} ">
	 <form:option selected="selected" value="Year">Year</form:option>
	 </c:if>
	  <c:if test="${not empty jBioData.jEWorkYear} ">
	 <form:option selected="selected" value="${jBioData.jEWorkYear}">${jBioData.jEWorkYear}</form:option>
	 </c:if>
	 
	 
	 
	<form:option  value="2004">2004</form:option> 
	<form:option  value="2005">2005</form:option> 
	<form:option  value="2006">2006</form:option> 
	<form:option  value="2007">2007</form:option> 
	<form:option  value="2008">2008</form:option> 
    <form:option  value="2009">2009</form:option>       
    <form:option  value="2010">2010</form:option>       
    <form:option  value="2011">2011</form:option>       
    <form:option  value="2012">2012</form:option>       
    <form:option  value="2013">2013</form:option>       
    <form:option  value="2014">2014</form:option>       
    <form:option  value="2015">2015</form:option>       
    <form:option  value="2016">2016</form:option>       
    <form:option  value="2017">2017</form:option>       
    <form:option  value="2018">2018</form:option>       
  </form:select> 
  <span class="inst">(Month-Year)</span> 
 
</fieldset> 

	</div>
	
	 <div class="form-group">
      <label for="comment">Job Description:</label>
      <form:textarea class="form-control" rows="5" value= "${jBioData.jWDescription}" path= "jWDescription" id="comment" required="required" title="Must Enter the description" maxlength="30" ></form:textarea>
    </div>
    
   <br />
	
    
	<button type="Save" class="btn btn-default">Save</button>
	<button type="Submit" class="btn btn-default">Submit</button>
  </form:form>
  
  <br/>
  
</div>
</div>
</div>
      </div>
    </div>
  
   </div> 
  </div>
 </div>
</div>   
</body>
</html>
