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
    }
	
	#hi{
		
		 font-family:Georgia, serif;
		font-size: 40px;
		color: white;
		padding-bottom: 0px;
	}
	
	
	#bye{
	font-family: Verdana, Geneva, sans-serif;
	font-size: 15px;
	position: static;
		color: black;
		padding-bottom: 0px;
		text-align:center;
		width:900px;
		height:30px;
	}
	
	
	#end{
	font-family: Verdana, Geneva, sans-serif;
	font-size: 15px;
	
		color: black;
		padding-bottom: 0px;
		text-align:center;
		width: 950px;
		height:30px;
	}
	
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
    background-image:url('Image_home/homepage.jpg');
	background-size: cover;
	background-repeat:no-repeat center center;
	min-height:100%;
		  margin-bottom: 0;
	
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
	
	#footer {
	clear: both;
    position: relative;
    z-index: 10;
   height : 70px; 
   left:0px;
   bottom:10px;
   width:100%;
   background:PaleTurquoise ;
}


<!--* html #footer {
   position:absolute;
   top:expression((0-(footer.offsetHeight)+(document.documentElement.clientHeight ? document.documentElement.clientHeight : document.body.clientHeight)+(ignoreMe = document.documentElement.scrollTop ? document.documentElement.scrollTop : document.body.scrollTop))+'px');
	-->
	

body  {
	background-repeat: repeat-x;	
    background-color: lightblue;
}

  </style>
</head>
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


<div class="row">
<div class="small-12 columns">
<div id="recent-searches">
<div class="row hide" id="recent-searches-header">
<div class="small-12 columns">
<h3>Recent Searches</h3>
</div>
</div>


</div>
</div>
</div>

  
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
        <li class="active"><a href="/vjf/home">Home</a></li>
        <li><a href="/vjf/jobseekerlogin">Job Seeker Login</a></li>
        <li><a href="/vjf/jobseekerregistration">Job Seeker Registration</a></li>
        <li><a href="/vjf/employerlogin">Employer Login</a></li>
        <li><a href="/vjf/employerregistration">Employer SignUp</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
	    <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user">${MyAccount} 
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="jobseekerlogin.html">Job Seeker</a></li>
          <li><a href="employerlogin.html">Employer</a></li>
          
        </ul>
      </li>
        <li><a href="#"><span class="glyphicon glyphicon-user"></span>Logout</a></li>
      </ul>
    </div>
  </div>
</nav>



<div class="container" id="bye">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Jobs</div>
        <div class="panel-body"><img src="https://appsftw.com/im/is5.mzstatic.com/image/thumb/Purple71/v4/4f/88/73/4f8873c6-5341-71be-6128-69e0c740dd44/source/512x512bb.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">1 million </br> Freshly posted jobs</div>
      </div>
    </div>
    
	<div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Companies</div>
        <div class="panel-body"><img src="https://cdn4.iconfinder.com/data/icons/ios7-active-2/512/Company.png" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">100,000  companies</div>
      </div>
    </div>
	
	
	<div class="row">
    <div class="col-sm-4"> 
      <div  class="panel panel-primary">
        <div class="panel-heading">Advice</div>
        <div class="panel-body"><img src="https://image.freepik.com/free-photo/eye-icon-symbol-protection-sign-glasses-face-man_121-98852.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">1 awesome you </div>
      </div>
    </div>
  </div>
</div><br>
</div>



<div class="container" id="end">    
  
	
	<div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Jeremy </br>New York City, NY</div>
        <div class="panel-body"><img src="http://www.brandeis.edu/gps/assets/img/program/hero/program-hero-software.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">"It saved me from accepting a position at a creative agency that received overall negative reviews. ” </div>
      </div>
    </div>
	
	
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Kate </br> Washington, DC</div>
        <div class="panel-body"><img src="http://assets.makers.com/field/image/01_1.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">“ I just got a job that I applied for via Careership! I used the site all the time during my job hunt. ”</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Anne </br> Seattle, WA</div>
        <div class="panel-body"><img src="https://cdn.shutterstock.com/shutterstock/videos/6095057/thumb/1.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">“ I really appreciate the work Careership is doing to empower and inform so I can make the best decision. ” </div>
      </div>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center" id="footer">
  
  <form class="form-inline">Looking for a job ?
    <input type="email" class="form-control" size="20" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  </form>
</footer>
</body>

</html>

