<!DOCTYPE html>
<html lang="en">
<head>
  <title>Virtual Job Fair </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  
   /* Remove the navbar's default rounded borders and increase the bottom margin */
    
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
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
	overflow : scroll;
    }
	
	#hi{
		
		 font-family:Georgia, serif;
		font-size: 30px;
		color: white;
		padding-bottom: 0px;
		text-align:left;
	}
	
	#bye{
	font-family: "Comic Sans MS", cursive, sans-serif;
	font-size: 20px;
	position: static;
		color: white;
		padding-bottom: 0px;
		text-align:center;
		//width:900px;
		//height:30px;
	}
	
	//tr:nth-child(even){background-color: #f2f2f2}
	
	
	#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	color: white;
    border-collapse: collapse;
    width: 600px;
	
}

#customers td, #customers th {
    border: 0px solid #ddd;
    padding: 8px;
}

//#customers tr:nth-child(even){background-color: #f2f2f2;}



#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: center;
    background-color: 	#87CEFA;
    color: white;
}


#button1{
background-color: white;
    color: black;
    border: 2px solid #4CAF50; /* Green */
}

#button2{
background-color: white;
    color: black;
    border: 2px solid #f44336; /* Red */
}
	
	
	
/* animation for heading careership */	
	#myDIV {
    -webkit-animation: mymove 5s infinite; /* Chrome, Safari, Opera */
    animation: mymove 5s infinite;
	 font-family:Georgia, serif;
		font-size: 30px;
		color: white;
		padding-bottom: 0px;
}

/* Chrome, Safari, Opera */
@-webkit-keyframes mymove {
    50% {text-shadow: 10px 20px 30px blue;}
}

/* Standard syntax */
@keyframes mymove {
    50% {text-shadow: 10px 20px 30px blue;}
}
	
	
	</style>
	
	
	<body>
	<div class="jumbotron">
  <div class="container text-center">
  <div id="fullscreen_bg"/>
	
	
	<div class="row">
<div class="small-12 columns">

<div id="myDIV">
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
        <li><a href="hp.html">Home</a></li>
        <li class="active"><a href="">Shortlist Candidates</a></li>
        <li><a href="/vjf/jobseekerregistration"></a></li>
        <li><a href="employerlogin.html"></a></li>
        <li><a href="employerreg.html"></a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
	    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user">MyAccount 
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="jobseekerlogin.html">Job Seeker</a></li>
          <li><a href="employerlogin.html">Employer</a></li>
          
        </ul>
      </li>
        <li><a href="#">Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
	 
	 
	 <h2 id="hi"><em>Candidate Info:</em></h2>
	  
<p id="hi"></p>

<div>
<p id="hi"></p>


<table id="customers" >
  <tr id="bye">
  
    

  </tr>
  <tr>
  <td id="bye">Name	: </td>
  <td id="bye">Sam Reeves</td>

  </tr>
  <tr>
  <td id="bye">School	:</td>
  <td id="bye">BITS Pilani</td>
    
  </tr>
  <tr>
  <td id="bye">Degree	:</td>
  <td id="bye">Btech</td>
  </tr>
  <tr>
  <td id="bye">Field of Study	:</td>
  <td id="bye">Computer Science</td>
    
  </tr>
  
</table>
</div>	
<p></p>

	 <h2 id="hi"><em>Work Experience:</em></h2>
<p id="hi"></p>

<div >
<p id="hi"></p>

<div>
<table id="customers" >
  <tr id="bye">
  
    

  </tr>
  <tr>
  <td id="bye">Company	:</td>
  <td id="bye">Amazon</td>

  </tr>
  <tr>
  <td id="bye">Location	:</td>
  <td id="bye">Hyderabad</td>
    
  </tr>
  <tr>
  <td id="bye">Position	:</td>
  <td id="bye">Software Developer</td>
  </tr>
  <tr>
  <td id="bye">Field of Study	:</td>
  <td id="bye">Computer Science</td>
    
  </tr>
  
</table>
</div>
	<p><button type="button"  class="btn btn-success" onclick=this.disabled=true;>Shortlist</button> </p> 
<p> </p>
	 
	 
	</div>
	</div>
	</body>