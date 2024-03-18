<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

</head>
<body>


    <a href="index.html">Add New User</a>

    <table>
        <thead>
            <tr>
                <td>S.NO</td>
               <td>First Name</td>
               <td>Last Name</td>
               <td>Email-Id</td>
               <td>Password</td>
               <td>Gender</td>
               <td>Role</td>

            </tr>
        </thead>



        <c:forEach items="${users}" var="user" varStatus="index">

        <tr>
            <td>${index.count}</td>
            <td>${user.fname}</td>
            <td>${user.lname}</td>
            <td>${user.email}</td>
            <td>${user.pwd}</td>
            <td>${user.gender}</td>
            <td>${user.role}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
