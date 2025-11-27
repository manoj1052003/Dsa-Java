<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: "Poppins", sans-serif;
        }
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: url('car111.jpg') no-repeat center center/cover;
            color: white;
        }
        .signup-container {
            background: transparent;
            backdrop-filter: blur(3px);
            padding: 30px;
            border-radius: 22px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
            width: 350px;
            text-align: center;
        }
        .signup-container h2 {
            margin-bottom: 20px;
            font-size: 24px;
        }
        .input-field {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: none;
            border-radius: 8px;
            font-size: 16px;
            background: rgba(255, 255, 255, 0.2);
            color: white;
            outline: none;
        }
        .input-field::placeholder {
            color: rgba(255, 255, 255, 0.7);
        }
        .forgot-password {
            display: block;
            text-align: right;
            font-size: 14px;
            color: white;
            margin-top: -5px;
            margin-bottom: 10px;
            text-decoration: none;
            transition: 0.3s;
        }
        .forgot-password:hover {
            color: #ff7eb3;
        }
        .login-button {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 8px;
            font-size: 18px;
            cursor: pointer;
            background: rgba(0, 0, 0, 0.3);
            color: white;
            transition: 0.3s;
            margin-top: 10px;
        }
        .login-button:hover {
            background: rgba(245, 12, 225, 0.986);
        }
        .signup-text {
            margin-top: 15px;
            display: block;
            color: white;
            font-size: 14px;
            text-decoration: none;
            transition: 0.3s;
        }
        .signup-text:hover {
            color: #0888eb;
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="signup-container">
        <h2>Login</h2>
        
        <% String Successmessage = (String)request.getAttribute("success");
        if(Successmessage!=null){%>
        <%= Successmessage %>
        <% } %>
        
        <% String failuremsg = (String)request.getAttribute("success_l");
        if(failuremsg!=null){%>
        <h3 class="failure" ><%= failuremsg %></h3>
        <% } %>
        
        <% String failuremsg1 = (String)request.getAttribute("error_l");
		if (failuremsg1 != null) { %>
		    <h3 class="failure" id="errorMsg"><%= failuremsg1 %></h3>
		<% } %>
		
		<% String failuremsg3 = (String)request.getAttribute("error_f2");
        if(failuremsg3!=null){%>
        <h3 class="failure" ><%= failuremsg3 %></h3>
        <% } %>
        
        <% String failuremsg4 = (String)request.getAttribute("success_1");
        if(failuremsg4!=null){%>
        <h3 class="failure" ><%= failuremsg4 %></h3>
        <% } %>
        
        <% String reset_s = (String)request.getAttribute("reset_s");
        if(reset_s!=null){%>
        <h3 class="failure" ><%= reset_s %></h3>
        <% } %>
		
		<script>
		    // Remove the error message after 10 seconds (10000 milliseconds)
		    setTimeout(function () {
		        var msgElement = document.getElementById("errorMsg");
		        if (msgElement) {
		            msgElement.style.display = "none";  // Hides the message
		        }
		    }, 5000);
		</script>
		        
        
        <form action="Login" method="post">
            <input type="email" class="input-field" placeholder="Email" name="mail" required>
            <input type="password" class="input-field" placeholder="Password" name="password" required>

            <!-- Forgot Password Link -->
            <a href="forget.jsp" class="forgot-password">Forgot Password?</a>

            <button type="submit" class="login-button">Login</button>
            
            <!-- Signup Link Instead of Button -->
            <a href="Signup.jsp" class="signup-text">Don't have an account? Sign up</a>
        </form>
    </div>
</body>
</html>

