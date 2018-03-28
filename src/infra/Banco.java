/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Pais;

/**
 *
 * @author paulo
 */
public class Banco {
    private List<Cliente> clientesDB = new ArrayList<>();
    private List<Pais> paisesDB = new ArrayList<>();

    public  List<Cliente> getClientesDB() {
        return clientesDB;
    }

    public  List<Pais> getPaisesDB() {
        return paisesDB;
    }
    
    public boolean addCliente(Cliente cli) {
        for(Cliente c : clientesDB) {
            if(c.getNome().equalsIgnoreCase(cli.getNome()))
                return false;
        }
        return clientesDB.add(cli);
    }
    
    public List<Cliente> listaClientes() {
        List<Cliente> l = new ArrayList<>();
        for(Cliente c : clientesDB) {
            l.add(c);
        }
        return l;
    }
    
    public boolean addPais(Pais pa) {
        for(Pais p : paisesDB) {
            if(p.getNome().equalsIgnoreCase(pa.getNome()))
                return false;
        }
        return paisesDB.add(pa);
    }
    
      public List<Pais> listaPaises() {
        List<Pais> l = new ArrayList<>();
        for(Pais p : paisesDB) {
            l.add(p);
        }
        return l;
    }
}
