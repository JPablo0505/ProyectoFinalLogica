<%-- 
    Document   : altasUsuarios
    Created on : 22 nov 2023, 16:16:55
    Author     : Pablo
--%>

<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>
<h1>Editar Usuarios</h1>
<p>Este apartado es para modificar a un usuarios del sistema.</p>
<% Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar");%>
<form class="user" action="SvEditUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu"
                   placeholder="Nombre Usuario" value="<%= usu.getId_usuario() %>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                   placeholder="Contraseña" value="<%= usu.getContrasenia() %>">
        </div>
                <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                   placeholder="Rol"value="<%= usu.getRol()%>">
        </div>
    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar Modificacion
    </button>
</form>
<%@include file="components/bodyfinal.jsp" %>
