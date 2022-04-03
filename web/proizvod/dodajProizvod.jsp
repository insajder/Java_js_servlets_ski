<%-- 
    Document   : dodajProizvod
    Created on : Jan 30, 2022, 11:41:14 AM
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
        <h2 class="text-center p-5">Dodaj proizvod</h2>
        <form action="AddProizvod" method="POST"  class="p-5">
            <div class="mb-3 w-50">
                <input name="naziv" placeholder="Uneti naziv" required class="form-control" />
            </div>
             <div  class="mb-3 w-50">
                 <input type="number" step=".01" min="0" name="cena" placeholder="Uneti cenu" required class="form-control" />
            </div>
             <div  class="mb-3 w-50">
                <input name="opis" placeholder="Uneti ops" class="form-control" required />
            </div>
             <div   class="mb-3 w-25">
                 <label class="p-2">Kategorija:</label>
                 <select name="kategorija" class="form-select" required>
                     <c:forEach items="${kategorije}" var="kategorija">
                         <option>
                             <c:out value="${kategorija.getNaziv()}"/>
                         </option>
                     </c:forEach>
                 </select>
            </div>
            <button type="submit"  class="btn btn-primary">Dodaj proizvod</button>
        </form>
        <div>
           <c:if test="${poruka != null}">
            <div class="px-5">
                <div class="alert alert-danger alert-dismissible fade show" role="alert">
                    ${poruka}
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
            </div>
        </c:if>
        <c:if test="${success != null}">
            <div class="px-5">
                <div class="alert alert-success alert-dismissible fade show" role="alert">
                    ${success}
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
            </div>
        </c:if>
        </div>
        <div class="px-5">
            <a href="HomeProizvod">Nazad</a>
        </div>
    </body>
</html>
