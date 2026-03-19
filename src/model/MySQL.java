package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {
    
    private static Connection connection;           //connection object ekak alla gtanna varible ekak haduwa.private kala class eka athule witharak oonama welawaka a
                                                   //allaganna.connections godaak watena nisa thama variable ekak hadagaththe
    private static final String USERNAME = "root";   //private kala pita unta baha access karanna.final kala
    private static final String PASSWORD = "Chooty2006@0322";
    private static final String DATABASE = "libms";
    
    private static Statement createConnection() throws Exception{
        if(connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DATABASE,USERNAME,PASSWORD); 
                                            //connection eka hadagaththa
        }
        
         
        return connection.createStatement();    //liumak hadagaththa connection eka yawanna return karanwa
     
    }
    public static void iud(String query) {   //return karanne nathi nisa try catch daala handle karanawa
                                             //INSERT/UPDATE/DELETE methanama handle karanwa errors
                                             //public kale oonama kenkta access karanna..onama thanakin query enawa methanata
        try {
             createConnection().executeUpdate(query); 
        } catch (Exception e) {
            e.printStackTrace(); //wena aula wistharathmakawa kiyanawa
        }
      
    }
    public static ResultSet search(String query) throws Exception{   //return ekak nisa throws Exception kiyala danawa.
                                                                   //SEARCH
        return createConnection().executeQuery(query);
    }
    public static Connection getConnection(){
           if(connection == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DATABASE,USERNAME,PASSWORD); 
             
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
           return connection;
                   
    }
    
}
