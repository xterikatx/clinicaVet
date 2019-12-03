<%-- 
    Document   : indexAdm
    Created on : 02-Dec-2019, 21:08:21
    Author     : vinicius
--%>

<!DOCTYPE html>
<html lang="br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Bem-vindo à Clínica Rabbit</title>
  <link rel="icon" type="img/png" href="${pageContext.request.contextPath}/icon/logo.png" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css" media="screen"/>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/navbar.css" media="screen" />
  <script src="js/jquery-3.4.1.min.js" charset="utf-8"></script>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  
  <script type="text/javascript">
    $(window).on('scroll', function(){
      if ($(window).scrollTop()) {
        $('nav').addClass('black');
      }
      else
      {
        $('nav').removeClass('black');
      }
    });
  </script>
  
</head>
<body>
  <header>
    <nav style="z-index: 1;">
      <div class="logo" style="cursor: pointer;">
        <a href="index.html" title="Home Page"><img src="${pageContext.request.contextPath}/icon/logo.png" alt="logo"></a>
      </div>
      <ul>
        <li><a href="index.html" title="Pagina Inicial">Início</a></li>
        <li><a href="consulta.html">Clíentes</a></li>
        <li><a href="#ancora" class="ancora" title="Serviços Disponíveis">Agendamentos</a></li>
        <div class="dropdown">
          <button class="dropbtn">Username</button>
          <div class="dropdown-content">
            <a href="admperfil.html">Meu Perfil</a>
            <a href="signin.html">Cadastro</a>
            <a href="login.html">Sair</a>
          </div>
        </div> 
      </ul>
    </nav>
  </header>
  <!-- <label for="teste " style="position: absolute; top: 200px; width: 150px; height: 150px; border-radius: 10px; background: red; margin-left:10px;">
    <a class="teste" href="admclientes.html" style="margin-top:10px;">Ir para listar clientes</a>
    
  </label> -->
  <!-- <p style="margin-top: 100px;"><a href="agendamentoadm.html">Ir para agendamentos</a></p> -->
  
  <style>
    .mesmo-tamanho {
      margin-left: 10px;
      margin-top: 80px;
      width: 130px;
      height: 60px;
      white-space: normal;
      
    }
   
  </style>
  
  <style>
    .mesmo-tamanho2 {
      margin-left:160px;
      position: absolute;
      margin-top: -60px;
      width: 130px;
      height: 60px;
      white-space: normal;
    }
  </style>
  <h1 style="margin-left: 50px; margin-top: 80px; position: Relative;">Painel de controle</h1>
  <div class="container">
    <a href="auth/">
        <button type="button" name="customerList" class="btn btn-primary mesmo-tamanho">
        Ver clientes
      </button>
    </a>
  </div>
  

  <div class="container">
    <a href="agendamentoadm.html">
      <button type="button" class="btn btn-primary mesmo-tamanho2">
        Agendamentos
      </button>
    </a>
  </div>
  
  
  
  
  <footer>
    <div style="font-family: Courgette; margin-top: 600px;">
      <span>Designed by Kennedy</span>
      <span>Industries Kennedy</span>
      <span>Production by Kennedy</span>
    </div>
  </footer>
  
</body>
<script type="text/javascript">
  $(".txtb input").on("focus",function(){
    $(this).addClass("focus")
  });
  
  $(".txtb input").on("blur",function(){
    if($(this).val() == "")
    $(this).removeClass("focus");
  });
  
  var $doc = $('html, body');
  $('.ancora').click(function() {
    $doc.animate({
      scrollTop: $( $.attr(this, 'href') ).offset().top
    }, 1000);
    return false;
  });
</script>
</html>
