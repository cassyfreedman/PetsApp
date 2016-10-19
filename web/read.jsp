
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cassy's Furry Friends</title>
        <link rel="stylesheet" type="text/css" href="./css/pets.css" />
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    
    
    <body>
        <h1>Cassy's Furry Friends</h1>
        <%= table %>
        <br><br>
        
        <a href ="add">Add A New Pet</a><br><br>
        
        
    </body>
</html>
