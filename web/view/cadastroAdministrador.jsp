<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="../login.css" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="../css/all.css">
        <!--load all styles -->
        <script defer src="../js/all.js"></script>
        <title>Seja bem-vindo(a) a plataforma dos Cursos Lero Lero!</title>
    </head>
    <body>
        <div class="container-fluid pb-5 mt-5">
            <div class="row">
                <div class="col-1 col-lg-4 col-md-4 col-sm-1"></div>
                <div class="col-10 col-sm-11 col-lg-4 col-md-10">
                    <div class="container formLogin bg-secondary">
                        <div class="container-fluid superiorContainer">
                            <div class="text-center">
                                <img src="../cerebro.png" width="30" height="30" class="d-inline-block align-top mr-2 iconeTitulo img-responsive" alt="">
                                <div class="titulo">
                                    <p class="tituloPrincipal">Lero Lero</p>
                                    <p class="subtitulo">cursos</p>

                                </div>
                            </div>
                        </div>
                        <div class="text-center">
                            <form class="p-3" method="POST" action="../controller/AdminController"  onsubmit="adicionarAdministrador(this);" id="formLogin">
                                <div class="form-group">
                                    <label class="nomeInput" for="InputNome">Nome:</label>
                                    <input type="text" class="form-control" id="inputNomeM" name="nome"  aria-describedby="NomeHelp">
                                    <small id="nomeHelpM" class="form-text"></small>
                                </div>
                                <div class="form-group">
                                    <label class="loginInput" for="InputEmail">Login:</label>
                                    <input type="text" class="form-control" id="inputLoginM" name="login"  aria-describedby="LoginHelp">
                                    <small id="loginHelpM" class="form-text"></small>
                                </div>
                                <div class="form-group">
                                    <label class="senhaInput" for="InputPassword">Senha:</label>
                                    <input type="password" class="form-control" id="inputSenhaM" name="senha" >
                                    <small id="senhaHelpM" class="form-text"></small>
                                </div>
                                <div class="container pb-5">
                                    <button type="submit" class="btn btn-dark ml-3" style="float: right;">Salvar</button>
                                    <a href="../index.jsp">
                                        <button type="button" class="btn btn-danger" data-dismiss="modal"
                                                style="float: right;">Cancelar</button>
                                    </a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-1 col-lg-4 col-md-1 col-sm-0"></div>
            </div>
        </div>

        <script src="../js/nossosScripts/adicionarItens.js" crossorigin="anonymous" type="text/javascript"></script>
        <script src="../js/nossosScripts/validacoes.js" crossorigin="anonymous" type="text/javascript"></script>
        <script src="../js/jquery-3.4.1.slim.min.js" crossorigin="anonymous"></script>
        <script src="../js/popper.min.js" crossorigin="anonymous"></script>
        <script src="../js/bootstrap.min.js" crossorigin="anonymous"></script>

    </body>
