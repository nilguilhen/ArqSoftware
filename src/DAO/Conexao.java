/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NiltonGuilhen
 */
public class Conexao {
    
    public void conexao() throws SQLException{
        
        try{ 
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/ARQ", "root", "root");
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //con.prepareStatement("INSERT INTO PAIS (ID, NOME, SIGLA, TELEFONE) VALUES (1, 'TESTE', 'SC', 10)").execute();
    }

    
    
}
