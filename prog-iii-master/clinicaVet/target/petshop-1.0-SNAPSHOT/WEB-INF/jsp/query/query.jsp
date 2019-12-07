<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html lang="br">
    <head>
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Bem-vindo a Cl�nica Veterin�ria Rabbit</title>
        <link rel="icon" type="img/png" href="icon/logo.png" />
	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
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
                    <a href="${pageContext.request.contextPath}/page" title="Home Page"><img src="icon/logo.png" alt="logo"></a>
                </div>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/page" title="Pagina Inicial">Inicio</a></li>
                    <li><a href="consulta.html">Clientes</a></li>
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
                    
	            <div align="center"><h5>${msg}</h5></div>

        <form action="search" method="post">
     	    <div class="form-row align-items-center" style="padding: 0px 30px;">
            <div class="col-auto">
                <label class="sr-only" for="teste">Username</label>
                <div class="input-group mb-2">
                    <input type="text" class="form-control" id="teste" placeholder="Pesquisar por nome" name="query.name" value="${query.name}">
                </div>
            </div>
            
            <div class="col-auto">
                <button type="submit" class="btn btn-primary mb-2">Submit</button>
            </div>
        </div>
    </form>
                

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
                            <a href="${pageContext.request.contextPath}/query/remove/${query.getId()}">Remover</a>
                            <a href="${pageContext.request.contextPath}/query/update/${query.getId()}">Update</a>
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