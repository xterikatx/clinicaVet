<!DOCTYPE html>
<html lang="br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Entrar</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" media="screen" />
    <script src="js/jquery-3.4.1.min.js" charset="utf-8"></script>

  </head>

  
  <body>
    <section class="sec1"></section>
    
    <form action="authenticate" class="login-form" method="post">
      <h1>Bem-vindo</h1>
      <div class="" id="radiobtn">
        <input type="radio" name="gender" value="Adm"> Administrador <br>
        <input type="radio" name="gender" value="cliente" checked> Entrar como cliente
      </div>
      
      <div class="txtb">
          <input type="text" name="cpf">
        <span data-placeholder="Cpf" ></span>
      </div>
      
      <div class="txtb">
          <input type="password" name="password">
        <span data-placeholder="Senha"></span>
      </div>
      
      <input type="submit"  class="logbtn" value="Entrar">
      
      <div class="bottom-text">Não tem uma conta ? <a href="${pageContext.request.contextPath}/customer/signup">Sign up</a></div>
      
      <div id="loginimg"></div>
    </form>
    
    


  </body>
</html>
