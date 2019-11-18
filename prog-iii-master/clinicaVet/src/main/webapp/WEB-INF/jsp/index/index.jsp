<!DOCTYPE html>
<html lang="br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Bem-vindo à Clínica Rabbit</title>
  <link rel="icon" type="imagem/png" href="image/logo2.png" />
  <script src="js/jquery-3.4.1.min.js" charset="utf-8"></script>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css" media="screen"/>
  <link href="https://fonts.googleapis.com/css?family=Alatsi&display=swap" rel="stylesheet">
  
  <script type="text/javascript">
    $(window).on('scroll', function(){
      if ($(window).scrollTop()) {
        $('nav').addClass('black');
      }
      else
      {
        $('nav').removeClass('black');
      }
    })
  </script>
  
</head>
<body>
  <header>
  <nav style="z-index: 1;">
    <div class="logo" style="cursor: pointer;">
      <img src="image/logo2.png">
    </div>
    <ul>
      <li><a href="consulta.html">Agendar consultas</a></li>
      <li><a href="#">Consultas</a></li>
      <li><a href="#">Serviços</a></li>
      <div class="dropdown">
        <button class="dropbtn">USERNAME</button>
        <div class="dropdown-content">
          <a href="auth/signout">Sair</a>
          <a href="sign.html">Cadastro</a>
        </div>
      </div> 
    </ul>
  </nav>
</header>
  
  <section class="sec1">
    <h1 style="position:absolute; top: 30%; margin-left: 480px;
    font-family: 'Alatsi', sans-serif; font-size: 40px; color:white;">
    Clínica Veterinária Rabbit
  </h1>
  <a style="margin-left:45%; position: absolute; margin-top: 23%; color:white;">Seu pet em boas mãos</a>
</section>

<p style="font-size: 5vh; position: relative; text-align: center; font-weight: bold;">
  Bem-vindo(a) à clínica veterinária Rabbit
</p>

<section class="cont">
  <div id="sobre">
    <div class="fotoperfil2">
      <img id="cir2"style="position: absolute; margin-left: 70vh; border-radius: 5%; height: 330px; margin-top: -50px; width: 500px;" src="image/pessoa.jpg">
    </div>
    
    <div>
      <b style="font-size: 5vh; margin-left:0px; margin-top:50%;">Sobre nós:</b><br><br>
      
      <span>
        Dra Gabriela Giraldi
        Movida pela paixão à medicina veterinária e apelidada pelos seus clientes como Veveta, tem como missão proporcionar o melhor atendimento clínico, cirúrgico e diagnóstico ao seu amigo pet.
        Equipamentos e instalações modernas, aliadas ao alto padrão de higiene, sempre foram a nossa preocupação.
        Nosso atendimento vai além do consultório, onde você tem acesso ao médico veterinário 24 horas por dia através das mídias sociais, assim estamos à sua disposição principalmente nos momentos emergenciais.
      </span><br><br><br>
      <span>
        Dra Gabriela Giraldi
        Movida pela paixão à medicina veterinária e apelidada pelos seus clientes como Veveta, tem como missão proporcionar o melhor atendimento clínico, cirúrgico e diagnóstico ao seu amigo pet.
      </span>
    </div>
  </div>
</section>



<section class="cont2">
  
  <h1 style="margin-left: 130px; margin-top:0px; padding: 30px;">Nossos Serviços:</h1>
  
  <div class="card">
    <img id="cir" src="image/rab.jpg">
    <p style="font-size: 25px; font-weight: bold; margin-top:-290px; margin-left: 30%;margin-bottom: 50px; color:rgb(201, 8, 8);">
      Cirurgias
    </p>
    
    <div id="textopublic">
      <span>
        Se necessário, realizamos vários procedimentos 
        cirúgicos em nossa clínica.Agende uma consulta.
      </span>
    </div>
    
    <button class="bt" style="border-style: groove; padding: 5px 15px; border: none;border-radius: 5px; color: white;margin-left: 32%; margin-top:130px; background-color:rgb(18, 72, 134);">
      Saiba mais
    </button>
  </div><!-- Fim da div publicação-->
  
  <div class="card2" >
    <p style="font-size: 25px; font-weight: bold; margin-top:90px; margin-left: 30%;margin-bottom: 50px; color:white;">
      Cirurgias
    </p>
    
    <div id="textopublic">
      <span style="color: rgb(255, 255, 255); font-weight: bold; ">
        Se necessário, realizamos vários procedimentos 
        cirúgicos em nossa clínica.Agende uma consulta.
      </span>
    </div>
    
    <button class="bt" style="border-style: groove; padding: 5px 15px; border: none;border-radius: 5px; color: white;margin-left: 32%; margin-top:50px; background-color:rgb(18, 72, 134);">
      Saiba mais
    </button>
  </div><!-- Fim da div publicação-->
  
  <div class="card3">
    <p style="font-size: 25px; font-weight: bold; margin-top:90px; margin-left: 30%;margin-bottom: 50px; color:white;">
      Cirurgias
    </p>
    
    <div id="textopublic">
      <span style="color: rgb(255, 255, 255); font-weight: bold; ">
        Se necessário, realizamos vários procedimentos 
        cirúgicos em nossa clínica.Agende uma consulta.
      </span>
    </div>
    
    <button class="bt" style="border-style: groove; padding: 5px 15px; border: none;border-radius: 5px; color: white;margin-left: 32%; margin-top:50px; background-color:rgb(18, 72, 134);">
      Saiba mais
    </button>
    
  </div><!-- Fim da div card3-->
  
  <div class="card4">
    <p style="font-size: 25px; font-weight: bold; margin-top:90px; margin-left: 30%;margin-bottom: 50px; color:white;">
      Cirurgias
    </p>
    
    <div id="textopublic">
      <span style="color: rgb(255, 255, 255); font-weight: bold; ">
        Se necessário, realizamos vários procedimentos 
        cirúgicos em nossa clínica.Agende uma consulta.
      </span>
    </div>
    <button class="bt" style="border-style: groove; padding: 5px 15px; border: none;border-radius: 5px; color: white;margin-left: 32%; margin-top:50px; background-color:rgb(18, 72, 134);">
      Saiba mais
    </button>
  </div><!-- Fim da div card4-->
</section>

<script type="text/javascript">
  $(".txtb input").on("focus",function(){
    $(this).addClass("focus")
  });
  
  $(".txtb input").on("blur",function(){
    if($(this).val() == "")
    $(this).removeClass("focus");
  });
</script>


<!-- CTA -->
<section id="cta" class="wrapper" style="margin-bottom:30px; ">
  <div class="inner">
    <h1>Nossa Localização</h1>
    <p>Ficamos localizado na FJN</p>
    <p>Rua dos cumputadores de sistemas de informação</p>
  </div>
</section>

<footer id="footer">
  <div>
    <span>Design by Kennedy</span>
    <span>Industries Kennedy</span>
    <span>Production by Kennedy</span>
  </div>
</footer>
</body>
</html>
