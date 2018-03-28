/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras;

import dados.Banco;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class Conexao {
    private Banco banco = new Banco();
    
    public ArrayList<Pais> getPaises(){
        return(banco.getPaisesDB());
    }
    
    public void addCliente(String nome, String idade, String telefone, Pais pais) throws Exception{
        Cliente cliente = new Cliente(nome, Integer.parseInt(idade), telefone, pais);
        banco.addCliente(cliente);
    }
    
    public void addPais(String nome, String sigla, int tamanhoTelefone) throws Exception{
        Pais pais = new Pais(nome, sigla, tamanhoTelefone);
        banco.addPais(pais);
    }
    
}
