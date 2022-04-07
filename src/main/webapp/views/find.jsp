<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%request.setCharacterEncoding("UTF-8");%>
<html>
    <head>
        <title>find_appliance</title>
    </head>
    <body>
            <h1>Параметры поиска приборов</h1>
    <form method="post">
                    <label>Введите минимальную мощность:
                        <input type="text" name="min-capacity" ><br />
                    </label>
                     <label>Введите максимальную мощность:
                     <input type="text" name="max-capacity" ><br />
                      </label>
                    <label>Введите минимальную цену:
                        <input type="text" name="min-price" ><br />
                    </label>
                     <label>Введите максимальную цену:
                     <input type="text" name="max-price"><br />
                     </label>
                   <button type="submit">Найти</button>
                </form>

            <h1>Результат поиска прибора:</h1>
            <c:forEach items="${result}" var="one">
               Название:${one.name} <br>
               Мощность:${one.capacity}<br>
               Цена:${one.price}<br>
               Цвет:${one.color}<br>
               <br>
            </c:forEach>
            <button onclick="location.href='/'">Назад</button>
    </body>
</html>