<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script type="application/javascript" src="/jsp/js/script.js"></script>
    <title>Student Service</title>
</head>
<body>
<div class="container">
    <div id="output">
        <table class="table table-stripped">
            <tr>
                <td>id</td>
                <td>Name</td>
                <td>Last Name</td>
                <td>Phone Number</td>
                <td>Birthday</td>
                <td>Email</td>
                <td>
                    <input class="btn btn-link" type="submit" value="Add" onclick="go_to_add()">
                </td>
            </tr>

            <c:forEach items="${students}" var="student">
                <tr>
                        <td><c:out value="${student.getId()}"/></td>
                        <td><c:out value="${student.getName()}"/></td>
                        <td><c:out value="${student.getLastName()}"/></td>
                        <td><c:out value="${student.getPhoneNumber()}"/></td>
                        <td><c:out value="${student.getBirthday()}"/></td>
                        <td><c:out value="${student.getEmail()}"/></td>
                    <td>
                        <a href="/update?id=${student.getId()}">Update</a>
                        <input class="btn btn-link" type="submit" value="Delete" onclick="delete_st(${student.getId()})">
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>