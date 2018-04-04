
package DAO;

import modelo.Cliente;

/**
 *
 * @author NiltonGuilhen
 */
public class ClienteDAO {
    
    
    public void CriaCliente(Cliente c) throws Exception{
   
        bd.addCliente(c);
        
    }
    
    public void LerCliente(Cliente c){
    }
    
    public void AlterarCliente(Cliente c){
    }
    
    public void DeletarCliente(Cliente c){
    }
    
}
