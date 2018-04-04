/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import infra.Banco;
import java.util.List;
import modelo.Cliente;
import modelo.Pais;

/**
 *
 * @author paulo e nilton
 */
public class Teste {
     public static void main(String[] args) throws Exception {
         Banco bd = new Banco();
         Pais p = new Pais("Brasil", "BR", 10);
         Cliente c = new Cliente("Teste", 18, "1234567890", p);
         
         bd.addPais(p);
         bd.addCliente(c);
         
         List<Cliente> l = bd.listaClientes();
         for(Cliente c1 : l) {
             System.out.println(c1.getNome());
             System.out.println(c1.getIdade());
             System.out.println(c1.getLimiteCredito());
             System.out.println(c1.getTelefone());
             System.out.println(c1.getPais().getNome());
             System.out.println(c1.getPais().getSigla());
             System.out.println(c1.getPais().getTamanhoTelefone());
         }
         
        List<Pais> l2 = bd.listaPaises();
         for(Pais p1 : l2) {
             System.out.println(p1.getNome());
             System.out.println(p1.getSigla());
             System.out.println(p1.getTamanhoTelefone());
         }
     }
}
