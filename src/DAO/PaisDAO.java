
package DAO;

import java.beans.Statement;
import java.sql.*;

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
            con.prepareStatement("INSERT INTO PAIS (ID, NOME, SIGLA, TELEFONE) VALUES (1, 'TESTE', 'SC', 10)");
            
        }catch(SQLException e){
            System.err.println(e);
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
