<!DOCTYPE html>
<html lang="br">
<head>
  <meta charset="UTF-8">
  <link rel="icon" type="img/png" href="../icon/logo.png" />
  <title>Pagina do Cliente</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="icon" type="img/png" href="icon/logo.png" />

  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admperfil.css" media="screen"/>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/navbar.css" media="screen"/>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/security2.css" media="screen"/>

</head>
<body>
  <header>
    <nav style="z-index: 1;">
      <div class="logo" style="cursor: pointer;">
        <a href="index.html" title="Home Page"><img src="icon/logo.png" alt="logo"></a>
      </div>
      <ul>
        <li><a href="index.html" title="Pagina Inicial">Início</a></li>
        <li><a href="consulta.html">Agendar consultas</a></li>
        <li><a href="index.html#ancora" class="ancora" title="Serviços Disponíveis">Serviços</a></li>
        <div class="dropdown">
          <button class="dropbtn">Username</button>
          <div class="dropdown-content">
            <a href="admperfil.html">Meu Perfil</a>
            <a href="login.html">Entrar</a>
            <a href="signin.html">Cadastro</a>
            <a href="adm.html">Administrador</a>
            <a href="login.html">Sair</a>
          </div>
        </div> 
      </ul>
    </nav>
  </header>

  <div id="info">
    <div class="perfil">
      <div class="fotoperfil">
        <div><img id="cir" src="../img/pessoa.jpg">
        </div>
      </div><!--Final da div fotoperfil -->
      
    </div><!--Final da div perfil-->
  </div>

  <form action="">
    <div style="border-radius: 10px; border: 2px solid rgb(236, 236, 236); width: 650px; height:350px; background: rgb(255, 255, 255); margin-top:120px; margin-left: 150px; margin-bottom: 100px; padding: 15px;">
      <a style="margin-bottom: 100px; font-weight: bold; font-size: 20px; margin-left: 15px; position: relative; top: 5px;" >Acesso e Segurança</a>
      
      <img class="hv" src="icon/lock.png" style="height: 50px; width: 50px; position: absolute; margin-left: 390px; margin-top: 1px;">
      
      <div style="padding: 10px; margin-top:15px;"><br>
        <label for="">Nome:</label><br>
        <input id="" type="text" value="Bunny R" minlength="5"><br>
        <label for="">CPF:</label><br>
        <input type="cpf" value="000.000.000-00" type="cpf" name="cpf" minlength="14" maxlength="14" OnKeyPress="formatar('###.###.###-##', this)" ><br>
        <label for="">Celular:</label><br>
        <input type="tell" value="88-91001-0000" name="tel" min="12" maxlength="12" OnKeyPress="formatar('##-####-####', this)" ><br>
        <label for="">Senha:</label><br>
        <input type="password" value="12345678"><br>
      </div>
      <input class="btalt" type="submit" value="Alterar">
      
      <input class="bt" type="reset" alt="cancelar consulta" value="Cancelar" style="width: 90px;">
      <for>
        
      </div>
    </form>

  

  
  <footer>
    <div style="margin-top: 10px;">
      <span>Designed by Kennedy</span>
      <span>Industries Kennedy</span>
      <span>Production by Kennedy</span>
    </div>
  </footer>
</body>
</html>