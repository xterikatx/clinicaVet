<!DOCTYPE html>
<html lang="br">
  <head>
    <meta charset="utf-8">
    <title>Cadastro</title>
    <link rel="icon" type="img/png" href="${pageContext.request.contextPath}/icon/logo.png" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/cadastro.css" media="screen" />
<<<<<<< HEAD
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/js/masc.js" charset="utf-8"></script>
=======
    <script src="js/jquery-3.4.1.min.js" charset="utf-8"></script>
    <script src="js/masc.js" charset="utf-8"></script>
>>>>>>> 00f9e21918605032133e14ba3587e00d00e1ca13
  </head>
  <body>
      <section class="sec2"></section>

  <form action="newCustomer" class="login-form" method="post">
        <a href="" style="font-family: Courgette; cursor: pointer; position: absolute; padding: 0px; color: rgb(255, 255, 255); font-weight: bold; font-size: 11px; top: -45px; margin-left: 100px;">
         Designed by Kennedy
        </a>

<<<<<<< HEAD
          <img id="back" type="image" src="${pageContext.request.contextPath}/icon/back.png" value="Voltar"  onClick="history.go(-1)" >
=======
          <img id="back" type="image" src="${pageContext.request.contextPath}/image/voltar.png" value="Voltar"  onClick="history.go(-1)" >
>>>>>>> 00f9e21918605032133e14ba3587e00d00e1ca13
        <h1>Cadastro</h1>

        <div class="txtb">
          <input type="text" name="customer.name" value="${customer.name}">
          <span data-placeholder="Nome:"></span>
        </div>

        <div class="txtb">
<<<<<<< HEAD
          <input type="text" name="customer.cpf" value="${customer.cpf}"minlength="14" maxlength="14" OnKeyPress="formatar('###.###.###-##', this)">
=======
          <input type="text" name="customer.cpf" value="${customer.cpf}" placeholder="Ex:123-123-123-00" minlength="14" maxlength="14" OnKeyPress="formatar('###.###.###-##', this)">
>>>>>>> 00f9e21918605032133e14ba3587e00d00e1ca13
          <span data-placeholder="CPF:"></span>
        </div>

        <div class="txtb">
          <input type="text" name="customer.address" value="${customer.address}">
          <span data-placeholder="Endereço:"></span>
        </div>

        <div class="txtb">
<<<<<<< HEAD
            <input type="text" name="customer.cellphone" value="${customer.cellphone}" minlength="12" maxlength="12" OnKeyPress="formatar('##-####-####', this)">
=======
            <input type="number" name="customer.cellphone" value="${customer.cellphone}" minlength="12" maxlength="12" OnKeyPress="formatar('##-####-####', this)">
>>>>>>> 00f9e21918605032133e14ba3587e00d00e1ca13
            <span data-placeholder="Celular:"></span>
          </div>

        <div class="txtb">
          <input type="password" name="customer.password" value="${customer.password}" minlength="8">
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
