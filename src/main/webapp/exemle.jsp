<%@page import="java.time.LocalDateTime"%>

<%@page import="java.time.format.DateTimeFormatter"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>DateTime</title>

    </head>

    <body>

        <h1>Current server date and time is:

        <%
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

            LocalDateTime now = LocalDateTime.now();

            out.println(dtf.format(now));
        %>



        </h1>

    </body>

</html>