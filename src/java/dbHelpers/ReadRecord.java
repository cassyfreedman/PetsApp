
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

public class ReadRecord {
        
    private Connection conn;
    private ResultSet results;
    private Pets pet = new Pets();
    private int petID;
    
    public ReadRecord (int petID) {

        Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
    
    this.petID = petID;
            
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
        public void doRead (){
       
        try {
            String query = "SELECT * FROM pets WHERE petID = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, petID);
            this.results = ps.executeQuery();
            
            this.results.next();
            pet.setPetID(this.results.getInt("petID"));
            pet.setPetName(this.results.getString("petName"));
            pet.setPetType(this.results.getString("petType"));
            pet.setAge(this.results.getInt("age"));
            pet.setColor(this.results.getString("color"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        }
        
        public Pets getPet(){
        
        return this.pet;
        
        }

}
    
