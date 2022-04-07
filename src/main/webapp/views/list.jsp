<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%request.setCharacterEncoding("UTF-8");%>
<html>
    <head>
        <title>appliance_list</title>
    </head>
    <body >
           <h1>Список приборов</h1>
               <c:forEach items="${applianceShow}" var="one">
                                    Название:${one.name} <br>
                                    Мощность:${one.capacity}<br>
                                    Цена:${one.price}<br>
                                    Цвет:${one.color}<br>
                                    <br>
                                 </c:forEach>
            <button onclick="location.href='/'">Назад</button>
        </div>
    </body>
</html>