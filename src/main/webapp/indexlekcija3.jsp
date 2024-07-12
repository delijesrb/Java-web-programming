<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <body>

        <%!
         public String hallo (){
         return "Hallo World";
         }
         %>
        <%-- komentar u jsp --%>

        <%= hallo() %>
        <%! class User {
        public int id;
       public String fName;
        public String lName;

        public User (int id,String fName , String lName){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        }     }
     User [] users = {
    new User(1,"Ivica","Nani"),
    new User(2,"Dafa","Dusmi"),
    new User(3,"Tea","Koza"),};
    %>
    <table border="1">
    <tr>
        <td>id</td>
        <td>First Name</td>
        <td>Last Name</td>
    </tr>
    <%
    for (int i=0; i<users.length ; i++){
%>
    <tr>
        <td><%= users[i].id %></td>
        <td><%= users[i].fName %></td>
        <td><%= users[i].lName %></td>
    </tr>
  <%  }
 %>
 </table>
    </body>
</html>
