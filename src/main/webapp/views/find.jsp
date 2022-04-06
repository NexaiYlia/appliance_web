<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>find_appliance</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>

    <body class="w3-light-grey">
        <div class="w3-container w3-blue-grey w3-opacity w3-right-align">
            <h1>Параметры поиска приборов</h1>
        </div>
    <form method="post" class="w3-selection w3-light-grey w3-padding">
                    <label>Введите минимальную мощность:
                        <input type="text" name="min-capacity" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                    </label>
                     <label>Введите максимальную мощность:
                     <input type="text" name="max-capacity" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                      </label>
                    <label>Введите минимальную цену:
                        <input type="text" name="min-price" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                    </label>
                     <label>Введите максимальную цену:
                     <input type="text" name="max-price" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                     </label>
                   <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Найти</button>
                </form>
            </div>
        </div>
            </div>
        </div>

        <div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
            <button class="w3-btn w3-round-large" onclick="location.href='/'">Назад</button>
        </div>
    </body>
</html>