/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import regras.Cliente;
import regras.Pais;

/**
 *
 * @author paulo
 */
public class Banco {
    private static ArrayList<Cliente> clientesDB = new ArrayList<>();
    private static ArrayList<Pais> paisesDB = new ArrayList<>();

    public static ArrayList<Cliente> getClientesDB() {
        return clientesDB;
    }

    public static ArrayList<Pais> getPaisesDB() {
        return paisesDB;
    }
    
    public boolean addCliente(Cliente c) {
        // inserir regras aqui
        return clientesDB.add(c);
    }
    
    public boolean addPais(Pais p) {
        // inserir regras aqui
        return paisesDB.add(p);
    }
}
