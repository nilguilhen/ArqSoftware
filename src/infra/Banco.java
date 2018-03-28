/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Pais;

/**
 *
 * @author paulo
 */
public class Banco {
    private static ArrayList<Cliente> clientesDB = new ArrayList<>();
    private static ArrayList<Pais> paisesDB = new ArrayList<>();

    public  ArrayList<Cliente> getClientesDB() {
        return clientesDB;
    }

    public  ArrayList<Pais> getPaisesDB() {
        return paisesDB;
    }
    
    public boolean addCliente(Cliente cli) {
        for(Cliente c : clientesDB) {
            if(c.getNome().equalsIgnoreCase(cli.getNome()))
                return false;
        }
        return clientesDB.add(cli);
    }
    
    public boolean addPais(Pais pa) {
        for(Pais p : paisesDB) {
            if(p.getNome().equalsIgnoreCase(pa.getNome()))
                return false;
        }
        return paisesDB.add(pa);
    }
}
