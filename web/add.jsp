
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Pet</title>
    </head>
    <body>
        <h1>Add A New Pet</h1>
                <form name="addForm" action="addPet" method="get">

                        <label>Pet Name:</label>
                        <input type="text" name="petName" value="" size="50" required />
                        <br>
                        <label>Pet Type:</label>
                        <input type="text" name="petType" value="" size="50" required/>
                        <br>
                        <label>Age:</label>
                        <input type="text" name="age" value="" size="50" required/>
                        <br>
                        <label>Color:</label>
                        <input type="text" name="color" value="" size="50" required/>
                        <br>
                        <input type="submit" value="Submit" id="submit"/>
            
        </form>
    </body>
</html>
