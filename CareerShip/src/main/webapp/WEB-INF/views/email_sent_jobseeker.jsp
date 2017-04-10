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
	}
	
	#bye{
	font-family: "Comic Sans MS", cursive, sans-serif;
	font-size: 20px;
	position: static;
		color: cyan ;
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


hr {
    display: block;
	color : cyan;
    height: 1px;
    border: 0;
    border-top: 1px solid #ccc;
    margin: 1em 0;
    padding: 0;
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

<hr/>

	
	
	
	
	 
	 <p></p>
	 <h2 id="bye">A verification email has been sent!</h2>
<h3 id="bye">Check your email and follow the link to finish creating your account.</h3>
<p id="bye"> 
<img src ="https://digitalsynopsis.com/wp-content/uploads/2015/10/gif-icons-menu-transition-animations-shake-new-mail.gif" width=500px height = 200px></img>
</p>

<p> </p>
<p> <button type="button" class="btn btn-primary" onclick="window.location.href='/vjf/mailverify/resendEmailJobSeeker'">Resend email</button> </p>
	
<p></p>
	<p> <button type="button" class="btn btn-primary" onclick="window.location.href='/vjf/home'">Home</button>
	 <button type="button" class="btn btn-primary" onclick="window.location.href='/vjf/jobseek/applyjobs'">Go to Job Search</button>   </p>
<p> </p>

	</div> 
	 
	</div>
	</div>
	</div>
	</body>