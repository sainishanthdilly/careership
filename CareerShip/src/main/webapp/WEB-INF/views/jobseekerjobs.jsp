<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
Success  : ${JobSeekerEmail}

<div class="container">
		<table class="table table-striped">
			<caption>List of job positions created: </caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Title</th>
					<th>Location</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employerjobs}" var="employerjob">
					<tr>
						<td>${employerjob.title}</td>
						<td>${employerjob.desc}</td>
						<td>${employerjob.location}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>

</div>
</body>
</html>