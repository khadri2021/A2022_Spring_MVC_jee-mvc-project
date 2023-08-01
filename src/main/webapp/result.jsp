<html>
<body>

  <%
    Integer addition  = (Integer)request.getAttribute("res_sum");
    Integer substraction  = (Integer)request.getAttribute("res_sub");
  %>

  
	<h2>Sum is : </h2> <%=addition%>
	<h2>Substraction is : </h2> <%=substraction%>

</body>
</html>
