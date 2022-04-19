<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%request.setCharacterEncoding("UTF-8");%>
<html>
    <head>
        <title>add_new_appliance</title>
    </head>
    <body>
        <h1>Бытовые приборы</h1>
            <% if (request.getAttribute("applianceName") != null) {
             out.println("Бытовой прибор " + request.getAttribute("applianceName") + " добавлен!");}
             %>
        <h2>Добавьте прибор:</h2>
         <form method="post" >
         <label>Название:
         <input type="text" name="name" ><br />
         </label>
         <label>Мощность:
         <input type="text" name="capacity" ><br />
         </label>
         <label>Цена:
         <input type="text" name="price" ><br />
          </label>
          <label>Цвет:
          <input type="text" name="color" ><br />
          </label>
          <button type="submit" >Добавить</button>
                </form>
          <button onclick="location.href='/'">Назад</button>
    </body>
</html>