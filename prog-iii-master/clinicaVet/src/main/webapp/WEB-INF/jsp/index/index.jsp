
<!DOCTYPE html>
<html lang="br">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Bem-vindo</title>
    <script src="js/jquery-3.4.1.min.js" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="style/index.css" media="screen"/>

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
    <nav style="z-index: 1;">
      <div class="logo">
        <img src="image/paisa.jpg">
      </div>
      <ul>
        <li><a href="#" class="active">Inicio</a></li>
        <li><a href="consulta.html">Agendar consultas</a></li>
        <li><a href="#">Consultas</a></li>
        <li><a href="#">Serviços</a></li>
        <li><a href="#">${userSession.userName}</a></li>
        <li><a href="auth/signout">Sair </a></li>
      </ul>
    </nav>

    <section class="sec1"></section>

    <p style="font-size: 40px; position: relative; text-align: center;">Bem-vindo(a) à clínica veterinária Heartbeat</p>

    <section class="cont">
    <div style="font-family:Arial, Helvetica, sans-serif; 
    margin-left: 13%; margin-top: 40px; width: 530px; height:290px; background-color:rgb(255, 255, 255); 
    border:1px solid rgba(218, 218, 218, 0.24); padding: 20px; text-align: left;">
        <div><img style="position: absolute; margin-left: 43%; border-radius: 5%;" src="image/pessoa.jpg"> </div>
        <div>

            <b style="font-size: 30px; margin-left:0px; margin-top:50%;">Sobre nós</b><br><br>

            <span>
            Dra Gabriela Giraldi
            Movida pela paixão à medicina veterinária e apelidada pelos seus clientes como Veveta, tem como missão proporcionar o melhor atendimento clínico, cirúrgico e diagnóstico ao seu amigo pet.
            Equipamentos e instalações modernas, aliadas ao alto padrão de higiene, sempre foram a nossa preocupação.
            Nosso atendimento vai além do consultório, onde você tem acesso ao médico veterinário 24 horas por dia através das mídias sociais, assim estamos à sua disposição principalmente nos momentos emergenciais.</span><br>
        </div>
    </div>
  </section>

    <section class="cont2">
    
        <h1 style="margin-left: 170px; margin-top:0px; padding: 30px;">Serviços:</h1>
    <div class="publicacao" >
        <div class="perfil">
            <div class="fotoperfil">
                <div><img src="image/clinica.jpg" style="background-size:cover;
                        width:123px; height:123px;
                        max-width: 100%;
                        object-fit: cover;
                        border-radius: 100%;
                        display: block;
                        position:relative;
                        left:50%;
                        top:50%;
                        transform: translate(-50%, -50%);">
                        </div>
                    </div><!--Final da div re3 -->

                </div><!--Final da div perfil-->
                <p style="font-size: 25px; font-weight: bold; margin-top:200px; margin-left: 30%;margin-bottom: 30px;">
                Cirurgias</p>
                  <span style="color: rgb(0, 0, 0); font-weight: bold; margin-left: 50px; " >Se necessário, realizamos vários procedimentos cirúgicos em nossa clínica.
                    Agende uma consulta.
                  </span>

            </div><!-- Fim da div publicação-->
            <div class="publicacaoc">
                <div class="perfil">
                    <div class="fotoperfil">
                        <div><img src="image/clinica.jpg" style="background-size:cover;
                            width:123px; height:123px;
                            max-width: 100%;
                            object-fit: cover;
                            border-radius: 100%;
                            display: block;
                            position:relative;
                            left:50%;
                            top:50%;
                            transform: translate(-50%, -50%);">
                            </div>
                        </div><!--Final da div re3 -->

                    </div><!--Final da div perfil-->

                    <h5 style="margin-top:300px; margin-left: 50px;margin-bottom: 30px;">
                      <span>Vinicius castrações</span></h5>

                </div><!-- Fim da div publicação-->

                <div class="publicacaod">
                    <div class="perfil">
                        <div class="fotoperfil">
                            <div><img src="image/clinica.jpg" style="background-size:cover;
                            width:123px; height:123px;
                            max-width: 100%;
                            object-fit: cover;
                            border-radius: 100%;
                            display: block;
                            position:relative;
                            left:50%;
                            top:50%;
                            transform: translate(-50%, -50%);">
                            </div>
                        </div><!--Final da div re3 -->
                    </div><!--Final da div perfil-->

                    <h5 style="margin-top:300px; margin-left: 50px;margin-bottom: 30px;"><span>Vinicius castrações</span></h5>

                </div><!-- Fim da div publicação-->
   
  </section>


<section class="cont3">
                <form action="#" class="login-form">

                      <h1>Agendar consulta</h1>

                      <div class="txtb">
                        <input type="text">
                        <span data-placeholder="Nome"></span>
                      </div>

                      <div class="txtb">
                        <input type="text">
                        <span data-placeholder="Celular"></span>
                      </div>

                      <div class="txtb">
                        <input type="text">
                        <span data-placeholder="Udfine"></span>
                      </div>

                      <div class="txtb">
                        <input type="text">
                        <span data-placeholder="Mensagem"></span>
                      </div>

                      <input type="submit" class="logbtn" value="Agendar">
                    </section>


                      <div id="loginimg">

                      </div>

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

                <div id="footer" style="width: 100%; height: 230px; background:rgba(5, 89, 128, 0.8); ">

                <div style="padding: 30px; width: 180px; height: 110px; background-color: rgba(0, 0, 0, 0.247); margin-left: 100px;">
                  <span style="color:white; margin: 00px; top:10%;">Design by Kennedy</span>
                  <span style="color:white; ">Industries Kennedy</span>
                  <span style="color:white; ">Production by Kennedy</span>
                  
                </div>
                </div>

</body>
</html>

