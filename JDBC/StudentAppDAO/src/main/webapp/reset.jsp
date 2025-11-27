<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reset Password</title>
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
        .reset-container {
            background: rgba(255, 255, 255, 0.2);
            border-radius: 15px;
            padding: 30px;
            width: 400px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.3);
        }

        .reset-container h2 {
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

    <div class="reset-container">
        <h2>Reset Password</h2>
        <form action="resetPasswordServlet" method="post">
            <div class="mb-3">
                <label class="form-label">Phone</label>
                <input type="text" class="form-control" name="phone" placeholder="Enter your phone" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Mail</label>
                <input type="email" class="form-control" name="mail" placeholder="Enter your mail ID" required>
            </div>
            <div class="mb-3">
                <label class="form-label">New Password</label>
                <input type="password" class="form-control" name="password" placeholder="Enter new password" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Confirm Password</label>
                <input type="password" class="form-control" name="confirm_password" placeholder="Confirm your password" required>
            </div>

            <button type="submit" class="btn btn-primary btn-custom">Reset Password</button>
            <button type="button" class="btn btn-secondary btn-custom mt-2">Back</button>
        </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
