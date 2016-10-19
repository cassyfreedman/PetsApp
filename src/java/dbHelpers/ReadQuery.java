
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pets;

public class ReadQuery {
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery (){
    
    Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
        public void doRead (){
        try {
            String query = "Select * from pets";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        public String getHTMLtable(){
            
            String table = "";
            table += "<table>";
            table += "<tr>";
            table += "<th> Pet ID </th>";
            table += "<th> Pet Name </th>";
            table += "<th> Pet Type </th>";
            table += "<th> Pet Age </th>";
            table += "<th> Pet Color </th>";
            table += "<th> Delete </th>";        
            table += "</tr>";
            
            
            
            try {
            while(this.results.next()){
                
                Pets pet = new Pets();
                pet.setPetID(this.results.getInt("petID"));
                pet.setPetName(this.results.getString("petName"));
                pet.setPetType(this.results.getString("petType"));
                pet.setAge(this.results.getInt("age"));
                pet.setColor(this.results.getString("color"));
                
                table += "<tr>";
                table += "<td>";
                table += pet.getPetID();
                table += "</td>";
                
                table += "<td>";
                table += pet.getPetName();
                table += "</td>";
                
                table += "<td>";
                table += pet.getPetType();
                table += "</td>";
                
                table += "<td>";
                table += pet.getAge();
                table += "</td>";
                
                table += "<td>";
                table += pet.getColor();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=delete?petID=" + pet.getPetID() + "> Delete </a>";
                table += "</td>";
                
                
                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            table +="</table>";
            
            return table;
            
            
            
            
        }
                
                
                
                
            }
