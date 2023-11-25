<%-- 
    Document   : Altas
    Created on : 22 nov 2023, 15:23:39
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>
<h1>Alta Odontólogos</h1>
<form class="user">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="cc"
                   placeholder="Documento Idenidad">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre"
                   placeholder="Nombre">
        </div>
                <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido"
                   placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono"
                   placeholder="Telefono">
        </div>
                <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direccion"
                   placeholder="Direccion">
        </div>
                <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechanac"
                   placeholder="Fechas Nac">
        </div>
                <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="Especialidad"
                   placeholder="Especialidad">
        </div>
        <!--Aca va a ir los horarios y usuarios -->
    </div>
    <a href="" class="btn btn-primary btn-user btn-block">
        Crear Odontólogo
    </a>
</form>
<%@include file="components/bodyfinal.jsp" %>