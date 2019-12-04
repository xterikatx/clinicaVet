<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html lang="br">
    <head>
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Bem-vindo à Clínica Rabbit</title>
        <link rel="icon" type="img/png" href="icon/logo.png" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css"> -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css" media="screen"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/navbar.css" media="screen" />
        <script src="js/jquery-3.4.1.min.js" charset="utf-8"></script>
        <script type="text/javascript">
            $(window).on('scroll', function () {
                if ($(window).scrollTop()) {
                    $('nav').addClass('black');
                } else
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
                    <li><a href="index.html" title="Pagina Inicial">Início</a></li>
                    <li><a href="consulta.html">Clíentes</a></li>
                    <li><a href="#ancora" class="ancora" title="Serviços Disponíveis">Agendamentos</a></li>
                    <div class="dropdown">
                        <button class="dropbtn">Username</button>
                        <div class="dropdown-content">
                            <a href="client.html">Meu Perfil</a>
                            <a href="login.html">Entrar</a>
                            <a href="signin.html">Cadastro</a>
                            <a href="adm.html">Administrador</a>
                            <a href="login.html">Sair</a>
                        </div>
                    </div> 
                </ul>
            </nav>
        </header>

        <div style="margin-top:100px; position: relative; padding: 20px;">
            <div class="row">
                <div class="col-sm-6">
                    <h2>Agendamentos</h2>
                </div>
                <div class="col-sm-6 text-right h2">
                    <!-- <a class="btn btn-primary" href="add.php"><i class="fa fa-plus"></i> Novo Cliente</a> -->
                    <a class="btn btn-primary" href="#"><i class="fa fa-refresh"></i> Atualizar</a>
                </div>
            </div>
        </div>
        <div style="margin-top:20px; width: 100%;  padding: 30px;">
            <table class="table table-striped  ">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th width="30%">CPF/CNPJ</th>
                        <th>Nome</th>
                        <th>Telefonte</th>
                        <th>Data/Hora</th>
                        <th>Op��es</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach items="${querys}" var="query">
                    <tr>
                        <td>${query.getId()}</td>
                        <td>${query.getCpf()}</td>
                        <td>${query.getName()}</td>
                        <td>${query.getPhone()}</td>
                        <td>${query.getCreatedAt()}</td>
             
                        <td>
                            <a href="#">Remover</a>
                        </td>
                    </tr>
                </c:forEach>
                <!--   <tr>
               <td class="actions text-right">
                   <a href="#" class="btn btn-sm btn-danger" data-toggle="modal" data-target="#delete-modal" data-customer="id">
                       <i class="fa fa-trash"></i> Cancelar
                   </a>
               </td>
           </tr> -->
                <!-- <?php endforeach; ?>
                   <?php else : ?> -->
                <tr>
                    <td colspan="6">Nenhum registro encontrado.</td>
                </tr>
                <!-- <?php endif; ?> -->
                </tbody>
            </table>
        </div>

    </body>
</html>