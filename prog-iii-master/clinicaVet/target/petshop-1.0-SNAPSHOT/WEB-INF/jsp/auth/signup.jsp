<!DOCTYPE html>
<html lang="br">
  <head>
    <meta charset="utf-8">
    <title>Cadastro</title>
    <link rel="icon" type="img/png" href="${pageContext.request.contextPath}/icon/logo.png" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/cadastro.css" media="screen" />
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/js/masc.js" charset="utf-8"></script>
  </head>
  <body>
      <section class="sec2"></section>

  <form action="newEmployee" class="login-form" method="post">
        <a href="" style="font-family: Courgette; cursor: pointer; position: absolute; padding: 0px; color: rgb(255, 255, 255); font-weight: bold; font-size: 11px; top: -45px; margin-left: 100px;">
         Designed by Kennedy
        </a>

          <img id="back" type="image" src="${pageContext.request.contextPath}/icon/back.png" value="Voltar"  onClick="history.go(-1)" >
        <h1>Cadastro</h1>

        <div class="txtb">
          <input type="text" name="employee.name" value="${employee.name}">
          <span data-placeholder="Nome:"></span>
        </div>

        <div class="txtb">
          <input type="text" name="employee.cpf" value="${employee.cpf}"minlength="14" maxlength="14" OnKeyPress="formatar('###.###.###-##', this)">
          <span data-placeholder="CPF:"></span>
        </div>

        <div class="txtb">
            <input type="text" name="employee.cellphone" value="${employee.cellphone}" minlength="12" maxlength="12" OnKeyPress="formatar('##-####-####', this)">
            <span data-placeholder="Celular:"></span>
          </div>

        <div class="txtb">
          <input type="password" name="employee.password" value="${employee.password}" minlength="8">
          <span data-placeholder="Senha:"></span>
        </div>

        <input type="submit" class="logbtn" value="Cadastrar">
        
        <div id="loginimg"></div>
        
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
