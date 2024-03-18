<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- This line specifies that the file is a JSP (JavaServer Pages) document, sets the content type to HTML with UTF-8 character encoding, and indicates the scripting language used is Java. -->

<%@ page import="java.util.List" %>
<!-- Imports the Java List interface for handling collections of objects. -->

<%@ page import="in.deepak.dto.CollectUserDataDTO" %>
<!-- Imports the CollectUserDataDTO class, which is likely a Data Transfer Object (DTO) used to transfer user data between the application layers. -->

<!DOCTYPE html>
<!-- Declares the document type and version of HTML being used (HTML5 here). -->

<html>
<head>
    <title>View Users</title>
    <!-- Sets the title of the webpage as 'View Users'. -->

    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
    </style>
    <!-- Internal CSS styles defining the appearance of tables, table headers (th), and table cells (td). -->
</head>
<body>
<h3>    <a href="index.html">+ Add New User</a>  </h3>
    <h2>Users List</h2>
    <!-- Displays a header 'Users List' on the webpage. -->

    <table>
        <!-- Starts a table to display user data. -->
        <thead>
            <!-- Defines the table header. -->
            <tr>
            <th>S.NO</th>
                <!-- Starts a row in the table header. -->
                <th>First Name</th>
                <!-- Column header for first names. -->
                <th>Last Name</th>
                <!-- Column header for last names. -->
                <th>Email</th>
                <!-- Column header for email addresses. -->
                <!-- Displaying passwords in UI is not recommended; included here for completeness -->
                <th>Password</th>
                <!-- Column header for passwords (not recommended for security reasons). -->
                <th>Gender</th>
                <!-- Column header for gender. -->
                <th>Role</th>
                <!-- Column header for roles (e.g., admin, user). -->
            </tr>
        </thead>
        <tbody>
            <!-- Starts the body of the table where data rows will be displayed. -->
            <%
                List<CollectUserDataDTO> users = (List<CollectUserDataDTO>) request.getAttribute("users");
                // Fetches a list of user data from a request attribute named "users" and stores it in a variable.

                int count = 1;
                for(CollectUserDataDTO user : users) {
                // Loops through each user in the list.

                    if(count == 2){
                    count = 3;
                    }
            %>
                <tr>
                       <td><%= count %></td>
                    <!-- Starts a new row for each user. -->

                    <td><%= user.fname() %></td>
                    <!-- Displays the user's first name. -->

                    <td><%= user.lname() %></td>
                    <!-- Displays the user's last name. -->

                    <td><%= user.email() %></td>
                    <!-- Displays the user's email. -->

                    <td><%= user.pwd() %></td> <!-- Consider removing this column for security reasons -->
                    <!-- Displays the user's password (not recommended). -->

                    <td><%= user.gender() %></td>
                    <!-- Displays the user's gender. -->

                    <td><%= user.role() %></td>
                    <!-- Displays the user's role. -->
                </tr>
            <%
            count++;
                }
                // Ends the loop.

            %>
        </tbody>
    </table>
</body>
</html>
