 <%@page import="java.sql.*,place.*" %>
<% 
   String id=request.getParameter("id");
try
{
	Connection con=ConnectionProvider.getCon();
	PreparedStatement pst=con.prepareStatement("delete from student_db where id=?");
	pst.setString(1,id);
	pst.execute();
    con.close();
    response.sendRedirect("allstudentslist.jsp?msg=successfully student deleted");
}
catch(Exception e)
{
	out.println(e);
}
%>