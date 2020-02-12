<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container mt-5" style="height: 50px; text-align: left;">
    <div class="row">
        <div class="col-9">
            <h3>Nome: 
                <% out.println("Breno");%>
            </h3>
            
            <h2 style="text-align: left !important;">Login: 
                <% out.println("brenofroes");%>
            </h2>
            
            <p> 
                <% out.println("aluno");%>
            </p>
        </div>
        <div class="col-3 mt-1">
            <div style="float: right;">
                <img src="../cerebro.png" class="imagemPerfil">
            </div>
        </div>
    </div> 
</div>
<div class="container mt-5 py-3" style="text-align: left;">
    <hr>
    <h4>Altere sua imagem de perfil:</h4>
    <form action="../controller/AlunoController" method="POST">
            <div class="form-group">
                <input type="file" class="form-control-file" id="imagemPerfil">
            </div>
            <hr>
            <h4>Edite seu perfil:</h4>
            <div class="form-group">
                <label for="inputCpfM">CPF:</label>
                <input type="number" class="form-control form-control-sm" id="inputCpfM" name="cpf">
                <small id="cpfHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputNomeM">Nome:</label>
                <input type="text" class="form-control form-control-sm" id="inputNomeM" name="nome">
                <small id="nomeHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputEmailM">E-mail:</label>
                <input type="text" class="form-control form-control-sm" id="inputEmailM" name="email"></textarea>
                <small id="emailHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputCelularM">Celular:</label>
                <input type="number" class="form-control form-control-sm" id="inputCelularM" name="celular">
                <small id="celularHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputEnderecoM">Endereço:</label>
                <input type="text" class="form-control form-control-sm" id="inputEnderecoM" name="endereco">
                <small id="enderecoHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputCidadeM">Cidade:</label>
                <input type="text" class="form-control form-control-sm" id="inputCidadeM" name="cidade">
                <small id="cidadeHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputBairroM">Bairro:</label>
                <input type="text" class="form-control form-control-sm" id="inputBairroM" name="bairro">
                <small id="bairroHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputCepM">CEP:</label>
                <input type="number" class="form-control form-control-sm" id="inputCepM" name="cep">
                <small id="cepHelpM" class="form-text"></small>
            </div>
            <div class="mb-5">
                <button type="submit" class="btn btn-primary ml-3" style="float: right;">Salvar</button>
                <a href="../index.jsp">
                    <button type="button" class="btn btn-danger" data-dismiss="modal"
                style="float: right;">Cancelar</button>
                </a>
            </div>
        </div>
    </form>
</div>
<%@include file="foot.jsp" %>
