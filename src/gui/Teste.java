/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.PaisDAO;

/**
 *
 * @author paulo e nilton
 */
public class Teste {
     public static void main(String[] args) throws Exception {
         PaisDAO p = new PaisDAO();
         p.conexao();
     }
}
