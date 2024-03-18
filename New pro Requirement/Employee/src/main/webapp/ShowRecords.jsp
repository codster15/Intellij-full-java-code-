

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.deepak.DTO.EmployeeDTO" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
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

        .topdiv{
            width: 100%;
            height: 250px;

            border: 2px solid;
            gap: 20px; /* Adjusted for visual clarity, you can increase or decrease */
            padding: 20px; /* Added padding for better appearance */

        }
        .firstdiv,.secondDiv{
            width: 100%;
            height: 15vh;

            display: flex;
            flex-direction: row;
            gap: 300px;
            align-items: center;
            justify-content: center;
        }
        select, button{
            height: 50px;
            width: 200px;
        }
        button{
            border-radius: 15px ;
        }
        button:hover{
            cursor: pointer;
         background-color: black;
         color: white;
         font-size: 20px;
        }
      .tabDiv{
        display: flex;
      justify-content: space-between;


      }
      .link{
        margin-right: 50px;
  font-size: 20px;
      }
    </style>
</head>
<body>

<div class="topdiv">

    <form action="viewRecords" method="get">


        <div class="firstdiv">
            <div>
                <span>Department</span>
                <select name="Department" id="">
                    <option value="select">Select Department</option>
                    <option value="Security">Security</option>
                    <option value="finance">finance</option>
                    <option value="testing">testing</option>
                    <option value="hr">hr</option>
                    <option value="Developer">Developer</option>
                </select>
            </div>
            <!-- //============================================================== -->
            <div>
                <span>gender</span>
                <select name="gender" id="">
                    <option value="select">Select</option>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                </select>
            </div>
        </div>



        <div class="secondDiv">

            <div>
                <span>Select Experience</span>
                <select name="Experience" id="">

                    <option value="select">Select Experience</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                </select>
            </div>


            <div>
                <button>Search</button></div>
        </div>



        <!-- //============================================================== -->


    </form>
</div>


<!-- Display employee data in a table -->

<div id="employeeTable" style="display:none;" class="belowTable">

    <div class="tabDiv">
        <h2>Employee Records</h2>
        <a href="/Employee/index.html" class="link">Register Your Self</a>
    </div>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Department</th>
                <th>Experience</th>
                <!-- Add other header fields as necessary -->
            </tr>
        </thead>
        <tbody>
            <%
             int count = 0;
                List<EmployeeDTO> employeeDTOS = (List<EmployeeDTO>)request.getAttribute("employeeDTOS");
                if (employeeDTOS != null && !employeeDTOS.isEmpty()) {
                    for (EmployeeDTO employee : employeeDTOS) {
                       count++;
            %>
                <tr>
                    <td><%= count %></td>
                    <td><%= employee.name() %></td>
                    <td><%= employee.Email() %></td> <!-- Assuming getEmail() is correct -->
                    <td><%= employee.Gender() %></td>
                    <td><%= employee.Department() %></td>
                    <td><%= employee.Experience() %></td>

                    <!-- Add other fields as necessary -->
                </tr>
                <%

                    } // end for loop
                } else {
            %>
                <tr>
                    <td colspan="6">No records found.</td>
                </tr>
            <%
                } // end if
            %>
        </tbody>
    </table>
</div>


<!-- ------------------------------ js file -->


        <script>
            window.onload = function() {
                var table = document.getElementById('employeeTable');
                var hasData = table.getElementsByTagName('tr').length > 1; // Check if more than header row
                if (hasData) {
                    table.style.display = 'block';
                }
            };
        </script>




</body>
</html>










