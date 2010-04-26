#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<%-- 
    Document   : simple index
    Created on : 15.01.2010, 11:31:03
    Author     : pgrund
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${artifactId}</title>
    </head>
    <body>
        <h1>Hello by ${artifactId}</h1>
        <fieldset>
            <legend>monitoring</legend>
            <p><a href="./-system/check" target="content">sysadmin monitoring</a></p>
        </fieldset>
        <fieldset>
            <legend>soap services</legend>
            <p><a href="./webservices"  target="content">webservice description</a></p>
        </fieldset>
        <h2>OUTPUT</h2>
        <iframe id="content" name="content" width="100%" height="440px" style="padding: 10px; border: none; background-color: #f0f0f0"/>
    </body>
</html>
