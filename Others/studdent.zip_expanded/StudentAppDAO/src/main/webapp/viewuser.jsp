<%@page import="com.student.dto.Student"%>

<%@page import="com.student.dao.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Student Management</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">

  <style>
    /* Fix navbar button alignment */
    .navbar-nav {
      display: flex;
      align-items: center;
    }

    /* Center align the Dashboard title */
    .dashboard-title {
      text-align: center;
      font-weight: bold;
      margin-bottom: 20px;
    }

    /* Responsive table */
    .table-container {
      overflow-x: auto;
    }

    /* Align logout button properly */
    .logout-btn {
      padding: 5px 15px;
      border: none;
      cursor: pointer;
      font-size: 16px;
    }
  </style>
</head>
<body>

  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand navbar-primary" href="#">Student Management</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item">
            <a class="nav-link" href="reset.jsp">Reset Password</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="update.jsp">Update Data</a>
          </li>
          <li class="nav-item">
            <form action="logout" method="post">
              <input class="btn btn-danger logout-btn" type="submit" name="logout" value="Logout">
            </form>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Dashboard Title -->
  
  <% String msg = (String)session.getAttribute("message"); %>
  <% if(msg != null){ %>
  		<h3> <%= msg %></h3>
  	<% } %>
  	
  	
  <div class="container mt-4">
    <h1 class="dashboard-title">Dashboard</h1>
  </div>

  <!-- User Section -->
  <div class="container table-container mt-4">
    <h3>View Your Data</h3>
    <table class="table table-hover table-bordered text-center">
      <thead class="table-dark">
        <tr>
          <th>Id</th>
          <th>Name</th>
          <th>Phone</th>
          <th>Mail ID</th>
          <th>Branch</th>
          <th>Location</th>
          <th>Action</th>
        </tr>
      </thead>
      <tbody>
        <!-- Data Rows Will Be Added Here -->
        
        <% StudentDAO sdao = new StudentDAOimp(); %>
        <% 
            List<Student> arr = sdao.getstudent(); 
			        
            if (arr != null) {
                for (Student user : arr) { 
        %>
        <tr>
            <td> <%= user.getId() %> </td>
            <td> <%= user.getName() %> </td>
            <td> <%= user.getPhone() %> </td>
            <td> <%= user.getMail() %> </td>
            <td> <%= user.getBranch() %> </td>
            <td> <%= user.getLoc() %> </td>
            <td>
    			<form action="DeleteUser" method="post" style="display:inline;">
        			<input type="hidden" name="name" value="<%= user.getName() %>">
        				<button type="submit" class="btn btn-danger">Delete</button>
    			</form>
			</td>
        </tr>
        <% 
                } 
            } else { 
        %>
        <tr>
            <td colspan="6" class="text-center">No data available</td>
        </tr>
        <% } %>
      </tbody>
    </table>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
