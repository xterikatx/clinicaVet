<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="br">
<head>
  <meta charset="UTF-8">
  <link rel="icon" type="img/png" href="../icon/logo.png" />
    <link rel="icon" type="img/png" href="${pageContext.request.contextPath}/img/pessoa.jpg" />

  <title>Editar dados ADM</title>
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
        <a href="${pageContext.request.contextPath}/page" title="Home Page"><img src="icon/logo.png" alt="logo"></a>
      </div>
      <ul>
        <li><a href="${pageContext.request.contextPath}/page" title="Pagina Inicial">Início</a></li>
        <li><a href="${pageContext.request.contextPath}/query/query">Agendar consultas</a></li>
        <li><a href="index.html#ancora" class="ancora" title="ServiÃ§os DisponÃ­veis">Serviços</a></li>
        <div class="dropdown">
          <button class="dropbtn">${userSession.cpf}</button>
          <div class="dropdown-content">
            <a href="${pageContext.request.contextPath}/profile">Meu Perfil</a>
            <a href="login.html">Sair</a>
          </div>
        </div> 
      </ul>
    </nav>
  </header>

  <div id="info">
    <div class="perfil">
      <div class="fotoperfil">
        <div><img id="cir" src="${pageContext.request.contextPath}/img/pessoa.jpg">
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
        <input id="" type="text" name="employee.name" value="${employee.name}" minlength="5"><br>
        <label for="">CPF:</label><br>
        <input type="cpf" name= "employee.cpf" value="${employee.cpf}" type="cpf" name="cpf" minlength="14" maxlength="14" OnKeyPress="formatar('###.###.###-##', this)" ><br>
        <label for="">Celular:</label><br>
        <input type="tell" name="{employee.name}" value="${employee.cellphone}" name="tel" min="12" maxlength="12" OnKeyPress="formatar('##-####-####', this)" ><br>
        <label for="">Senha:</label><br>
        <input type="password" name="{employee.password}" value="${employee.password}"><br>
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