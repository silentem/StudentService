<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <table class="table table-stripped">
        <tr>
            <td>Name</td>
            <td>Last Name</td>
            <td>Phone Number</td>
            <td>Birthday</td>
            <td>Email</td>
            <td>
                <input class="btn btn-link" type="submit" value="Back" onclick="go_to_view()">
            </td>
        </tr>
        <tr>
            <td>
                <label>
                    <input type="text" id="name"/>
                </label>
            </td>
            <td>
                <label>
                    <input type="text" id="last_name"/>
                </label>
            </td>
            <td>
                <label>
                    <input type="text" id="phone_number"/>
                </label>
            </td>
            <td>
                <label>
                    <input type="date" id="birthday"/>
                </label>
            </td>
            <td>
                <label>
                    <input type="text" id="email"/>
                </label>
            </td>
            <td>
                <input class="btn btn-link" type="submit" value="Add" onclick="add()">
            </td>
        </tr>
    </table>
</div>
</body>
</html>