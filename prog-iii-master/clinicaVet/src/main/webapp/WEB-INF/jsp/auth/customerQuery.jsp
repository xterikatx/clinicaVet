<%-- 
    Document   : customerQuery
    Created on : 29-Nov-2019, 17:20:25
    Author     : vinicius
--%>


<!DOCTYPE html>
<html lang="br" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Agendar Consulta</title>
        <link rel="icon" type="img/png" href="${pageContext.request.contextPath}/icon/logo.png" />
        <!-- <link rel="stylesheet" href="consulta.css"> -->
        <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js" charset="utf-8"></script>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/schedule.css" media="screen" />
        <script src="${pageContext.request.contextPath}/js/masc.js" charset="utf-8"></script>
    </head>
    <body>

        <section class="sec1"></section>
        <form action="newQuery" method="post" class="login-form">
            <img id="back" type="image" src="${pageContext.request.contextPath}/icon/back.png" value="Voltar" onClick="history.go(-1)" >
            
            <div align="center"><h5>${msg}</h5></div>


            <h1>Agendar consulta</h1>

            <div class="txtb">
                <input type="text"  name="query.name" value="${query.name}">
                <span data-placeholder="Nome:"></span>
            </div>

            <div class="txtb">
                <input name="query.phone" value="${query.phone}" type="text"  minlength="11" maxlength="11" OnKeyPress="formatar('##-####-####', this)">
                <span data-placeholder="Celular:"></span>
            </div>
            <div class="txtb">
                <input type="text"  name="query.cpf"  value="${query.cpf}" minlength="10" maxlength="14" OnKeyPress="formatar('###.###.###-##', this)">
                <span data-placeholder="CPF:"></span>
            </div>


            <input type="submit" class="logbtn" value="Agendar">

            <div id="loginimg"></div>

        </form>

        <script type="text/javascript">
            $(".txtb input").on("focus", function () {
                $(this).addClass("focus");
            });

            $(".txtb input").on("blur", function () {
                if ($(this).val() == "")
                    $(this).removeClass("focus");
            });

        </script>

    </body>
</html>
