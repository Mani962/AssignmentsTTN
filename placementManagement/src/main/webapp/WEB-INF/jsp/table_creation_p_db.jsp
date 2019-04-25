<%--
<%@page import="placementManagement.*,java.sql.*"%>
<%@ page import="org.hibernate.engine.jdbc.connections.spi.ConnectionProvider" %>
<html>
<body>
<% 
try
{
Connection con = ConnectionProvider.getCon();
Statement pst=con.createStatement();
pst.execute("CREATE TABLE  student_DB (ID VARCHAR2(4000),NAME VARCHAR2(4000),PASS VARCHAR2(4000), EMAIL VARCHAR2(4000), MOBILENUMBER VARCHAR2(4000),CONSTRAINT STUDENT_DB_PK PRIMARY KEY (ID) ENABLE)");
pst.execute("CREATE TABLE  placement_DB (ID VARCHAR2(4000),NAME VARCHAR2(4000),PASS VARCHAR2(4000), EMAIL VARCHAR2(4000), MOBILENUMBER VARCHAR2(4000),CONSTRAINT PLACEMENT_DB_PK PRIMARY KEY (ID) ENABLE)");
pst.execute("CREATE TABLE  CONTACT_INDEX(NAME VARCHAR2(4000) NOT NULL ENABLE,EMAIL VARCHAR2(4000),SUBJECT VARCHAR2(4000),MESSAGE VARCHAR2(4000),CONSTRAINT CONTACT_INDEX_PK PRIMARY KEY (EMAIL) ENABLE)");
pst.execute("CREATE TABLE  company_DB (company_id VARCHAR2(4000),company_name VARCHAR2(4000),website VARCHAR2(4000), designation VARCHAR2(4000),degree VARCHAR2(4000),Bond VARCHAR2(4000),timings VARCHAR2(4000),cutoff VARCHAR2(4000), joining VARCHAR2(4000),venue VARCHAR2(4000),email VARCHAR2(4000),datetime VARCHAR2(4000),Description VARCHAR2(4000),CONSTRAINT company_DB_PK PRIMARY KEY (company_id) ENABLE)");
pst.execute("CREATE TABLE  updateprofile_DB (username VARCHAR2(4000),system_id VARCHAR2(4000),rollno VARCHAR2(4000), course VARCHAR2(4000),degree VARCHAR2(4000),branch VARCHAR2(4000),phonenumber VARCHAR2(4000),ten VARCHAR2(4000), twelve VARCHAR2(4000),btech VARCHAR2(4000),backlogs VARCHAR2(4000),email VARCHAR2(4000),CONSTRAINT updateprofile_DB_PK PRIMARY KEY (system_id) ENABLE)");
System.out.println("1");
con.close();
}
catch(Exception e)
{
// System.out.println(e);
 System.out.println(" DATABASES COOL db related problem or tables already exist");
}
%>
</body>
</html>--%>
