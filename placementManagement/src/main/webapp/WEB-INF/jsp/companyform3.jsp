<%@page import="java.sql.*,place.*" %>
<html>
<head>
</head>
<h4><a href="studentviewcompanies.jsp">&#10094; BACK</a></h4>
<h1><center>View Profile of Company</center></h1>
<form action="CompanyView" method="post">
<table border="5px" style="width: 612px; height: 432px; background-color:yellow">
<tbody>
<% 
String company_id=request.getParameter("company_id");
Connection con=ConnectionProvider.getCon();
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from company_db where company_id="+company_id);
while(rs.next())
{
%>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;&nbsp;Company ID</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(1)%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">Company name</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(2)%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;CompanyWebsite</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(3)%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Designation</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(4)%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Target Degree and Branches</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(5)%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Bond</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(6)%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Shift-Timings</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(7)%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Percentage Cut-off</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(8)%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Joining</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(9)%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Venue</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(10)%></td>
</tr>
<tr style="height: 33px;">
<td style="width: 202px; height: 33px;">&nbsp;Company Email address</td>
<td style="width: 466px; height: 33px;">&nbsp;<%=rs.getString(11)%></td>
</tr>
<tr style="height: 34px;">
<td style="width: 202px; height: 34px;">&nbsp;Campus Date and Time</td>
<td style="width: 466px; height: 34px;">&nbsp;<%=rs.getString(12)%></td>
</tr>
<tr style="height: 106px;">
<td style="width: 202px; height: 106px;">Job Description</td>
<td style="width: 466px; height: 106px;">&nbsp;<%=rs.getString(13)%>
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
<%
}
con.close();
%>
</table>
</form>
</body>
</html>