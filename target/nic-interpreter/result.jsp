<%-- 
    Document   : result
    Created on : Sep 11, 2013, 10:02:39 PM
    Author     : Nazick Ahamed
--%>

<%@page language="java" contentType="text/html" pageEncoding="windows-1252"%>
<%@page import="NIC.NicCalculator"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<h1>NIC Interpretation Results</h1>

<h3>Result of NIC Interpretation is >>>></h3>
<%
	String nic_no = request.getParameter("NICNumber");
	
	
	NicCalculator nic = new NicCalculator();
        String[] num= nic.calculate(nic_no);
              // out.println("Nic [birthDay=BirthDay[year="+num[0]+",month="+num[1]+",date="+num[2]+"], gender="+num[3]+",isVoter="+num[4]); 
	
	
%>
<br />
<%out.println("BirthDay [ year = "+num[0]+" , month = "+num[1]+" , date = "+num[2]+" ]");%>
<br />
<%out.println("gender   =   "+num[3]);%>
<br />
<%out.println("isVoter  =   "+num[4]);%>
</head>
<body>

</body>
</html>
