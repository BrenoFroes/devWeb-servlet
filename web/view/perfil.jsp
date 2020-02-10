<%-- 
    Document   : perfil
    Created on : 09/02/2020, 01:05:21
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container mt-3">
    <div class="text-center" style="text-align: left;">
        
        <h3>Nome: 
            <% out.println("Breno");%>
        </h3>
        
        <h2>Login: 
            <% out.println("brenofroes");%>
        </h2>
        
        <p> 
            <% out.println("aluno");%>
        </p>
        <div class="mt-n5" style="float: right;">
            <img src="../cerebro.png" style="border-radius: 50%; max-width: 100px; position: relative; top: -50px;">  
        </div>
        
    </div>
</div>    
<%@include file="foot.jsp" %>