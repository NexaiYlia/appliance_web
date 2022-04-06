<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>add_new_appliance</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>

    <body class="w3-light-grey">
        <div class="w3-container w3-blue-grey w3-opacity w3-right-align">
            <h1>Бытовые приборы</h1>
        </div>

        <div class="w3-container w3-padding">
            <%
                if (request.getAttribute("applianceName") != null) {
                    out.println("<div class=\"w3-panel w3-green w3-display-container w3-card-4 w3-round\">\n" +
                            "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                            "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey\">×</span>\n" +
                            "   <h5>Бытовой прибор '" + request.getAttribute("applianceName") + "' added!</h5>\n" +
                            "</div>");
                }
                            %>
            <div class="w3-card-4">
                <div class="w3-container w3-center w3-green">
                    <h2>Добавьте прибор:</h2>
                </div>
                <form method="post" class="w3-selection w3-light-grey w3-padding">
                    <label>Название:
                        <input type="text" name="name" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                    </label>
                     <label>Мощность:
                     <input type="text" name="capacity" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                      </label>
                    <label>Цена:
                        <input type="text" name="price" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                    </label>
                     <label>Цвет:
                     <input type="text" name="color" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                     </label>
                   <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Добавить</button>
                </form>
            </div>
        </div>

        <div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
            <button class="w3-btn w3-round-large" onclick="location.href='/'">Назад</button>
        </div>
    </body>
</html>