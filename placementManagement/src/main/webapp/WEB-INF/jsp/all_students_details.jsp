<%@page import="java.sql.*,place.*" %>
<center><h1>All Students details</h1></center>
<a href="Pdashboard.jsp">&#10094; BACK</a>
<table class="table">
<th>SYSTEMID</th><th>NAME</th><th>roll no</th><th>course</th><th>branch</th><th>section</th><th>phonenumber</th><th>ten</th><th>twelve</th><th>btech</th><th>Backlogs</th><th>E-mail</th>
<% 
Connection con=ConnectionProvider.getCon();
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select *from updateprofile_db");
while(rs.next())
{
%>
<tr>
<td><%=rs.getString(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%><td><%=rs.getString(4)%></td><td ><%=rs.getString(5)%></td><td><%=rs.getString(6)%></td><td><%=rs.getString(7)%></td><td><%=rs.getString(8)%></td><td><%=rs.getString(9)%></td><td><%=rs.getString(10)%></td><td><%=rs.getString(11)%></td><td><%=rs.getString(12)%></td><td>
<td>

  <a href="delete_students_details.jsp?system_id=<%=rs.getString(2)%>">Delete</a>
 <%System.out.println("1"); %>
 
<a href="edit_students_details.jsp?system_id=<%=rs.getString(2)%>">Edit</a>

</td>
</tr>
<%
}
con.close();
%>
</table>

</body>
</html>