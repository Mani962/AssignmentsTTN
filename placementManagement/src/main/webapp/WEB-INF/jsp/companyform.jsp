<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>See Company Details</title>
</head>
<body>
<h4><a href="viewcompanies.jsp">&#10094; BACK</a></h4>
<body>
<table border="5px" style="width: 612px; height: 432px; background-color:yellow">
  <%  String company_id=request.getParameter("company_id");
   String company_name=request.getParameter("company_name");
   String website=request.getParameter("website");
   String designation=request.getParameter("designation");
   String degree=request.getParameter("degree");
   String bond=request.getParameter("Bond");
   String timings=request.getParameter("timings");
   String cutoff=request.getParameter("cutoff");
   String joining=request.getParameter("joining");
   String venue=request.getParameter("venue");
   String email=request.getParameter("email");
   String datetime=request.getParameter("datetime");
   String Description=request.getParameter("Description");   
   %>  

Connection con=ConnectionProvider.getCon();
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select *from company_db where company_id=company_id");
while(rs.next())
{
%>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;&nbsp;Company ID</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=company_id%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">Company name</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=company_name%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Company&nbsp; Website</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=website%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Designation</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=designation%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Target Degree and Branches</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=degree%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Bond</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=bond%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Shift-Timings</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=timings%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Percentage Cut-off</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=cutoff%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Joining</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=joining%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Venue</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=venue%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Company Email address</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=email%></td>
</tr>
<tr style="height: 34px;">
<td style="width: 202px; height: 34px;">&nbsp;Campus Date and Time</td>
<td style="width: 466px; height: 34px;">&nbsp;<%=datetime%></td>
</tr>
<tr style="height: 106px;">
<td style="width: 202px; height: 106px;">Job Description</td>
<td style="width: 466px; height: 106px;">&nbsp;<%=Description%>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>



%>
</body>
</html>