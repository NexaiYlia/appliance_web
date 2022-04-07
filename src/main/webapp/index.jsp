<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%request.setCharacterEncoding("UTF-8");%>
<html>
<head>
    <title>appliance_web!</title>
   </head>
<h1>Бытовые электроприборы</h1>
<button onclick="location.href='/list'">Вывести список приборов</button>
<button onclick="location.href='/add'">Добавить прибор</button>
<button onclick="location.href='/sort'">Сортировать приборы по мощности</button>
<button onclick="location.href='/find'">Найти прибор по заданным параметрам</button>

</body>
</html>