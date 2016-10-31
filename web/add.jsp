
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Pet</title>
        <link rel="stylesheet" type="text/css" href="./css/pets.css" />
    </head>
    <body>
        <div class="wrap">
            <%@ include file="includes/header.jsp" %>

            <!--Menu-->
            <%@ include file="includes/menu.jsp" %>
            <div class="main">
                <h1>Add A New Pet</h1>
                <div>

                    <form name="addForm" action="addPet" method="get">
                        <table>

                            <tr>

                                <td class = "right">
                                    Pet Name:  
                                </td>
                                <td class = "left"><input type="text" name="petName" value="" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Pet Type:  
                                </td>
                                <td class = "left"><input type="text" name="petType" value="" size="50" required /> 
                                </td>
                            </tr>

                            <tr>

                                <td class = "right">
                                    Age:  
                                </td>
                                <td class = "left"><input type="text" name="age" value="" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Color:  
                                </td>
                                <td class = "left"><input type="text" name="color" value="" size="50" required /> 
                                </td>
                            </tr>




                        </table>

                        <br><br>
                        <input type="submit" value="Submit" id="submit"/>
                        <br><br>
                    </form>
                </div>
            </div>
            <!--footer-->
            <%@ include file="includes/footer.jsp" %>
        </div> 
    </body>
</html>
