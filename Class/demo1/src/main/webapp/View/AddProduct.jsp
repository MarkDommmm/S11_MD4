<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/2/2023
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 20px;
        }

        h1 {
            color: #333;
        }

        form {
            width: 300px;
            margin: auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            text-align: center;
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            margin-bottom: 10px;
        }

        input[type="cancel"] {
            width: 100%;
            padding: 10px;
            text-align: center;
            background-color: red;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;

        }

        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">Add Product</h1>
<form method="post" action="/Home">

    <label for="name">Product Name: </label>
    <input type="text" name="name" id="name">
    <br>
    <label for="price">Price: </label>
    <input type="text" name="price" id="price">
    <br>
    <label for="year">Year: </label>
    <input type="number" name="year" id="year">
    <br>
    <label for="description">Description:</label>
    <input type="text" name="description" id="description">

    <input type="submit" value="submit" name="action">
    <input type="cancel" value="Cancel" name="action">

</form>
</body>
</html>
