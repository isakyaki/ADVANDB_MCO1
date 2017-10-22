<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ADVANDB MCO1</title>
 	<link rel="stylesheet" type="text/css" href="css/MainPageStyle.css">
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src = "https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/easydropdown.metro.css"/>
    <script src="css/jquery.easydropdown.min.js" type="text/javascript"></script>
     <script>
        $(document).ready(function () {
          $('.result_container').hide();
          $('#option1').show();
          $('#selectMe').change(function () {
            $('.result_container').hide();
            $('#'+$(this).val()).show();
          })
        })
    </script>
    
</head>
<body>

	<div id = "query_container">
      
      <form method = "GET" action = "queries"> 
	      <select class="dropdown" id = "selectMe" name = "query">
	         <option value="1">Query 1</option>
	         <option value="2">Query 2</option>
	         <option value="3">Query 3</option>
	         <option value="4">Query 4</option>
	         <option value="5">Query 5</option>
	         <option value="6">Query 6</option>
	         <option value="7">Query 7</option>
	         <option value="8">Query 8</option>
	      </select>
			<input type="submit" value="Submit">
		</form>
     </div>
     
      <div id="option1" class="result_container">
      	
      	<c:choose>
	        <c:when test = "${query != 1 && query != 2 && query != 3 && query != 4 && query != 5 && query != 6 && query != 7 && query != 8}"></c:when>
	        <c:otherwise>
	        	<p class = "content">Execution time: ${time}</p>
      			<br>
			</c:otherwise>
	    </c:choose>
		<table style="width:100%" class = "content">
	     <c:choose>
	        <c:when test = "${query == 1}">
			  <tr>
			    <th>BranchID</th>
			    <th>BookID</th> 
			    <th>Date Returned</th>
			  </tr>
			  <c:forEach items = "${result}" var = "s" >
				  <tr>
				    <td>${s.branchid}</td>
				    <td>${s.bookid}</td> 
				    <td>${s.datereturned}</td>
				  </tr>
			  </c:forEach>
	        </c:when>
	        <c:when test = "${query == 2}">
 			  <tr>
			    <th>Card Number</th>
			    <th>BookID</th> 
			    <th>Due Date</th>
			    <th>Date Returned</th>
			  </tr>
			  <c:forEach items = "${result}" var = "s" >
				  <tr>
				    <td>${s.cardno}</td>
				    <td>${s.bookid}</td> 
				    <td>${s.duedate}</td>
				    <td>${s.datereturned}</td>
				  </tr>
			  </c:forEach>	 
	        </c:when>
	        <c:when test= "${query == 3}">
 			  <tr>
			    <th>Last Name</th>
			    <th>First Name</th> 
			    <th>Count</th>
			    <th>Address</th>
			  </tr>
			  <c:forEach items = "${result}" var = "s" >
				  <tr>
				    <td>${s.lastname}</td>
				    <td>${s.firstname}</td> 
				    <td>${s.count}</td>
				    <td>${s.address}</td>
				  </tr>
			  </c:forEach>
	        </c:when>
	        <c:when test= "${query == 4}">
 			  <tr>
			    <th>First Name</th>
			    <th>Count</th>
			  </tr>
			  <c:forEach items = "${result}" var = "s" >
				  <tr>
				    <td>${s.firstname}</td>
				    <td>${s.count}</td>
				  </tr>
			  </c:forEach>
	        </c:when>
	        <c:when test= "${query == 5}">
 			  <tr>
			    <th>Card Number</th>
			    <th>First Name</th> 
			    <th>Address</th>
			    <th>Branch ID</th> 
			    <th>Branch Name</th>
			    <th>Branch Address</th>
			  </tr>
			  <c:forEach items = "${result}" var = "s" >
				  <tr>
				    <td>${s.cardno}</td>
				    <td>${s.firstname}</td> 
				    <td>${s.address}</td>
				    <td>${s.branchid}</td>
				    <td>${s.branchname}</td>
				    <td>${s.branchaddress}</td>
				  </tr>
			  </c:forEach>
	        </c:when>
			<c:when test= "${query == 6}">
 			  <tr>
			    <th>Title</th>
			    <th>Last Name</th> 
			    <th>First Name</th>
			    <th>Address</th> 
			  </tr>
			  <c:forEach items = "${result}" var = "s" >
				  <tr>
				    <td>${s.title}</td>
				    <td>${s.lastname}</td> 
				    <td>${s.firstname}</td>
				    <td>${s.address}</td>
				  </tr>
			  </c:forEach>
	        </c:when>
			<c:when test= "${query == 7}">
 			  <tr>
			    <th>Count</th>
			    <th>Last Name</th> 
			    <th>First Name</th>
			    <th>Address</th> 
			  </tr>
			  <c:forEach items = "${result}" var = "s" >
				  <tr>
				    <td>${s.count}</td>
				    <td>${s.lastname}</td> 
				    <td>${s.firstname}</td>
				    <td>${s.address}</td>
				  </tr>
			  </c:forEach>
	        </c:when>
			<c:when test= "${query == 8}">
 			  <tr>
			    <th>Count</th>
			    <th>Branch Name</th> 
			    <th>Publisher Name</th>
			  </tr>
			  <c:forEach items = "${result}" var = "s" >
				  <tr>
				    <td>${s.count}</td>
				    <td>${s.branchname}</td> 
				    <td>${s.publishername}</td>
				  </tr>
			  </c:forEach>
	        </c:when>
	        <c:otherwise><p class = "content">Choose a query</p></c:otherwise>
	    </c:choose>    
	    </table>
	   </div>  
</body>
</html>