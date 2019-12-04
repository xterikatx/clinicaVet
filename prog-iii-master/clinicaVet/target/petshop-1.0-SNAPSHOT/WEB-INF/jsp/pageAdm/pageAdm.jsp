<!DOCTYPE html>
<html lang="br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Bem-vindo à Clínica Rabbit</title>
  <link rel="icon" type="img/png" href="icon/logo.png" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css" media="screen"/>
  <link rel="stylesheet" type="text/css"href="${pageContext.request.contextPath}/css/navbar.css" media="screen" />
  <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js" charset="utf-8"></script>
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
        <a href="index.html" title="Home Page"><img src="icon/logo.png" alt="logo"></a>
      </div>
      <ul>
        <li><a href="auth/pageCustomer.jsp" title="Pagina Inicial">Início</a></li>
        <li><a href="${pageContext.request.contextPath}/query/query">Agendar consultas</a></li>
        <li><a href="#ancora" class="ancora" title="Serviços Disponíveis">Serviços</a></li>
        <li><a href="query/listQuery" class="ancora" title="Serviços Disponíveis">Listar consultas</a></li>
        <div class="dropdown">
          <button class="dropbtn">${userSession.cpf}</button>
          <div class="dropdown-content">
            <a href="client.html">Meu Perfil</a>
            <a href="auth/signout">Sair</a>
          </div>
        </div> 
      </ul>
    </nav>
  </header>
  
  <section class="sec1">
    <h1 style="position: relative; margin-top: 15%; font-family:'Courgette'; font-size: 40px; color:white;">
      Clínica Veterinária Rabbit
    </h1>
    <!-- <a style="font-size: 40px; margin-left:35%; position: absolute; margin-top: 20%; color:white;">Clinica veterinária Rabbit</a> -->
    
    <a style="position: relative; color:white; font-size: 23px; font-family:'Courgette'">Seu pet em boas mãos</a>
  </section>
  
  <div class="body">
    <p style="font-size: 35px; position: relative; text-align: center; font-weight: bold;">
      Bem-vindo(a) à Clínica Veterinária Rabbit
    </p>
    
    <section class="cont">
      <div id="sobre">
        <div class="foto">
          <img id="cir2"style="position: absolute; margin-left: 500px; border-radius: 3%; height: 330px; margin-top: -10px; width: 500px;" src="img/pessoa.jpg">
        </div>
        
        <div>
          <b style="font-size: 33px;">Sobre nós:</b><br><br>
          
          <span style="font-size:17px; line-height: 23px;">
            Dra Gabriela Giraldi
            Movida pela paixão à medicina veterinária e apelidada pelos seus clientes como Veveta, tem como missão proporcionar o melhor atendimento clínico, cirúrgico e diagnóstico ao seu amigo pet.
            Equipamentos e instalações modernas, aliadas ao alto padrão de higiene, sempre foram a nossa preocupação.
            Nosso atendimento vai além do consultório, onde você tem acesso ao médico veterinário 24 horas por dia através das mídias sociais, assim estamos à sua disposição principalmente nos momentos emergenciais.
          </span><br><br>
          <span style="font-size:17px; line-height: 23px;">
            Dra Gabriela Giraldi
            Movida pela paixão à medicina veterinária e apelidada pelos seus clientes como Veveta, tem como missão proporcionar o melhor atendimento clínico, cirúrgico e diagnóstico ao seu amigo pet.
          </span>
        </div>
        <div id="ancora"></div>
      </div>
    </section>
    
    <section class="cont2">
      <img src="icon/pata.png" alt="" style="margin-left: 100px; margin-top: 31px; height: 35px; position: absolute;">
      <h1 style="margin-left: 130px; padding: 30px;">Nossos Serviços:</h1>
      
      <div class="card">
        <img id="cir" src="img/rab.jpg">
        <div style="width: 205px; height: 90px; text-align: center; position: relative;">
          <p style="border-radius: 10px; font-size: 25px; font-weight: bold; margin-top:-290px; margin-left: 30%; margin-bottom: 50px; color:rgb(255, 255, 255); background-color: rgba(0, 0, 0, 0.692); padding: 3px;">
            Cirurgias
          </p>
        </div>
        
        <div id="textopublic">
          <span>
            Se necessário, realizamos vários procedimentos 
            cirúgicos em nossa clínica.Agende uma consulta.
          </span>
        </div>
        <input title="Veja Nossos Serviços" type="submit" value="Saiba mais" class="bt">
      </div><!-- Fim da div card-->
      
      <div class="card2">
        <img id="cir" src="img/dog2.jpg">
        <div style="width: 205px; height: 90px; text-align: center; position: relative;">
          <p style="border-radius: 10px;font-size: 25px; font-weight: bold; margin-top:-290px; margin-left: 30%;margin-bottom: 50px; color:rgb(255, 255, 255); background-color: rgba(0, 0, 0, 0.692); padding: 3px;">
            Banho e Tosa
          </p>
        </div>
        
        <div id="textopublic">
          <span>
            Aque também é lugar de embelezar nossos lindo pets. Confira
            agende o seu horário.
          </span>
        </div>
        <input title="Veja Nossos Serviços" type="submit" value="Saiba maís" class="bt">
      </div><!-- Fim da div card-->
      
      <div class="card3">
        <img id="cir" src="img/cat.jpg">
        <div style="width: 205px; height: 90px; text-align: center; position: relative;">
          <p style="border-radius: 10px;font-size: 25px; font-weight: bold; margin-top:-290px; margin-left: 30%;margin-bottom: 50px; color:rgb(255, 255, 255); background-color: rgba(0, 0, 0, 0.692); padding: 3px;">
            Cirurgias
          </p>
        </div>
        
        <div id="textopublic">
          <span>
            Se necessário, realizamos vários procedimentos 
            cirúgicos em nossa clínica.Agende uma consulta.
          </span>
        </div>
        
        <input title="Veja Nossos Serviços" type="submit" value="Saiba mais" class="bt">
      </div><!-- Fim da div card-->
      
      <div class="card4">
        <img id="cir" src="img/codrab.jpg">
        <div style="width: 205px; height: 90px; text-align: center; position: relative;">
          <p style="border-radius: 10px; font-size: 25px; font-weight: bold; margin-top:-290px; margin-left: 30%;margin-bottom: 50px; color:rgb(255, 255, 255); background-color: rgba(0, 0, 0, 0.692); padding: 3px;">
            Consultas
          </p>
        </div>
        
        <div id="textopublic">
          <span>
            Realize consulta com seu pet, cachorro, gato, coelho os melhores serviços
            para o seu bichinho
          </span>
        </div>
        
        <input title="Veja Nossos Serviços" type="submit" value="Saiba mais" class="bt">
      </div><!-- Fim da div card-->
    </section>
  </div><!-- divbody -->
  
  <!-- CTA -->
  <section id="cta" class="wrapper" style="margin-bottom:30px; ">
    <div class="inner">
      <img src="icon/location.png" alt="" style="height: 35px;">
      <h1>Nossa Localização</h1>
      <p>Ficamos Localizado na FJN</p>
      <p>Rua dos Cumputadores de Sistemas de Informação</p>
    </div>
  </section>
  
  <footer>
    <div style="font-family: Courgette;">
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
