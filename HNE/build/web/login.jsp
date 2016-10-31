<%-- 
    Document   : login
    Created on : Nov 15, 2015, 11:49:09 AM
    Author     : HeeraSingh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:include page="header.jsp"></jsp:include>
    <body>
        <!index form>
    <div class="elementry_body">
        <form action="servlet1" method="post">  
                Name:<input type="text" name="username"/><br/><br/>  
                Password:<input type="password" name="password"/><br/><br/>  
                <input type="submit" value="Login"/>  
        </form>
    </div>
    </body>
    
    <jsp:include page="footer.jsp"></jsp:include>
</html>
