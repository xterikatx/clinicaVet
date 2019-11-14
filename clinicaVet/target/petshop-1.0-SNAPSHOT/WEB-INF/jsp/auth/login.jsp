<%-- 
    Document   : login
    Created on : 11-Nov-2019, 15:17:31
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js" charset="utf-8"></script>
    

  </head>
  <body>

      <form action="authenticate" class="login-form">
        <h1>Bem-vindo</h1>

        <div class="txtb">
          <input type="text" name="userName" >
          <span data-placeholder="Nome"></span>
        </div>

        <div class="txtb">
          <input type="password" name="password">
          <span data-placeholder="Senha"></span>
        </div>

        <input type="submit" class="logbtn" value="Entrar">

        <div class="bottom-text">
          Don't have account? <a href="formcl.html">Sign up</a>
        </div>

        <div id="loginimg">
          
        </div>
        
      </form>

      <script type="text/javascript">
      $(".txtb input").on("focus",function(){
        $(this).addClass("focus");
      });

      $(".txtb input").on("blur",function(){
        if($(this).val() == "")
        $(this).removeClass("focus");
      });

      </script>


  </body>
</html>
