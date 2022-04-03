<%-- 
    Document   : prikazProizvoda
    Created on : Jan 29, 2022, 12:27:25 PM
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
        <h1 class="text-center p-5">Proizvodi</h1>
        <div class="px-5 w-50">
            <select class="form-select" id="proizvodiSortSelect">
                <option value="0">Podrazumevano</option>
                <option value="1">Sortiraj po nazivu rastuce</option>
                <option value="2">Sortiraj po nazivu opadajuce</option>
                <option value="3">Sortiraj po ceni rastuce</option>
                <option value="4">Sortiraj po ceni opadajuce</option>
            </select>
        </div>
        <div class="p-5">
            Pretraga po nazivu ili opisu proizvoda:
            <input type="text" id="pretraziProizvode" />
        </div>
        <div class="px-5 fs-3">
            <a href="AddProizvod">Dodaj novi proizvod</a>
        </div>
        <div class="p-5">
        <table border="1"  class="table table-striped table-hover">
            <thead>
                <tr>
                    <th scope="col">Naziv</th>
                    <th scope="col">Cena</th>
                    <th scope="col">Opis</th>
                    <th scope="col">Kategorija</th>
                    <th scope="col"></th>
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody id="proizvodiTableBody">
            <c:forEach items="${proizvodi}" var="proizvod">
                <tr scope="row">
                    <td>${proizvod.naziv}</td>
                    <td>${proizvod.cena}</td>
                    <td>${proizvod.opis}</td>
                    <td>${proizvod.kategorija.getNaziv()}</td>
                    <td>
                        <a href="EditProizvod?id=${proizvod.id}">Izmeni</a>
                    </td>
                    <td>
                        <a href="DeleteProizvod?id=${proizvod.id}">Obrisi</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        </div>
        <div class="px-5 mb-5">
            <a href="index.jsp">Nazad</a>
        </div>
        
        <script type="text/javascript">
            var proizvodi = [
              <c:forEach items="${proizvodi}" var="proizvod"> 
                {
                    id: '${proizvod.id}',
                    naziv: '${proizvod.naziv}',
                    cena: '${proizvod.cena}',
                    opis: '${proizvod.opis}',
                    kategorija: {
                        id: '${proizvod.kategorija.getId()}',
                        naziv: '${proizvod.kategorija.getNaziv()}'
                    }
                }, 
            </c:forEach>  
            ];
        </script>
        
        <script src="javascript/index.js"></script>
    </body>
</html>
