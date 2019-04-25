<%@page import="java.sql.*,place.*" %>
<%
  String msg=request.getParameter("msg");
if(msg!=null)
{
	out.println("<html><body>");
	out.println("<center><font color=green size=5 text-align=center>"+msg);
	out.println("</font></center>");
	out.println("</body></html>");
}
%>
<center><h1>All Teachers/Placements officers list</h1></center>
<table border="2px" style="height: 77px; width: 1077px; background-color: orange;">
<tbody>
<tr>
<td style="width: 160px;">&nbsp;ID</td>
<td style="width: 164px;">&nbsp;NAME</td>
<td style="width: 165px;">&nbsp;PASS</td>
<td style="width: 166px;">&nbsp;EMAIL</td>
<td style="width: 168px;">&nbsp;MOBILE NUMBER</td>
</tr>
<% 
Connection con=ConnectionProvider.getCon();
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select *from placement_db");
while(rs.next())
{
%>
<tr>
<td><%=rs.getString(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td ><%=rs.getString(5)%></td>
<td>

  <a href="deleteallplacements.jsp?id=<%=rs.getString(1)%>">Delete</a>
 <%System.out.println("123"); %>
 
<a href="editallplacements.jsp?id=<%=rs.getString(1)%>">Edit</a>
</td>
</tr>
</tr>
</tbody>
<%
}
con.close();
%>
</table>

</body>
</html>