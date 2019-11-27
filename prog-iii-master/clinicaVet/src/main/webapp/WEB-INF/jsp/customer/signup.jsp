<!DOCTYPE html>
<html lang="br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Cadastro</title>
    <link rel="stylesheet" type="text/css" href="css/cadastro.css" media="screen" />
    <script src="js/jquery-3.4.1.min.js" charset="utf-8"></script>
  </head>
  <style>
  #back{
    margin-left:-5px;
    margin-top:-50px;
    position: absolute;
    height: 25px;
    width: 25px;
    cursor: pointer;
  }
  </style>
  <body>
      <section class="sec2"></section>

      <form action="#" class="login-form">
          <img id="back" type="image" src="image/voltar.png" value="Voltar"  onClick="history.go(-1)" >
        <h1>Cadastro</h1>

        <div class="txtb">
          <input type="text">
          <span data-placeholder="Nome"placeholder="Ex:123-123-123-00"></span>
        </div>

        <div class="txtb">
          <input type="text">
          <span data-placeholder="Cpf"></span>
        </div>

        <div class="txtb">
          <input type="text">
          <span data-placeholder="Endereço"></span>
        </div>

        <div class="txtb">
            <input type="number">
            <span data-placeholder="Celular"></span>
          </div>

        <div class="txtb">
          <input type="password">
          <span data-placeholder="Senha"></span>
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
