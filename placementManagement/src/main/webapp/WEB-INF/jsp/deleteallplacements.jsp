 <%@page import="java.sql.*,place.*" %>
<% 
   String id=request.getParameter("id");
try
{
	Connection con=ConnectionProvider.getCon();
	PreparedStatement pst=con.prepareStatement("delete from placement_db where id=?");
	pst.setString(1,id);
	pst.execute();
    con.close();
    response.sendRedirect("allplacementslist.jsp?msg=successfully faculty/placement officer deleted");
}
catch(Exception e)
{
	out.println(e);
}
%>