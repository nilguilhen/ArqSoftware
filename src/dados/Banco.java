/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import regras.Cliente;

/**
 *
 * @author paulo
 */
public class Banco {
    private ArrayList<Cliente> clientesDB = new ArrayList<>();
    
    public boolean add(Cliente c) {
        // inserir regras aqui
        return clientesDB.add(c);
    }
}
