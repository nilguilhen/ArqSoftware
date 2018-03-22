/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras;

import dados.Banco;

/**
 *
 * @author paulo
 */
public class Conexao {
    private Banco banco = new Banco();
    
    public void add(String nome, String idade, String telefone){
        Cliente cliente = new Cliente(nome, Integer.parseInt(idade), telefone);
        banco.add(cliente);
    }
}
