<%-- 
    Document   : prikazKategorija
    Created on : Jan 29, 2022, 7:33:28 PM
    Author     : WINDOWS 10
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    
        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="text-center p-5">Kategorije</h1>
        <div class="px-5 fs-3">
            <a href="AddKategoriju">Dodaj novu kategoriju</a>
        </div>
        <div class="p-5">
        <table border="1" class="table table-striped table-hover">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Naziv</th>
                    <th scope="col"></th>
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${kategorije}" var="kategorija" varStatus="loop">
                <tr scope="row">
                    <td>${loop.index+1}</td>
                    <td>${kategorija.naziv}</td>
                    <td>
                        <a href="EditKategorija?id=${kategorija.id}">Izmeni</a>
                    </td>
                    <td>
                        <a href="DeleteKategorija?id=${kategorija.id}">Obrisi</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        </div>
            <c:if test="${poruka != null}">
                <div class="px-5">
                    <div class="alert alert-danger alert-dismissible fade show" role="alert">
                        ${poruka}
                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                    </div>
                </div>
            </c:if>
        <div class="px-5">
            <a href="index.jsp">Nazad</a>
        </div>
    </body>
</html>
