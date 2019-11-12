<%-- 
    Document   : index
    Created on : 12-Nov-2019, 09:51:15
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <header style=" display: flex; justify-content: space-between">

            
            <div style="display: flex;">
            <p>User Logger: ${userSession.userName}</p>
                  
            </p>
            <p><a href="auth/signout">Sair </a></p>
            </div>
        </header> 
    </body>
</html>
