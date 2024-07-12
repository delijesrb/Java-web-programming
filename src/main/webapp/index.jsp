<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>


<html>
    <body>

 <%--  <b:out value="my jstl tag"></b:out>
    <b:if test="${2==2}">
      <b:out value="this is true"/>
    </b:if>


   <b:set var="a" value="5"/>
   <b:set var="b" value="3"/>

   <b:if test="${a!=b}"> <b:out value="${a+b}"/>
   </b:if>
   --%>
   <b:forEach var="item" items="Srbija, Bosna ,Makedonija" >
        <div style="border: 1px solid black; padding: 3px; margin: 5px;">
        ${item}

        </div>
   </b:forEach>


   </body>
</html>