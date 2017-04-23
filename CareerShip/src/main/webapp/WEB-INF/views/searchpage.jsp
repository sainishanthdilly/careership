

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Jobseeker Registration</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<style>
.jumbotron { 
    background-image: url('http://beatwhale.com/images/background.png');
    color: #ffffff;
}

.container { 
   
    color: #ffffff;
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
	overflow : scroll;
    
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
		

		
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	color: white;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

//#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #AFEEEE;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: center;
    background-color: 	#87CEFA;
    color: white;
}
		
		
	
	
/*search bar */
	
	
body {
    padding-top: 50px;
}
.dropdown.dropdown-lg .dropdown-menu {
    margin-top: -1px;
    padding: 6px 20px;
}
.input-group-btn .btn-group {
    display: flex !important;
}
.btn-group .btn {
    border-radius: 0;
    margin-left: -1px;
}
.btn-group .btn:last-child {
    border-top-right-radius: 4px;
    border-bottom-right-radius: 4px;
}
.btn-group .form-horizontal .btn[type="submit"] {
  border-top-left-radius: 4px;
  border-bottom-left-radius: 4px;
}
.form-horizontal .form-group {
    margin-left: 0;
    margin-right: 0;
}
.form-group .form-control:last-child {
    border-top-left-radius: 4px;
    border-bottom-left-radius: 4px;
}

@media screen and (min-width: 768px) {
    #adv-search {
        width: 500px;
        margin: 0 auto;
    }
    .dropdown.dropdown-lg {
        position: static !important;
    }
    .dropdown.dropdown-lg .dropdown-menu {
        min-width: 500px;
    }
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
         <li><a href="hp.html">Home</a></li>
        <li><a href="vjf/jobseekerlogin">Job Seeker Login</a></li>
        <li class="active"><a href="/vjf/jobseekerregistration">Job Seeker Registration</a></li>
        <li><a href="employerlogin.html">Employer Login</a></li>
        <li><a href="employerreg.html">Employer SignUp</a></li>
      </ul>
      
    </div>
  </div>
</nav>

<div class="container">

	<div class="row">
		<div class="col-md-12">
            <div class="input-group" id="adv-search">
                <input type="text" class="form-control" placeholder="Search for Jobs" />
                <div class="input-group-btn">
                    <div class="btn-group" role="group">
                        <div class="dropdown dropdown-lg">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><span class="caret"></span></button>
                            <div class="dropdown-menu dropdown-menu-right" role="menu">
                                <form class="form-horizontal" role="form">
                                  <div class="form-group">
                                    <label for="filter">Filter by</label>
                                    <select class="form-control">
                                        <option value="0" selected>All Jobs</option>
                                        <option value="1">Company</option>
                                        <option value="2">Location</option>
                                        <option value="3">Title</option>
                                        
                                    </select>
                                  </div>
                                  <div class="form-group">
                                    <label for="contain">Job</label>
                                    <input class="form-control" type="text" />
                                  </div>
                                  
                                  <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </form>
                            </div>
                        </div>
                        <button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                    </div>
                </div>
			
            </div>
			 <h4>Search Results :</h4>
<p id="hi"></p>

<div style="overflow-x:auto;">
<table id="customers">
  <tr id="bye">
    <th width=500px >Position</th>
	<th>Company</th>
    <th >Location</th>
    <th>Type</th>
	<th> </th>

  </tr>
  
  <tr>
    <td><strong><u>DevOps Engineer</u></strong> </br>
	Description : Our TOP financial client is looking for a DevOps Engineer from an Application Development background to join their team. 
	 Please Apply Now directly if interested! Automation Engineers are responsible for interfacing with the application development teams.
	</td>
	<td> Honeywell </td>
    <td>New York</td>
    <td>Full Time</td>
	<td>  <button type="button" class="btn btn-success" onclick="alert('Cant Edit')">Apply Now</button> </td>

  </tr>
 
  <tr>
    <td><strong><u>SAS Developer </u></strong></br>
	Description : SAS Developer Summary: Signature Consultants is looking for a SAS Developer for an opportunity in Charlotte, NC. 
	The ideal candidate will be one that has worked within a large enterprise environment and has created BI Solutions with SAS and has prior experience</td>
    <td> Big Solutions </td>
	<td>Boston</td>
    <td>Full Time</td>
	<td>  <button type="button" class="btn btn-success" onclick="">Apply Now</button> </td>
	
  </tr>
  <tr>
    <td><strong><u>Project Manager</u></strong></br>
	Description : Our client, a Fortune 50 global leader in the financial industry is hiring a Project Manager to join their Change Management 
	Global Marketing and Corporate Affairs team in Charlotte, NC. This position is specifically geared toward permit to send cases. </td>
    <td> Pink </td>
	<td>Charlotte</td>
    <td>Part Time</td>
	<td>  <button type="button" class="btn btn-success" onclick="">Apply Now</button> </td>
	
  </tr>
  
  
</table>
</div>	

		 
	</div>
          </div>
        </div>
	</div>	
</div>














</body>
</html>















