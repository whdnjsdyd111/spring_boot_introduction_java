<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html public
    "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html; charset=utf-8"
        http-equiv="Content-Type">
    <title>JSP Index Page</title>
</head>
<body>
<h1>Index Page</h1>
<p>this is JSP sample page.</p>
<%=new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date())%>
</body>
</html>