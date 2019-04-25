 <%@page import="java.sql.*,place.*" %>
<% 
   String company_id=request.getParameter("company_id");
try
{
	Connection con=ConnectionProvider.getCon();
	PreparedStatement pst=con.prepareStatement("delete from company_db where company_id=?");
	pst.setString(1,company_id);
	pst.execute();
    con.close();
    response.sendRedirect("viewcompanies.jsp?msg=successfully company deleted");
}
catch(Exception e)
{
	out.println(e);
}
%>