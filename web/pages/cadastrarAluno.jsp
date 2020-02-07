<%-- 
    Document   : cadastrarAluno
    Created on : 05/02/2020, 21:33:21
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../head.jsp" %>
  <body>
    <div class="container-fluid mb-3">
      <div class="row">
        <div class="col-1 col-lg-3 col-md-4 col-sm-1"></div>
        <div class="col-10 col-sm-11 col-lg-6 col-md-10">
          <div class="container formCadastro bg-secondary py-4">
            <div class="container-fluid superiorContainer">
                <div class="text-center">
                    <img src="../cerebro.png" width="30" height="30" class="d-inline-block align-top mr-2 iconeTitulo img-responsive" alt="">
                    <div class="titulo">
                        <p class="tituloPrincipal">Lero Lero</p>
                        <p class="subtitulo">cursos</p>
                        
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="text-center">
                    <h2>Cadastre-se como aluno:</h2>
                    <a href="cadastroAdministrador.html" style="color:lightskyblue;">ou cadastre-se aqui como administrador.</a>
                    <form action="../AlunoControl" method="post">
                        <div class="row">
                            <div class="form-group col-6">
                                <label for="inputCpfM">CPF:</label>
                                <input type="number" class="form-control" id="inputCpfM" name="cpf">
                                <small id="cpfHelpM" class="form-text"></small>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputNomeM">Nome:</label>
                                <input type="text" class="form-control" id="inputNomeM" name="nome">
                                <small id="nomeHelpM" class="form-text"></small>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputEmailM">E-mail:</label>
                                <input type="text" class="form-control" id="inputEmailM" name="email"></textarea>
                                <small id="emailHelpM" class="form-text"></small>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputCelularM">Celular:</label>
                                <input type="number" class="form-control" id="inputCelularM" name="celular">
                                <small id="celularHelpM" class="form-text"></small>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputLoginM">Login:</label>
                                <input type="text" class="form-control" id="inputLoginM" name="login">
                                <small id="loginHelpM" class="form-text"></small>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputSenhaM">Senha:</label>
                                <input type="password" class="form-control" id="inputSenhaM" name="senha">
                                <small id="senhaHelpM" class="form-text"></small>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputEnderecoM">Endereço:</label>
                                <input type="text" class="form-control" id="inputEnderecoM" name="endereco">
                                <small id="enderecoHelpM" class="form-text"></small>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputCidadeM">Cidade:</label>
                                <input type="text" class="form-control" id="inputCidadeM" name="cidade">
                                <small id="cidadeHelpM" class="form-text"></small>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputBairroM">Bairro:</label>
                                <input type="text" class="form-control" id="inputBairroM" name="bairro">
                                <small id="bairroHelpM" class="form-text"></small>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputCepM">CEP:</label>
                                <input type="number" class="form-control" id="inputCepM" name="cep">
                                <small id="cepHelpM" class="form-text"></small>
                            </div>
                            <div class="col-12">
                                <button type="submit" class="btn btn-dark ml-3" style="float: right;">Salvar</button>
                                <a href="../index.html">
                                    <button type="button" class="btn btn-danger" data-dismiss="modal"
                                style="float: right;">Cancelar</button>
                                </a>
                            </div>
                        </div>
                    </form>
                </div>
                
            </div>
          </div>
        </div>
      </div>
    </div>
   <%@include file="../foot.jsp" %>