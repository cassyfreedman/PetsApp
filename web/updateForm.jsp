
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Pets"%>
<% Pets pet = (Pets) request.getAttribute("pet");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update A Pet</title>
        <link rel="stylesheet" type="text/css" href="./css/pets.css" />
    </head>
    <body>
        <div class="wrap">
            <%@ include file="includes/header.jsp" %>

            <!--Menu-->
            <%@ include file="includes/menu.jsp" %>
            <div class="main">
                <h1>Update A Pet Record</h1>
                <div>

                    <form name="updateForm" action="updatePet" method="get">
                        <table>
                            <tr>

                                <td class = "right">
                                    Pet ID:  
                                </td>
                                <td class = "left"><input type="text" name="id" value="<%= pet.getPetID()%>" size="50" required readonly/> 
                                </td>
                            </tr>                        
                            <tr>

                                <td class = "right">
                                    Pet Name:  
                                </td>
                                <td class = "left"><input type="text" name="petName" value="<%= pet.getPetName()%>" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Pet Type:  
                                </td>
                                <td class = "left"><input type="text" name="petType" value="<%= pet.getPetType()%>" size="50" required /> 
                                </td>
                            </tr>

                            <tr>

                                <td class = "right">
                                    Age:  
                                </td>
                                <td class = "left"><input type="text" name="age" value="<%= pet.getAge()%>" size="50" required /> 
                                </td>
                            </tr>
                            <tr>

                                <td class = "right">
                                    Color:  
                                </td>
                                <td class = "left"><input type="text" name="color" value="<%= pet.getColor()%>" size="50" required /> 
                                </td>
                            </tr>




                        </table>

                        <br><br>
                        <input type="submit" value="Update" id="submit"/>
                        <br><br>
                    </form>
                </div>
            </div>
            <!--footer-->
            <%@ include file="includes/footer.jsp" %>
        </div> 
    </body>
</html>
