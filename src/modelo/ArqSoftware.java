/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class ArqSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aux=0;
        boolean rodando = true;
        
        ArrayList<String> listaNomes = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        
        while(rodando){
            
            System.out.println("1 - cadastrar");
            System.out.println("2 - listar");
            System.out.println("3 - sair");
            System.out.println("Digite sua opção:");
            aux = s.nextInt();
        
        switch(aux){
            case 1:
                    System.out.println("Digite o nome:");
                    String nome = s.next();
                    listaNomes.add(nome);
                    break;
            case 2:
                    for (Iterator<String> it = listaNomes.iterator(); it.hasNext();) {
                        System.out.println(it.next());
                    }
                    break;
            case 3:
                    rodando = false;
                    break;
        }

        }
    }
}
