<!DOCTYPE html>
<html lang="br">
<head>
  <meta charset="utf-8">
  <title>Entrar</title>
  <link rel="icon" type="img/png" href="${pageContext.request.contextPath}/icon/logo.png" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css" media="screen" />
  <script src="js/jquery-3.4.1.min.js" charset="utf-8"></script>
  <script src="js/masc.js" charset="utf-8"></script>
</head>
<body>
  <section class="sec1">
    <!-- <a href="index.html" style="cursor: pointer; position: absolute; font-family:sans-serif; padding: 10px; color: rgb(11, 120, 192); font-weight: bold;">
      Design by Kennedy
    </a> -->
  </section>
    <form action="authenticate" class="login-form" method="post">
    
    <a style="cursor: pointer; position: relative; font-family:sans-serif; color: rgb(11, 120, 192); font-weight: bold; font-size: 11px; top: -74px; margin-left: 98px;">
      Designed by Kennedy
    </a>
    
    <h1>Login</h1>
    
    <div class="txtb">
        <input type="text" name="cpf" minlength="10" maxlength="14" OnKeyPress="formatar('###.###.###-##', this)" >
      <span data-placeholder="Cpf:" ></span>
    </div>
    
    <div class="txtb">
        <input type="password" name="password">
      <span data-placeholder="Senha:"></span>
    </div>
    <h5 style="margin-top: -15px; margin-bottom: 15px; font-size: 13px; font-weight: lighter;">Esqueceu a senha ? <a href="#" >Lembrar</a></h5>
    
    <input type="submit"  class="logbtn" value="Entrar">
    
    <div class="bottom-text">Não tem uma conta ? <a href="${pageContext.request.contextPath}/auth/signup">Cadastrar</a></div>
    
    <div id="loginimg"></div>
  </form>
  
  <script type="text/javascript">
    $(".txtb input").on("blur",function(){
      if($(this).val() == "")
      $(this).removeClass("focus");
    });
    
  </script>
  
  
</body>
</html>
