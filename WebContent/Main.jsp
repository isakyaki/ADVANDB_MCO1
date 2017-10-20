<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
          
      <select class="dropdown" id = "selectMe">
         <option value="option1">Query 1</option>
         <option value="option2">Query 2</option>
         <option value="option3">Query 3</option>
         <option value="option4">Query 4</option>
         <option value="option5">Query 5</option>
         <option value="option6">Query 6</option>
         <option value="option7">Query 7</option>
         <option value="option8">Query 8</option>
      </select>
     </div>
            
        
     <div id="option1" class="result_container">show result 1</div>
     <div id="option2" class="result_container">2</div>
     <div id="option3" class="result_container">3</div>
     <div id="option4" class="result_container">4</div>
     <div id="option5" class="result_container">5</div>
     <div id="option6" class="result_container">6</div>
     <div id="option7" class="result_container">7</div>
     <div id="option8" class="result_container">8</div>
    
    

</body>
</html>