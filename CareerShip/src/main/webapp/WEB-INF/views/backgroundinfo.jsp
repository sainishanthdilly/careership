 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
         <li><a href="/vjf/employer/postjobs">Employer Post Jobs</a></li>
         
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
                         <form:input path ="jFirstName" type="text" class="form-control" value="${jBioData.jFirstName}" id="usr" placeholder="Enter First name" required="required" />
	                    </div>
		    
	
  
                   <div class="form-group" id="labels" style="color:black;"> 
                        <label for="usr">Last name:</label>
                          <div class="form-group">  
                            <form:input type="text" path = "jLastName" value = "${jBioData.jLastName}" class="form-control" id="usr" placeholder="Enter last name" />
	                       </div>
				    
  
	               <div>    
	                 <h3 style="color:black;">Contact Information</h3>
	                 <p style="color:black;"> Email Address<span><i  class="glyphicon glyphicon-lock"></i></span> only provided to the employers you apply to</p>
	
	                 
	               </div>
				   <div class="form-group" id="labels" style="color:black;"> 
                        <label for="num">Phone Number:<span class="form-required">
                         </span></label>
                          <div class="form-group">  
                            <form:input type="number" value= "${jBioData.jPhone}" path = "jPhone" required="required" class="form-control" id="num" placeholder="Enter phone Number" />
	                       </div>
	
                   </br>
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
                         <form:input path ="jSchool" value="${jBioData.jSchool}" type="text" class="form-control" id="usr" placeholder="Enter School Name" required="required" />
	                    </div>
	
  
                <div class="form-group" id="labels" style="color:black;"> 
                  <label for="usr">Degree</label>
 
                       <div class="form-group">  
                           <form:input type="text" path = "jDegree" value="${jBioData.jDegree}" class="form-control" id="usr" placeholder="Enter Degree" />
	 
	                    </div>
	                   <p class = "help-block">e.g, BA,BS,PhD,JD</p>
	
	            <div class="form-group" id="labels" style="color:black;"> 
                     <label for="usr">Field Of Study</label>
                        <div class="form-group">  
                          <form:input type="text" value = "${jBioData.jFStudy}" path = "jFStudy" class="form-control" id="usr" placeholder="Enter Field of Study" />
	                          </div>
                           <p class = "help-block">e.g, Biology,Computer Science, Nursing, Psychology</p>
               <div class="form-group" id="labels" style="color:black;">
                <label for="usr">Time Period </label>
   
   
                      <fieldset class="date"> 
   
                           <label for="month_start">Month</label> 
                               <form:select path ="jSStudyMonth" value="${jBioData.jSStudyMonth}"  id="month_start" name="month_start" > 
                                      <option selected="selected" value="0">Month</option> 
                                         <option>January</option>       
                                        <option>February</option>       
                                        <option>March</option>       
                                        <option>April</option>       
                                        <option>May</option>       
                                         <option>June</option>       
                                         <option>July</option>
                                          <option>August</option>       
                                         <option>September</option>       
                                         <option>October</option>       
                                        <option>November</option>       
    								    <option>December</option>       
                                </form:select> - 
   
  <label for="year_start">Year</label> 
  <form:select path ="jSStudyYear" value="${jBioData.jSStudyYear}" id="year_start" 
         name="year_start" > 
	<option selected="selected" value="0">Year</option>	 
    <option>2004</option> 
	<option>2005</option> 
	<option>2006</option> 
	<option>2007</option> 
	<option>2008</option> 
	<option>2009</option>       
    <option>2010</option>       
    <option>2011</option>       
    <option>2012</option>       
    <option>2013</option>       
    <option>2014</option>       
    <option>2015</option>       
    <option>2016</option>       
    <option>2017</option>       
    <option>2018</option>       
  </form:select> 
  <span class="inst">(Month-Year)</span> 
</fieldset> 

<fieldset class="date"> 
   
  <label for="month_end">Month</label> 
  <form:select id="month_end" path="jEStudyMonth" value="${jBioData.jEStudyMonth}"  
          name="month_end" > 
    <option selected="selected" value="0">Month</option>
    <option>January</option>       
    <option>February</option>       
    <option>March</option>       
    <option>April</option>       
    <option>May</option>       
    <option>June</option>       
    <option>July</option>       
    <option>August</option>       
    <option>September</option>       
    <option>October</option>       
    <option>November</option>       
    <option>December</option>       
  </form:select> -
  <label for="year_end">Year</label> 
  <form:select id="year_end" path="jEStudyYear"  value="${jBioData.jEStudyYear}" 
         name="year_end" > 
	 <option selected="selected" value="0">Year</option>
	<option>2004</option> 
	<option>2005</option> 
	<option>2006</option> 
	<option>2007</option> 
	<option>2008</option> 
    <option>2009</option>       
    <option>2010</option>       
    <option>2011</option>       
    <option>2012</option>       
    <option>2013</option>       
    <option>2014</option>       
    <option>2015</option>       
    <option>2016</option>       
    <option>2017</option>       
    <option>2018</option>       
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
  <form:input path ="jWJobTitle" value ="${jBioData.jWJobTitle}" type="text" class="form-control" id="usr" placeholder="Enter job title" required="required" />
	</div>
	
  
  <div class="form-group" id="labels" style="color:black;"> 
 <label for="usr">Company</label>
   <div class="form-group">  
  <form:input  type="text" path = "jWCompany" value = "${jBioData.jWCompany}" class="form-control" id="usr" placeholder="Enter Company Name" />
	 
	</div>
	
	
	<div class="form-group " id="labels" style="color:black;">
    <label for="CountryId">Country</label>
	<div class="form-group">
	
    <form:select class="form-control GSgd4 fieldWrapper" path="jWCountry" value="{jBioData.jWCountry}"  id="CountryId" name="CountryId">
    <option value="1">Afghanistan</option>
<option value="2">Albania</option>
<option value="3">Algeria</option>
<option value="4">Andorra</option>
<option value="5">Angola</option>
<option value="176">Anguilla</option>
<option value="177">Antarctica</option>
<option value="175">Antigua and Barbuda</option>
<option value="6">Argentina</option>
<option value="7">Armenia</option>
<option value="179">Aruba</option>
<option value="8">Australia</option>
<option value="9">Austria</option>
<option value="10">Azerbaijan</option>
<option value="11">Bahamas</option>
<option value="12">Bahrain</option>
<option value="13">Bangladesh</option>
<option value="14">Barbados</option>
<option value="15">Belarus</option>
<option value="16">Belgium</option>
<option value="17">Belize</option>
<option value="18">Benin</option>
<option value="19">Bermuda</option>
<option value="20">Bhutan</option>
<option value="21">Bolivia</option>
<option value="22">Bosnia-Herzegovina</option>
<option value="23">Botswana</option>
<option value="181">Bouvet Island</option>
<option value="24">Brazil</option>
<option value="201">British Indian Ocean Territory</option>
<option value="180">Brunei Darussalam</option>
<option value="25">Bulgaria</option>
<option value="26">Burkina Faso</option>
<option value="27">Burundi</option>
<option value="28">Cambodia</option>
<option value="29">Cameroon</option>
<option value="30">Canada</option>
<option value="31">Cape Verde</option>
<option value="32">Cayman Islands</option>
<option value="33">Central African Republic</option>
<option value="34">Chad</option>
<option value="35">Chile</option>
<option value="36">China</option>
<option value="185">Christmas Island</option>
<option value="182">Cocos (Keeling) Islands</option>
<option value="37">Colombia</option>
<option value="204">Comoros</option>
<option value="38">Congo</option>
<option value="183">Cook Islands</option>
<option value="39">Costa Rica</option>
<option value="40">Croatia</option>
<option value="184">Cuba</option>
<option value="41">Cyprus</option>
<option value="42">Czech Republic</option>
<option value="172">Democratic Republic of Congo</option>
<option value="43">Denmark</option>
<option value="44">Djibouti</option>
<option value="186">Dominica</option>
<option value="187">Dominican Republic</option>
<option value="233">East Timor</option>
<option value="251">East Timor</option>
<option value="45">Ecuador</option>
<option value="46">Egypt</option>
<option value="47">El Salvador</option>
<option value="48">Equatorial Guinea</option>
<option value="49">Eritrea</option>
<option value="50">Estonia</option>
<option value="51">Ethiopia</option>
<option value="189">Falkland Islands</option>
<option value="191">Faroe Islands</option>
<option value="52">Fiji</option>
<option value="53">Finland</option>
<option value="228">Former USSR</option>
<option value="54">France</option>
<option value="55">France (European Territory)</option>
<option value="193">French Guyana</option>
<option value="230">French Southern Territories</option>
<option value="56">Gabon</option>
<option value="57">Gambia</option>
<option value="58">Georgia</option>
<option value="59">Germany</option>
<option value="60">Ghana</option>
<option value="194">Gibraltar</option>
<option value="61">Greece</option>
<option value="195">Greenland</option>
<option value="192">Grenada</option>
<option value="196">Guadeloupe (French)</option>
<option value="198">Guatemala</option>
<option value="63">Guinea</option>
<option value="64">Guinea Bissau</option>
<option value="65">Guyana</option>
<option value="200">Haiti</option>
<option value="199">Heard and McDonald Islands</option>
<option value="66">Honduras</option>
<option value="67">Hong Kong</option>
<option value="68">Hungary</option>
<option value="69">Iceland</option>
<option value="70">India</option>
<option value="71">Indonesia</option>
<option value="72">Iran</option>
<option value="73">Iraq</option>
<option value="74">Ireland</option>
<option value="75">Israel</option>
<option value="76">Italy</option>
<option value="77">Ivory Coast</option>
<option value="202">Jamaica</option>
<option value="78">Japan</option>
<option value="79">Jordan</option>
<option value="80">Kazakhstan</option>
<option value="81">Kenya</option>
<option value="203">Kiribati</option>
<option value="82">Kuwait</option>
<option value="83">Kyrgyzstan</option>
<option value="84">Laos</option>
<option value="85">Latvia</option>
<option value="86">Lebanon</option>
<option value="87">Lesotho</option>
<option value="88">Liberia</option>
<option value="89">Libya</option>
<option value="90">Liechtenstein</option>
<option value="91">Lithuania</option>
<option value="92">Luxembourg</option>
<option value="208">Macau</option>
<option value="93">Macedonia</option>
<option value="94">Madagascar</option>
<option value="95">Malawi</option>
<option value="96">Malaysia</option>
<option value="97">Maldives</option>
<option value="98">Mali</option>
<option value="99">Malta</option>
<option value="207">Marshall Islands</option>
<option value="210">Martinique (French)</option>
<option value="100">Mauritania</option>
<option value="212">Mauritius</option>
<option value="241">Mayotte</option>
<option value="101">Mexico</option>
<option value="190">Micronesia</option>
<option value="102">Moldavia</option>
<option value="103">Monaco</option>
<option value="104">Mongolia</option>
<option value="246">Montenegro</option>
<option value="211">Montserrat</option>
<option value="105">Morocco</option>
<option value="106">Mozambique</option>
<option value="242">Myanmar, Union of (Burma)</option>
<option value="107">Namibia</option>
<option value="215">Nauru</option>
<option value="108">Nepal</option>
<option value="109">Netherlands</option>
<option value="110">Netherlands Antilles</option>
<option value="216">Neutral Zone</option>
<option value="213">New Caledonia (French)</option>
<option value="111">New Zealand</option>
<option value="112">Nicaragua</option>
<option value="113">Niger</option>
<option value="114">Nigeria</option>
<option value="217">Niue</option>
<option value="214">Norfolk Island</option>
<option value="115">North Korea</option>
<option value="209">Northern Mariana Islands</option>
<option value="116">Norway</option>
<option value="117">Oman</option>
<option value="118">Pakistan</option>
<option value="222">Palau</option>
<option value="249">Palestinian Territory, Occupied</option>
<option value="119">Panama</option>
<option value="219">Papua New Guinea</option>
<option value="120">Paraguay</option>
<option value="121">Peru</option>
<option value="122">Philippines</option>
<option value="221">Pitcairn Island</option>
<option value="123">Poland</option>
<option value="218">Polynesia (French)</option>
<option value="124">Portugal</option>
<option value="126">Qatar</option>
<option value="127">Reunion (French)</option>
<option value="128">Romania</option>
<option value="129">Russian Federation</option>
<option value="130">Rwanda</option>
<option value="197">S. Georgia &amp; S. Sandwich Islands</option>
<option value="244">Saint Barth&#233;lemy</option>
<option value="224">Saint Helena</option>
<option value="205">Saint Kitts &amp; Nevis Anguilla</option>
<option value="206">Saint Lucia</option>
<option value="247">Saint Martin</option>
<option value="220">Saint Pierre and Miquelon</option>
<option value="131">Saint Tome and Principe</option>
<option value="237">Saint Vincent &amp; Grenadines</option>
<option value="132">Samoa</option>
<option value="227">San Marino</option>
<option value="133">Saudi Arabia</option>
<option value="134">Senegal</option>
<option value="250">Serbia</option>
<option value="135">Seychelles</option>
<option value="136">Sierra Leone</option>
<option value="137">Singapore</option>
<option value="138">Slovakia</option>
<option value="139">Slovenia</option>
<option value="223">Solomon Islands</option>
<option value="140">Somalia</option>
<option value="141">South Africa</option>
<option value="142">South Korea</option>
<option value="143">Spain</option>
<option value="144">Sri Lanka</option>
<option value="145">Sudan</option>
<option value="146">Suriname</option>
<option value="225">Svalbard and Jan Mayen Islands</option>
<option value="147">Swaziland</option>
<option value="148">Sweden</option>
<option value="149">Switzerland</option>
<option value="150">Syria</option>
<option value="151">Tadjikistan</option>
<option value="152">Taiwan</option>
<option value="153">Tanzania</option>
<option value="154">Thailand</option>
<option value="155">Togo</option>
<option value="231">Tokelau</option>
<option value="232">Tonga</option>
<option value="234">Trinidad and Tobago</option>
<option value="156">Tunisia</option>
<option value="157">Turkey</option>
<option value="158">Turkmenistan</option>
<option value="229">Turks and Caicos Islands</option>
<option value="235">Tuvalu</option>
<option value="159">Uganda</option>
<option value="160">UK</option>
<option value="161">Ukraine</option>
<option value="162">United Arab Emirates</option>
<option value="163">Uruguay</option>
<option selected="selected" value="164">US</option>
<option value="236">USA Minor Outlying Islands</option>
<option value="165">Uzbekistan</option>
<option value="239">Vanuatu</option>
<option value="166">Vatican City</option>
<option value="167">Venezuela</option>
<option value="168">Vietnam</option>
<option value="169">Virgin Islands (British)</option>
<option value="240">Wallis and Futuna Islands</option>
<option value="188">Western Sahara</option>
<option value="170">Yemen</option>
<option value="171">Yugoslavia</option>
<option value="173">Zambia</option>
<option value="174">Zimbabwe</option>
</form:select>

 <!-- Note* try to assig id but it conflicts with location autocomplete result -->
                </div>
				</div>
	<div class="form-group" id="labels" style="color:black;"> 
 <label for="usr">City</label>
 <div class="form-group">  
  <form:input type="text" path = "jWCity" value = "${jBioData.jWCity}" class="form-control" id="usr" placeholder="Enter City name" />
	</div>
	</div>
   </br>
   <div class="form-group" id="labels" style="color:black;">
   <label for="usr">Time Period </label>
   </div>
   <div>
  <fieldset class="date"> 
   
  <label for="month_start">Month</label> 
  <form:select id="month_start" 
          name="month_start" path="jSWorkMonth" value="${jBioData.jSWorkMonth}" > 
     <option selected="selected" value="0">Month</option> 
    <option>January</option>       
    <option>February</option>       
    <option>March</option>       
    <option>April</option>       
    <option>May</option>       
    <option>June</option>       
    <option>July</option>       
    <option>August</option>       
    <option>September</option>       
    <option>October</option>       
    <option>November</option>       
    <option>December</option>       
  </form:select> - 
   
  <label for="year_start">Year</label> 
  <form:select path ="jSWorkYear" value ="${jBioData.jSWorkYear}" id="year_start" 
         name="year_start" > 
	<option selected="selected" value="0">Year</option>	 
    <option>2004</option> 
	<option>2005</option> 
	<option>2006</option> 
	<option>2007</option> 
	<option>2008</option> 
	<option>2009</option>       
    <option>2010</option>       
    <option>2011</option>       
    <option>2012</option>       
    <option>2013</option>       
    <option>2014</option>       
    <option>2015</option>       
    <option>2016</option>       
    <option>2017</option>       
    <option>2018</option>       
  </form:select> 
  <span class="inst">(Month-Year)</span> 
</fieldset> 

<fieldset class="date"> 
   
  <label for="month_end">Month</label> 
  <form:select id="month_end" 
          name="month_end" path="jEWorkMonth" value="${jBioData.jEWorkMonth}"  > 
    <option selected="selected" value="0">Month</option>
    <option>January</option>       
    <option>February</option>       
    <option>March</option>       
    <option>April</option>       
    <option>May</option>       
    <option>June</option>       
    <option>July</option>       
    <option>August</option>       
    <option>September</option>       
    <option>October</option>       
    <option>November</option>       
    <option>December</option>       
  </form:select> -
  <label for="year_end">Year</label> 
  <form:select id="year_end" 
         name="year_end" path="jEWorkYear" value="${jBioData.jEWorkYear}"  > 
	 <option selected="selected" value="0">Year</option>
	<option>2004</option> 
	<option>2005</option> 
	<option>2006</option> 
	<option>2007</option> 
	<option>2008</option> 
    <option>2009</option>       
    <option>2010</option>       
    <option>2011</option>       
    <option>2012</option>       
    <option>2013</option>       
    <option>2014</option>       
    <option>2015</option>       
    <option>2016</option>       
    <option>2017</option>       
    <option>2018</option>       
  <span class="inst">(Month-Year)</span> 
  </form:select> 

</fieldset> 

	</div>
	
	 <div class="form-group">
      <label for="comment">Job Description:</label>
      <form:textarea class="form-control" rows="5" value= "${jBioData.jWDescription}" path= "jWDescription" id="comment"></form:textarea>
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
