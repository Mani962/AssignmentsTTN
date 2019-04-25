 <%@page import="java.sql.*,place.*" %>
<% 
   String system_id=request.getParameter("system_id");
try
{
	Connection con=ConnectionProvider.getCon();
	PreparedStatement pst=con.prepareStatement("delete from updateprofile_db where system_id=?");
	pst.setString(1,system_id);
	pst.execute();
    con.close();
    response.sendRedirect("all_students_details.jsp?msg=successfully deleted");
}
catch(Exception e)
{
	out.println(e);
}
%>