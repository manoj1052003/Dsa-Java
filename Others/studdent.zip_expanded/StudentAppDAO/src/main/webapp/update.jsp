<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.student.dto.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Account</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        /* Background Image */
        body {
            background: url('car111.jpg') no-repeat center center/cover;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        /* Glassmorphic Effect */
        .update-container {
            background: rgba(255, 255, 255, 0.2);
            border-radius: 15px;
            padding: 30px;
            width: 400px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.3);
        }

        .update-container h2 {
            text-align: center;
            margin-bottom: 20px;
            font-weight: bold;
            color: white;
        }

        /* Input Fields */
        .form-control {
            background: rgba(255, 255, 255, 0.2);
            border: none;
            color: white;
        }

        .form-control::placeholder {
            color: rgba(255, 255, 255, 0.7);
        }

        /* Buttons */
        .btn-custom {
            width: 100%;
            border-radius: 5px;
            font-weight: bold;
            padding: 10px;
        }

        /* Text Color */
        label {
            color: white;
        }
    </style>
</head>
<body>

	<% Student user = (Student)session.getAttribute("user"); %>

    <div class="update-container">
        <h2>Update Account</h2>
        <form action="updateAccountServlet" method="post">
            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" class="form-control" name="name" placeholder="Enter your name" value="<%= user.getName() %>" >
            </div>
            <div class="mb-3">
                <label class="form-label">Phone</label>
                <input type="text" class="form-control" name="phone" placeholder="Enter your phone" value="<%= user.getPhone()%>">
            </div>
            <div class="mb-3">
                <label class="form-label">Mail</label >
                <input type="email" class="form-control" name="mail" placeholder="Enter your mail ID"  value="<%= user.getMail()%>"  >
            </div>
            <div class="mb-3">
                <label class="form-label">Branch</label>
                <input type="text" class="form-control" name="branch" placeholder="Enter your branch"  value="<%= user.getBranch()%>"  >
            </div>
            <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" class="form-control" name="location" placeholder="Enter your location"  value="<%= user.getLoc()%>" >
            </div>

            <button type="submit" class="btn btn-primary btn-custom">Update</button>
            <a href="Dashboard.jsp" class="btn btn-secondary btn-custom mt-2">Back</a>

        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

