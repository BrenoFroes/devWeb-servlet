<%-- 
    Document   : login
    Created on : 08/02/2020, 14:46:41
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="head.jsp"%>
    <div class="container-fluid">
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
                <form class="p-3" action="../controller/LoginController" method="POST"  onsubmit="validaLogin()" id="formLogin">
                    <div class="form-group">
                      	<label class="loginInput" for="InputLogin">Login</label>
                      	<input class="form-control" id="inputLogin" name="login"  aria-describedby="emailHelp">
			<small id="loginHelp" class="form-text"></small>
                    </div>
                    <div class="form-group">
			<label class="loginInput" for="InputPassword">Senha:</label>
                      	<input type="password" class="form-control" id="inputPassword" name="senha" >
			<small id="passwordHelp" class="form-text"></small>
                    </div>
                    <button class="btn btn-dark" href="index.html" type="submit">
                        ENTRAR
                    </button>
                  </form>
            </div>
          </div>
        </div>
        <div class="col-1 col-lg-4 col-md-1 col-sm-0"></div>
      </div>
    </div>
    
<%@include file="foot.jsp"%>