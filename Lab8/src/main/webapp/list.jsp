
<%@ page import="java.util.List, app.user.*" %>
<%@ page pageEncoding="UTF-8" %>

<%
List<User> users = UserBase.getInstance().getUserList();
%>
<!DOCTYPE html>
<html lang="ru">
    <head>
        <meta charset="UTF-8" />
        <link href="https://fonts.googleapis.com/css?family=Niramit" rel="stylesheet">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="list.css">
        <title>Список пользователей</title>
    </head>
    <body>
        <header>
            <div class="navbar">
                <div class="navbar-main">
                    <a href="./">Главная страница</a>
                </div>
            </div>
        </header>

        <div class="content">
            <table>
            <% for(User user : users) { %>
                <tr>
                    <th>имя пользователя</th>
                    <th>пароль</th>
                </tr>
                <tr>
                    <td><%=user.getLogin() %></td>
                    <td><%=user.getPassword() %></td> 
                </tr>
            <% } %>
            </table>
        </div>
    </body>
</html>