
package DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import modelo.Pais;

/**
 *
 * @author NiltonGuilhen
 */
public class PaisDAO {
    
    public void conexao(){
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
            }
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ARQ", "root", "root");
            Statement stmt = (Statement) con.createStatement();
        }
        }catch(SQLException e){
            System.err.println(e);
        } 
    
    
    }
}
    
    public void CriaPais(Pais p){
        
        
    }
    
    public void LerPais(){
    }
    
    public void AlterarPais(){
    }
    
    public void DeletarPais(){
    }
    
}
